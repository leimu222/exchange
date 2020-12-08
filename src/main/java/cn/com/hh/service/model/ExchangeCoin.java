package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [exchange服务实现]
 */
public class ExchangeCoin  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private String symbol;
	/**
     * 价格精度
     */
	private Integer baseCoinScale;
	/**
     * 结算币种手续费
     */
	private java.math.BigDecimal baseFee;
	/**
     * 结算币种符号
     */
	private String baseSymbol;
	/**
     * 数量精度
     */
	private Integer coinScale;
	/**
     * 交易币种符号
     */
	private String coinSymbol;
	/**
     * 状态，1：启用，2：禁止
     */
	private Integer enable;
	/**
     * 是否启用市价买
     */
	private Integer enableMarketBuy;
	/**
     * 是否启用市价卖
     */
	private Integer enableMarketSell;
	/**
     * 基币手续费
     */
	private java.math.BigDecimal fee;
	/**
     * 标签位，用于推荐，排序等,默认为0，1表示推荐
     */
	private Integer flag;
	/**
     * 最大允许同时交易的订单数，0表示不限制
     */
	private Integer maxTradingOrder;
	/**
     * 委托超时自动下架时间，单位为秒，0表示不过期
     */
	private Integer maxTradingTime;
	/**
     * 最大下单量
     */
	private java.math.BigDecimal maxVolume;
	/**
     * 卖单最低价格
     */
	private java.math.BigDecimal minSellPrice;
	/**
     * 最小成交额
     */
	private java.math.BigDecimal minTurnover;
	/**
     * 最小下单量
     */
	private java.math.BigDecimal minVolume;
	/**
     * 
     */
	private Integer sort;
	/**
     * 
     */
	private Integer zone;
	/**
     * 
     */
	private String defaultSymbol;
	/**
     * 0-主区 1-解封区 2期权区
     */
	private Boolean symbolArea;
	
	// setter and getter
	/**
	* 
	* @return String
    */
	public String getSymbol(){
		return symbol;
	}
	/**
	* 
	*/
	public void setSymbol(String symbol){
		this.symbol = symbol;
	}
	/**
	* 价格精度
	* @return Integer
    */
	public Integer getBaseCoinScale(){
		return baseCoinScale;
	}
	/**
	* 价格精度
	*/
	public void setBaseCoinScale(Integer baseCoinScale){
		this.baseCoinScale = baseCoinScale;
	}
	/**
	* 结算币种手续费
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBaseFee(){
		return baseFee;
	}
	/**
	* 结算币种手续费
	*/
	public void setBaseFee(java.math.BigDecimal baseFee){
		this.baseFee = baseFee;
	}
	/**
	* 结算币种符号
	* @return String
    */
	public String getBaseSymbol(){
		return baseSymbol;
	}
	/**
	* 结算币种符号
	*/
	public void setBaseSymbol(String baseSymbol){
		this.baseSymbol = baseSymbol;
	}
	/**
	* 数量精度
	* @return Integer
    */
	public Integer getCoinScale(){
		return coinScale;
	}
	/**
	* 数量精度
	*/
	public void setCoinScale(Integer coinScale){
		this.coinScale = coinScale;
	}
	/**
	* 交易币种符号
	* @return String
    */
	public String getCoinSymbol(){
		return coinSymbol;
	}
	/**
	* 交易币种符号
	*/
	public void setCoinSymbol(String coinSymbol){
		this.coinSymbol = coinSymbol;
	}
	/**
	* 状态，1：启用，2：禁止
	* @return Integer
    */
	public Integer getEnable(){
		return enable;
	}
	/**
	* 状态，1：启用，2：禁止
	*/
	public void setEnable(Integer enable){
		this.enable = enable;
	}
	/**
	* 是否启用市价买
	* @return Integer
    */
	public Integer getEnableMarketBuy(){
		return enableMarketBuy;
	}
	/**
	* 是否启用市价买
	*/
	public void setEnableMarketBuy(Integer enableMarketBuy){
		this.enableMarketBuy = enableMarketBuy;
	}
	/**
	* 是否启用市价卖
	* @return Integer
    */
	public Integer getEnableMarketSell(){
		return enableMarketSell;
	}
	/**
	* 是否启用市价卖
	*/
	public void setEnableMarketSell(Integer enableMarketSell){
		this.enableMarketSell = enableMarketSell;
	}
	/**
	* 基币手续费
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFee(){
		return fee;
	}
	/**
	* 基币手续费
	*/
	public void setFee(java.math.BigDecimal fee){
		this.fee = fee;
	}
	/**
	* 标签位，用于推荐，排序等,默认为0，1表示推荐
	* @return Integer
    */
	public Integer getFlag(){
		return flag;
	}
	/**
	* 标签位，用于推荐，排序等,默认为0，1表示推荐
	*/
	public void setFlag(Integer flag){
		this.flag = flag;
	}
	/**
	* 最大允许同时交易的订单数，0表示不限制
	* @return Integer
    */
	public Integer getMaxTradingOrder(){
		return maxTradingOrder;
	}
	/**
	* 最大允许同时交易的订单数，0表示不限制
	*/
	public void setMaxTradingOrder(Integer maxTradingOrder){
		this.maxTradingOrder = maxTradingOrder;
	}
	/**
	* 委托超时自动下架时间，单位为秒，0表示不过期
	* @return Integer
    */
	public Integer getMaxTradingTime(){
		return maxTradingTime;
	}
	/**
	* 委托超时自动下架时间，单位为秒，0表示不过期
	*/
	public void setMaxTradingTime(Integer maxTradingTime){
		this.maxTradingTime = maxTradingTime;
	}
	/**
	* 最大下单量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMaxVolume(){
		return maxVolume;
	}
	/**
	* 最大下单量
	*/
	public void setMaxVolume(java.math.BigDecimal maxVolume){
		this.maxVolume = maxVolume;
	}
	/**
	* 卖单最低价格
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMinSellPrice(){
		return minSellPrice;
	}
	/**
	* 卖单最低价格
	*/
	public void setMinSellPrice(java.math.BigDecimal minSellPrice){
		this.minSellPrice = minSellPrice;
	}
	/**
	* 最小成交额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMinTurnover(){
		return minTurnover;
	}
	/**
	* 最小成交额
	*/
	public void setMinTurnover(java.math.BigDecimal minTurnover){
		this.minTurnover = minTurnover;
	}
	/**
	* 最小下单量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMinVolume(){
		return minVolume;
	}
	/**
	* 最小下单量
	*/
	public void setMinVolume(java.math.BigDecimal minVolume){
		this.minVolume = minVolume;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getSort(){
		return sort;
	}
	/**
	* 
	*/
	public void setSort(Integer sort){
		this.sort = sort;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getZone(){
		return zone;
	}
	/**
	* 
	*/
	public void setZone(Integer zone){
		this.zone = zone;
	}
	/**
	* 
	* @return String
    */
	public String getDefaultSymbol(){
		return defaultSymbol;
	}
	/**
	* 
	*/
	public void setDefaultSymbol(String defaultSymbol){
		this.defaultSymbol = defaultSymbol;
	}
	/**
	* 0-主区 1-解封区 2期权区
	* @return Boolean
    */
	public Boolean getSymbolArea(){
		return symbolArea;
	}
	/**
	* 0-主区 1-解封区 2期权区
	*/
	public void setSymbolArea(Boolean symbolArea){
		this.symbolArea = symbolArea;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("symbol:").append(getSymbol()).append(";");
		sb.append("baseCoinScale:").append(getBaseCoinScale()).append(";");
		sb.append("baseFee:").append(getBaseFee()).append(";");
		sb.append("baseSymbol:").append(getBaseSymbol()).append(";");
		sb.append("coinScale:").append(getCoinScale()).append(";");
		sb.append("coinSymbol:").append(getCoinSymbol()).append(";");
		sb.append("enable:").append(getEnable()).append(";");
		sb.append("enableMarketBuy:").append(getEnableMarketBuy()).append(";");
		sb.append("enableMarketSell:").append(getEnableMarketSell()).append(";");
		sb.append("fee:").append(getFee()).append(";");
		sb.append("flag:").append(getFlag()).append(";");
		sb.append("maxTradingOrder:").append(getMaxTradingOrder()).append(";");
		sb.append("maxTradingTime:").append(getMaxTradingTime()).append(";");
		sb.append("maxVolume:").append(getMaxVolume()).append(";");
		sb.append("minSellPrice:").append(getMinSellPrice()).append(";");
		sb.append("minTurnover:").append(getMinTurnover()).append(";");
		sb.append("minVolume:").append(getMinVolume()).append(";");
		sb.append("sort:").append(getSort()).append(";");
		sb.append("zone:").append(getZone()).append(";");
		sb.append("defaultSymbol:").append(getDefaultSymbol()).append(";");
		sb.append("symbolArea:").append(getSymbolArea()).append(";");
		return sb.toString();
	}
}
