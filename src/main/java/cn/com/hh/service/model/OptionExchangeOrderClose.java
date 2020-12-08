package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public class OptionExchangeOrderClose  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 关联订单主键
     */
	private Long orderId;
	/**
     * 平仓价格
     */
	private java.math.BigDecimal closePrice;
	/**
     * 盈亏额-百分比
     */
	private java.math.BigDecimal profitOrLoss;
	/**
     * 平仓盈亏额
     */
	private java.math.BigDecimal closeProfitOrLoss;
	/**
     * 平仓类型 0-手动平仓 1-自动平仓
     */
	private Boolean type;
	/**
     * 创建时间
     */
	private java.util.Date createTime;
	/**
     * 时间戳
     */
	private Long sequence;
	/**
     * 乐观锁版本号
     */
	private Long version;
	
	// setter and getter
	/**
	* 关联订单主键
	* @return Long
    */
	public Long getOrderId(){
		return orderId;
	}
	/**
	* 关联订单主键
	*/
	public void setOrderId(Long orderId){
		this.orderId = orderId;
	}
	/**
	* 平仓价格
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getClosePrice(){
		return closePrice;
	}
	/**
	* 平仓价格
	*/
	public void setClosePrice(java.math.BigDecimal closePrice){
		this.closePrice = closePrice;
	}
	/**
	* 盈亏额-百分比
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getProfitOrLoss(){
		return profitOrLoss;
	}
	/**
	* 盈亏额-百分比
	*/
	public void setProfitOrLoss(java.math.BigDecimal profitOrLoss){
		this.profitOrLoss = profitOrLoss;
	}
	/**
	* 平仓盈亏额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getCloseProfitOrLoss(){
		return closeProfitOrLoss;
	}
	/**
	* 平仓盈亏额
	*/
	public void setCloseProfitOrLoss(java.math.BigDecimal closeProfitOrLoss){
		this.closeProfitOrLoss = closeProfitOrLoss;
	}
	/**
	* 平仓类型 0-手动平仓 1-自动平仓
	* @return Boolean
    */
	public Boolean getType(){
		return type;
	}
	/**
	* 平仓类型 0-手动平仓 1-自动平仓
	*/
	public void setType(Boolean type){
		this.type = type;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("orderId:").append(getOrderId()).append(";");
		sb.append("closePrice:").append(getClosePrice()).append(";");
		sb.append("profitOrLoss:").append(getProfitOrLoss()).append(";");
		sb.append("closeProfitOrLoss:").append(getCloseProfitOrLoss()).append(";");
		sb.append("type:").append(getType()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		return sb.toString();
	}
}
