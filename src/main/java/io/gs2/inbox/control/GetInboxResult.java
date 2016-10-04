package io.gs2.inbox.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.inbox.model.Inbox;

/**
 * 受信ボックス取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetInboxResult {

	/** 受信ボックス */
	Inbox item;
	
	/**
	 * 取得した受信ボックスを取得。
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
}
