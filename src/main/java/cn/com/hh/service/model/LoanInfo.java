package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [loan服务实现]
 */
public class LoanInfo  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 发布者
     */
	private Long issuer;
	/**
     * 币种
     */
	private String coinName;
	/**
     * 借款金额
     */
	private java.math.BigDecimal amount;
	/**
     * 最小借款金额
     */
	private java.math.BigDecimal minAmount;
	/**
     * 最大借款金额
     */
	private java.math.BigDecimal maxAmount;
	/**
     * 剩余可借
     */
	private java.math.BigDecimal remainAmount;
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
     * 0-进行中,1-完成
     */
	private Integer state;
	/**
     * 借款时间
     */
	private java.util.Date borrowingTime;
	/**
     * 到期时间
     */
	private java.util.Date dueTime;
	/**
     * 0-借出,1-借入
     */
	private Integer type;
	/**
     * 发布时间
     */
	private java.util.Date publishTime;
	
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
	* 最小借款金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMinAmount(){
		return minAmount;
	}
	/**
	* 最小借款金额
	*/
	public void setMinAmount(java.math.BigDecimal minAmount){
		this.minAmount = minAmount;
	}
	/**
	* 最大借款金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMaxAmount(){
		return maxAmount;
	}
	/**
	* 最大借款金额
	*/
	public void setMaxAmount(java.math.BigDecimal maxAmount){
		this.maxAmount = maxAmount;
	}
	/**
	* 剩余可借
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getRemainAmount(){
		return remainAmount;
	}
	/**
	* 剩余可借
	*/
	public void setRemainAmount(java.math.BigDecimal remainAmount){
		this.remainAmount = remainAmount;
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
	* 0-进行中,1-完成
	* @return Integer
    */
	public Integer getState(){
		return state;
	}
	/**
	* 0-进行中,1-完成
	*/
	public void setState(Integer state){
		this.state = state;
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
	* 0-借出,1-借入
	* @return Integer
    */
	public Integer getType(){
		return type;
	}
	/**
	* 0-借出,1-借入
	*/
	public void setType(Integer type){
		this.type = type;
	}
	/**
	* 发布时间
	* @return java.util.Date
    */
	public java.util.Date getPublishTime(){
		return publishTime;
	}
	/**
	* 发布时间
	*/
	public void setPublishTime(java.util.Date publishTime){
		this.publishTime = publishTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("issuer:").append(getIssuer()).append(";");
		sb.append("coinName:").append(getCoinName()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("minAmount:").append(getMinAmount()).append(";");
		sb.append("maxAmount:").append(getMaxAmount()).append(";");
		sb.append("remainAmount:").append(getRemainAmount()).append(";");
		sb.append("term:").append(getTerm()).append(";");
		sb.append("interest:").append(getInterest()).append(";");
		sb.append("annualInterest:").append(getAnnualInterest()).append(";");
		sb.append("dailyInterest:").append(getDailyInterest()).append(";");
		sb.append("state:").append(getState()).append(";");
		sb.append("borrowingTime:").append(getBorrowingTime()).append(";");
		sb.append("dueTime:").append(getDueTime()).append(";");
		sb.append("type:").append(getType()).append(";");
		sb.append("publishTime:").append(getPublishTime()).append(";");
		return sb.toString();
	}
}
