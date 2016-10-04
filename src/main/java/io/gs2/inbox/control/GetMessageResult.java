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
public class GetMessageResult {

	/** メッセージ */
	Message item;
	
	/**
	 * 取得したメッセージを取得。
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
}
