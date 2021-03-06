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
import io.gs2.control.Gs2BasicRequest;

/**
 * @author Game Server Services, Inc.
 */
@SuppressWarnings("serial")
public class DeleteMessageRequest extends Gs2BasicRequest<DeleteMessageRequest> {

	public static class Constant extends Gs2Inbox.Constant {
		public static final String FUNCTION = "DeleteMessage";
	}

	/** 受信ボックスの名前を指定します。 */
	private String inboxName;

	/** 削除するメッセージIDを指定します。 */
	private String messageId;


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
	public DeleteMessageRequest withInboxName(String inboxName) {
		setInboxName(inboxName);
		return this;
	}

	/**
	 * 削除するメッセージIDを指定します。を取得
	 *
	 * @return 削除するメッセージIDを指定します。
	 */
	public String getMessageId() {
		return messageId;
	}

	/**
	 * 削除するメッセージIDを指定します。を設定
	 *
	 * @param messageId 削除するメッセージIDを指定します。
	 */
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	/**
	 * 削除するメッセージIDを指定します。を設定
	 *
	 * @param messageId 削除するメッセージIDを指定します。
	 * @return this
	 */
	public DeleteMessageRequest withMessageId(String messageId) {
		setMessageId(messageId);
		return this;
	}

}