package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [legal服务实现]
 */
public class LegalWalletRecharge  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 充值金额
     */
	private java.math.BigDecimal amount;
	/**
     * 
     */
	private java.util.Date creationTime;
	/**
     * 
     */
	private java.util.Date dealTime;
	/**
     * 
     */
	private Integer payMode;
	/**
     * 
     */
	private String paymentInstrument;
	/**
     * 
     */
	private String remark;
	/**
     * 
     */
	private Integer state;
	/**
     * 
     */
	private java.util.Date updateTime;
	/**
     * 
     */
	private Long adminId;
	/**
     * 
     */
	private String coinName;
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
	* 充值金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 充值金额
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getCreationTime(){
		return creationTime;
	}
	/**
	* 
	*/
	public void setCreationTime(java.util.Date creationTime){
		this.creationTime = creationTime;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getDealTime(){
		return dealTime;
	}
	/**
	* 
	*/
	public void setDealTime(java.util.Date dealTime){
		this.dealTime = dealTime;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getPayMode(){
		return payMode;
	}
	/**
	* 
	*/
	public void setPayMode(Integer payMode){
		this.payMode = payMode;
	}
	/**
	* 
	* @return String
    */
	public String getPaymentInstrument(){
		return paymentInstrument;
	}
	/**
	* 
	*/
	public void setPaymentInstrument(String paymentInstrument){
		this.paymentInstrument = paymentInstrument;
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
	* @return Integer
    */
	public Integer getState(){
		return state;
	}
	/**
	* 
	*/
	public void setState(Integer state){
		this.state = state;
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
	public Long getAdminId(){
		return adminId;
	}
	/**
	* 
	*/
	public void setAdminId(Long adminId){
		this.adminId = adminId;
	}
	/**
	* 
	* @return String
    */
	public String getCoinName(){
		return coinName;
	}
	/**
	* 
	*/
	public void setCoinName(String coinName){
		this.coinName = coinName;
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
		sb.append("creationTime:").append(getCreationTime()).append(";");
		sb.append("dealTime:").append(getDealTime()).append(";");
		sb.append("payMode:").append(getPayMode()).append(";");
		sb.append("paymentInstrument:").append(getPaymentInstrument()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("state:").append(getState()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		sb.append("adminId:").append(getAdminId()).append(";");
		sb.append("coinName:").append(getCoinName()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		return sb.toString();
	}
}
