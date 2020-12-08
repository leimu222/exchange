package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [risk服务实现]
 */
public class RiskRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private java.math.BigDecimal currentThreshold;
	/**
     * 
     */
	private Long memberId;
	/**
     * 
     */
	private String memberName;
	/**
     * 
     */
	private Integer performActions;
	/**
     * 
     */
	private Long leverCoinId;
	/**
     * 
     */
	private Long lossThresholdId;
	
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
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getCurrentThreshold(){
		return currentThreshold;
	}
	/**
	* 
	*/
	public void setCurrentThreshold(java.math.BigDecimal currentThreshold){
		this.currentThreshold = currentThreshold;
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
	* 
	* @return String
    */
	public String getMemberName(){
		return memberName;
	}
	/**
	* 
	*/
	public void setMemberName(String memberName){
		this.memberName = memberName;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getPerformActions(){
		return performActions;
	}
	/**
	* 
	*/
	public void setPerformActions(Integer performActions){
		this.performActions = performActions;
	}
	/**
	* 
	* @return Long
    */
	public Long getLeverCoinId(){
		return leverCoinId;
	}
	/**
	* 
	*/
	public void setLeverCoinId(Long leverCoinId){
		this.leverCoinId = leverCoinId;
	}
	/**
	* 
	* @return Long
    */
	public Long getLossThresholdId(){
		return lossThresholdId;
	}
	/**
	* 
	*/
	public void setLossThresholdId(Long lossThresholdId){
		this.lossThresholdId = lossThresholdId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("currentThreshold:").append(getCurrentThreshold()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("memberName:").append(getMemberName()).append(";");
		sb.append("performActions:").append(getPerformActions()).append(";");
		sb.append("leverCoinId:").append(getLeverCoinId()).append(";");
		sb.append("lossThresholdId:").append(getLossThresholdId()).append(";");
		return sb.toString();
	}
}
