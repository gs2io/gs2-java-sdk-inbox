package io.gs2.inbox;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.gs2.AbstractGs2Client;
import io.gs2.Gs2Constant;
import io.gs2.auth.Gs2AuthClient;
import io.gs2.inbox.control.CreateInboxRequest;
import io.gs2.inbox.control.CreateInboxResult;
import io.gs2.inbox.control.DeleteInboxRequest;
import io.gs2.inbox.control.DeleteMessageRequest;
import io.gs2.inbox.control.DeleteMessagesRequest;
import io.gs2.inbox.control.DescribeInboxRequest;
import io.gs2.inbox.control.DescribeInboxResult;
import io.gs2.inbox.control.DescribeMessageRequest;
import io.gs2.inbox.control.DescribeMessageResult;
import io.gs2.inbox.control.DescribeServiceClassRequest;
import io.gs2.inbox.control.DescribeServiceClassResult;
import io.gs2.inbox.control.GetInboxRequest;
import io.gs2.inbox.control.GetInboxResult;
import io.gs2.inbox.control.GetInboxStatusRequest;
import io.gs2.inbox.control.GetInboxStatusResult;
import io.gs2.inbox.control.GetMessageRequest;
import io.gs2.inbox.control.GetMessageResult;
import io.gs2.inbox.control.ReadMessageRequest;
import io.gs2.inbox.control.ReadMessageResult;
import io.gs2.inbox.control.ReadMessagesRequest;
import io.gs2.inbox.control.ReadMessagesResult;
import io.gs2.inbox.control.SendMessageRequest;
import io.gs2.inbox.control.SendMessageResult;
import io.gs2.inbox.control.UpdateInboxRequest;
import io.gs2.inbox.control.UpdateInboxResult;
import io.gs2.model.IGs2Credential;

/**
 * GS2 Inbox API クライアント
 * 
 * @author Game Server Services, Inc.
 *
 */
public class Gs2InboxClient extends AbstractGs2Client<Gs2InboxClient> {

	public static String ENDPOINT = "inbox";
	
	/**
	 * コンストラクタ。
	 * 
	 * @param credential 認証情報
	 */
	public Gs2InboxClient(IGs2Credential credential) {
		super(credential);
	}

	/**
	 * 受信ボックスを作成。<br>
	 * <br>
	 * GS2-Inbox を利用するにはまず受信ボックスを作成します。<br>
	 * 受信ボックスを作成後、受信ボックスにメッセージを送信することでメッセージを届けることができます。<br>
	 * 1つの受信ボックスで、複数のユーザのメッセージを扱うことができますので、ユーザ数分の受信ボックスを作成する必要はありません。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 作成結果
	 */
	public CreateInboxResult createInbox(CreateInboxRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("name", request.getName())
				.put("serviceClass", request.getServiceClass())
				.put("autoDelete", request.getAutoDelete())
				.put("cooperationUrl", request.getCooperationUrl());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/inbox", 
				credential, 
				ENDPOINT,
				CreateInboxRequest.Constant.MODULE, 
				CreateInboxRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(post, CreateInboxResult.class);
	}
	
