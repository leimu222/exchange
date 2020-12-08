package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [exchange服务实现]
 */
public class ExchangeOrder  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private String orderId;
	/**
     * 
     */
	private java.math.BigDecimal amount;
	/**
     * 
     */
	private String baseSymbol;
	/**
     * 
     */
	private Long canceledTime;
	/**
     * 
     */
	private String coinSymbol;
	/**
     * 
     */
	private Long completedTime;
	/**
     * 
     */
	private Integer direction;
	/**
     * 
     */
	private Integer marginTrade;
	/**
     * 
     */
	private Integer memberTrade;
	/**
     * 
     */
	private Long memberId;
	/**
     * 
     */
	private java.math.BigDecimal price;
	/**
     * 
     */
	private Integer status;
	/**
     * 
     */
	private String symbol;
	/**
     * 
     */
	private Long time;
	/**
     * 
     */
	private java.math.BigDecimal tradedAmount;
	/**
     * 
     */
	private java.math.BigDecimal turnover;
	/**
     * 
     */
	private Integer type;
	/**
     * 
     */
	private java.math.BigDecimal triggerPrice;
	/**
     * 
     */
	private Integer orderResource;
	/**
     * 
     */
	private String sellOrderTxHash;
	
	// setter and getter
	/**
	* 
	* @return String
    */
	public String getOrderId(){
		return orderId;
	}
	/**
	* 
	*/
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}
	/**
	* 
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 
	* @return String
    */
	public String getBaseSymbol(){
		return baseSymbol;
	}
	/**
	* 
	*/
	public void setBaseSymbol(String baseSymbol){
		this.baseSymbol = baseSymbol;
	}
	/**
	* 
	* @return Long
    */
	public Long getCanceledTime(){
		return canceledTime;
	}
	/**
	* 
	*/
	public void setCanceledTime(Long canceledTime){
		this.canceledTime = canceledTime;
	}
	/**
	* 
	* @return String
    */
	public String getCoinSymbol(){
		return coinSymbol;
	}
	/**
	* 
	*/
	public void setCoinSymbol(String coinSymbol){
		this.coinSymbol = coinSymbol;
	}
	/**
	* 
	* @return Long
    */
	public Long getCompletedTime(){
		return completedTime;
	}
	/**
	* 
	*/
	public void setCompletedTime(Long completedTime){
		this.completedTime = completedTime;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getDirection(){
		return direction;
	}
	/**
	* 
	*/
	public void setDirection(Integer direction){
		this.direction = direction;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getMarginTrade(){
		return marginTrade;
	}
	/**
	* 
	*/
	public void setMarginTrade(Integer marginTrade){
		this.marginTrade = marginTrade;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getMemberTrade(){
		return memberTrade;
	}
	/**
	* 
	*/
	public void setMemberTrade(Integer memberTrade){
		this.memberTrade = memberTrade;
	}
	/**
	* 
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPrice(){
		return price;
	}
	/**
	* 
	*/
	public void setPrice(java.math.BigDecimal price){
		this.price = price;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getStatus(){
		return status;
	}
	/**
	* 
	*/
	public void setStatus(Integer status){
		this.status = status;
	}
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
	* 
	* @return Long
    */
	public Long getTime(){
		return time;
	}
	/**
	* 
	*/
	public void setTime(Long time){
		this.time = time;
	}
	/**
	* 
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTradedAmount(){
		return tradedAmount;
	}
	/**
	* 
	*/
	public void setTradedAmount(java.math.BigDecimal tradedAmount){
		this.tradedAmount = tradedAmount;
	}
	/**
	* 
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTurnover(){
		return turnover;
	}
	/**
	* 
	*/
	public void setTurnover(java.math.BigDecimal turnover){
		this.turnover = turnover;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getType(){
		return type;
	}
	/**
	* 
	*/
	public void setType(Integer type){
		this.type = type;
	}
	/**
	* 
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTriggerPrice(){
		return triggerPrice;
	}
	/**
	* 
	*/
	public void setTriggerPrice(java.math.BigDecimal triggerPrice){
		this.triggerPrice = triggerPrice;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getOrderResource(){
		return orderResource;
	}
	/**
	* 
	*/
	public void setOrderResource(Integer orderResource){
		this.orderResource = orderResource;
	}
	/**
	* 
	* @return String
    */
	public String getSellOrderTxHash(){
		return sellOrderTxHash;
	}
	/**
	* 
	*/
	public void setSellOrderTxHash(String sellOrderTxHash){
		this.sellOrderTxHash = sellOrderTxHash;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("orderId:").append(getOrderId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("baseSymbol:").append(getBaseSymbol()).append(";");
		sb.append("canceledTime:").append(getCanceledTime()).append(";");
		sb.append("coinSymbol:").append(getCoinSymbol()).append(";");
		sb.append("completedTime:").append(getCompletedTime()).append(";");
		sb.append("direction:").append(getDirection()).append(";");
		sb.append("marginTrade:").append(getMarginTrade()).append(";");
		sb.append("memberTrade:").append(getMemberTrade()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("price:").append(getPrice()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("symbol:").append(getSymbol()).append(";");
		sb.append("time:").append(getTime()).append(";");
		sb.append("tradedAmount:").append(getTradedAmount()).append(";");
		sb.append("turnover:").append(getTurnover()).append(";");
		sb.append("type:").append(getType()).append(";");
		sb.append("triggerPrice:").append(getTriggerPrice()).append(";");
		sb.append("orderResource:").append(getOrderResource()).append(";");
		sb.append("sellOrderTxHash:").append(getSellOrderTxHash()).append(";");
		return sb.toString();
	}
}
