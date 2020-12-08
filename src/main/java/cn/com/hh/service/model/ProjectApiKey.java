package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [project服务实现]
 */
public class ProjectApiKey  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Integer id;
	/**
     * 
     */
	private String apiKey;
	/**
     * 
     */
	private String apiName;
	/**
     * 
     */
	private String bindIp;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private java.util.Date expireTime;
	/**
     * 
     */
	private String secretKey;
	/**
     * 
     */
	private String rsaPrivateKey;
	
	// setter and getter
	/**
	* 
	* @return Integer
    */
	public Integer getId(){
		return id;
	}
	/**
	* 
	*/
	public void setId(Integer id){
		this.id = id;
	}
	/**
	* 
	* @return String
    */
	public String getApiKey(){
		return apiKey;
	}
	/**
	* 
	*/
	public void setApiKey(String apiKey){
		this.apiKey = apiKey;
	}
	/**
	* 
	* @return String
    */
	public String getApiName(){
		return apiName;
	}
	/**
	* 
	*/
	public void setApiName(String apiName){
		this.apiName = apiName;
	}
	/**
	* 
	* @return String
    */
	public String getBindIp(){
		return bindIp;
	}
	/**
	* 
	*/
	public void setBindIp(String bindIp){
		this.bindIp = bindIp;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getCreateTime(){
		return createTime;
	}
	/**
	* 
	*/
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getExpireTime(){
		return expireTime;
	}
	/**
	* 
	*/
	public void setExpireTime(java.util.Date expireTime){
		this.expireTime = expireTime;
	}
	/**
	* 
	* @return String
    */
	public String getSecretKey(){
		return secretKey;
	}
	/**
	* 
	*/
	public void setSecretKey(String secretKey){
		this.secretKey = secretKey;
	}
	/**
	* 
	* @return String
    */
	public String getRsaPrivateKey(){
		return rsaPrivateKey;
	}
	/**
	* 
	*/
	public void setRsaPrivateKey(String rsaPrivateKey){
		this.rsaPrivateKey = rsaPrivateKey;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("apiKey:").append(getApiKey()).append(";");
		sb.append("apiName:").append(getApiName()).append(";");
		sb.append("bindIp:").append(getBindIp()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("expireTime:").append(getExpireTime()).append(";");
		sb.append("secretKey:").append(getSecretKey()).append(";");
		sb.append("rsaPrivateKey:").append(getRsaPrivateKey()).append(";");
		return sb.toString();
	}
}
