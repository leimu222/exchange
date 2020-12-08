package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [tb服务实现]
 */
public class TbSms  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String keyId;
	/**
     * 
     */
	private String keySecret;
	/**
     * 
     */
	private String signId;
	/**
     * 
     */
	private String smsName;
	/**
     * 
     */
	private String smsStatus;
	/**
     * 
     */
	private String templateId;
	
	// setter and getter
	/**
	* 
	* @return Long
    */
	public Long getId(){
		return id;
	}
	/**
	* 
	*/
	public void setId(Long id){
		this.id = id;
	}
	/**
	* 
	* @return String
    */
	public String getKeyId(){
		return keyId;
	}
	/**
	* 
	*/
	public void setKeyId(String keyId){
		this.keyId = keyId;
	}
	/**
	* 
	* @return String
    */
	public String getKeySecret(){
		return keySecret;
	}
	/**
	* 
	*/
	public void setKeySecret(String keySecret){
		this.keySecret = keySecret;
	}
	/**
	* 
	* @return String
    */
	public String getSignId(){
		return signId;
	}
	/**
	* 
	*/
	public void setSignId(String signId){
		this.signId = signId;
	}
	/**
	* 
	* @return String
    */
	public String getSmsName(){
		return smsName;
	}
	/**
	* 
	*/
	public void setSmsName(String smsName){
		this.smsName = smsName;
	}
	/**
	* 
	* @return String
    */
	public String getSmsStatus(){
		return smsStatus;
	}
	/**
	* 
	*/
	public void setSmsStatus(String smsStatus){
		this.smsStatus = smsStatus;
	}
	/**
	* 
	* @return String
    */
	public String getTemplateId(){
		return templateId;
	}
	/**
	* 
	*/
	public void setTemplateId(String templateId){
		this.templateId = templateId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("keyId:").append(getKeyId()).append(";");
		sb.append("keySecret:").append(getKeySecret()).append(";");
		sb.append("signId:").append(getSignId()).append(";");
		sb.append("smsName:").append(getSmsName()).append(";");
		sb.append("smsStatus:").append(getSmsStatus()).append(";");
		sb.append("templateId:").append(getTemplateId()).append(";");
		return sb.toString();
	}
}
