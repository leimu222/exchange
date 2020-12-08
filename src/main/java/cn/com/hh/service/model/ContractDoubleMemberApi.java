package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public class ContractDoubleMemberApi  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private Long memberId;
	/**
     * 来源交易所
     */
	private Long fromExchangeId;
	/**
     * API_KEY
     */
	private String apiKey;
	/**
     * SECRET_KEY
     */
	private String secretKey;
	/**
     * passphrase
     */
	private String passphrase;
	/**
     * 可用状态 0-不可以 1-可用；
     */
	private Boolean status;
	/**
     * 是否为默认使用的api；0-否；1-是
     */
	private Boolean ifDefault;
	/**
     * 删除状态 0-未删除 1-已删除
     */
	private Boolean deleteFlag;
	/**
     * 
     */
	private Long sequence;
	
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
	* 来源交易所
	* @return Long
    */
	public Long getFromExchangeId(){
		return fromExchangeId;
	}
	/**
	* 来源交易所
	*/
	public void setFromExchangeId(Long fromExchangeId){
		this.fromExchangeId = fromExchangeId;
	}
	/**
	* API_KEY
	* @return String
    */
	public String getApiKey(){
		return apiKey;
	}
	/**
	* API_KEY
	*/
	public void setApiKey(String apiKey){
		this.apiKey = apiKey;
	}
	/**
	* SECRET_KEY
	* @return String
    */
	public String getSecretKey(){
		return secretKey;
	}
	/**
	* SECRET_KEY
	*/
	public void setSecretKey(String secretKey){
		this.secretKey = secretKey;
	}
	/**
	* passphrase
	* @return String
    */
	public String getPassphrase(){
		return passphrase;
	}
	/**
	* passphrase
	*/
	public void setPassphrase(String passphrase){
		this.passphrase = passphrase;
	}
	/**
	* 可用状态 0-不可以 1-可用；
	* @return Boolean
    */
	public Boolean getStatus(){
		return status;
	}
	/**
	* 可用状态 0-不可以 1-可用；
	*/
	public void setStatus(Boolean status){
		this.status = status;
	}
	/**
	* 是否为默认使用的api；0-否；1-是
	* @return Boolean
    */
	public Boolean getIfDefault(){
		return ifDefault;
	}
	/**
	* 是否为默认使用的api；0-否；1-是
	*/
	public void setIfDefault(Boolean ifDefault){
		this.ifDefault = ifDefault;
	}
	/**
	* 删除状态 0-未删除 1-已删除
	* @return Boolean
    */
	public Boolean getDeleteFlag(){
		return deleteFlag;
	}
	/**
	* 删除状态 0-未删除 1-已删除
	*/
	public void setDeleteFlag(Boolean deleteFlag){
		this.deleteFlag = deleteFlag;
	}
	/**
	* 
	* @return Long
    */
	public Long getSequence(){
		return sequence;
	}
	/**
	* 
	*/
	public void setSequence(Long sequence){
		this.sequence = sequence;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("fromExchangeId:").append(getFromExchangeId()).append(";");
		sb.append("apiKey:").append(getApiKey()).append(";");
		sb.append("secretKey:").append(getSecretKey()).append(";");
		sb.append("passphrase:").append(getPassphrase()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("ifDefault:").append(getIfDefault()).append(";");
		sb.append("deleteFlag:").append(getDeleteFlag()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
