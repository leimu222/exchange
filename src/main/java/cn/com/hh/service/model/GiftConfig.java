package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [gift服务实现]
 */
public class GiftConfig  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键ID自增
     */
	private Long id;
	/**
     * 活动名称
     */
	private String giftName;
	/**
     * 赠送币种
     */
	private String giftCoin;
	/**
     * 总量
     */
	private java.math.BigDecimal amount;
	/**
     * 持有币种
     */
	private String haveCoin;
	/**
     * 持有数量
     */
	private java.math.BigDecimal haveAmount;
	/**
     * 
     */
	private java.util.Date createTime;
	
	// setter and getter
	/**
	* 主键ID自增
	* @return Long
    */
	public Long getId(){
		return id;
	}
	/**
	* 主键ID自增
	*/
	public void setId(Long id){
		this.id = id;
	}
	/**
	* 活动名称
	* @return String
    */
	public String getGiftName(){
		return giftName;
	}
	/**
	* 活动名称
	*/
	public void setGiftName(String giftName){
		this.giftName = giftName;
	}
	/**
	* 赠送币种
	* @return String
    */
	public String getGiftCoin(){
		return giftCoin;
	}
	/**
	* 赠送币种
	*/
	public void setGiftCoin(String giftCoin){
		this.giftCoin = giftCoin;
	}
	/**
	* 总量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 总量
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 持有币种
	* @return String
    */
	public String getHaveCoin(){
		return haveCoin;
	}
	/**
	* 持有币种
	*/
	public void setHaveCoin(String haveCoin){
		this.haveCoin = haveCoin;
	}
	/**
	* 持有数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getHaveAmount(){
		return haveAmount;
	}
	/**
	* 持有数量
	*/
	public void setHaveAmount(java.math.BigDecimal haveAmount){
		this.haveAmount = haveAmount;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("giftName:").append(getGiftName()).append(";");
		sb.append("giftCoin:").append(getGiftCoin()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("haveCoin:").append(getHaveCoin()).append(";");
		sb.append("haveAmount:").append(getHaveAmount()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		return sb.toString();
	}
}
