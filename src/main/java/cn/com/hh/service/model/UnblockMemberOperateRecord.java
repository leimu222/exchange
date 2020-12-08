package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public class UnblockMemberOperateRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Long id;
	/**
     * 用户编码
     */
	private Long memberId;
	/**
     * 订单编号
     */
	private String orderId;
	/**
     * 
     */
	private String symbol;
	/**
     * 价格
     */
	private java.math.BigDecimal price;
	/**
     * 行情实时价格
     */
	private java.math.BigDecimal currentPrice;
	/**
     * 数量
     */
	private java.math.BigDecimal amount;
	/**
     * 操作前的币币账户金额
     */
	private java.math.BigDecimal beforeBalance;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
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
	* 用户编码
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 用户编码
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 订单编号
	* @return String
    */
	public String getOrderId(){
		return orderId;
	}
	/**
	* 订单编号
	*/
	public void setOrderId(String orderId){
		this.orderId = orderId;
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
	* 价格
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPrice(){
		return price;
	}
	/**
	* 价格
	*/
	public void setPrice(java.math.BigDecimal price){
		this.price = price;
	}
	/**
	* 行情实时价格
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getCurrentPrice(){
		return currentPrice;
	}
	/**
	* 行情实时价格
	*/
	public void setCurrentPrice(java.math.BigDecimal currentPrice){
		this.currentPrice = currentPrice;
	}
	/**
	* 数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 数量
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 操作前的币币账户金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBeforeBalance(){
		return beforeBalance;
	}
	/**
	* 操作前的币币账户金额
	*/
	public void setBeforeBalance(java.math.BigDecimal beforeBalance){
		this.beforeBalance = beforeBalance;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("orderId:").append(getOrderId()).append(";");
		sb.append("symbol:").append(getSymbol()).append(";");
		sb.append("price:").append(getPrice()).append(";");
		sb.append("currentPrice:").append(getCurrentPrice()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("beforeBalance:").append(getBeforeBalance()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
