package io.gs2.inbox.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.inbox.model.Message;

/**
 * メッセージ取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ReadMessagesResult {

	/** メッセージリスト */
	List<Message> items;
	/** 連携用URLの応答値 */
	String cooperationResponse;

	/**
	 * メッセージリストを取得。
	 * 
	 * @return メッセージリスト
	 */
	public List<Message> getItems() {
		return items;
	}
	
	/**
	 * メッセージリストを設定。
	 * 
	 * @param items メッセージリスト
	 */
	public void setItems(List<Message> items) {
		this.items = items;
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
