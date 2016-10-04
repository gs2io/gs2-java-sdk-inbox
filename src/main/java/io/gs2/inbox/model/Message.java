package io.gs2.inbox.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * メッセージ
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Message implements Serializable {

	/** メッセージID */
	String messageId;
	/** 受信ボックスID */
	String inboxId;
	/** 受信ユーザID */
	String userId;
	/** メッセージ本文 */
	String message;
	/** 開封時に連携用URLを呼び出すか */
	Boolean cooperation;
	/** 受信日時 */
	Long date;
	/** 既読状態 */
	Boolean read;
	
	/**
	 * メッセージIDを取得
	 * 
	 * @return メッセージID
	 */
	public String getMessageId() {
		return messageId;
	}
	
	/**
	 * メッセージIDを設定
	 * 
	 * @param messageId メッセージID
	 */
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	
	/**
	 * 受信ボックスIDを取得
	 * 
	 * @return 受信ボックスID
	 */
	public String getInboxId() {
		return inboxId;
	}
	
	/**
	 * 受信ボックスIDを設定
	 * 
	 * @param inboxId 受信ボックスID
	 */
	public void setInboxId(String inboxId) {
		this.inboxId = inboxId;
	}
	
	/**
	 * 受信ユーザIDを取得
	 * 
	 * @return 受信ユーザID
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * 受信ユーザIDを設定
	 * 
	 * @param userId 受信ユーザID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * メッセージ本文を取得
	 * 
	 * @return メッセージ本文
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * メッセージ本文を設定
	 * 
	 * @param message メッセージ本文
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * 開封時に連携用URLを呼び出すかを取得
	 * 
	 * @return 開封時に連携用URLを呼び出すか
	 */
	public Boolean getCooperation() {
		return cooperation;
	}
	
	/**
	 * 開封時に連携用URLを呼び出すかを設定
	 * 
	 * @param cooperation 開封時に連携用URLを呼び出すか
	 */
	public void setCooperation(Boolean cooperation) {
		this.cooperation = cooperation;
	}
	
	/**
	 * 受信日時を取得
	 * 
	 * @return 受信日時
	 */
	public Long getDate() {
		return date;
	}
	
	/**
	 * 受信日時を設定
	 * 
	 * @param date 受信日時
	 */
	public void setDate(Long date) {
		this.date = date;
	}
	
	/**
	 * 既読状態を取得
	 * 
	 * @return 既読状態
	 */
	public Boolean getRead() {
		return read;
	}
	
	/**
	 * 既読状態を設定
	 * 
	 * @param read 既読状態
	 */
	public void setRead(Boolean read) {
		this.read = read;
	}
}
