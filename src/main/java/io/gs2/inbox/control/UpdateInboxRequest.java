/*
 * Copyright 2016 Game Server Services, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package io.gs2.inbox.control;

import org.json.JSONObject;
import java.util.List;
import io.gs2.inbox.Gs2Inbox;
import io.gs2.control.Gs2BasicRequest;

/**
 * @author Game Server Services, Inc.
 */
@SuppressWarnings("serial")
public class UpdateInboxRequest extends Gs2BasicRequest<UpdateInboxRequest> {

	public static class Constant extends Gs2Inbox.Constant {
		public static final String FUNCTION = "UpdateInbox";
	}

	/** 受信ボックスの名前を指定します。 */
	private String inboxName;

	/** サービスクラス */
	private String serviceClass;

	/** 開封時通知設定が有効な場合に通知するURL */
	private String cooperationUrl;


	/**
	 * 受信ボックスの名前を指定します。を取得
	 *
	 * @return 受信ボックスの名前を指定します。
	 */
	public String getInboxName() {
		return inboxName;
	}

	/**
	 * 受信ボックスの名前を指定します。を設定
	 *
	 * @param inboxName 受信ボックスの名前を指定します。
	 */
	public void setInboxName(String inboxName) {
		this.inboxName = inboxName;
	}

	/**
	 * 受信ボックスの名前を指定します。を設定
	 *
	 * @param inboxName 受信ボックスの名前を指定します。
	 * @return this
	 */
	public UpdateInboxRequest withInboxName(String inboxName) {
		setInboxName(inboxName);
		return this;
	}

	/**
	 * サービスクラスを取得
	 *
	 * @return サービスクラス
	 */
	public String getServiceClass() {
		return serviceClass;
	}

	/**
	 * サービスクラスを設定
	 *
	 * @param serviceClass サービスクラス
	 */
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}

	/**
	 * サービスクラスを設定
	 *
	 * @param serviceClass サービスクラス
	 * @return this
	 */
	public UpdateInboxRequest withServiceClass(String serviceClass) {
		setServiceClass(serviceClass);
		return this;
	}

	/**
	 * 開封時通知設定が有効な場合に通知するURLを取得
	 *
	 * @return 開封時通知設定が有効な場合に通知するURL
	 */
	public String getCooperationUrl() {
		return cooperationUrl;
	}

	/**
	 * 開封時通知設定が有効な場合に通知するURLを設定
	 *
	 * @param cooperationUrl 開封時通知設定が有効な場合に通知するURL
	 */
	public void setCooperationUrl(String cooperationUrl) {
		this.cooperationUrl = cooperationUrl;
	}

	/**
	 * 開封時通知設定が有効な場合に通知するURLを設定
	 *
	 * @param cooperationUrl 開封時通知設定が有効な場合に通知するURL
	 * @return this
	 */
	public UpdateInboxRequest withCooperationUrl(String cooperationUrl) {
		setCooperationUrl(cooperationUrl);
		return this;
	}

}