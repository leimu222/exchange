package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [community服务实现]
 */
public class CommunityMember  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long memberId;
	/**
     * 用户名
     */
	private String username;
	/**
     * 地区名称
     */
	private String areaName;
	/**
     * 个人简介
     */
	private String personalIntroduction;
	/**
     * 性别 0-男 1-女 2-未知
     */
	private Boolean sex;
	/**
     * 
     */
	private String enLabels;
	/**
     * 风格id拼接
     */
	private String labelIds;
	/**
     * 标签
     */
	private String labels;
	/**
     * 0-普通用户 1-交易员
     */
	private Boolean type;
	/**
     * 0-关闭带单功能 1-开启带单功能
     */
	private Boolean status;
	/**
     * 累计收益率
     */
	private java.math.BigDecimal totalProfitRate;
	/**
     * 近3周交易胜率
     */
	private java.math.BigDecimal threeWeekWinRate;
	/**
     * 近3周最大回撤
     */
	private java.math.BigDecimal threeWeekCallbackRate;
	/**
     * 跟单利润分成比例
     */
	private java.math.BigDecimal followExtractRate;
	/**
     * 创建时间
     */
	private java.util.Date createTime;
	/**
     * 时间戳
     */
	private Long sequence;
	/**
     * 乐观锁
     */
	private Long version;
	/**
     * 实时跟单笔数
     */
	private Integer actualTimeCount;
	/**
     * 
     */
	private Integer transactionDays;
	
	// setter and getter
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
	* 用户名
	* @return String
    */
	public String getUsername(){
		return username;
	}
	/**
	* 用户名
	*/
	public void setUsername(String username){
		this.username = username;
	}
	/**
	* 地区名称
	* @return String
    */
	public String getAreaName(){
		return areaName;
	}
	/**
	* 地区名称
	*/
	public void setAreaName(String areaName){
		this.areaName = areaName;
	}
	/**
	* 个人简介
	* @return String
    */
	public String getPersonalIntroduction(){
		return personalIntroduction;
	}
	/**
	* 个人简介
	*/
	public void setPersonalIntroduction(String personalIntroduction){
		this.personalIntroduction = personalIntroduction;
	}
	/**
	* 性别 0-男 1-女 2-未知
	* @return Boolean
    */
	public Boolean getSex(){
		return sex;
	}
	/**
	* 性别 0-男 1-女 2-未知
	*/
	public void setSex(Boolean sex){
		this.sex = sex;
	}
	/**
	* 
	* @return String
    */
	public String getEnLabels(){
		return enLabels;
	}
	/**
	* 
	*/
	public void setEnLabels(String enLabels){
		this.enLabels = enLabels;
	}
	/**
	* 风格id拼接
	* @return String
    */
	public String getLabelIds(){
		return labelIds;
	}
	/**
	* 风格id拼接
	*/
	public void setLabelIds(String labelIds){
		this.labelIds = labelIds;
	}
	/**
	* 标签
	* @return String
    */
	public String getLabels(){
		return labels;
	}
	/**
	* 标签
	*/
	public void setLabels(String labels){
		this.labels = labels;
	}
	/**
	* 0-普通用户 1-交易员
	* @return Boolean
    */
	public Boolean getType(){
		return type;
	}
	/**
	* 0-普通用户 1-交易员
	*/
	public void setType(Boolean type){
		this.type = type;
	}
	/**
	* 0-关闭带单功能 1-开启带单功能
	* @return Boolean
    */
	public Boolean getStatus(){
		return status;
	}
	/**
	* 0-关闭带单功能 1-开启带单功能
	*/
	public void setStatus(Boolean status){
		this.status = status;
	}
	/**
	* 累计收益率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTotalProfitRate(){
		return totalProfitRate;
	}
	/**
	* 累计收益率
	*/
	public void setTotalProfitRate(java.math.BigDecimal totalProfitRate){
		this.totalProfitRate = totalProfitRate;
	}
	/**
	* 近3周交易胜率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getThreeWeekWinRate(){
		return threeWeekWinRate;
	}
	/**
	* 近3周交易胜率
	*/
	public void setThreeWeekWinRate(java.math.BigDecimal threeWeekWinRate){
		this.threeWeekWinRate = threeWeekWinRate;
	}
	/**
	* 近3周最大回撤
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getThreeWeekCallbackRate(){
		return threeWeekCallbackRate;
	}
	/**
	* 近3周最大回撤
	*/
	public void setThreeWeekCallbackRate(java.math.BigDecimal threeWeekCallbackRate){
		this.threeWeekCallbackRate = threeWeekCallbackRate;
	}
	/**
	* 跟单利润分成比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFollowExtractRate(){
		return followExtractRate;
	}
	/**
	* 跟单利润分成比例
	*/
	public void setFollowExtractRate(java.math.BigDecimal followExtractRate){
		this.followExtractRate = followExtractRate;
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
	* 实时跟单笔数
	* @return Integer
    */
	public Integer getActualTimeCount(){
		return actualTimeCount;
	}
	/**
	* 实时跟单笔数
	*/
	public void setActualTimeCount(Integer actualTimeCount){
		this.actualTimeCount = actualTimeCount;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getTransactionDays(){
		return transactionDays;
	}
	/**
	* 
	*/
	public void setTransactionDays(Integer transactionDays){
		this.transactionDays = transactionDays;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("username:").append(getUsername()).append(";");
		sb.append("areaName:").append(getAreaName()).append(";");
		sb.append("personalIntroduction:").append(getPersonalIntroduction()).append(";");
		sb.append("sex:").append(getSex()).append(";");
		sb.append("enLabels:").append(getEnLabels()).append(";");
		sb.append("labelIds:").append(getLabelIds()).append(";");
		sb.append("labels:").append(getLabels()).append(";");
		sb.append("type:").append(getType()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("totalProfitRate:").append(getTotalProfitRate()).append(";");
		sb.append("threeWeekWinRate:").append(getThreeWeekWinRate()).append(";");
		sb.append("threeWeekCallbackRate:").append(getThreeWeekCallbackRate()).append(";");
		sb.append("followExtractRate:").append(getFollowExtractRate()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		sb.append("actualTimeCount:").append(getActualTimeCount()).append(";");
		sb.append("transactionDays:").append(getTransactionDays()).append(";");
		return sb.toString();
	}
}
