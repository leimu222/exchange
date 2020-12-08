package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public class OptionExchangeOrderConditionRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 自增，主键
     */
	private Long id;
	/**
     * 关联持仓订单表主键
     */
	private Long orderId;
	/**
     * 是否止损 0-否 1-是
     */
	private Boolean ifStopLoss;
	/**
     * 止损触发价
     */
	private java.math.BigDecimal stopLossPrice;
	/**
     * 是否止盈 0-否 1-是
     */
	private Boolean ifStopProfit;
	/**
     * 止盈触发价
     */
	private java.math.BigDecimal stopProfitPrice;
	/**
     * 创建时间
     */
	private java.util.Date createTime;
	/**
     * 时间戳
     */
	private Long sequence;
	/**
     * 止损比例，取值0-1之间
     */
	private java.math.BigDecimal stopLossRate;
	/**
     * 止盈比例
     */
	private java.math.BigDecimal stopProfitRate;
	
	// setter and getter
	/**
	* 自增，主键
	* @return Long
    */
	public Long getId(){
		return id;
	}
	/**
	* 自增，主键
	*/
	public void setId(Long id){
		this.id = id;
	}
	/**
	* 关联持仓订单表主键
	* @return Long
    */
	public Long getOrderId(){
		return orderId;
	}
	/**
	* 关联持仓订单表主键
	*/
	public void setOrderId(Long orderId){
		this.orderId = orderId;
	}
	/**
	* 是否止损 0-否 1-是
	* @return Boolean
    */
	public Boolean getIfStopLoss(){
		return ifStopLoss;
	}
	/**
	* 是否止损 0-否 1-是
	*/
	public void setIfStopLoss(Boolean ifStopLoss){
		this.ifStopLoss = ifStopLoss;
	}
	/**
	* 止损触发价
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getStopLossPrice(){
		return stopLossPrice;
	}
	/**
	* 止损触发价
	*/
	public void setStopLossPrice(java.math.BigDecimal stopLossPrice){
		this.stopLossPrice = stopLossPrice;
	}
	/**
	* 是否止盈 0-否 1-是
	* @return Boolean
    */
	public Boolean getIfStopProfit(){
		return ifStopProfit;
	}
	/**
	* 是否止盈 0-否 1-是
	*/
	public void setIfStopProfit(Boolean ifStopProfit){
		this.ifStopProfit = ifStopProfit;
	}
	/**
	* 止盈触发价
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getStopProfitPrice(){
		return stopProfitPrice;
	}
	/**
	* 止盈触发价
	*/
	public void setStopProfitPrice(java.math.BigDecimal stopProfitPrice){
		this.stopProfitPrice = stopProfitPrice;
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
	* 时间戳
	* @return Long
    */
	public Long getSequence(){
		return sequence;
	}
	/**
	* 时间戳
	*/
	public void setSequence(Long sequence){
		this.sequence = sequence;
	}
	/**
	* 止损比例，取值0-1之间
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getStopLossRate(){
		return stopLossRate;
	}
	/**
	* 止损比例，取值0-1之间
	*/
	public void setStopLossRate(java.math.BigDecimal stopLossRate){
		this.stopLossRate = stopLossRate;
	}
	/**
	* 止盈比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getStopProfitRate(){
		return stopProfitRate;
	}
	/**
	* 止盈比例
	*/
	public void setStopProfitRate(java.math.BigDecimal stopProfitRate){
		this.stopProfitRate = stopProfitRate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("orderId:").append(getOrderId()).append(";");
		sb.append("ifStopLoss:").append(getIfStopLoss()).append(";");
		sb.append("stopLossPrice:").append(getStopLossPrice()).append(";");
		sb.append("ifStopProfit:").append(getIfStopProfit()).append(";");
		sb.append("stopProfitPrice:").append(getStopProfitPrice()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		sb.append("stopLossRate:").append(getStopLossRate()).append(";");
		sb.append("stopProfitRate:").append(getStopProfitRate()).append(";");
		return sb.toString();
	}
}
