package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public class MemberDepositInfo  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 用户id
     */
	private Long memberId;
	/**
     * 理财类型id
     */
	private Integer depositTypeId;
	/**
     * 理财金额
     */
	private java.math.BigDecimal amount;
	/**
     * 投资时间
     */
	private java.util.Date investTime;
	/**
     * 投资状态，0投资中，1投资结束，2提前赎回
     */
	private Integer status;
	/**
     * 当前总收益
     */
	private java.math.BigDecimal profit;
	/**
     * 时间结束时间
     */
	private java.util.Date endTime;
	/**
     * 预计结束时间
     */
	private java.util.Date preEndTime;
	/**
     * 时间戳
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
	* 用户id
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 用户id
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 理财类型id
	* @return Integer
    */
	public Integer getDepositTypeId(){
		return depositTypeId;
	}
	/**
	* 理财类型id
	*/
	public void setDepositTypeId(Integer depositTypeId){
		this.depositTypeId = depositTypeId;
	}
	/**
	* 理财金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 理财金额
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 投资时间
	* @return java.util.Date
    */
	public java.util.Date getInvestTime(){
		return investTime;
	}
	/**
	* 投资时间
	*/
	public void setInvestTime(java.util.Date investTime){
		this.investTime = investTime;
	}
	/**
	* 投资状态，0投资中，1投资结束，2提前赎回
	* @return Integer
    */
	public Integer getStatus(){
		return status;
	}
	/**
	* 投资状态，0投资中，1投资结束，2提前赎回
	*/
	public void setStatus(Integer status){
		this.status = status;
	}
	/**
	* 当前总收益
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getProfit(){
		return profit;
	}
	/**
	* 当前总收益
	*/
	public void setProfit(java.math.BigDecimal profit){
		this.profit = profit;
	}
	/**
	* 时间结束时间
	* @return java.util.Date
    */
	public java.util.Date getEndTime(){
		return endTime;
	}
	/**
	* 时间结束时间
	*/
	public void setEndTime(java.util.Date endTime){
		this.endTime = endTime;
	}
	/**
	* 预计结束时间
	* @return java.util.Date
    */
	public java.util.Date getPreEndTime(){
		return preEndTime;
	}
	/**
	* 预计结束时间
	*/
	public void setPreEndTime(java.util.Date preEndTime){
		this.preEndTime = preEndTime;
	}
	/**
	* 时间戳
	* @return Long
    */
	public Long getSequence(){
		return sequence;
	}
	/**
	* 时间戳
	*/
	public void setSequence(Long sequence){
		this.sequence = sequence;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("depositTypeId:").append(getDepositTypeId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("investTime:").append(getInvestTime()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("profit:").append(getProfit()).append(";");
		sb.append("endTime:").append(getEndTime()).append(";");
		sb.append("preEndTime:").append(getPreEndTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
