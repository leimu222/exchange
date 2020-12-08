package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public class MemberWalletHistory  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private Integer memberId;
	/**
     * 
     */
	private String coinId;
	/**
     * 
     */
	private java.math.BigDecimal beforeBalance;
	/**
     * 
     */
	private java.math.BigDecimal afterBalance;
	/**
     * 
     */
	private java.math.BigDecimal beforeFrozenBalance;
	/**
     * 
     */
	private java.math.BigDecimal afterFrozenBalance;
	/**
     * 
     */
	private java.util.Date opTime;
	
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
	public Integer getMemberId(){
		return memberId;
	}
	/**
	* 
	*/
	public void setMemberId(Integer memberId){
		this.memberId = memberId;
	}
	/**
	* 
	* @return String
    */
	public String getCoinId(){
		return coinId;
	}
	/**
	* 
	*/
	public void setCoinId(String coinId){
		this.coinId = coinId;
	}
	/**
	* 
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBeforeBalance(){
		return beforeBalance;
	}
	/**
	* 
	*/
	public void setBeforeBalance(java.math.BigDecimal beforeBalance){
		this.beforeBalance = beforeBalance;
	}
	/**
	* 
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAfterBalance(){
		return afterBalance;
	}
	/**
	* 
	*/
	public void setAfterBalance(java.math.BigDecimal afterBalance){
		this.afterBalance = afterBalance;
	}
	/**
	* 
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBeforeFrozenBalance(){
		return beforeFrozenBalance;
	}
	/**
	* 
	*/
	public void setBeforeFrozenBalance(java.math.BigDecimal beforeFrozenBalance){
		this.beforeFrozenBalance = beforeFrozenBalance;
	}
	/**
	* 
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAfterFrozenBalance(){
		return afterFrozenBalance;
	}
	/**
	* 
	*/
	public void setAfterFrozenBalance(java.math.BigDecimal afterFrozenBalance){
		this.afterFrozenBalance = afterFrozenBalance;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getOpTime(){
		return opTime;
	}
	/**
	* 
	*/
	public void setOpTime(java.util.Date opTime){
		this.opTime = opTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		sb.append("beforeBalance:").append(getBeforeBalance()).append(";");
		sb.append("afterBalance:").append(getAfterBalance()).append(";");
		sb.append("beforeFrozenBalance:").append(getBeforeFrozenBalance()).append(";");
		sb.append("afterFrozenBalance:").append(getAfterFrozenBalance()).append(";");
		sb.append("opTime:").append(getOpTime()).append(";");
		return sb.toString();
	}
}
