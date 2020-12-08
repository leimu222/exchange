package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public class ContractDoubleMemberStrategyOrder  implements Serializable {

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
     * 
     */
	private Long contractOrderId;
	/**
     * 
     */
	private Long apiId;
	/**
     * 对冲时使用的apiKey
     */
	private String apiKey;
	/**
     * 
     */
	private String secretKey;
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
	/**
     * 最终下单状态 0-下单成功  1-下单不成功
     */
	private Boolean status;
	/**
     * 备注信息
     */
	private String remark;
	/**
     * 撮合状态（同火币）：(1准备提交 2准备提交 3已提交 4部分成交 5部分成交已撤单 6全部成交 7已撤单 11撤单中)
     */
	private Boolean matchStatus;
	/**
     * 
     */
	private java.util.Date updateTime;
	/**
     * 冻结保证金
     */
	private java.math.BigDecimal marginFrozen;
	/**
     * 收益
     */
	private java.math.BigDecimal profit;
	/**
     * 平仓订单id
     */
	private String closeOrderId;
	/**
     * 平仓撮合状态（同火币）：(1准备提交 2准备提交 3已提交 4部分成交 5部分成交已撤单 6全部成交 7已撤单 11撤单中)
     */
	private Boolean closeMatchStatus;
	/**
     * 平仓时间
     */
	private java.util.Date closeTime;
	
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
	* 
	* @return Long
    */
	public Long getContractOrderId(){
		return contractOrderId;
	}
	/**
	* 
	*/
	public void setContractOrderId(Long contractOrderId){
		this.contractOrderId = contractOrderId;
	}
	/**
	* 
	* @return Long
    */
	public Long getApiId(){
		return apiId;
	}
	/**
	* 
	*/
	public void setApiId(Long apiId){
		this.apiId = apiId;
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
	* 
	* @return String
    */
	public String getSecretKey(){
		return secretKey;
	}
	/**
	* 
	*/
	public void setSecretKey(String secretKey){
		this.secretKey = secretKey;
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
	/**
	* 最终下单状态 0-下单成功  1-下单不成功
	* @return Boolean
    */
	public Boolean getStatus(){
		return status;
	}
	/**
	* 最终下单状态 0-下单成功  1-下单不成功
	*/
	public void setStatus(Boolean status){
		this.status = status;
	}
	/**
	* 备注信息
	* @return String
    */
	public String getRemark(){
		return remark;
	}
	/**
	* 备注信息
	*/
	public void setRemark(String remark){
		this.remark = remark;
	}
	/**
	* 撮合状态（同火币）：(1准备提交 2准备提交 3已提交 4部分成交 5部分成交已撤单 6全部成交 7已撤单 11撤单中)
	* @return Boolean
    */
	public Boolean getMatchStatus(){
		return matchStatus;
	}
	/**
	* 撮合状态（同火币）：(1准备提交 2准备提交 3已提交 4部分成交 5部分成交已撤单 6全部成交 7已撤单 11撤单中)
	*/
	public void setMatchStatus(Boolean matchStatus){
		this.matchStatus = matchStatus;
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
	* 冻结保证金
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMarginFrozen(){
		return marginFrozen;
	}
	/**
	* 冻结保证金
	*/
	public void setMarginFrozen(java.math.BigDecimal marginFrozen){
		this.marginFrozen = marginFrozen;
	}
	/**
	* 收益
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getProfit(){
		return profit;
	}
	/**
	* 收益
	*/
	public void setProfit(java.math.BigDecimal profit){
		this.profit = profit;
	}
	/**
	* 平仓订单id
	* @return String
    */
	public String getCloseOrderId(){
		return closeOrderId;
	}
	/**
	* 平仓订单id
	*/
	public void setCloseOrderId(String closeOrderId){
		this.closeOrderId = closeOrderId;
	}
	/**
	* 平仓撮合状态（同火币）：(1准备提交 2准备提交 3已提交 4部分成交 5部分成交已撤单 6全部成交 7已撤单 11撤单中)
	* @return Boolean
    */
	public Boolean getCloseMatchStatus(){
		return closeMatchStatus;
	}
	/**
	* 平仓撮合状态（同火币）：(1准备提交 2准备提交 3已提交 4部分成交 5部分成交已撤单 6全部成交 7已撤单 11撤单中)
	*/
	public void setCloseMatchStatus(Boolean closeMatchStatus){
		this.closeMatchStatus = closeMatchStatus;
	}
	/**
	* 平仓时间
	* @return java.util.Date
    */
	public java.util.Date getCloseTime(){
		return closeTime;
	}
	/**
	* 平仓时间
	*/
	public void setCloseTime(java.util.Date closeTime){
		this.closeTime = closeTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("fromExchangeId:").append(getFromExchangeId()).append(";");
		sb.append("contractOrderId:").append(getContractOrderId()).append(";");
		sb.append("apiId:").append(getApiId()).append(";");
		sb.append("apiKey:").append(getApiKey()).append(";");
		sb.append("secretKey:").append(getSecretKey()).append(";");
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
		sb.append("status:").append(getStatus()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("matchStatus:").append(getMatchStatus()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		sb.append("marginFrozen:").append(getMarginFrozen()).append(";");
		sb.append("profit:").append(getProfit()).append(";");
		sb.append("closeOrderId:").append(getCloseOrderId()).append(";");
		sb.append("closeMatchStatus:").append(getCloseMatchStatus()).append(";");
		sb.append("closeTime:").append(getCloseTime()).append(";");
		return sb.toString();
	}
}
