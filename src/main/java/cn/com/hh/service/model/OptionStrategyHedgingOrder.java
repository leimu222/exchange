package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public class OptionStrategyHedgingOrder  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 节点用户编码
     */
	private Long memberId;
	/**
     * 合约对冲交易所
     */
	private Long fromExchangeId;
	/**
     * 对冲时使用的apiKey
     */
	private String apiKey;
	/**
     * 其他交易所合约订单ID
     */
	private String fromExchangeOrderId;
	/**
     * 下单交易对
     */
	private String symbol;
	/**
     * 下单价格
     */
	private java.math.BigDecimal price;
	/**
     * 下单张数
     */
	private Long amount;
	/**
     * 合约面值，即1张合约对应多少美元
     */
	private java.math.BigDecimal contractSize;
	/**
     * 方向 "buy":买 "sell":卖
     */
	private String direction;
	/**
     * "open":开 "close":平
     */
	private String offset;
	/**
     * 杠杆倍数
     */
	private Integer leverRate;
	/**
     * "limit":限价
     */
	private String orderPriceType;
	/**
     * 创建时间
     */
	private java.util.Date createTime;
	
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
	* 节点用户编码
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 节点用户编码
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 合约对冲交易所
	* @return Long
    */
	public Long getFromExchangeId(){
		return fromExchangeId;
	}
	/**
	* 合约对冲交易所
	*/
	public void setFromExchangeId(Long fromExchangeId){
		this.fromExchangeId = fromExchangeId;
	}
	/**
	* 对冲时使用的apiKey
	* @return String
    */
	public String getApiKey(){
		return apiKey;
	}
	/**
	* 对冲时使用的apiKey
	*/
	public void setApiKey(String apiKey){
		this.apiKey = apiKey;
	}
	/**
	* 其他交易所合约订单ID
	* @return String
    */
	public String getFromExchangeOrderId(){
		return fromExchangeOrderId;
	}
	/**
	* 其他交易所合约订单ID
	*/
	public void setFromExchangeOrderId(String fromExchangeOrderId){
		this.fromExchangeOrderId = fromExchangeOrderId;
	}
	/**
	* 下单交易对
	* @return String
    */
	public String getSymbol(){
		return symbol;
	}
	/**
	* 下单交易对
	*/
	public void setSymbol(String symbol){
		this.symbol = symbol;
	}
	/**
	* 下单价格
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPrice(){
		return price;
	}
	/**
	* 下单价格
	*/
	public void setPrice(java.math.BigDecimal price){
		this.price = price;
	}
	/**
	* 下单张数
	* @return Long
    */
	public Long getAmount(){
		return amount;
	}
	/**
	* 下单张数
	*/
	public void setAmount(Long amount){
		this.amount = amount;
	}
	/**
	* 合约面值，即1张合约对应多少美元
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getContractSize(){
		return contractSize;
	}
	/**
	* 合约面值，即1张合约对应多少美元
	*/
	public void setContractSize(java.math.BigDecimal contractSize){
		this.contractSize = contractSize;
	}
	/**
	* 方向 "buy":买 "sell":卖
	* @return String
    */
	public String getDirection(){
		return direction;
	}
	/**
	* 方向 "buy":买 "sell":卖
	*/
	public void setDirection(String direction){
		this.direction = direction;
	}
	/**
	* "open":开 "close":平
	* @return String
    */
	public String getOffset(){
		return offset;
	}
	/**
	* "open":开 "close":平
	*/
	public void setOffset(String offset){
		this.offset = offset;
	}
	/**
	* 杠杆倍数
	* @return Integer
    */
	public Integer getLeverRate(){
		return leverRate;
	}
	/**
	* 杠杆倍数
	*/
	public void setLeverRate(Integer leverRate){
		this.leverRate = leverRate;
	}
	/**
	* "limit":限价
	* @return String
    */
	public String getOrderPriceType(){
		return orderPriceType;
	}
	/**
	* "limit":限价
	*/
	public void setOrderPriceType(String orderPriceType){
		this.orderPriceType = orderPriceType;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("fromExchangeId:").append(getFromExchangeId()).append(";");
		sb.append("apiKey:").append(getApiKey()).append(";");
		sb.append("fromExchangeOrderId:").append(getFromExchangeOrderId()).append(";");
		sb.append("symbol:").append(getSymbol()).append(";");
		sb.append("price:").append(getPrice()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("contractSize:").append(getContractSize()).append(";");
		sb.append("direction:").append(getDirection()).append(";");
		sb.append("offset:").append(getOffset()).append(";");
		sb.append("leverRate:").append(getLeverRate()).append(";");
		sb.append("orderPriceType:").append(getOrderPriceType()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		return sb.toString();
	}
}
