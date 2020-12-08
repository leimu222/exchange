package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [legal服务实现]
 */
public class LegalWalletWithdraw  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String account;
	/**
     * 申请总数量
     */
	private java.math.BigDecimal amount;
	/**
     * 
     */
	private java.util.Date createTime;
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
	private java.util.Date remitTime;
	/**
     * 
     */
	private Integer status;
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
	* 
	* @return String
    */
	public String getAccount(){
		return account;
	}
	/**
	* 
	*/
	public void setAccount(String account){
		this.account = account;
	}
	/**
	* 申请总数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 申请总数量
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
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
	* @return java.util.Date
    */
	public java.util.Date getRemitTime(){
		return remitTime;
	}
	/**
	* 
	*/
	public void setRemitTime(java.util.Date remitTime){
		this.remitTime = remitTime;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getStatus(){
		return status;
	}
	/**
	* 
	*/
	public void setStatus(Integer status){
		this.status = status;
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
		sb.append("account:").append(getAccount()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("dealTime:").append(getDealTime()).append(";");
		sb.append("payMode:").append(getPayMode()).append(";");
		sb.append("paymentInstrument:").append(getPaymentInstrument()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("remitTime:").append(getRemitTime()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("adminId:").append(getAdminId()).append(";");
		sb.append("coinName:").append(getCoinName()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		return sb.toString();
	}
}
