package io.gs2.inbox.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.inbox.model.Inbox;

/**
 * 受信ボックスの更新結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UpdateInboxResult {
	
	Inbox item;
	
	/**
	 * 受信ボックスを取得。
	 * 
	 * @return 受信ボックス
	 */
	public Inbox getItem() {
		return item;
	}
	
	/**
	 * 受信ボックスを設定。
	 * 
	 * @param item 受信ボックス
	 */
	public void setItem(Inbox item) {
		this.item = item;
	}
	
	/**
	 * 受信ボックスを設定。
	 * 
	 * @param item 受信ボックス
	 * @return this
	 */
	public UpdateInboxResult withItem(Inbox item) {
		setItem(item);
		return this;
	}
}
