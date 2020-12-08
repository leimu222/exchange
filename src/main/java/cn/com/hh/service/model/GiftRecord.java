package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [gift服务实现]
 */
public class GiftRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键ID自增
     */
	private Long id;
	/**
     * 用户ID
     */
	private Long userId;
	/**
     * 用户昵称
     */
	private String userName;
	/**
     * 用户手机号
     */
	private String userMobile;
	/**
     * 活动名称
     */
	private String giftName;
	/**
     * 赠送币种
     */
	private String giftCoin;
	/**
     * 赠送数量
     */
	private java.math.BigDecimal giftAmount;
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
	* 用户ID
	* @return Long
    */
	public Long getUserId(){
		return userId;
	}
	/**
	* 用户ID
	*/
	public void setUserId(Long userId){
		this.userId = userId;
	}
	/**
	* 用户昵称
	* @return String
    */
	public String getUserName(){
		return userName;
	}
	/**
	* 用户昵称
	*/
	public void setUserName(String userName){
		this.userName = userName;
	}
	/**
	* 用户手机号
	* @return String
    */
	public String getUserMobile(){
		return userMobile;
	}
	/**
	* 用户手机号
	*/
	public void setUserMobile(String userMobile){
		this.userMobile = userMobile;
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
	* 赠送数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getGiftAmount(){
		return giftAmount;
	}
	/**
	* 赠送数量
	*/
	public void setGiftAmount(java.math.BigDecimal giftAmount){
		this.giftAmount = giftAmount;
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
		sb.append("userId:").append(getUserId()).append(";");
		sb.append("userName:").append(getUserName()).append(";");
		sb.append("userMobile:").append(getUserMobile()).append(";");
		sb.append("giftName:").append(getGiftName()).append(";");
		sb.append("giftCoin:").append(getGiftCoin()).append(";");
		sb.append("giftAmount:").append(getGiftAmount()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		return sb.toString();
	}
}
