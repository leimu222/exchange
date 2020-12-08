package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [loan服务实现]
 */
public class LoanOrder  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 订单号
     */
	private Long orderNo;
	/**
     * 借出人
     */
	private Long lender;
	/**
     * 借入人
     */
	private Long loanee;
	/**
     * 币种
     */
	private String coinName;
	/**
     * 借款金额
     */
	private java.math.BigDecimal amount;
	/**
     * 总金额=本金+利息
     */
	private java.math.BigDecimal totalAmount;
	/**
     * 抵押金额
     */
	private java.math.BigDecimal mortgageAmount;
	/**
     * 借款期限
     */
	private Integer term;
	/**
     * 利息
     */
	private java.math.BigDecimal interest;
	/**
     * 年息
     */
	private java.math.BigDecimal annualInterest;
	/**
     * 日息
     */
	private java.math.BigDecimal dailyInterest;
	/**
     * 0-进行中,1-结束
     */
	private Integer state;
	/**
     * 发布者
     */
	private Long issuer;
	/**
     * 借款时间
     */
	private java.util.Date borrowingTime;
	/**
     * 到期时间
     */
	private java.util.Date dueTime;
	/**
     * 还款时间
     */
	private java.util.Date repaymentTime;
	
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
	* 订单号
	* @return Long
    */
	public Long getOrderNo(){
		return orderNo;
	}
	/**
	* 订单号
	*/
	public void setOrderNo(Long orderNo){
		this.orderNo = orderNo;
	}
	/**
	* 借出人
	* @return Long
    */
	public Long getLender(){
		return lender;
	}
	/**
	* 借出人
	*/
	public void setLender(Long lender){
		this.lender = lender;
	}
	/**
	* 借入人
	* @return Long
    */
	public Long getLoanee(){
		return loanee;
	}
	/**
	* 借入人
	*/
	public void setLoanee(Long loanee){
		this.loanee = loanee;
	}
	/**
	* 币种
	* @return String
    */
	public String getCoinName(){
		return coinName;
	}
	/**
	* 币种
	*/
	public void setCoinName(String coinName){
		this.coinName = coinName;
	}
	/**
	* 借款金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 借款金额
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 总金额=本金+利息
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTotalAmount(){
		return totalAmount;
	}
	/**
	* 总金额=本金+利息
	*/
	public void setTotalAmount(java.math.BigDecimal totalAmount){
		this.totalAmount = totalAmount;
	}
	/**
	* 抵押金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMortgageAmount(){
		return mortgageAmount;
	}
	/**
	* 抵押金额
	*/
	public void setMortgageAmount(java.math.BigDecimal mortgageAmount){
		this.mortgageAmount = mortgageAmount;
	}
	/**
	* 借款期限
	* @return Integer
    */
	public Integer getTerm(){
		return term;
	}
	/**
	* 借款期限
	*/
	public void setTerm(Integer term){
		this.term = term;
	}
	/**
	* 利息
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getInterest(){
		return interest;
	}
	/**
	* 利息
	*/
	public void setInterest(java.math.BigDecimal interest){
		this.interest = interest;
	}
	/**
	* 年息
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAnnualInterest(){
		return annualInterest;
	}
	/**
	* 年息
	*/
	public void setAnnualInterest(java.math.BigDecimal annualInterest){
		this.annualInterest = annualInterest;
	}
	/**
	* 日息
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getDailyInterest(){
		return dailyInterest;
	}
	/**
	* 日息
	*/
	public void setDailyInterest(java.math.BigDecimal dailyInterest){
		this.dailyInterest = dailyInterest;
	}
	/**
	* 0-进行中,1-结束
	* @return Integer
    */
	public Integer getState(){
		return state;
	}
	/**
	* 0-进行中,1-结束
	*/
	public void setState(Integer state){
		this.state = state;
	}
	/**
	* 发布者
	* @return Long
    */
	public Long getIssuer(){
		return issuer;
	}
	/**
	* 发布者
	*/
	public void setIssuer(Long issuer){
		this.issuer = issuer;
	}
	/**
	* 借款时间
	* @return java.util.Date
    */
	public java.util.Date getBorrowingTime(){
		return borrowingTime;
	}
	/**
	* 借款时间
	*/
	public void setBorrowingTime(java.util.Date borrowingTime){
		this.borrowingTime = borrowingTime;
	}
	/**
	* 到期时间
	* @return java.util.Date
    */
	public java.util.Date getDueTime(){
		return dueTime;
	}
	/**
	* 到期时间
	*/
	public void setDueTime(java.util.Date dueTime){
		this.dueTime = dueTime;
	}
	/**
	* 还款时间
	* @return java.util.Date
    */
	public java.util.Date getRepaymentTime(){
		return repaymentTime;
	}
	/**
	* 还款时间
	*/
	public void setRepaymentTime(java.util.Date repaymentTime){
		this.repaymentTime = repaymentTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("orderNo:").append(getOrderNo()).append(";");
		sb.append("lender:").append(getLender()).append(";");
		sb.append("loanee:").append(getLoanee()).append(";");
		sb.append("coinName:").append(getCoinName()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("totalAmount:").append(getTotalAmount()).append(";");
		sb.append("mortgageAmount:").append(getMortgageAmount()).append(";");
		sb.append("term:").append(getTerm()).append(";");
		sb.append("interest:").append(getInterest()).append(";");
		sb.append("annualInterest:").append(getAnnualInterest()).append(";");
		sb.append("dailyInterest:").append(getDailyInterest()).append(";");
		sb.append("state:").append(getState()).append(";");
		sb.append("issuer:").append(getIssuer()).append(";");
		sb.append("borrowingTime:").append(getBorrowingTime()).append(";");
		sb.append("dueTime:").append(getDueTime()).append(";");
		sb.append("repaymentTime:").append(getRepaymentTime()).append(";");
		return sb.toString();
	}
}
