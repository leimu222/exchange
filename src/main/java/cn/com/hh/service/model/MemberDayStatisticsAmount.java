package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public class MemberDayStatisticsAmount  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Long id;
	/**
     * 用户ID
     */
	private Long memberId;
	/**
     * 交易总额
     */
	private java.math.BigDecimal transAmount;
	/**
     * 总体盈亏
     */
	private java.math.BigDecimal profitLossAmount;
	/**
     * 总持仓利息
     */
	private java.math.BigDecimal holdInterestAmount;
	/**
     * 总手续费
     */
	private java.math.BigDecimal feeAmount;
	/**
     * 买涨（做多）总金额
     */
	private java.math.BigDecimal upAmount;
	/**
     * 买跌（做空）总金额
     */
	private java.math.BigDecimal downAmount;
	/**
     * 统计时间（yyyy-MM-dd）
     */
	private String calTime;
	/**
     * 统计时间戳
     */
	private Long calSequence;
	/**
     * 最后统计时间戳
     */
	private Long sequence;
	
	// setter and getter
	/**
	* 主键
	* @return Long
    */
	public Long getId(){
		return id;
	}
	/**
	* 主键
	*/
	public void setId(Long id){
		this.id = id;
	}
	/**
	* 用户ID
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 用户ID
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 交易总额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTransAmount(){
		return transAmount;
	}
	/**
	* 交易总额
	*/
	public void setTransAmount(java.math.BigDecimal transAmount){
		this.transAmount = transAmount;
	}
	/**
	* 总体盈亏
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getProfitLossAmount(){
		return profitLossAmount;
	}
	/**
	* 总体盈亏
	*/
	public void setProfitLossAmount(java.math.BigDecimal profitLossAmount){
		this.profitLossAmount = profitLossAmount;
	}
	/**
	* 总持仓利息
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getHoldInterestAmount(){
		return holdInterestAmount;
	}
	/**
	* 总持仓利息
	*/
	public void setHoldInterestAmount(java.math.BigDecimal holdInterestAmount){
		this.holdInterestAmount = holdInterestAmount;
	}
	/**
	* 总手续费
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFeeAmount(){
		return feeAmount;
	}
	/**
	* 总手续费
	*/
	public void setFeeAmount(java.math.BigDecimal feeAmount){
		this.feeAmount = feeAmount;
	}
	/**
	* 买涨（做多）总金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getUpAmount(){
		return upAmount;
	}
	/**
	* 买涨（做多）总金额
	*/
	public void setUpAmount(java.math.BigDecimal upAmount){
		this.upAmount = upAmount;
	}
	/**
	* 买跌（做空）总金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getDownAmount(){
		return downAmount;
	}
	/**
	* 买跌（做空）总金额
	*/
	public void setDownAmount(java.math.BigDecimal downAmount){
		this.downAmount = downAmount;
	}
	/**
	* 统计时间（yyyy-MM-dd）
	* @return String
    */
	public String getCalTime(){
		return calTime;
	}
	/**
	* 统计时间（yyyy-MM-dd）
	*/
	public void setCalTime(String calTime){
		this.calTime = calTime;
	}
	/**
	* 统计时间戳
	* @return Long
    */
	public Long getCalSequence(){
		return calSequence;
	}
	/**
	* 统计时间戳
	*/
	public void setCalSequence(Long calSequence){
		this.calSequence = calSequence;
	}
	/**
	* 最后统计时间戳
	* @return Long
    */
	public Long getSequence(){
		return sequence;
	}
	/**
	* 最后统计时间戳
	*/
	public void setSequence(Long sequence){
		this.sequence = sequence;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("transAmount:").append(getTransAmount()).append(";");
		sb.append("profitLossAmount:").append(getProfitLossAmount()).append(";");
		sb.append("holdInterestAmount:").append(getHoldInterestAmount()).append(";");
		sb.append("feeAmount:").append(getFeeAmount()).append(";");
		sb.append("upAmount:").append(getUpAmount()).append(";");
		sb.append("downAmount:").append(getDownAmount()).append(";");
		sb.append("calTime:").append(getCalTime()).append(";");
		sb.append("calSequence:").append(getCalSequence()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
