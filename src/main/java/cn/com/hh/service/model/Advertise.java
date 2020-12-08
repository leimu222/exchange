package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [advertise服务实现]
 */
public class Advertise  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private Integer advertiseType;
	/**
     * 
     */
	private Integer auto;
	/**
     * 
     */
	private String autoword;
	/**
     * 
     */
	private String coinUnit;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 交易中数量
     */
	private java.math.BigDecimal dealAmount;
	/**
     * 
     */
	private Integer level;
	/**
     * 
     */
	private String limitMoney;
	/**
     * 最高单笔交易额
     */
	private java.math.BigDecimal maxLimit;
	/**
     * 最低单笔交易额
     */
	private java.math.BigDecimal minLimit;
	/**
     * 计划数量
     */
	private java.math.BigDecimal number;
	/**
     * 
     */
	private String payMode;
	/**
     * 溢价百分比
     */
	private java.math.BigDecimal premiseRate;
	/**
     * 交易价格
     */
	private java.math.BigDecimal price;
	/**
     * 
     */
	private Integer priceType;
	/**
     * 计划剩余数量
     */
	private java.math.BigDecimal remainAmount;
	/**
     * 
     */
	private String remark;
	/**
     * 
     */
	private Integer status;
	/**
     * 
     */
	private Integer timeLimit;
	/**
     * 
     */
	private java.util.Date updateTime;
	/**
     * 
     */
	private String username;
	/**
     * 
     */
	private Long version;
	/**
     * 
     */
	private Long coinId;
	/**
     * 
     */
	private String country;
	/**
     * 
     */
	private Long memberId;
	/**
     * 是否是平台，0不是，1是
     */
	private Integer platType;
	
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
	* 
	* @return Integer
    */
	public Integer getAdvertiseType(){
		return advertiseType;
	}
	/**
	* 
	*/
	public void setAdvertiseType(Integer advertiseType){
		this.advertiseType = advertiseType;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getAuto(){
		return auto;
	}
	/**
	* 
	*/
	public void setAuto(Integer auto){
		this.auto = auto;
	}
	/**
	* 
	* @return String
    */
	public String getAutoword(){
		return autoword;
	}
	/**
	* 
	*/
	public void setAutoword(String autoword){
		this.autoword = autoword;
	}
	/**
	* 
	* @return String
    */
	public String getCoinUnit(){
		return coinUnit;
	}
	/**
	* 
	*/
	public void setCoinUnit(String coinUnit){
		this.coinUnit = coinUnit;
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
	* 交易中数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getDealAmount(){
		return dealAmount;
	}
	/**
	* 交易中数量
	*/
	public void setDealAmount(java.math.BigDecimal dealAmount){
		this.dealAmount = dealAmount;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getLevel(){
		return level;
	}
	/**
	* 
	*/
	public void setLevel(Integer level){
		this.level = level;
	}
	/**
	* 
	* @return String
    */
	public String getLimitMoney(){
		return limitMoney;
	}
	/**
	* 
	*/
	public void setLimitMoney(String limitMoney){
		this.limitMoney = limitMoney;
	}
	/**
	* 最高单笔交易额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMaxLimit(){
		return maxLimit;
	}
	/**
	* 最高单笔交易额
	*/
	public void setMaxLimit(java.math.BigDecimal maxLimit){
		this.maxLimit = maxLimit;
	}
	/**
	* 最低单笔交易额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMinLimit(){
		return minLimit;
	}
	/**
	* 最低单笔交易额
	*/
	public void setMinLimit(java.math.BigDecimal minLimit){
		this.minLimit = minLimit;
	}
	/**
	* 计划数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getNumber(){
		return number;
	}
	/**
	* 计划数量
	*/
	public void setNumber(java.math.BigDecimal number){
		this.number = number;
	}
	/**
	* 
	* @return String
    */
	public String getPayMode(){
		return payMode;
	}
	/**
	* 
	*/
	public void setPayMode(String payMode){
		this.payMode = payMode;
	}
	/**
	* 溢价百分比
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPremiseRate(){
		return premiseRate;
	}
	/**
	* 溢价百分比
	*/
	public void setPremiseRate(java.math.BigDecimal premiseRate){
		this.premiseRate = premiseRate;
	}
	/**
	* 交易价格
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPrice(){
		return price;
	}
	/**
	* 交易价格
	*/
	public void setPrice(java.math.BigDecimal price){
		this.price = price;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getPriceType(){
		return priceType;
	}
	/**
	* 
	*/
	public void setPriceType(Integer priceType){
		this.priceType = priceType;
	}
	/**
	* 计划剩余数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getRemainAmount(){
		return remainAmount;
	}
	/**
	* 计划剩余数量
	*/
	public void setRemainAmount(java.math.BigDecimal remainAmount){
		this.remainAmount = remainAmount;
	}
	/**
	* 
	* @return String
    */
	public String getRemark(){
		return remark;
	}
	/**
	* 
	*/
	public void setRemark(String remark){
		this.remark = remark;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getStatus(){
		return status;
	}
	/**
	* 
	*/
	public void setStatus(Integer status){
		this.status = status;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getTimeLimit(){
		return timeLimit;
	}
	/**
	* 
	*/
	public void setTimeLimit(Integer timeLimit){
		this.timeLimit = timeLimit;
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
	public String getUsername(){
		return username;
	}
	/**
	* 
	*/
	public void setUsername(String username){
		this.username = username;
	}
	/**
	* 
	* @return Long
    */
	public Long getVersion(){
		return version;
	}
	/**
	* 
	*/
	public void setVersion(Long version){
		this.version = version;
	}
	/**
	* 
	* @return Long
    */
	public Long getCoinId(){
		return coinId;
	}
	/**
	* 
	*/
	public void setCoinId(Long coinId){
		this.coinId = coinId;
	}
	/**
	* 
	* @return String
    */
	public String getCountry(){
		return country;
	}
	/**
	* 
	*/
	public void setCountry(String country){
		this.country = country;
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
	* 是否是平台，0不是，1是
	* @return Integer
    */
	public Integer getPlatType(){
		return platType;
	}
	/**
	* 是否是平台，0不是，1是
	*/
	public void setPlatType(Integer platType){
		this.platType = platType;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("advertiseType:").append(getAdvertiseType()).append(";");
		sb.append("auto:").append(getAuto()).append(";");
		sb.append("autoword:").append(getAutoword()).append(";");
		sb.append("coinUnit:").append(getCoinUnit()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("dealAmount:").append(getDealAmount()).append(";");
		sb.append("level:").append(getLevel()).append(";");
		sb.append("limitMoney:").append(getLimitMoney()).append(";");
		sb.append("maxLimit:").append(getMaxLimit()).append(";");
		sb.append("minLimit:").append(getMinLimit()).append(";");
		sb.append("number:").append(getNumber()).append(";");
		sb.append("payMode:").append(getPayMode()).append(";");
		sb.append("premiseRate:").append(getPremiseRate()).append(";");
		sb.append("price:").append(getPrice()).append(";");
		sb.append("priceType:").append(getPriceType()).append(";");
		sb.append("remainAmount:").append(getRemainAmount()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("timeLimit:").append(getTimeLimit()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		sb.append("username:").append(getUsername()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		sb.append("country:").append(getCountry()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("platType:").append(getPlatType()).append(";");
		return sb.toString();
	}
}
