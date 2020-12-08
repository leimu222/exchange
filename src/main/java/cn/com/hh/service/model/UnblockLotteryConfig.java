package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public class UnblockLotteryConfig  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 奖项级别
     */
	private String lotteryLevel;
	/**
     * 中奖概率
     */
	private java.math.BigDecimal lotteryRate;
	/**
     * 奖项说明
     */
	private String lotteryInstruction;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 购买抽奖次数单价
     */
	private java.math.BigDecimal buyPrice;
	/**
     * 抽奖规则
     */
	private String lotteryRule;
	/**
     * 中奖币种
     */
	private String coin;
	/**
     * 奖金数量
     */
	private java.math.BigDecimal amount;
	/**
     * 保险基金比例
     */
	private java.math.BigDecimal insuranceRate;
	/**
     * 单日最大中奖人数
     */
	private Integer dayWinnerNumLimit;
	
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
	* 奖项级别
	* @return String
    */
	public String getLotteryLevel(){
		return lotteryLevel;
	}
	/**
	* 奖项级别
	*/
	public void setLotteryLevel(String lotteryLevel){
		this.lotteryLevel = lotteryLevel;
	}
	/**
	* 中奖概率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getLotteryRate(){
		return lotteryRate;
	}
	/**
	* 中奖概率
	*/
	public void setLotteryRate(java.math.BigDecimal lotteryRate){
		this.lotteryRate = lotteryRate;
	}
	/**
	* 奖项说明
	* @return String
    */
	public String getLotteryInstruction(){
		return lotteryInstruction;
	}
	/**
	* 奖项说明
	*/
	public void setLotteryInstruction(String lotteryInstruction){
		this.lotteryInstruction = lotteryInstruction;
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
	* 购买抽奖次数单价
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBuyPrice(){
		return buyPrice;
	}
	/**
	* 购买抽奖次数单价
	*/
	public void setBuyPrice(java.math.BigDecimal buyPrice){
		this.buyPrice = buyPrice;
	}
	/**
	* 抽奖规则
	* @return String
    */
	public String getLotteryRule(){
		return lotteryRule;
	}
	/**
	* 抽奖规则
	*/
	public void setLotteryRule(String lotteryRule){
		this.lotteryRule = lotteryRule;
	}
	/**
	* 中奖币种
	* @return String
    */
	public String getCoin(){
		return coin;
	}
	/**
	* 中奖币种
	*/
	public void setCoin(String coin){
		this.coin = coin;
	}
	/**
	* 奖金数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 奖金数量
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 保险基金比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getInsuranceRate(){
		return insuranceRate;
	}
	/**
	* 保险基金比例
	*/
	public void setInsuranceRate(java.math.BigDecimal insuranceRate){
		this.insuranceRate = insuranceRate;
	}
	/**
	* 单日最大中奖人数
	* @return Integer
    */
	public Integer getDayWinnerNumLimit(){
		return dayWinnerNumLimit;
	}
	/**
	* 单日最大中奖人数
	*/
	public void setDayWinnerNumLimit(Integer dayWinnerNumLimit){
		this.dayWinnerNumLimit = dayWinnerNumLimit;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("lotteryLevel:").append(getLotteryLevel()).append(";");
		sb.append("lotteryRate:").append(getLotteryRate()).append(";");
		sb.append("lotteryInstruction:").append(getLotteryInstruction()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("buyPrice:").append(getBuyPrice()).append(";");
		sb.append("lotteryRule:").append(getLotteryRule()).append(";");
		sb.append("coin:").append(getCoin()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("insuranceRate:").append(getInsuranceRate()).append(";");
		sb.append("dayWinnerNumLimit:").append(getDayWinnerNumLimit()).append(";");
		return sb.toString();
	}
}
