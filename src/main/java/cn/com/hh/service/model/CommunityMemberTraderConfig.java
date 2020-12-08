package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [community服务实现]
 */
public class CommunityMemberTraderConfig  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 近三周交易总额：本金*杠杆>当前值
     */
	private java.math.BigDecimal totalAmountLimit;
	/**
     * 近三周交易笔数
     */
	private Integer transactionCountLimit;
	/**
     * 近三周胜率
     */
	private java.math.BigDecimal winRateLimit;
	/**
     * 累计收益率
     */
	private java.math.BigDecimal totalWinRateLimit;
	/**
     * 入金
     */
	private java.math.BigDecimal rechargeLimit;
	/**
     * 专业交易员最小下单数额，50USDT
     */
	private java.math.BigDecimal orderAmountMin;
	
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
	* 近三周交易总额：本金*杠杆>当前值
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTotalAmountLimit(){
		return totalAmountLimit;
	}
	/**
	* 近三周交易总额：本金*杠杆>当前值
	*/
	public void setTotalAmountLimit(java.math.BigDecimal totalAmountLimit){
		this.totalAmountLimit = totalAmountLimit;
	}
	/**
	* 近三周交易笔数
	* @return Integer
    */
	public Integer getTransactionCountLimit(){
		return transactionCountLimit;
	}
	/**
	* 近三周交易笔数
	*/
	public void setTransactionCountLimit(Integer transactionCountLimit){
		this.transactionCountLimit = transactionCountLimit;
	}
	/**
	* 近三周胜率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getWinRateLimit(){
		return winRateLimit;
	}
	/**
	* 近三周胜率
	*/
	public void setWinRateLimit(java.math.BigDecimal winRateLimit){
		this.winRateLimit = winRateLimit;
	}
	/**
	* 累计收益率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTotalWinRateLimit(){
		return totalWinRateLimit;
	}
	/**
	* 累计收益率
	*/
	public void setTotalWinRateLimit(java.math.BigDecimal totalWinRateLimit){
		this.totalWinRateLimit = totalWinRateLimit;
	}
	/**
	* 入金
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getRechargeLimit(){
		return rechargeLimit;
	}
	/**
	* 入金
	*/
	public void setRechargeLimit(java.math.BigDecimal rechargeLimit){
		this.rechargeLimit = rechargeLimit;
	}
	/**
	* 专业交易员最小下单数额，50USDT
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getOrderAmountMin(){
		return orderAmountMin;
	}
	/**
	* 专业交易员最小下单数额，50USDT
	*/
	public void setOrderAmountMin(java.math.BigDecimal orderAmountMin){
		this.orderAmountMin = orderAmountMin;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("totalAmountLimit:").append(getTotalAmountLimit()).append(";");
		sb.append("transactionCountLimit:").append(getTransactionCountLimit()).append(";");
		sb.append("winRateLimit:").append(getWinRateLimit()).append(";");
		sb.append("totalWinRateLimit:").append(getTotalWinRateLimit()).append(";");
		sb.append("rechargeLimit:").append(getRechargeLimit()).append(";");
		sb.append("orderAmountMin:").append(getOrderAmountMin()).append(";");
		return sb.toString();
	}
}
