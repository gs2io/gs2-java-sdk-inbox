package io.gs2.inbox.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.inbox.Gs2Inbox;

/**
 * メッセージの取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class GetMessageRequest extends Gs2BasicRequest<GetMessageRequest> {

	public static class Constant extends Gs2Inbox.Constant {
		public static final String FUNCTION = "GetMessage";
	}
	
	/** メッセージ名 */
	String inboxName;
	/** メッセージID */
	String messageId;
	
	/**
	 * メッセージ名を取得。
	 * 
	 * @return メッセージ名
	 */
	public String getInboxName() {
		return inboxName;
	}
	
	/**
	 * メッセージ名を設定。
	 * 
	 * @param inboxName メッセージ名
	 */
	public void setInboxName(String inboxName) {
		this.inboxName = inboxName;
	}
	
	/**
	 * メッセージ名を設定。
	 * 
	 * @param inboxName メッセージ名
	 * @return this
	 */
	public GetMessageRequest withInboxName(String inboxName) {
		setInboxName(inboxName);
		return this;
	}

	/**
	 * メッセージIDを取得。
	 * 
	 * @return メッセージID
	 */
	public String getMessageId() {
		return messageId;
	}
	
	/**
	 * メッセージIDを設定。
	 * 
	 * @param messageId メッセージID
	 */
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	
	/**
	 * メッセージIDを設定。
	 * 
	 * @param messageId メッセージID
	 * @return this
	 */
	public GetMessageRequest withMessageId(String messageId) {
		setMessageId(messageId);
		return this;
	}
}
