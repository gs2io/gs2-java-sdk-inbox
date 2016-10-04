package io.gs2.inbox.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.inbox.model.Message;

/**
 * メッセージ送信結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class SendMessageResult {
	
	Message item;
	
	/**
	 * 受信ボックスを取得。
	 * 
	 * @return 受信ボックス
	 */
	public Message getItem() {
		return item;
	}
	
	/**
	 * 受信ボックスを設定。
	 * 
	 * @param item 受信ボックス
	 */
	public void setItem(Message item) {
		this.item = item;
	}
	
	/**
	 * 受信ボックスを設定。
	 * 
	 * @param item 受信ボックス
	 * @return this
	 */
	public SendMessageResult withItem(Message item) {
		setItem(item);
		return this;
	}
}
