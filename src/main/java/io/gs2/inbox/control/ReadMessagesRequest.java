package io.gs2.inbox.control;

import java.util.List;

import io.gs2.control.Gs2UserRequest;
import io.gs2.inbox.Gs2Inbox;

/**
 * メッセージ複数同時既読リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class ReadMessagesRequest extends Gs2UserRequest<ReadMessagesRequest> {

	public static class Constant extends Gs2Inbox.Constant {
		public static final String FUNCTION = "ReadMessages";
	}

	/** 受信ボックス名 */
	String inboxName;
	/** メッセージIDリスト */
	List<String> messageIds;

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
	public ReadMessagesRequest withInboxName(String inboxName) {
		setInboxName(inboxName);
		return this;
	}

	/**
	 * メッセージIDリストを取得。
	 * 
	 * @return メッセージID
	 */
	public List<String> getMessageIds() {
		return messageIds;
	}
	
	/**
	 * メッセージIDリストを設定。
	 * 
	 * @param messageIds メッセージIDリスト
	 */
	public void setMessageIds(List<String> messageIds) {
		this.messageIds = messageIds;
	}
	
	/**
	 * メッセージIDリストを設定。
	 * 
	 * @param messageIds メッセージIDリスト
	 * @return this
	 */
	public ReadMessagesRequest withMessageIds(List<String> messageIds) {
		setMessageIds(messageIds);
		return this;
	}
}
