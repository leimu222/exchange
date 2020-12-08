package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [emption服务实现]
 */
public class EmptionRecord  implements Serializable {

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
     * ieoId
     */
	private Long ieoId;
	/**
     * 用户昵称
     */
	private String userName;
	/**
     * 用户手机号
     */
	private String userMobile;
	/**
     * 项目名称
     */
	private String ieoName;
	/**
     * 发售币种
     */
	private String saleCoin;
	/**
     * 发售总量
     */
	private java.math.BigDecimal saleAmount;
	/**
     * 募集币种
     */
	private String raiseCoin;
	/**
     * 募集币种与发售币种的比率
     */
	private java.math.BigDecimal ratio;
	/**
     * 募集开始时间
     */
	private java.util.Date startTime;
	/**
     * 募集结束时间
     */
	private java.util.Date endTime;
	/**
     * 状态
     */
	private String status;
	/**
     * 认购数量
     */
	private java.math.BigDecimal receiveAmount;
	/**
     * 使用数量
     */
	private java.math.BigDecimal payAmount;
	/**
     * 预计上线时间
     */
	private java.util.Date expectTime;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private String picView;
	
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
	* ieoId
	* @return Long
    */
	public Long getIeoId(){
		return ieoId;
	}
	/**
	* ieoId
	*/
	public void setIeoId(Long ieoId){
		this.ieoId = ieoId;
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
	* 项目名称
	* @return String
    */
	public String getIeoName(){
		return ieoName;
	}
	/**
	* 项目名称
	*/
	public void setIeoName(String ieoName){
		this.ieoName = ieoName;
	}
	/**
	* 发售币种
	* @return String
    */
	public String getSaleCoin(){
		return saleCoin;
	}
	/**
	* 发售币种
	*/
	public void setSaleCoin(String saleCoin){
		this.saleCoin = saleCoin;
	}
	/**
	* 发售总量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getSaleAmount(){
		return saleAmount;
	}
	/**
	* 发售总量
	*/
	public void setSaleAmount(java.math.BigDecimal saleAmount){
		this.saleAmount = saleAmount;
	}
	/**
	* 募集币种
	* @return String
    */
	public String getRaiseCoin(){
		return raiseCoin;
	}
	/**
	* 募集币种
	*/
	public void setRaiseCoin(String raiseCoin){
		this.raiseCoin = raiseCoin;
	}
	/**
	* 募集币种与发售币种的比率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getRatio(){
		return ratio;
	}
	/**
	* 募集币种与发售币种的比率
	*/
	public void setRatio(java.math.BigDecimal ratio){
		this.ratio = ratio;
	}
	/**
	* 募集开始时间
	* @return java.util.Date
    */
	public java.util.Date getStartTime(){
		return startTime;
	}
	/**
	* 募集开始时间
	*/
	public void setStartTime(java.util.Date startTime){
		this.startTime = startTime;
	}
	/**
	* 募集结束时间
	* @return java.util.Date
    */
	public java.util.Date getEndTime(){
		return endTime;
	}
	/**
	* 募集结束时间
	*/
	public void setEndTime(java.util.Date endTime){
		this.endTime = endTime;
	}
	/**
	* 状态
	* @return String
    */
	public String getStatus(){
		return status;
	}
	/**
	* 状态
	*/
	public void setStatus(String status){
		this.status = status;
	}
	/**
	* 认购数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getReceiveAmount(){
		return receiveAmount;
	}
	/**
	* 认购数量
	*/
	public void setReceiveAmount(java.math.BigDecimal receiveAmount){
		this.receiveAmount = receiveAmount;
	}
	/**
	* 使用数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPayAmount(){
		return payAmount;
	}
	/**
	* 使用数量
	*/
	public void setPayAmount(java.math.BigDecimal payAmount){
		this.payAmount = payAmount;
	}
	/**
	* 预计上线时间
	* @return java.util.Date
    */
	public java.util.Date getExpectTime(){
		return expectTime;
	}
	/**
	* 预计上线时间
	*/
	public void setExpectTime(java.util.Date expectTime){
		this.expectTime = expectTime;
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
	* @return String
    */
	public String getPicView(){
		return picView;
	}
	/**
	* 
	*/
	public void setPicView(String picView){
		this.picView = picView;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("userId:").append(getUserId()).append(";");
		sb.append("ieoId:").append(getIeoId()).append(";");
		sb.append("userName:").append(getUserName()).append(";");
		sb.append("userMobile:").append(getUserMobile()).append(";");
		sb.append("ieoName:").append(getIeoName()).append(";");
		sb.append("saleCoin:").append(getSaleCoin()).append(";");
		sb.append("saleAmount:").append(getSaleAmount()).append(";");
		sb.append("raiseCoin:").append(getRaiseCoin()).append(";");
		sb.append("ratio:").append(getRatio()).append(";");
		sb.append("startTime:").append(getStartTime()).append(";");
		sb.append("endTime:").append(getEndTime()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("receiveAmount:").append(getReceiveAmount()).append(";");
		sb.append("payAmount:").append(getPayAmount()).append(";");
		sb.append("expectTime:").append(getExpectTime()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("picView:").append(getPicView()).append(";");
		return sb.toString();
	}
}
