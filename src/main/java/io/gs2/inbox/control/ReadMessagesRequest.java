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
import io.gs2.inbox.model.*;
import io.gs2.inbox.Gs2Inbox;
import io.gs2.control.Gs2UserRequest;

/**
 * @author Game Server Services, Inc.
 */
@SuppressWarnings("serial")
public class ReadMessagesRequest extends Gs2UserRequest<ReadMessagesRequest> {

	public static class Constant extends Gs2Inbox.Constant {
		public static final String FUNCTION = "ReadMessages";
	}

	/** 受信ボックスの名前を指定します。 */
	private String inboxName;

	/** カンマ区切りの開封するメッセージのメッセージIDリスト */
	private String messageIds;


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
	public ReadMessagesRequest withInboxName(String inboxName) {
		setInboxName(inboxName);
		return this;
	}

	/**
	 * カンマ区切りの開封するメッセージのメッセージIDリストを取得
	 *
	 * @return カンマ区切りの開封するメッセージのメッセージIDリスト
	 */
	public String getMessageIds() {
		return messageIds;
	}

	/**
	 * カンマ区切りの開封するメッセージのメッセージIDリストを設定
	 *
	 * @param messageIds カンマ区切りの開封するメッセージのメッセージIDリスト
	 */
	public void setMessageIds(String messageIds) {
		this.messageIds = messageIds;
	}

	/**
	 * カンマ区切りの開封するメッセージのメッセージIDリストを設定
	 *
	 * @param messageIds カンマ区切りの開封するメッセージのメッセージIDリスト
	 * @return this
	 */
	public ReadMessagesRequest withMessageIds(String messageIds) {
		setMessageIds(messageIds);
		return this;
	}

}