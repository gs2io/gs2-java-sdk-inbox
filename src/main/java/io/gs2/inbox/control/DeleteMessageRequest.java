package io.gs2.inbox.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.control.Gs2UserRequest;
import io.gs2.inbox.Gs2Inbox;

/**
 * メッセージ削除リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class DeleteMessageRequest extends Gs2UserRequest<DeleteMessageRequest> {

	public static class Constant extends Gs2Inbox.Constant {
		public static final String FUNCTION = "DeleteMessage";
	}

	/** 受信ボックス名 */
	String inboxName;
	/** メッセージID */
	String messageId;

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
	public DeleteMessageRequest withInboxName(String inboxName) {
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
	public DeleteMessageRequest withMessageId(String messageId) {
		setMessageId(messageId);
		return this;
	}
}
