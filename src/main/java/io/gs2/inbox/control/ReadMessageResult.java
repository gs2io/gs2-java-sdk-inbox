package io.gs2.inbox.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.inbox.model.Message;

/**
 * メッセージ取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ReadMessageResult {

	/** メッセージ */
	Message item;
	/** 連携用URLの応答値 */
	String cooperationResponse;

	/**
	 * メッセージを取得。
	 * 
	 * @return メッセージ
	 */
	public Message getItem() {
		return item;
	}
	
	/**
	 * メッセージを設定。
	 * 
	 * @param item メッセージ
	 */
	public void setItem(Message item) {
		this.item = item;
	}

	/**
	 * 連携用URLを呼び出した際のレスポンスを取得。
	 * 
	 * @return 連携用URLを呼び出した際のレスポンス
	 */
	public String getCooperationResponse() {
		return cooperationResponse;
	}
	
	/**
	 * 連携用URLを呼び出した際のレスポンスを設定。
	 * 
	 * @param cooperationResponse 連携用URLを呼び出した際のレスポンス
	 */
	public void setCooperationResponse(String cooperationResponse) {
		this.cooperationResponse = cooperationResponse;
	}
}
