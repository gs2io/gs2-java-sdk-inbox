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

package io.gs2.inbox.model;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 受信ボックス
 *
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Inbox implements Serializable {

	/** 受信ボックス名 */
	private String name;

	/** 開封時自動削除 */
	private Boolean autoDelete;

	/** 受信ボックスGRN */
	private String inboxId;

	/** サービスクラス */
	private String serviceClass;

	/** メッセージ開封完了時 に実行されるGS2-Script */
	private String readMessageDoneTriggerScript;

	/** 作成日時(エポック秒) */
	private Integer createAt;

	/** メッセージ削除完了時 に実行されるGS2-Script */
	private String deleteMessageDoneTriggerScript;

	/** メッセージ受信完了時 に実行されるGS2-Script */
	private String receiveMessageDoneTriggerScript;

	/** オーナーID */
	private String ownerId;

	/** メッセージの開封通知先URL */
	private String cooperationUrl;

	/** メッセージ削除時 に実行されるGS2-Script */
	private String deleteMessageTriggerScript;

	/** メッセージ受信時 に実行されるGS2-Script */
	private String receiveMessageTriggerScript;

	/** 最終更新日時(エポック秒) */
	private Integer updateAt;

	/** メッセージ開封時 に実行されるGS2-Script */
	private String readMessageTriggerScript;

	/** 説明文 */
	private String description;


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
	 * 開封時自動削除を取得
	 *
	 * @return 開封時自動削除
	 */
	public Boolean getAutoDelete() {
		return autoDelete;
	}

	/**
	 * 開封時自動削除を設定
	 *
	 * @param autoDelete 開封時自動削除
	 */
	public void setAutoDelete(Boolean autoDelete) {
		this.autoDelete = autoDelete;
	}

	/**
	 * 受信ボックスGRNを取得
	 *
	 * @return 受信ボックスGRN
	 */
	public String getInboxId() {
		return inboxId;
	}

	/**
	 * 受信ボックスGRNを設定
	 *
	 * @param inboxId 受信ボックスGRN
	 */
	public void setInboxId(String inboxId) {
		this.inboxId = inboxId;
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
	 * メッセージ開封完了時 に実行されるGS2-Scriptを取得
	 *
	 * @return メッセージ開封完了時 に実行されるGS2-Script
	 */
	public String getReadMessageDoneTriggerScript() {
		return readMessageDoneTriggerScript;
	}

	/**
	 * メッセージ開封完了時 に実行されるGS2-Scriptを設定
	 *
	 * @param readMessageDoneTriggerScript メッセージ開封完了時 に実行されるGS2-Script
	 */
	public void setReadMessageDoneTriggerScript(String readMessageDoneTriggerScript) {
		this.readMessageDoneTriggerScript = readMessageDoneTriggerScript;
	}

	/**
	 * 作成日時(エポック秒)を取得
	 *
	 * @return 作成日時(エポック秒)
	 */
	public Integer getCreateAt() {
		return createAt;
	}

	/**
	 * 作成日時(エポック秒)を設定
	 *
	 * @param createAt 作成日時(エポック秒)
	 */
	public void setCreateAt(Integer createAt) {
		this.createAt = createAt;
	}

	/**
	 * メッセージ削除完了時 に実行されるGS2-Scriptを取得
	 *
	 * @return メッセージ削除完了時 に実行されるGS2-Script
	 */
	public String getDeleteMessageDoneTriggerScript() {
		return deleteMessageDoneTriggerScript;
	}

	/**
	 * メッセージ削除完了時 に実行されるGS2-Scriptを設定
	 *
	 * @param deleteMessageDoneTriggerScript メッセージ削除完了時 に実行されるGS2-Script
	 */
	public void setDeleteMessageDoneTriggerScript(String deleteMessageDoneTriggerScript) {
		this.deleteMessageDoneTriggerScript = deleteMessageDoneTriggerScript;
	}

	/**
	 * メッセージ受信完了時 に実行されるGS2-Scriptを取得
	 *
	 * @return メッセージ受信完了時 に実行されるGS2-Script
	 */
	public String getReceiveMessageDoneTriggerScript() {
		return receiveMessageDoneTriggerScript;
	}

	/**
	 * メッセージ受信完了時 に実行されるGS2-Scriptを設定
	 *
	 * @param receiveMessageDoneTriggerScript メッセージ受信完了時 に実行されるGS2-Script
	 */
	public void setReceiveMessageDoneTriggerScript(String receiveMessageDoneTriggerScript) {
		this.receiveMessageDoneTriggerScript = receiveMessageDoneTriggerScript;
	}

	/**
	 * オーナーIDを取得
	 *
	 * @return オーナーID
	 */
	public String getOwnerId() {
		return ownerId;
	}

	/**
	 * オーナーIDを設定
	 *
	 * @param ownerId オーナーID
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	/**
	 * メッセージの開封通知先URLを取得
	 *
	 * @return メッセージの開封通知先URL
	 */
	public String getCooperationUrl() {
		return cooperationUrl;
	}

	/**
	 * メッセージの開封通知先URLを設定
	 *
	 * @param cooperationUrl メッセージの開封通知先URL
	 */
	public void setCooperationUrl(String cooperationUrl) {
		this.cooperationUrl = cooperationUrl;
	}

	/**
	 * メッセージ削除時 に実行されるGS2-Scriptを取得
	 *
	 * @return メッセージ削除時 に実行されるGS2-Script
	 */
	public String getDeleteMessageTriggerScript() {
		return deleteMessageTriggerScript;
	}

	/**
	 * メッセージ削除時 に実行されるGS2-Scriptを設定
	 *
	 * @param deleteMessageTriggerScript メッセージ削除時 に実行されるGS2-Script
	 */
	public void setDeleteMessageTriggerScript(String deleteMessageTriggerScript) {
		this.deleteMessageTriggerScript = deleteMessageTriggerScript;
	}

	/**
	 * メッセージ受信時 に実行されるGS2-Scriptを取得
	 *
	 * @return メッセージ受信時 に実行されるGS2-Script
	 */
	public String getReceiveMessageTriggerScript() {
		return receiveMessageTriggerScript;
	}

	/**
	 * メッセージ受信時 に実行されるGS2-Scriptを設定
	 *
	 * @param receiveMessageTriggerScript メッセージ受信時 に実行されるGS2-Script
	 */
	public void setReceiveMessageTriggerScript(String receiveMessageTriggerScript) {
		this.receiveMessageTriggerScript = receiveMessageTriggerScript;
	}

	/**
	 * 最終更新日時(エポック秒)を取得
	 *
	 * @return 最終更新日時(エポック秒)
	 */
	public Integer getUpdateAt() {
		return updateAt;
	}

	/**
	 * 最終更新日時(エポック秒)を設定
	 *
	 * @param updateAt 最終更新日時(エポック秒)
	 */
	public void setUpdateAt(Integer updateAt) {
		this.updateAt = updateAt;
	}

	/**
	 * メッセージ開封時 に実行されるGS2-Scriptを取得
	 *
	 * @return メッセージ開封時 に実行されるGS2-Script
	 */
	public String getReadMessageTriggerScript() {
		return readMessageTriggerScript;
	}

	/**
	 * メッセージ開封時 に実行されるGS2-Scriptを設定
	 *
	 * @param readMessageTriggerScript メッセージ開封時 に実行されるGS2-Script
	 */
	public void setReadMessageTriggerScript(String readMessageTriggerScript) {
		this.readMessageTriggerScript = readMessageTriggerScript;
	}

	/**
	 * 説明文を取得
	 *
	 * @return 説明文
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 説明文を設定
	 *
	 * @param description 説明文
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}