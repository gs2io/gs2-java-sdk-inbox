package io.gs2.inbox.model;

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

	/** 受信ボックスID */
	String inboxId;
	/** オーナーID */
	String ownerId;
	/** 受信ボックス名 */
	String name;
	/** サービスクラス */
	String serviceClass;
	/** 自動削除設定 */
	Boolean autoDelete;
	/** 連携用URL */
	String cooperationUrl;
	/** 作成日時 */
	Long createAt;
	
	/**
	 * 受信ボックスIDを取得
	 * 
	 * @return 受信ボックスID
	 */
	public String getInboxId() {
		return inboxId;
	}
	
	/**
	 * 受信ボックスIDを設定
	 * 
	 * @param inboxId 受信ボックスID
	 */
	public void setInboxId(String inboxId) {
		this.inboxId = inboxId;
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
	 * 開封時自動削除を取得
	 * 
	 * @return 開封時自動削除
	 */
	public String getCooperationUrl() {
		return cooperationUrl;
	}
	
	/**
	 * 連携用URLを設定
	 * 
	 * @param cooperationUrl 連携用URL
	 */
	public void setCooperationUrl(String cooperationUrl) {
		this.cooperationUrl = cooperationUrl;
	}
	
	/**
	 * 作成日時を取得
	 * 
	 * @return 作成日時
	 */
	public Long getCreateAt() {
		return createAt;
	}
	
	/**
	 * 作成日時を設定
	 * 
	 * @param createAt 作成日時
	 */
	public void setCreateAt(Long createAt) {
		this.createAt = createAt;
	}
}
