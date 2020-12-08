package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [robot服务实现]
 */
public class RobotSymbolConfig  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 交易对
     */
	private String symbol;
	/**
     * 基础币种数量 
     */
	private java.math.BigDecimal baseCoinBalance;
	/**
     * 交易法币的币种数量
     */
	private java.math.BigDecimal tradeCoinBalance;
	/**
     * 机器人最大下单数量
     */
	private java.math.BigDecimal robotOrderMax;
	/**
     * 来源交易所编码，关联配置交易所
     */
	private Long fromExchangeId;
	/**
     * 来源交易所的交易对
     */
	private String fromExchangeSymbol;
	/**
     * 使用的下单账户
     */
	private Long memberId;
	/**
     * 委托量下浮率
     */
	private java.math.BigDecimal depthAmountDownRate;
	/**
     * 交易量上浮率
     */
	private java.math.BigDecimal tradeAmountUpRate;
	/**
     * 买单价格下浮率
     */
	private java.math.BigDecimal buyPriceDownRate;
	/**
     * 卖单价格上浮率
     */
	private java.math.BigDecimal sellPriceUpRate;
	/**
     * 手续费
     */
	private java.math.BigDecimal fee;
	/**
     * 档位补单时，每两单间隔的最小值
     */
	private java.math.BigDecimal depthIntervalMin;
	/**
     * 档位补单时，每两单间隔的最大值
     */
	private java.math.BigDecimal depthIntervalMax;
	/**
     * 状态 0-停止 1-启动
     */
	private Boolean status;
	/**
     * 搬砖套利状态  0-停止 1-启动
     */
	private Boolean arbitrageStatus;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private Long sequence;
	/**
     * 版本号
     */
	private Long version;
	
	// setter and getter
	/**
	* 交易对
	* @return String
    */
	public String getSymbol(){
		return symbol;
	}
	/**
	* 交易对
	*/
	public void setSymbol(String symbol){
		this.symbol = symbol;
	}
	/**
	* 基础币种数量 
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBaseCoinBalance(){
		return baseCoinBalance;
	}
	/**
	* 基础币种数量 
	*/
	public void setBaseCoinBalance(java.math.BigDecimal baseCoinBalance){
		this.baseCoinBalance = baseCoinBalance;
	}
	/**
	* 交易法币的币种数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTradeCoinBalance(){
		return tradeCoinBalance;
	}
	/**
	* 交易法币的币种数量
	*/
	public void setTradeCoinBalance(java.math.BigDecimal tradeCoinBalance){
		this.tradeCoinBalance = tradeCoinBalance;
	}
	/**
	* 机器人最大下单数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getRobotOrderMax(){
		return robotOrderMax;
	}
	/**
	* 机器人最大下单数量
	*/
	public void setRobotOrderMax(java.math.BigDecimal robotOrderMax){
		this.robotOrderMax = robotOrderMax;
	}
	/**
	* 来源交易所编码，关联配置交易所
	* @return Long
    */
	public Long getFromExchangeId(){
		return fromExchangeId;
	}
	/**
	* 来源交易所编码，关联配置交易所
	*/
	public void setFromExchangeId(Long fromExchangeId){
		this.fromExchangeId = fromExchangeId;
	}
	/**
	* 来源交易所的交易对
	* @return String
    */
	public String getFromExchangeSymbol(){
		return fromExchangeSymbol;
	}
	/**
	* 来源交易所的交易对
	*/
	public void setFromExchangeSymbol(String fromExchangeSymbol){
		this.fromExchangeSymbol = fromExchangeSymbol;
	}
	/**
	* 使用的下单账户
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 使用的下单账户
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 委托量下浮率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getDepthAmountDownRate(){
		return depthAmountDownRate;
	}
	/**
	* 委托量下浮率
	*/
	public void setDepthAmountDownRate(java.math.BigDecimal depthAmountDownRate){
		this.depthAmountDownRate = depthAmountDownRate;
	}
	/**
	* 交易量上浮率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTradeAmountUpRate(){
		return tradeAmountUpRate;
	}
	/**
	* 交易量上浮率
	*/
	public void setTradeAmountUpRate(java.math.BigDecimal tradeAmountUpRate){
		this.tradeAmountUpRate = tradeAmountUpRate;
	}
	/**
	* 买单价格下浮率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBuyPriceDownRate(){
		return buyPriceDownRate;
	}
	/**
	* 买单价格下浮率
	*/
	public void setBuyPriceDownRate(java.math.BigDecimal buyPriceDownRate){
		this.buyPriceDownRate = buyPriceDownRate;
	}
	/**
	* 卖单价格上浮率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getSellPriceUpRate(){
		return sellPriceUpRate;
	}
	/**
	* 卖单价格上浮率
	*/
	public void setSellPriceUpRate(java.math.BigDecimal sellPriceUpRate){
		this.sellPriceUpRate = sellPriceUpRate;
	}
	/**
	* 手续费
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFee(){
		return fee;
	}
	/**
	* 手续费
	*/
	public void setFee(java.math.BigDecimal fee){
		this.fee = fee;
	}
	/**
	* 档位补单时，每两单间隔的最小值
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getDepthIntervalMin(){
		return depthIntervalMin;
	}
	/**
	* 档位补单时，每两单间隔的最小值
	*/
	public void setDepthIntervalMin(java.math.BigDecimal depthIntervalMin){
		this.depthIntervalMin = depthIntervalMin;
	}
	/**
	* 档位补单时，每两单间隔的最大值
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getDepthIntervalMax(){
		return depthIntervalMax;
	}
	/**
	* 档位补单时，每两单间隔的最大值
	*/
	public void setDepthIntervalMax(java.math.BigDecimal depthIntervalMax){
		this.depthIntervalMax = depthIntervalMax;
	}
	/**
	* 状态 0-停止 1-启动
	* @return Boolean
    */
	public Boolean getStatus(){
		return status;
	}
	/**
	* 状态 0-停止 1-启动
	*/
	public void setStatus(Boolean status){
		this.status = status;
	}
	/**
	* 搬砖套利状态  0-停止 1-启动
	* @return Boolean
    */
	public Boolean getArbitrageStatus(){
		return arbitrageStatus;
	}
	/**
	* 搬砖套利状态  0-停止 1-启动
	*/
	public void setArbitrageStatus(Boolean arbitrageStatus){
		this.arbitrageStatus = arbitrageStatus;
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
	* @return Long
    */
	public Long getSequence(){
		return sequence;
	}
	/**
	* 
	*/
	public void setSequence(Long sequence){
		this.sequence = sequence;
	}
	/**
	* 版本号
	* @return Long
    */
	public Long getVersion(){
		return version;
	}
	/**
	* 版本号
	*/
	public void setVersion(Long version){
		this.version = version;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("symbol:").append(getSymbol()).append(";");
		sb.append("baseCoinBalance:").append(getBaseCoinBalance()).append(";");
		sb.append("tradeCoinBalance:").append(getTradeCoinBalance()).append(";");
		sb.append("robotOrderMax:").append(getRobotOrderMax()).append(";");
		sb.append("fromExchangeId:").append(getFromExchangeId()).append(";");
		sb.append("fromExchangeSymbol:").append(getFromExchangeSymbol()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("depthAmountDownRate:").append(getDepthAmountDownRate()).append(";");
		sb.append("tradeAmountUpRate:").append(getTradeAmountUpRate()).append(";");
		sb.append("buyPriceDownRate:").append(getBuyPriceDownRate()).append(";");
		sb.append("sellPriceUpRate:").append(getSellPriceUpRate()).append(";");
		sb.append("fee:").append(getFee()).append(";");
		sb.append("depthIntervalMin:").append(getDepthIntervalMin()).append(";");
		sb.append("depthIntervalMax:").append(getDepthIntervalMax()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("arbitrageStatus:").append(getArbitrageStatus()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		return sb.toString();
	}
}
