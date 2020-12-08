package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [member服务实现]
 */
public class MemberBuyCoinInfo  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Integer id;
	/**
     * 
     */
	private Long memberId;
	/**
     * 认购币种
     */
	private String coinName;
	/**
     * 单价
     */
	private java.math.BigDecimal price;
	/**
     * 数量
     */
	private java.math.BigDecimal num;
	/**
     * 花费的USDT
     */
	private java.math.BigDecimal amount;
	/**
     * 0审核中，1通过，2驳回
     */
	private Integer status;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private java.util.Date updateTime;
	
	// setter and getter
	/**
	* 
	* @return Integer
    */
	public Integer getId(){
		return id;
	}
	/**
	* 
	*/
	public void setId(Integer id){
		this.id = id;
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
	* 认购币种
	* @return String
    */
	public String getCoinName(){
		return coinName;
	}
	/**
	* 认购币种
	*/
	public void setCoinName(String coinName){
		this.coinName = coinName;
	}
	/**
	* 单价
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPrice(){
		return price;
	}
	/**
	* 单价
	*/
	public void setPrice(java.math.BigDecimal price){
		this.price = price;
	}
	/**
	* 数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getNum(){
		return num;
	}
	/**
	* 数量
	*/
	public void setNum(java.math.BigDecimal num){
		this.num = num;
	}
	/**
	* 花费的USDT
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 花费的USDT
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 0审核中，1通过，2驳回
	* @return Integer
    */
	public Integer getStatus(){
		return status;
	}
	/**
	* 0审核中，1通过，2驳回
	*/
	public void setStatus(Integer status){
		this.status = status;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("coinName:").append(getCoinName()).append(";");
		sb.append("price:").append(getPrice()).append(";");
		sb.append("num:").append(getNum()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		return sb.toString();
	}
}