	/**
	 * 受信ボックス一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return 受信ボックス一覧
	 */
	public DescribeInboxResult describeInbox(DescribeInboxRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/inbox";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				DescribeInboxRequest.Constant.MODULE, 
				DescribeInboxRequest.Constant.FUNCTION);
		return doRequest(get, DescribeInboxResult.class);
	}

	/**
	 * サービスクラス一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return サービスクラス一覧
	 */
	public DescribeServiceClassResult describeServiceClass(DescribeServiceClassRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/inbox/serviceClass", 
				credential, 
				ENDPOINT,
				DescribeServiceClassRequest.Constant.MODULE, 
				DescribeServiceClassRequest.Constant.FUNCTION);
		return doRequest(get, DescribeServiceClassResult.class);
	}

	/**
	 * 受信ボックスを取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return 受信ボックス
	 */
	public GetInboxResult getInbox(GetInboxRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/inbox/" + request.getInboxName(), 
				credential, 
				ENDPOINT,
				GetInboxRequest.Constant.MODULE, 
				GetInboxRequest.Constant.FUNCTION);
		return doRequest(get, GetInboxResult.class);
	}

	/**
	 * 受信ボックスの状態を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return 受信ボックスの状態
	 */
	public GetInboxStatusResult getInboxStatus(GetInboxStatusRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/inbox/" + request.getInboxName() + "/status", 
				credential, 
				ENDPOINT,
				GetInboxStatusRequest.Constant.MODULE, 
				GetInboxStatusRequest.Constant.FUNCTION);
		return doRequest(get, GetInboxStatusResult.class);
	}

	/**
	 * 受信ボックスを更新。
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public UpdateInboxResult updateInbox(UpdateInboxRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("serviceClass", request.getServiceClass())
				.put("cooperationUrl", request.getCooperationUrl());
		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/inbox/" + request.getInboxName(), 
				credential, 
				ENDPOINT,
				UpdateInboxRequest.Constant.MODULE, 
				UpdateInboxRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(put, UpdateInboxResult.class);
	}

	/**
	 * 受信ボックスを削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteInbox(DeleteInboxRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/inbox/" + request.getInboxName(), 
				credential, 
				ENDPOINT,
				DeleteInboxRequest.Constant.MODULE, 
				DeleteInboxRequest.Constant.FUNCTION);
		doRequest(delete, null);
	}

	/**
	 * メッセージを送信。<br>
	 * <br>
	 * メッセージを受信ボックスに送信します。<br>
	 * メッセージには本文との他に開封時通知を有効にするかのフラグ、既読状態のフラグといった情報が付加されています。<br>
	 * <br>
	 * 開封時通知を有効にすると、受信ボックスに設定された連携用URLにメッセージIDがPOSTリクエストで通知されます。<br>
	 * メッセージ送信時にも送信したメッセージIDが取得できますので、<br>
	 * 例えば、メッセージに課金用アイテムを添付したい場合は以下の様なメッセージを送信します。<br>
	 * <ul>
	 * <li>送信先: user-0001</li>
	 * <li>メッセージ本文: サーバ障害のお詫びです</li>
	 * <li>開封時通知: 有効</li>
	 * </ul>
	 * このAPIの戻り値に含まれるメッセージIDとユーザID、アイテムの内容(課金用アイテム)をひも付けて保存します。<br>
	 * <br>
	 * その後、ユーザがこのメッセージを開封すると、連携用URLにこのメッセージのメッセージIDが通知されます。<br>
	 * それを受けて、ユーザIDのアカウントにアイテムの内容(課金用アイテム)を付与します。<br>
	 * これで、メッセージにアイテムを添付することができます。<br>
	 * <br>
	 * また、連携用URLを呼び出した際にエラー応答することで、メッセージの開封を失敗させることができます。<br>
	 * これによって、持ち物がいっぱいの場合などにアイテムの付与に失敗しても再度開封処理を実行させることができます。<br>
	 * <br>
	 * 開封時のコールバックは通信障害などの理由により、コールバック先のサーバは正しく処理を行えたけれど、<br>
	 * GS2側のインフラにレスポンスが届かず、結果的に処理が失敗する可能性を考慮する必要があります。<br>
	 * この場合、複数回の開封コールバックが呼び出される可能性がありますので、コールバック処理は冪等性を持った形で実装するようにしてください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 送信結果
	 */
	public SendMessageResult sendMessage(SendMessageRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("userId", request.getUser())
				.put("message", request.getMessage())
				.put("cooperation", request.getCooperation());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/inbox/" + request.getInboxName() + "/message", 
				credential, 
				ENDPOINT,
				SendMessageRequest.Constant.MODULE, 
				SendMessageRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(post, SendMessageResult.class);
	}
	
	/**
	 * メッセージ一覧を取得。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return メッセージ一覧
	 */
	public DescribeMessageResult describeMessage(DescribeMessageRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/inbox/" + request.getInboxName() + "/message";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				DescribeMessageRequest.Constant.MODULE, 
				DescribeMessageRequest.Constant.FUNCTION);
		get.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(get, DescribeMessageResult.class);
	}

	/**
	 * メッセージを取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return 受信ボックス
	 */
	public GetMessageResult getMessage(GetMessageRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/inbox/" + request.getInboxName() + "/message/" + request.getMessageId(), 
				credential, 
				ENDPOINT,
				GetMessageRequest.Constant.MODULE, 
				GetMessageRequest.Constant.FUNCTION);
		return doRequest(get, GetMessageResult.class);
	}
	
	/**
	 * メッセージを既読にする。<br>
	 * <br>
	 * 受信ボックスの設定で開封時自動削除設定が有効な場合は、メッセージは削除されます。<br>
	 * <br>
	 * 連携用URLを呼び出す設定になっている場合、連携用URLにメッセージIDを付与したコールバックが実行されます。<br>
	 * このコールバックをうけて、持ち物を増やしたりすることでメッセージにアイテムを添付することができます。<br>
	 * <br>
	 * レスポンスには連携用URLを呼び出した際の応答内容も含まれますので、開封時にさらにメッセージを表示させるようなこともできます。<br>
	 * 例えば、連携用URLを呼び出した際に「アイテムを手に入れた」というレスポンスを返すことで、このAPIのレスポンスにその文字列も含んだ形で応答されますので、<br>
	 * 開封時にさらにその応答メッセージを使って画面にメッセージとして「アイテムを手に入れた」という表示をすることができます。<br>
	 * <br>
	 * 開封時のコールバックは通信障害などの理由により、コールバック先のサーバは正しく処理を行えたけれど、<br>
	 * GS2側のインフラにレスポンスが届かず、結果的に処理が失敗する可能性を考慮する必要があります。<br>
	 * この場合、複数回の開封コールバックが呼び出される可能性がありますので、コールバック処理は冪等性を持った形で実装するようにしてください。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 開封結果
	 */
	public ReadMessageResult readMessage(ReadMessageRequest request) {
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/inbox/" + request.getInboxName() + "/message/" + request.getMessageId(), 
				credential, 
				ENDPOINT,
				ReadMessageRequest.Constant.MODULE, 
				ReadMessageRequest.Constant.FUNCTION,
				"");
		post.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(post, ReadMessageResult.class);
	}

	/**
	 * メッセージを削除する。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteMessage(DeleteMessageRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/inbox/" + request.getInboxName() + "/message/" + request.getMessageId(), 
				credential, 
				ENDPOINT,
				DeleteMessageRequest.Constant.MODULE, 
				DeleteMessageRequest.Constant.FUNCTION);
		delete.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		doRequest(delete, null);
	}
	
	/**
	 * メッセージを複数同時に既読にする。<br>
	 * <br>
	 * 受信ボックスの設定で開封時自動削除設定が有効な場合は、メッセージは削除されます。<br>
	 * <br>
	 * 連携用URLを呼び出す設定になっている場合、連携用URLにメッセージIDを付与したコールバックが実行されます。<br>
	 * このコールバックをうけて、持ち物を増やしたりすることでメッセージにアイテムを添付することができます。<br>
	 * <br>
	 * レスポンスには連携用URLを呼び出した際の応答内容も含まれますので、開封時にさらにメッセージを表示させるようなこともできます。<br>
	 * 例えば、連携用URLを呼び出した際に「アイテムを手に入れた」というレスポンスを返すことで、このAPIのレスポンスにその文字列も含んだ形で応答されますので、<br>
	 * 開封時にさらにその応答メッセージを使って画面にメッセージとして「アイテムを手に入れた」という表示をすることができます。<br>
	 * <br>
	 * 開封時のコールバックは通信障害などの理由により、コールバック先のサーバは正しく処理を行えたけれど、<br>
	 * GS2側のインフラにレスポンスが届かず、結果的に処理が失敗する可能性を考慮する必要があります。<br>
	 * この場合、複数回の開封コールバックが呼び出される可能性がありますので、コールバック処理は冪等性を持った形で実装するようにしてください。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 開封結果
	 */
	public ReadMessagesResult readMessages(ReadMessagesRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("messageIds", request.getMessageIds() == null ? null : String.join(",", request.getMessageIds()));
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/inbox/" + request.getInboxName() + "/message/multiple", 
				credential, 
				ENDPOINT,
				ReadMessagesRequest.Constant.MODULE, 
				ReadMessagesRequest.Constant.FUNCTION,
				body.toString());
		post.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(post, ReadMessagesResult.class);
	}

	/**
	 * メッセージを複数同時に削除する。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteMessages(DeleteMessagesRequest request) {
		String messageIds = String.join(",", request.getMessageIds());
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/inbox/" + request.getInboxName() + "/message/multiple?messageIds=" + messageIds, 
				credential, 
				ENDPOINT,
				DeleteMessagesRequest.Constant.MODULE, 
				DeleteMessagesRequest.Constant.FUNCTION);
		delete.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		doRequest(delete, null);
	}
	
}
