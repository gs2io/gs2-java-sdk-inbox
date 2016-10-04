package io.gs2.inbox.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.inbox.Gs2Inbox;

/**
 * サービスクラス一覧の取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DescribeServiceClassRequest extends Gs2BasicRequest<DescribeServiceClassRequest> {

	public static class Constant extends Gs2Inbox.Constant {
		public static final String FUNCTION = "DescribeServiceClass";
	}
}
