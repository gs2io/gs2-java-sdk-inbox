package io.gs2.inbox.control;

import io.gs2.control.Gs2UserRequest;
import io.gs2.inbox.Gs2Inbox;

/**
 * メッセージ一覧の取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DescribeMessageRequest extends Gs2UserRequest<DescribeMessageRequest> {

	public static class Constant extends Gs2Inbox.Constant {
		public static final String FUNCTION = "DescribeMessage";
	}

	/** 受信ボックス名 */
	String inboxName;
	/** 取得件数 */
	Integer limit;
	/** 取得開始位置トークン */
	String pageToken;

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
	public DescribeMessageRequest withInboxName(String inboxName) {
		setInboxName(inboxName);
		return this;
	}

	/**
	 * 取得開始位置トークンを取得。
	 * 
	 * @return 取得開始位置トークン
	 */
	public String getPageToken() {
		return pageToken;
	}
	
	/**
	 * 取得開始位置トークンを設定。
	 * 
	 * @param pageToken 取得開始位置トークン
	 */
	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
	}
	
	/**
	 * 取得開始位置トークンを設定。
	 * 
	 * @param pageToken 取得開始位置トークン
	 * @return this
	 */
	public DescribeMessageRequest withPageToken(String pageToken) {
		setPageToken(pageToken);
		return this;
	}

	/**
	 * 取得件数を取得。
	 * 
	 * @return 取得件数
	 */
	public Integer getLimit() {
		return limit;
	}
	
	/**
	 * 取得件数を設定。
	 * 
	 * @param limit 取得件数
	 */
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	
	/**
	 * 取得件数を設定。
	 * 
	 * @param limit 取得件数
	 * @return this
	 */
	public DescribeMessageRequest withLimit(Integer limit) {
		setLimit(limit);
		return this;
	}
}
