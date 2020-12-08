package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [option服务实现]
 */
public class OptionCoin  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 计价币种-目前均为usdt
     */
	private String baseSymbol;
	/**
     * 交易币种
     */
	private String coinSymbol;
	/**
     * 交易币种名称
     */
	private String coinSymbolName;
	/**
     * 交易币种图标
     */
	private String coinSymbolImageUrl;
	/**
     * 交易币种精度
     */
	private Integer coinSymbolPrecision;
	/**
     * 是否有效 1：启用，2：禁止
     */
	private Integer enable;
	/**
     * 排序
     */
	private Integer sort;
	/**
     * 交易对信息
     */
	private String symbol;
	/**
     * 杠杆倍数-弃用
     */
	private String leverMultiple;
	/**
     * 开仓手续费比例
     */
	private java.math.BigDecimal openFee;
	/**
     * 平仓手续费比例
     */
	private java.math.BigDecimal closeFee;
	/**
     * 持仓日利率比例
     */
	private java.math.BigDecimal dayFeeRate;
	/**
     * 单笔交易最小限额-弃用
     */
	private java.math.BigDecimal minLimit;
	/**
     * 单笔交易最大限额-弃用
     */
	private java.math.BigDecimal maxLimit;
	/**
     * 最大持仓量
     */
	private java.math.BigDecimal maxHoldLimit;
	/**
     * 买涨点差
     */
	private java.math.BigDecimal riseInterval;
	/**
     * 买跌点差
     */
	private java.math.BigDecimal fallInterval;
	/**
     * 最大购买手数
     */
	private Integer maxHoldNumLimit;
	/**
     * 保证金金额类型，多种金额用英文逗号分开
     */
	private String bondTypes;
	/**
     * 最大止损比例，默认100%
     */
	private java.math.BigDecimal maxLossRate;
	/**
     * 最大止盈比例，默认50%
     */
	private java.math.BigDecimal maxProfitRate;
	/**
     * 期权点位
     */
	private java.math.BigDecimal optionPoint;
	
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
	* 计价币种-目前均为usdt
	* @return String
    */
	public String getBaseSymbol(){
		return baseSymbol;
	}
	/**
	* 计价币种-目前均为usdt
	*/
	public void setBaseSymbol(String baseSymbol){
		this.baseSymbol = baseSymbol;
	}
	/**
	* 交易币种
	* @return String
    */
	public String getCoinSymbol(){
		return coinSymbol;
	}
	/**
	* 交易币种
	*/
	public void setCoinSymbol(String coinSymbol){
		this.coinSymbol = coinSymbol;
	}
	/**
	* 交易币种名称
	* @return String
    */
	public String getCoinSymbolName(){
		return coinSymbolName;
	}
	/**
	* 交易币种名称
	*/
	public void setCoinSymbolName(String coinSymbolName){
		this.coinSymbolName = coinSymbolName;
	}
	/**
	* 交易币种图标
	* @return String
    */
	public String getCoinSymbolImageUrl(){
		return coinSymbolImageUrl;
	}
	/**
	* 交易币种图标
	*/
	public void setCoinSymbolImageUrl(String coinSymbolImageUrl){
		this.coinSymbolImageUrl = coinSymbolImageUrl;
	}
	/**
	* 交易币种精度
	* @return Integer
    */
	public Integer getCoinSymbolPrecision(){
		return coinSymbolPrecision;
	}
	/**
	* 交易币种精度
	*/
	public void setCoinSymbolPrecision(Integer coinSymbolPrecision){
		this.coinSymbolPrecision = coinSymbolPrecision;
	}
	/**
	* 是否有效 1：启用，2：禁止
	* @return Integer
    */
	public Integer getEnable(){
		return enable;
	}
	/**
	* 是否有效 1：启用，2：禁止
	*/
	public void setEnable(Integer enable){
		this.enable = enable;
	}
	/**
	* 排序
	* @return Integer
    */
	public Integer getSort(){
		return sort;
	}
	/**
	* 排序
	*/
	public void setSort(Integer sort){
		this.sort = sort;
	}
	/**
	* 交易对信息
	* @return String
    */
	public String getSymbol(){
		return symbol;
	}
	/**
	* 交易对信息
	*/
	public void setSymbol(String symbol){
		this.symbol = symbol;
	}
	/**
	* 杠杆倍数-弃用
	* @return String
    */
	public String getLeverMultiple(){
		return leverMultiple;
	}
	/**
	* 杠杆倍数-弃用
	*/
	public void setLeverMultiple(String leverMultiple){
		this.leverMultiple = leverMultiple;
	}
	/**
	* 开仓手续费比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getOpenFee(){
		return openFee;
	}
	/**
	* 开仓手续费比例
	*/
	public void setOpenFee(java.math.BigDecimal openFee){
		this.openFee = openFee;
	}
	/**
	* 平仓手续费比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getCloseFee(){
		return closeFee;
	}
	/**
	* 平仓手续费比例
	*/
	public void setCloseFee(java.math.BigDecimal closeFee){
		this.closeFee = closeFee;
	}
	/**
	* 持仓日利率比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getDayFeeRate(){
		return dayFeeRate;
	}
	/**
	* 持仓日利率比例
	*/
	public void setDayFeeRate(java.math.BigDecimal dayFeeRate){
		this.dayFeeRate = dayFeeRate;
	}
	/**
	* 单笔交易最小限额-弃用
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMinLimit(){
		return minLimit;
	}
	/**
	* 单笔交易最小限额-弃用
	*/
	public void setMinLimit(java.math.BigDecimal minLimit){
		this.minLimit = minLimit;
	}
	/**
	* 单笔交易最大限额-弃用
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMaxLimit(){
		return maxLimit;
	}
	/**
	* 单笔交易最大限额-弃用
	*/
	public void setMaxLimit(java.math.BigDecimal maxLimit){
		this.maxLimit = maxLimit;
	}
	/**
	* 最大持仓量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMaxHoldLimit(){
		return maxHoldLimit;
	}
	/**
	* 最大持仓量
	*/
	public void setMaxHoldLimit(java.math.BigDecimal maxHoldLimit){
		this.maxHoldLimit = maxHoldLimit;
	}
	/**
	* 买涨点差
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getRiseInterval(){
		return riseInterval;
	}
	/**
	* 买涨点差
	*/
	public void setRiseInterval(java.math.BigDecimal riseInterval){
		this.riseInterval = riseInterval;
	}
	/**
	* 买跌点差
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFallInterval(){
		return fallInterval;
	}
	/**
	* 买跌点差
	*/
	public void setFallInterval(java.math.BigDecimal fallInterval){
		this.fallInterval = fallInterval;
	}
	/**
	* 最大购买手数
	* @return Integer
    */
	public Integer getMaxHoldNumLimit(){
		return maxHoldNumLimit;
	}
	/**
	* 最大购买手数
	*/
	public void setMaxHoldNumLimit(Integer maxHoldNumLimit){
		this.maxHoldNumLimit = maxHoldNumLimit;
	}
	/**
	* 保证金金额类型，多种金额用英文逗号分开
	* @return String
    */
	public String getBondTypes(){
		return bondTypes;
	}
	/**
	* 保证金金额类型，多种金额用英文逗号分开
	*/
	public void setBondTypes(String bondTypes){
		this.bondTypes = bondTypes;
	}
	/**
	* 最大止损比例，默认100%
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMaxLossRate(){
		return maxLossRate;
	}
	/**
	* 最大止损比例，默认100%
	*/
	public void setMaxLossRate(java.math.BigDecimal maxLossRate){
		this.maxLossRate = maxLossRate;
	}
	/**
	* 最大止盈比例，默认50%
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMaxProfitRate(){
		return maxProfitRate;
	}
	/**
	* 最大止盈比例，默认50%
	*/
	public void setMaxProfitRate(java.math.BigDecimal maxProfitRate){
		this.maxProfitRate = maxProfitRate;
	}
	/**
	* 期权点位
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getOptionPoint(){
		return optionPoint;
	}
	/**
	* 期权点位
	*/
	public void setOptionPoint(java.math.BigDecimal optionPoint){
		this.optionPoint = optionPoint;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("baseSymbol:").append(getBaseSymbol()).append(";");
		sb.append("coinSymbol:").append(getCoinSymbol()).append(";");
		sb.append("coinSymbolName:").append(getCoinSymbolName()).append(";");
		sb.append("coinSymbolImageUrl:").append(getCoinSymbolImageUrl()).append(";");
		sb.append("coinSymbolPrecision:").append(getCoinSymbolPrecision()).append(";");
		sb.append("enable:").append(getEnable()).append(";");
		sb.append("sort:").append(getSort()).append(";");
		sb.append("symbol:").append(getSymbol()).append(";");
		sb.append("leverMultiple:").append(getLeverMultiple()).append(";");
		sb.append("openFee:").append(getOpenFee()).append(";");
		sb.append("closeFee:").append(getCloseFee()).append(";");
		sb.append("dayFeeRate:").append(getDayFeeRate()).append(";");
		sb.append("minLimit:").append(getMinLimit()).append(";");
		sb.append("maxLimit:").append(getMaxLimit()).append(";");
		sb.append("maxHoldLimit:").append(getMaxHoldLimit()).append(";");
		sb.append("riseInterval:").append(getRiseInterval()).append(";");
		sb.append("fallInterval:").append(getFallInterval()).append(";");
		sb.append("maxHoldNumLimit:").append(getMaxHoldNumLimit()).append(";");
		sb.append("bondTypes:").append(getBondTypes()).append(";");
		sb.append("maxLossRate:").append(getMaxLossRate()).append(";");
		sb.append("maxProfitRate:").append(getMaxProfitRate()).append(";");
		sb.append("optionPoint:").append(getOptionPoint()).append(";");
		return sb.toString();
	}
}
