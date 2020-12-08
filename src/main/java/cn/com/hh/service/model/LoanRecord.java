package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [loan服务实现]
 */
public class LoanRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 累计利息
     */
	private java.math.BigDecimal accumulative;
	/**
     * 未归还的借贷金额
     */
	private java.math.BigDecimal amount;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 借贷利率
     */
	private java.math.BigDecimal interestRate;
	/**
     * 借贷金额（记录值，不变化）
     */
	private java.math.BigDecimal loanBalance;
	/**
     * 
     */
	private Long memberId;
	/**
     * 
     */
	private String memberName;
	/**
     * 
     */
	private Integer repayment;
	/**
     * 
     */
	private Integer version;
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
	* 累计利息
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAccumulative(){
		return accumulative;
	}
	/**
	* 累计利息
	*/
	public void setAccumulative(java.math.BigDecimal accumulative){
		this.accumulative = accumulative;
	}
	/**
	* 未归还的借贷金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 未归还的借贷金额
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
	* 借贷金额（记录值，不变化）
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getLoanBalance(){
		return loanBalance;
	}
	/**
	* 借贷金额（记录值，不变化）
	*/
	public void setLoanBalance(java.math.BigDecimal loanBalance){
		this.loanBalance = loanBalance;
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
	public String getMemberName(){
		return memberName;
	}
	/**
	* 
	*/
	public void setMemberName(String memberName){
		this.memberName = memberName;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getRepayment(){
		return repayment;
	}
	/**
	* 
	*/
	public void setRepayment(Integer repayment){
		this.repayment = repayment;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getVersion(){
		return version;
	}
	/**
	* 
	*/
	public void setVersion(Integer version){
		this.version = version;
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
		sb.append("accumulative:").append(getAccumulative()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("interestRate:").append(getInterestRate()).append(";");
		sb.append("loanBalance:").append(getLoanBalance()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("memberName:").append(getMemberName()).append(";");
		sb.append("repayment:").append(getRepayment()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		sb.append("leverCoinId:").append(getLeverCoinId()).append(";");
		return sb.toString();
	}
}
