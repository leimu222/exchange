package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [member服务实现]
 */
public class MemberApiKey  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
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
	private Long memberId;
	/**
     * 
     */
	private String remark;
	/**
     * 
     */
	private String secretKey;
	
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
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 
	* @return String
    */
	public String getRemark(){
		return remark;
	}
	/**
	* 
	*/
	public void setRemark(String remark){
		this.remark = remark;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("apiKey:").append(getApiKey()).append(";");
		sb.append("apiName:").append(getApiName()).append(";");
		sb.append("bindIp:").append(getBindIp()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("expireTime:").append(getExpireTime()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("secretKey:").append(getSecretKey()).append(";");
		return sb.toString();
	}
}
