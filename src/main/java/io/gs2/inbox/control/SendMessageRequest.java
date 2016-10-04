package io.gs2.inbox.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.inbox.Gs2Inbox;

/**
 * メッセージ送信リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class SendMessageRequest extends Gs2BasicRequest<SendMessageRequest> {

	public static class Constant extends Gs2Inbox.Constant {
		public static final String FUNCTION = "SendMessage";
	}
	
	/** 受信ボックス名 */
	String inboxName;
	/** 受信者ID */
	String user;
	/** メッセージ本文(〜1024byte) */
	String message;
	/** サーバ間連携を必要とするか */
	Boolean cooperation;

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
	public SendMessageRequest withInboxName(String inboxName) {
		setInboxName(inboxName);
		return this;
	}

	/**
	 * 受信者IDを取得。
	 * 
	 * @return 受信者ID
	 */
	public String getUser() {
		return user;
	}
	
	/**
	 * 受信者IDを設定。
	 * 
	 * @param user 受信者ID
	 */
	public void setUser(String user) {
		this.user = user;
	}
	
	/**
	 * 受信者IDを設定。
	 * 
	 * @param user 受信者ID
	 * @return this
	 */
	public SendMessageRequest withUserId(String user) {
		setUser(user);
		return this;
	}
	
	/**
	 * メッセージ本文を取得。
	 * 
	 * @return メッセージ本文
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * メッセージ本文を設定。
	 * 
	 * @param message メッセージ本文
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * メッセージ本文を設定。
	 * 
	 * @param message メッセージ本文
	 * @return this
	 */
	public SendMessageRequest withMessage(String message) {
		setMessage(message);
		return this;
	}
	
	/**
	 * サーバ間連携を必要とするかを取得。
	 * 
	 * @return サーバ間連携を必要とするか
	 */
	public Boolean getCooperation() {
		return cooperation;
	}
	
	/**
	 * サーバ間連携を必要とするかを設定。
	 * 
	 * @param cooperation サーバ間連携を必要とするか
	 */
	public void setCooperation(Boolean cooperation) {
		this.cooperation = cooperation;
	}
	
	/**
	 * サーバ間連携を必要とするかを設定。
	 * 
	 * @param cooperation サーバ間連携を必要とするか
	 * @return this
	 */
	public SendMessageRequest withCooperation(Boolean cooperation) {
		setCooperation(cooperation);
		return this;
	}
}
