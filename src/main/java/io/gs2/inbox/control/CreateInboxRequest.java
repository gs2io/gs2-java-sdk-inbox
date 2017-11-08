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
public class CreateInboxRequest extends Gs2BasicRequest<CreateInboxRequest> {

	public static class Constant extends Gs2Inbox.Constant {
		public static final String FUNCTION = "CreateInbox";
	}

	/** サービスクラス */
	private String serviceClass;

	/** 受信ボックス名 */
	private String name;

	/** 開封時通知設定が有効な場合に通知するURL */
	private String cooperationUrl;

	/** 開封時自動削除機能を使用するか */
	private Boolean autoDelete;


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
	public CreateInboxRequest withServiceClass(String serviceClass) {
		setServiceClass(serviceClass);
		return this;
	}

	/**
	 * 受信ボックス名を取得
	 *
	 * @return 受信ボックス名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 受信ボックス名を設定
	 *
	 * @param name 受信ボックス名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 受信ボックス名を設定
	 *
	 * @param name 受信ボックス名
	 * @return this
	 */
	public CreateInboxRequest withName(String name) {
		setName(name);
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
	public CreateInboxRequest withCooperationUrl(String cooperationUrl) {
		setCooperationUrl(cooperationUrl);
		return this;
	}

	/**
	 * 開封時自動削除機能を使用するかを取得
	 *
	 * @return 開封時自動削除機能を使用するか
	 */
	public Boolean getAutoDelete() {
		return autoDelete;
	}

	/**
	 * 開封時自動削除機能を使用するかを設定
	 *
	 * @param autoDelete 開封時自動削除機能を使用するか
	 */
	public void setAutoDelete(Boolean autoDelete) {
		this.autoDelete = autoDelete;
	}

	/**
	 * 開封時自動削除機能を使用するかを設定
	 *
	 * @param autoDelete 開封時自動削除機能を使用するか
	 * @return this
	 */
	public CreateInboxRequest withAutoDelete(Boolean autoDelete) {
		setAutoDelete(autoDelete);
		return this;
	}

}