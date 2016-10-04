package io.gs2.inbox.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.inbox.Gs2Inbox;

/**
 * 受信ボックスの更新リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class UpdateInboxRequest extends Gs2BasicRequest<UpdateInboxRequest> {

	public static class Constant extends Gs2Inbox.Constant {
		public static final String FUNCTION = "UpdateInbox";
	}

	/** 受信ボックス名 */
	String inboxName;
	/** サービスクラス */
	String serviceClass;
	/** 連携用URL */
	String cooperationUrl;

	/**
	 * 受信ボックス名を取得。
	 * 
	 * @return 受信ボックス名
	 */
	public String getInboxName() {
		return inboxName;
	}
	
	/**
	 * 受信ボックス名を設定。
	 * 
	 * @param inboxName 受信ボックス名
	 */
	public void setInboxName(String inboxName) {
		this.inboxName = inboxName;
	}
	
	/**
	 * 受信ボックス名を設定。
	 * 
	 * @param inboxName 受信ボックス名
	 * @return this
	 */
	public UpdateInboxRequest withInboxName(String inboxName) {
		setInboxName(inboxName);
		return this;
	}
	
	/**
	 * サービスクラスを取得。
	 * 
	 * @return サービスクラス
	 */
	public String getServiceClass() {
		return serviceClass;
	}
	
	/**
	 * サービスクラスを設定。
	 * 
	 * @param serviceClass サービスクラス
	 */
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}
	
	/**
	 * サービスクラスを設定。
	 * 
	 * @param serviceClass サービスクラス
	 * @return this
	 */
	public UpdateInboxRequest withServiceClass(String serviceClass) {
		setServiceClass(serviceClass);
		return this;
	}
	
	/**
	 * 連携用URLを取得。
	 * 
	 * @return 連携用URL
	 */
	public String getCooperationUrl() {
		return cooperationUrl;
	}
	
	/**
	 * 連携用URLを設定。
	 * 
	 * @param cooperationUrl 連携用URL
	 */
	public void setCooperationUrl(String cooperationUrl) {
		this.cooperationUrl = cooperationUrl;
	}
	
	/**
	 * 連携用URLを設定。
	 * 
	 * @param cooperationUrl 連携用URL
	 * @return this
	 */
	public UpdateInboxRequest withCooperationUrl(String cooperationUrl) {
		setCooperationUrl(cooperationUrl);
		return this;
	}
}
