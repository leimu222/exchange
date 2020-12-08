package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public class UnblockExchangeSymbol  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private String symbol;
	/**
     * 单轮释放比例
     */
	private java.math.BigDecimal singleRoundReleaseRate;
	/**
     * 单日最高释放比例
     */
	private java.math.BigDecimal dayMaxReleaseRate;
	/**
     * 单日最高释放数量
     */
	private java.math.BigDecimal dayMaxReleaseAmount;
	/**
     * 上浮价格规则
     */
	private java.math.BigDecimal priceRiseRule;
	/**
     * 解封区币种初始价格
     */
	private java.math.BigDecimal startPrice;
	/**
     * 一轮中一买一卖的价格差值
     */
	private java.math.BigDecimal roundIntervalPrice;
	/**
     * 单日最大交易轮次
     */
	private Integer singleDayRoundMax;
	/**
     * 轮次配置，以逗号隔开
     */
	private String roundLimitKey;
	/**
     * 轮次对应的交易限额，以逗号隔开
     */
	private String roundLimitValue;
	/**
     * 价格限制
     */
	private java.math.BigDecimal priceLimit;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private java.util.Date updateTime;
	/**
     * 
     */
	private Long version;
	/**
     * 交易白名单账户，以英文逗号隔开
     */
	private String whitelistMemberId;
	
	// setter and getter
	/**
	* 主键
	* @return String
    */
	public String getSymbol(){
		return symbol;
	}
	/**
	* 主键
	*/
	public void setSymbol(String symbol){
		this.symbol = symbol;
	}
	/**
	* 单轮释放比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getSingleRoundReleaseRate(){
		return singleRoundReleaseRate;
	}
	/**
	* 单轮释放比例
	*/
	public void setSingleRoundReleaseRate(java.math.BigDecimal singleRoundReleaseRate){
		this.singleRoundReleaseRate = singleRoundReleaseRate;
	}
	/**
	* 单日最高释放比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getDayMaxReleaseRate(){
		return dayMaxReleaseRate;
	}
	/**
	* 单日最高释放比例
	*/
	public void setDayMaxReleaseRate(java.math.BigDecimal dayMaxReleaseRate){
		this.dayMaxReleaseRate = dayMaxReleaseRate;
	}
	/**
	* 单日最高释放数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getDayMaxReleaseAmount(){
		return dayMaxReleaseAmount;
	}
	/**
	* 单日最高释放数量
	*/
	public void setDayMaxReleaseAmount(java.math.BigDecimal dayMaxReleaseAmount){
		this.dayMaxReleaseAmount = dayMaxReleaseAmount;
	}
	/**
	* 上浮价格规则
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPriceRiseRule(){
		return priceRiseRule;
	}
	/**
	* 上浮价格规则
	*/
	public void setPriceRiseRule(java.math.BigDecimal priceRiseRule){
		this.priceRiseRule = priceRiseRule;
	}
	/**
	* 解封区币种初始价格
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getStartPrice(){
		return startPrice;
	}
	/**
	* 解封区币种初始价格
	*/
	public void setStartPrice(java.math.BigDecimal startPrice){
		this.startPrice = startPrice;
	}
	/**
	* 一轮中一买一卖的价格差值
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getRoundIntervalPrice(){
		return roundIntervalPrice;
	}
	/**
	* 一轮中一买一卖的价格差值
	*/
	public void setRoundIntervalPrice(java.math.BigDecimal roundIntervalPrice){
		this.roundIntervalPrice = roundIntervalPrice;
	}
	/**
	* 单日最大交易轮次
	* @return Integer
    */
	public Integer getSingleDayRoundMax(){
		return singleDayRoundMax;
	}
	/**
	* 单日最大交易轮次
	*/
	public void setSingleDayRoundMax(Integer singleDayRoundMax){
		this.singleDayRoundMax = singleDayRoundMax;
	}
	/**
	* 轮次配置，以逗号隔开
	* @return String
    */
	public String getRoundLimitKey(){
		return roundLimitKey;
	}
	/**
	* 轮次配置，以逗号隔开
	*/
	public void setRoundLimitKey(String roundLimitKey){
		this.roundLimitKey = roundLimitKey;
	}
	/**
	* 轮次对应的交易限额，以逗号隔开
	* @return String
    */
	public String getRoundLimitValue(){
		return roundLimitValue;
	}
	/**
	* 轮次对应的交易限额，以逗号隔开
	*/
	public void setRoundLimitValue(String roundLimitValue){
		this.roundLimitValue = roundLimitValue;
	}
	/**
	* 价格限制
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPriceLimit(){
		return priceLimit;
	}
	/**
	* 价格限制
	*/
	public void setPriceLimit(java.math.BigDecimal priceLimit){
		this.priceLimit = priceLimit;
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
	public Long getVersion(){
		return version;
	}
	/**
	* 
	*/
	public void setVersion(Long version){
		this.version = version;
	}
	/**
	* 交易白名单账户，以英文逗号隔开
	* @return String
    */
	public String getWhitelistMemberId(){
		return whitelistMemberId;
	}
	/**
	* 交易白名单账户，以英文逗号隔开
	*/
	public void setWhitelistMemberId(String whitelistMemberId){
		this.whitelistMemberId = whitelistMemberId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("symbol:").append(getSymbol()).append(";");
		sb.append("singleRoundReleaseRate:").append(getSingleRoundReleaseRate()).append(";");
		sb.append("dayMaxReleaseRate:").append(getDayMaxReleaseRate()).append(";");
		sb.append("dayMaxReleaseAmount:").append(getDayMaxReleaseAmount()).append(";");
		sb.append("priceRiseRule:").append(getPriceRiseRule()).append(";");
		sb.append("startPrice:").append(getStartPrice()).append(";");
		sb.append("roundIntervalPrice:").append(getRoundIntervalPrice()).append(";");
		sb.append("singleDayRoundMax:").append(getSingleDayRoundMax()).append(";");
		sb.append("roundLimitKey:").append(getRoundLimitKey()).append(";");
		sb.append("roundLimitValue:").append(getRoundLimitValue()).append(";");
		sb.append("priceLimit:").append(getPriceLimit()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		sb.append("whitelistMemberId:").append(getWhitelistMemberId()).append(";");
		return sb.toString();
	}
}
