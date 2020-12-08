package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [release服务实现]
 */
public class ReleaseBalance  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键id
     */
	private Long id;
	/**
     * 用户id
     */
	private Long memberId;
	/**
     * 币种名字
     */
	private String coinName;
	/**
     * 币种单位
     */
	private String coinUnit;
	/**
     * 注册时间
     */
	private java.util.Date registerTime;
	/**
     * 会员名称
     */
	private String userName;
	/**
     * 手机号
     */
	private String phone;
	/**
     * 邮箱
     */
	private String email;
	/**
     * 释放余额
     */
	private java.math.BigDecimal releaseBalance;
	/**
     * 释放余额状态  0 - 未审核   1 - 已审核  2 - 全部
     */
	private String releaseState;
	/**
     * 释放时间
     */
	private java.util.Date releaseTime;
	
	// setter and getter
	/**
	* 主键id
	* @return Long
    */
	public Long getId(){
		return id;
	}
	/**
	* 主键id
	*/
	public void setId(Long id){
		this.id = id;
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
	* 币种名字
	* @return String
    */
	public String getCoinName(){
		return coinName;
	}
	/**
	* 币种名字
	*/
	public void setCoinName(String coinName){
		this.coinName = coinName;
	}
	/**
	* 币种单位
	* @return String
    */
	public String getCoinUnit(){
		return coinUnit;
	}
	/**
	* 币种单位
	*/
	public void setCoinUnit(String coinUnit){
		this.coinUnit = coinUnit;
	}
	/**
	* 注册时间
	* @return java.util.Date
    */
	public java.util.Date getRegisterTime(){
		return registerTime;
	}
	/**
	* 注册时间
	*/
	public void setRegisterTime(java.util.Date registerTime){
		this.registerTime = registerTime;
	}
	/**
	* 会员名称
	* @return String
    */
	public String getUserName(){
		return userName;
	}
	/**
	* 会员名称
	*/
	public void setUserName(String userName){
		this.userName = userName;
	}
	/**
	* 手机号
	* @return String
    */
	public String getPhone(){
		return phone;
	}
	/**
	* 手机号
	*/
	public void setPhone(String phone){
		this.phone = phone;
	}
	/**
	* 邮箱
	* @return String
    */
	public String getEmail(){
		return email;
	}
	/**
	* 邮箱
	*/
	public void setEmail(String email){
		this.email = email;
	}
	/**
	* 释放余额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getReleaseBalance(){
		return releaseBalance;
	}
	/**
	* 释放余额
	*/
	public void setReleaseBalance(java.math.BigDecimal releaseBalance){
		this.releaseBalance = releaseBalance;
	}
	/**
	* 释放余额状态  0 - 未审核   1 - 已审核  2 - 全部
	* @return String
    */
	public String getReleaseState(){
		return releaseState;
	}
	/**
	* 释放余额状态  0 - 未审核   1 - 已审核  2 - 全部
	*/
	public void setReleaseState(String releaseState){
		this.releaseState = releaseState;
	}
	/**
	* 释放时间
	* @return java.util.Date
    */
	public java.util.Date getReleaseTime(){
		return releaseTime;
	}
	/**
	* 释放时间
	*/
	public void setReleaseTime(java.util.Date releaseTime){
		this.releaseTime = releaseTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("coinName:").append(getCoinName()).append(";");
		sb.append("coinUnit:").append(getCoinUnit()).append(";");
		sb.append("registerTime:").append(getRegisterTime()).append(";");
		sb.append("userName:").append(getUserName()).append(";");
		sb.append("phone:").append(getPhone()).append(";");
		sb.append("email:").append(getEmail()).append(";");
		sb.append("releaseBalance:").append(getReleaseBalance()).append(";");
		sb.append("releaseState:").append(getReleaseState()).append(";");
		sb.append("releaseTime:").append(getReleaseTime()).append(";");
		return sb.toString();
	}
}
