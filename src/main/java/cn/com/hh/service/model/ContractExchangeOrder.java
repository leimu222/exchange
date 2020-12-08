package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public class ContractExchangeOrder  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 会员编号
     */
	private Long memberId;
	/**
     * 交易对
     */
	private String symbol;
	/**
     * 订单方向 0-买涨 1-买跌
     */
	private Boolean side;
	/**
     * 委托方式 0-市价 1-限价
     */
	private Boolean type;
	/**
     * 开仓价
     */
	private java.math.BigDecimal openPrice;
	/**
     * 接口提交时币种的价格
     */
	private java.math.BigDecimal price;
	/**
     * 限价时的触发价格
     */
	private java.math.BigDecimal limitTriggerPrice;
	/**
     * 限价时的委托成交价格
     */
	private java.math.BigDecimal limitPrice;
	/**
     * 购买数额
     */
	private java.math.BigDecimal amount;
	/**
     * 投入本金
     */
	private java.math.BigDecimal capitalAmount;
	/**
     * 本金币种类型 - -USDT
     */
	private String coinId;
	/**
     * 杠杆倍数
     */
	private java.math.BigDecimal leverMultiple;
	/**
     * 是否设置止损 0-否 1-是
     */
	private Boolean ifStopLoss;
	/**
     * 止损触发价格
     */
	private java.math.BigDecimal stopLossPrice;
	/**
     * 是否设置止盈 0-否 1-是
     */
	private Boolean ifStopProfit;
	/**
     * 止盈触发价格
     */
	private java.math.BigDecimal stopProfitPrice;
	/**
     * 状态，0-委托中 1-持仓中 2-委托取消 3-手动平仓 4-强制平仓 5-爆仓 6-穿仓 7-止盈 8-止损9-跟随平仓
     */
	private Boolean status;
	/**
     * 订单来源IP
     */
	private String originIp;
	/**
     * 来源 0-PC端 1-移动端 2-跟随下单
     */
	private Boolean origin;
	/**
     * 
     */
	private Long leaderOrderId;
	/**
     * 
     */
	private Long leaderMemberId;
	/**
     * 乐观锁版本号
     */
	private Long version;
	/**
     * 创建时间
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private Long sequence;
	/**
     * 0自由合约，1双仓合约
     */
	private Integer contractType;
	/**
     * 0自由合约钱包，1双仓合约钱包，2托管合约钱包
     */
	private Integer walletType;
	/**
     * 0只在本平台下单，1一键在其他平台下单
     */
	private Integer isOneClickOrder;
	/**
     * 开仓点差
     */
	private java.math.BigDecimal openSpotInterval;
	/**
     * 合约面值
     */
	private java.math.BigDecimal contractSize;
	/**
     * 合约面值手数
     */
	private java.math.BigDecimal contractSizeQuantity;
	
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
	* 会员编号
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 会员编号
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
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
	* 订单方向 0-买涨 1-买跌
	* @return Boolean
    */
	public Boolean getSide(){
		return side;
	}
	/**
	* 订单方向 0-买涨 1-买跌
	*/
	public void setSide(Boolean side){
		this.side = side;
	}
	/**
	* 委托方式 0-市价 1-限价
	* @return Boolean
    */
	public Boolean getType(){
		return type;
	}
	/**
	* 委托方式 0-市价 1-限价
	*/
	public void setType(Boolean type){
		this.type = type;
	}
	/**
	* 开仓价
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getOpenPrice(){
		return openPrice;
	}
	/**
	* 开仓价
	*/
	public void setOpenPrice(java.math.BigDecimal openPrice){
		this.openPrice = openPrice;
	}
	/**
	* 接口提交时币种的价格
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPrice(){
		return price;
	}
	/**
	* 接口提交时币种的价格
	*/
	public void setPrice(java.math.BigDecimal price){
		this.price = price;
	}
	/**
	* 限价时的触发价格
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getLimitTriggerPrice(){
		return limitTriggerPrice;
	}
	/**
	* 限价时的触发价格
	*/
	public void setLimitTriggerPrice(java.math.BigDecimal limitTriggerPrice){
		this.limitTriggerPrice = limitTriggerPrice;
	}
	/**
	* 限价时的委托成交价格
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getLimitPrice(){
		return limitPrice;
	}
	/**
	* 限价时的委托成交价格
	*/
	public void setLimitPrice(java.math.BigDecimal limitPrice){
		this.limitPrice = limitPrice;
	}
	/**
	* 购买数额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 购买数额
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 投入本金
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getCapitalAmount(){
		return capitalAmount;
	}
	/**
	* 投入本金
	*/
	public void setCapitalAmount(java.math.BigDecimal capitalAmount){
		this.capitalAmount = capitalAmount;
	}
	/**
	* 本金币种类型 - -USDT
	* @return String
    */
	public String getCoinId(){
		return coinId;
	}
	/**
	* 本金币种类型 - -USDT
	*/
	public void setCoinId(String coinId){
		this.coinId = coinId;
	}
	/**
	* 杠杆倍数
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getLeverMultiple(){
		return leverMultiple;
	}
	/**
	* 杠杆倍数
	*/
	public void setLeverMultiple(java.math.BigDecimal leverMultiple){
		this.leverMultiple = leverMultiple;
	}
	/**
	* 是否设置止损 0-否 1-是
	* @return Boolean
    */
	public Boolean getIfStopLoss(){
		return ifStopLoss;
	}
	/**
	* 是否设置止损 0-否 1-是
	*/
	public void setIfStopLoss(Boolean ifStopLoss){
		this.ifStopLoss = ifStopLoss;
	}
	/**
	* 止损触发价格
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getStopLossPrice(){
		return stopLossPrice;
	}
	/**
	* 止损触发价格
	*/
	public void setStopLossPrice(java.math.BigDecimal stopLossPrice){
		this.stopLossPrice = stopLossPrice;
	}
	/**
	* 是否设置止盈 0-否 1-是
	* @return Boolean
    */
	public Boolean getIfStopProfit(){
		return ifStopProfit;
	}
	/**
	* 是否设置止盈 0-否 1-是
	*/
	public void setIfStopProfit(Boolean ifStopProfit){
		this.ifStopProfit = ifStopProfit;
	}
	/**
	* 止盈触发价格
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getStopProfitPrice(){
		return stopProfitPrice;
	}
	/**
	* 止盈触发价格
	*/
	public void setStopProfitPrice(java.math.BigDecimal stopProfitPrice){
		this.stopProfitPrice = stopProfitPrice;
	}
	/**
	* 状态，0-委托中 1-持仓中 2-委托取消 3-手动平仓 4-强制平仓 5-爆仓 6-穿仓 7-止盈 8-止损9-跟随平仓
	* @return Boolean
    */
	public Boolean getStatus(){
		return status;
	}
	/**
	* 状态，0-委托中 1-持仓中 2-委托取消 3-手动平仓 4-强制平仓 5-爆仓 6-穿仓 7-止盈 8-止损9-跟随平仓
	*/
	public void setStatus(Boolean status){
		this.status = status;
	}
	/**
	* 订单来源IP
	* @return String
    */
	public String getOriginIp(){
		return originIp;
	}
	/**
	* 订单来源IP
	*/
	public void setOriginIp(String originIp){
		this.originIp = originIp;
	}
	/**
	* 来源 0-PC端 1-移动端 2-跟随下单
	* @return Boolean
    */
	public Boolean getOrigin(){
		return origin;
	}
	/**
	* 来源 0-PC端 1-移动端 2-跟随下单
	*/
	public void setOrigin(Boolean origin){
		this.origin = origin;
	}
	/**
	* 
	* @return Long
    */
	public Long getLeaderOrderId(){
		return leaderOrderId;
	}
	/**
	* 
	*/
	public void setLeaderOrderId(Long leaderOrderId){
		this.leaderOrderId = leaderOrderId;
	}
	/**
	* 
	* @return Long
    */
	public Long getLeaderMemberId(){
		return leaderMemberId;
	}
	/**
	* 
	*/
	public void setLeaderMemberId(Long leaderMemberId){
		this.leaderMemberId = leaderMemberId;
	}
	/**
	* 乐观锁版本号
	* @return Long
    */
	public Long getVersion(){
		return version;
	}
	/**
	* 乐观锁版本号
	*/
	public void setVersion(Long version){
		this.version = version;
	}
	/**
	* 创建时间
	* @return java.util.Date
    */
	public java.util.Date getCreateTime(){
		return createTime;
	}
	/**
	* 创建时间
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
	* 0自由合约，1双仓合约
	* @return Integer
    */
	public Integer getContractType(){
		return contractType;
	}
	/**
	* 0自由合约，1双仓合约
	*/
	public void setContractType(Integer contractType){
		this.contractType = contractType;
	}
	/**
	* 0自由合约钱包，1双仓合约钱包，2托管合约钱包
	* @return Integer
    */
	public Integer getWalletType(){
		return walletType;
	}
	/**
	* 0自由合约钱包，1双仓合约钱包，2托管合约钱包
	*/
	public void setWalletType(Integer walletType){
		this.walletType = walletType;
	}
	/**
	* 0只在本平台下单，1一键在其他平台下单
	* @return Integer
    */
	public Integer getIsOneClickOrder(){
		return isOneClickOrder;
	}
	/**
	* 0只在本平台下单，1一键在其他平台下单
	*/
	public void setIsOneClickOrder(Integer isOneClickOrder){
		this.isOneClickOrder = isOneClickOrder;
	}
	/**
	* 开仓点差
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getOpenSpotInterval(){
		return openSpotInterval;
	}
	/**
	* 开仓点差
	*/
	public void setOpenSpotInterval(java.math.BigDecimal openSpotInterval){
		this.openSpotInterval = openSpotInterval;
	}
	/**
	* 合约面值
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getContractSize(){
		return contractSize;
	}
	/**
	* 合约面值
	*/
	public void setContractSize(java.math.BigDecimal contractSize){
		this.contractSize = contractSize;
	}
	/**
	* 合约面值手数
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getContractSizeQuantity(){
		return contractSizeQuantity;
	}
	/**
	* 合约面值手数
	*/
	public void setContractSizeQuantity(java.math.BigDecimal contractSizeQuantity){
		this.contractSizeQuantity = contractSizeQuantity;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("symbol:").append(getSymbol()).append(";");
		sb.append("side:").append(getSide()).append(";");
		sb.append("type:").append(getType()).append(";");
		sb.append("openPrice:").append(getOpenPrice()).append(";");
		sb.append("price:").append(getPrice()).append(";");
		sb.append("limitTriggerPrice:").append(getLimitTriggerPrice()).append(";");
		sb.append("limitPrice:").append(getLimitPrice()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("capitalAmount:").append(getCapitalAmount()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		sb.append("leverMultiple:").append(getLeverMultiple()).append(";");
		sb.append("ifStopLoss:").append(getIfStopLoss()).append(";");
		sb.append("stopLossPrice:").append(getStopLossPrice()).append(";");
		sb.append("ifStopProfit:").append(getIfStopProfit()).append(";");
		sb.append("stopProfitPrice:").append(getStopProfitPrice()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("originIp:").append(getOriginIp()).append(";");
		sb.append("origin:").append(getOrigin()).append(";");
		sb.append("leaderOrderId:").append(getLeaderOrderId()).append(";");
		sb.append("leaderMemberId:").append(getLeaderMemberId()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		sb.append("contractType:").append(getContractType()).append(";");
		sb.append("walletType:").append(getWalletType()).append(";");
		sb.append("isOneClickOrder:").append(getIsOneClickOrder()).append(";");
		sb.append("openSpotInterval:").append(getOpenSpotInterval()).append(";");
		sb.append("contractSize:").append(getContractSize()).append(";");
		sb.append("contractSizeQuantity:").append(getContractSizeQuantity()).append(";");
		return sb.toString();
	}
}
