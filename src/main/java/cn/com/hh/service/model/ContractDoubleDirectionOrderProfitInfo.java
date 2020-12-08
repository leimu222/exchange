package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public class ContractDoubleDirectionOrderProfitInfo  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 订单id
     */
	private Long orderId;
	/**
     * 订单盈利
     */
	private java.math.BigDecimal profit;
	/**
     * 返回总天数，默认10天
     */
	private Integer days;
	/**
     * 用户id
     */
	private Long memberId;
	/**
     * 0未返回完成，1返回完成
     */
	private Integer status;
	/**
     * 创建时间
     */
	private java.util.Date createTime;
	/**
     * 时间戳
     */
	private Long sequence;
	/**
     * 剩余天数
     */
	private Integer remainDays;
	
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
	* 订单id
	* @return Long
    */
	public Long getOrderId(){
		return orderId;
	}
	/**
	* 订单id
	*/
	public void setOrderId(Long orderId){
		this.orderId = orderId;
	}
	/**
	* 订单盈利
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getProfit(){
		return profit;
	}
	/**
	* 订单盈利
	*/
	public void setProfit(java.math.BigDecimal profit){
		this.profit = profit;
	}
	/**
	* 返回总天数，默认10天
	* @return Integer
    */
	public Integer getDays(){
		return days;
	}
	/**
	* 返回总天数，默认10天
	*/
	public void setDays(Integer days){
		this.days = days;
	}
	/**
	* 用户id
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 用户id
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 0未返回完成，1返回完成
	* @return Integer
    */
	public Integer getStatus(){
		return status;
	}
	/**
	* 0未返回完成，1返回完成
	*/
	public void setStatus(Integer status){
		this.status = status;
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
	* 剩余天数
	* @return Integer
    */
	public Integer getRemainDays(){
		return remainDays;
	}
	/**
	* 剩余天数
	*/
	public void setRemainDays(Integer remainDays){
		this.remainDays = remainDays;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("orderId:").append(getOrderId()).append(";");
		sb.append("profit:").append(getProfit()).append(";");
		sb.append("days:").append(getDays()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		sb.append("remainDays:").append(getRemainDays()).append(";");
		return sb.toString();
	}
}
