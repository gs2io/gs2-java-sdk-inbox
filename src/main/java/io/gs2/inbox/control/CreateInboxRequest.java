package io.gs2.inbox.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.inbox.Gs2Inbox;

/**
 * 受信ボックスの作成リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class CreateInboxRequest extends Gs2BasicRequest<CreateInboxRequest> {

	public static class Constant extends Gs2Inbox.Constant {
		public static final String FUNCTION = "CreateInbox";
	}
	
	/** 受信ボックス名 */
	String name;
	/** サービスクラス */
	String serviceClass;
	/** 既読時自動削除設定 */
	Boolean autoDelete;
	/** 連携用URL */
	String cooperationUrl;
	
	/**
	 * 受信ボックス名を取得。
	 * 
	 * @return 受信ボックス名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 受信ボックス名を設定。
	 * 
	 * @param name 受信ボックス名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 受信ボックス名を設定。
	 * 
	 * @param name 受信ボックス名
	 * @return this
	 */
	public CreateInboxRequest withName(String name) {
		setName(name);
		return this;
	}
	
	/**
	 * サービスクラスを取得。
	 * 
	 * @return サービスクラス
	 */
	public String getServiceClass() {
		return serviceClass;
	}
	
	/**
	 * サービスクラスを設定。
	 * 
	 * @param serviceClass サービスクラス
	 */
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}
	
	/**
	 * サービスクラスを設定。
	 * 
	 * @param serviceClass サービスクラス
	 * @return this
	 */
	public CreateInboxRequest withServiceClass(String serviceClass) {
		setServiceClass(serviceClass);
		return this;
	}

	/**
	 * 既読時自動削除設定を取得。
	 * 
	 * @return 既読時自動削除設定
	 */
	public Boolean getAutoDelete() {
		return autoDelete;
	}
	
	/**
	 * 既読時自動削除設定を設定。
	 * 
	 * @param autoDelete 既読時自動削除設定
	 */
	public void setAutoDelete(Boolean autoDelete) {
		this.autoDelete = autoDelete;
	}
	
	/**
	 * 既読時自動削除設定を設定。
	 * 
	 * @param autoDelete 既読時自動削除設定
	 * @return this
	 */
	public CreateInboxRequest withAutoDelete(Boolean autoDelete) {
		setAutoDelete(autoDelete);
		return this;
	}
	
	/**
	 * 連携用URLを取得。
	 * 
	 * @return 連携用URL
	 */
	public String getCooperationUrl() {
		return cooperationUrl;
	}
	
	/**
	 * 連携用URLを設定。
	 * 
	 * @param cooperationUrl 連携用URL
	 */
	public void setCooperationUrl(String cooperationUrl) {
		this.cooperationUrl = cooperationUrl;
	}
	
	/**
	 * 連携用URLを設定。
	 * 
	 * @param cooperationUrl 連携用URL
	 * @return this
	 */
	public CreateInboxRequest withCooperationUrl(String cooperationUrl) {
		setCooperationUrl(cooperationUrl);
		return this;
	}
}
