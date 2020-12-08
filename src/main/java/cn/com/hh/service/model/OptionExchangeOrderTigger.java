package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public class OptionExchangeOrderTigger  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 关联持仓订单表主键
     */
	private Long orderId;
	/**
     * 触发价格
     */
	private java.math.BigDecimal openPrice;
	/**
     * 乐观锁
     */
	private Long version;
	/**
     * 创建时间
     */
	private java.util.Date createTime;
	/**
     * 时间戳
     */
	private Long sequence;
	
	// setter and getter
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
	* 触发价格
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getOpenPrice(){
		return openPrice;
	}
	/**
	* 触发价格
	*/
	public void setOpenPrice(java.math.BigDecimal openPrice){
		this.openPrice = openPrice;
	}
	/**
	* 乐观锁
	* @return Long
    */
	public Long getVersion(){
		return version;
	}
	/**
	* 乐观锁
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("orderId:").append(getOrderId()).append(";");
		sb.append("openPrice:").append(getOpenPrice()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
