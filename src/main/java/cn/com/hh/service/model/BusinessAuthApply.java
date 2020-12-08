package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [business服务实现]
 */
public class BusinessAuthApply  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 保证金数额
     */
	private java.math.BigDecimal amount;
	/**
     * 
     */
	private java.util.Date auditingTime;
	/**
     * 
     */
	private String authInfo;
	/**
     * 
     */
	private Integer certifiedBusinessStatus;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private String depositRecordId;
	/**
     * 
     */
	private String detail;
	/**
     * 
     */
	private java.util.Date updateTime;
	/**
     * 
     */
	private Long businessAuthDepositId;
	/**
     * 
     */
	private Long memberId;
	
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
	* 保证金数额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 保证金数额
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getAuditingTime(){
		return auditingTime;
	}
	/**
	* 
	*/
	public void setAuditingTime(java.util.Date auditingTime){
		this.auditingTime = auditingTime;
	}
	/**
	* 
	* @return String
    */
	public String getAuthInfo(){
		return authInfo;
	}
	/**
	* 
	*/
	public void setAuthInfo(String authInfo){
		this.authInfo = authInfo;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getCertifiedBusinessStatus(){
		return certifiedBusinessStatus;
	}
	/**
	* 
	*/
	public void setCertifiedBusinessStatus(Integer certifiedBusinessStatus){
		this.certifiedBusinessStatus = certifiedBusinessStatus;
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
	* @return String
    */
	public String getDepositRecordId(){
		return depositRecordId;
	}
	/**
	* 
	*/
	public void setDepositRecordId(String depositRecordId){
		this.depositRecordId = depositRecordId;
	}
	/**
	* 
	* @return String
    */
	public String getDetail(){
		return detail;
	}
	/**
	* 
	*/
	public void setDetail(String detail){
		this.detail = detail;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getUpdateTime(){
		return updateTime;
	}
	/**
	* 
	*/
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}
	/**
	* 
	* @return Long
    */
	public Long getBusinessAuthDepositId(){
		return businessAuthDepositId;
	}
	/**
	* 
	*/
	public void setBusinessAuthDepositId(Long businessAuthDepositId){
		this.businessAuthDepositId = businessAuthDepositId;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("auditingTime:").append(getAuditingTime()).append(";");
		sb.append("authInfo:").append(getAuthInfo()).append(";");
		sb.append("certifiedBusinessStatus:").append(getCertifiedBusinessStatus()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("depositRecordId:").append(getDepositRecordId()).append(";");
		sb.append("detail:").append(getDetail()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		sb.append("businessAuthDepositId:").append(getBusinessAuthDepositId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		return sb.toString();
	}
}
