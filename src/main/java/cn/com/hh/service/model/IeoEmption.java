package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [ieo服务实现]
 */
public class IeoEmption  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键ID自增
     */
	private Long id;
	/**
     * 项目名称
     */
	private String ieoName;
	/**
     * 项目缩略图
     */
	private String picView;
	/**
     * 项目图片
     */
	private String pic;
	/**
     * 发售币种
     */
	private String saleCoin;
	/**
     * 发售总量
     */
	private java.math.BigDecimal saleAmount;
	/**
     * 剩余量
     */
	private java.math.BigDecimal surplusAmount;
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
     * 手续费
     */
	private java.math.BigDecimal fee;
	/**
     * 预计上线时间
     */
	private java.util.Date expectTime;
	/**
     * 抢购成功几率
     */
	private java.math.BigDecimal successRatio;
	/**
     * 每人抢购限额
     */
	private java.math.BigDecimal limitAmount;
	/**
     * 允许抢购条件持有数量
     */
	private java.math.BigDecimal haveAmount;
	/**
     * 持有币种
     */
	private String haveCoin;
	/**
     * 售卖方式
     */
	private String sellMode;
	/**
     * 项目详情
     */
	private String sellDetail;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private String createUser;
	/**
     * 
     */
	private java.util.Date updateTime;
	/**
     * 
     */
	private String updateUser;
	
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
	* 项目缩略图
	* @return String
    */
	public String getPicView(){
		return picView;
	}
	/**
	* 项目缩略图
	*/
	public void setPicView(String picView){
		this.picView = picView;
	}
	/**
	* 项目图片
	* @return String
    */
	public String getPic(){
		return pic;
	}
	/**
	* 项目图片
	*/
	public void setPic(String pic){
		this.pic = pic;
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
	* 剩余量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getSurplusAmount(){
		return surplusAmount;
	}
	/**
	* 剩余量
	*/
	public void setSurplusAmount(java.math.BigDecimal surplusAmount){
		this.surplusAmount = surplusAmount;
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
	* 手续费
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFee(){
		return fee;
	}
	/**
	* 手续费
	*/
	public void setFee(java.math.BigDecimal fee){
		this.fee = fee;
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
	* 抢购成功几率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getSuccessRatio(){
		return successRatio;
	}
	/**
	* 抢购成功几率
	*/
	public void setSuccessRatio(java.math.BigDecimal successRatio){
		this.successRatio = successRatio;
	}
	/**
	* 每人抢购限额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getLimitAmount(){
		return limitAmount;
	}
	/**
	* 每人抢购限额
	*/
	public void setLimitAmount(java.math.BigDecimal limitAmount){
		this.limitAmount = limitAmount;
	}
	/**
	* 允许抢购条件持有数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getHaveAmount(){
		return haveAmount;
	}
	/**
	* 允许抢购条件持有数量
	*/
	public void setHaveAmount(java.math.BigDecimal haveAmount){
		this.haveAmount = haveAmount;
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
	* 售卖方式
	* @return String
    */
	public String getSellMode(){
		return sellMode;
	}
	/**
	* 售卖方式
	*/
	public void setSellMode(String sellMode){
		this.sellMode = sellMode;
	}
	/**
	* 项目详情
	* @return String
    */
	public String getSellDetail(){
		return sellDetail;
	}
	/**
	* 项目详情
	*/
	public void setSellDetail(String sellDetail){
		this.sellDetail = sellDetail;
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
	public String getCreateUser(){
		return createUser;
	}
	/**
	* 
	*/
	public void setCreateUser(String createUser){
		this.createUser = createUser;
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
	/**
	* 
	* @return String
    */
	public String getUpdateUser(){
		return updateUser;
	}
	/**
	* 
	*/
	public void setUpdateUser(String updateUser){
		this.updateUser = updateUser;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("ieoName:").append(getIeoName()).append(";");
		sb.append("picView:").append(getPicView()).append(";");
		sb.append("pic:").append(getPic()).append(";");
		sb.append("saleCoin:").append(getSaleCoin()).append(";");
		sb.append("saleAmount:").append(getSaleAmount()).append(";");
		sb.append("surplusAmount:").append(getSurplusAmount()).append(";");
		sb.append("raiseCoin:").append(getRaiseCoin()).append(";");
		sb.append("ratio:").append(getRatio()).append(";");
		sb.append("startTime:").append(getStartTime()).append(";");
		sb.append("endTime:").append(getEndTime()).append(";");
		sb.append("fee:").append(getFee()).append(";");
		sb.append("expectTime:").append(getExpectTime()).append(";");
		sb.append("successRatio:").append(getSuccessRatio()).append(";");
		sb.append("limitAmount:").append(getLimitAmount()).append(";");
		sb.append("haveAmount:").append(getHaveAmount()).append(";");
		sb.append("haveCoin:").append(getHaveCoin()).append(";");
		sb.append("sellMode:").append(getSellMode()).append(";");
		sb.append("sellDetail:").append(getSellDetail()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("createUser:").append(getCreateUser()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		sb.append("updateUser:").append(getUpdateUser()).append(";");
		return sb.toString();
	}
}
