package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [payment服务实现]
 */
public class PaymentHistory  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 金额
     */
	private java.math.BigDecimal amount;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 还款的利息数额
     */
	private java.math.BigDecimal interest;
	/**
     * 借贷利率
     */
	private java.math.BigDecimal interestRate;
	/**
     * 
     */
	private Long loanRecordId;
	/**
     * 
     */
	private Long memberId;
	/**
     * 
     */
	private Integer paymentType;
	/**
     * 还款的本金数额
     */
	private java.math.BigDecimal principal;
	/**
     * 
     */
	private Integer status;
	/**
     * 
     */
	private String coinId;
	/**
     * 
     */
	private Long leverCoinId;
	
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
	* 金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 金额
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
	* 还款的利息数额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getInterest(){
		return interest;
	}
	/**
	* 还款的利息数额
	*/
	public void setInterest(java.math.BigDecimal interest){
		this.interest = interest;
	}
	/**
	* 借贷利率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getInterestRate(){
		return interestRate;
	}
	/**
	* 借贷利率
	*/
	public void setInterestRate(java.math.BigDecimal interestRate){
		this.interestRate = interestRate;
	}
	/**
	* 
	* @return Long
    */
	public Long getLoanRecordId(){
		return loanRecordId;
	}
	/**
	* 
	*/
	public void setLoanRecordId(Long loanRecordId){
		this.loanRecordId = loanRecordId;
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
	* @return Integer
    */
	public Integer getPaymentType(){
		return paymentType;
	}
	/**
	* 
	*/
	public void setPaymentType(Integer paymentType){
		this.paymentType = paymentType;
	}
	/**
	* 还款的本金数额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPrincipal(){
		return principal;
	}
	/**
	* 还款的本金数额
	*/
	public void setPrincipal(java.math.BigDecimal principal){
		this.principal = principal;
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
	* @return String
    */
	public String getCoinId(){
		return coinId;
	}
	/**
	* 
	*/
	public void setCoinId(String coinId){
		this.coinId = coinId;
	}
	/**
	* 
	* @return Long
    */
	public Long getLeverCoinId(){
		return leverCoinId;
	}
	/**
	* 
	*/
	public void setLeverCoinId(Long leverCoinId){
		this.leverCoinId = leverCoinId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("interest:").append(getInterest()).append(";");
		sb.append("interestRate:").append(getInterestRate()).append(";");
		sb.append("loanRecordId:").append(getLoanRecordId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("paymentType:").append(getPaymentType()).append(";");
		sb.append("principal:").append(getPrincipal()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		sb.append("leverCoinId:").append(getLeverCoinId()).append(";");
		return sb.toString();
	}
}
