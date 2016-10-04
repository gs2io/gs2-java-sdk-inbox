package io.gs2.inbox.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.inbox.Gs2Inbox;

/**
 * 受信ボックスの状態取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class GetInboxStatusRequest extends Gs2BasicRequest<GetInboxStatusRequest> {

	public static class Constant extends Gs2Inbox.Constant {
		public static final String FUNCTION = "GetInboxStatus";
	}
	
	/** 受信ボックス名 */
	String inboxName;
	
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
	public GetInboxStatusRequest withInboxName(String inboxName) {
		setInboxName(inboxName);
		return this;
	}
}
