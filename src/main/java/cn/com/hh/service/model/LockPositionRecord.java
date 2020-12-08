package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [lock服务实现]
 */
public class LockPositionRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 锁仓金额
     */
	private java.math.BigDecimal amount;
	/**
     * 
     */
	private java.util.Date createTime;
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
	private String reason;
	/**
     * 
     */
	private Integer status;
	/**
     * 
     */
	private java.util.Date unlockTime;
	/**
     * 
     */
	private Long walletId;
	/**
     * 
     */
	private String coinId;
	
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
	* 锁仓金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 锁仓金额
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
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
	* @return String
    */
	public String getReason(){
		return reason;
	}
	/**
	* 
	*/
	public void setReason(String reason){
		this.reason = reason;
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
	* @return java.util.Date
    */
	public java.util.Date getUnlockTime(){
		return unlockTime;
	}
	/**
	* 
	*/
	public void setUnlockTime(java.util.Date unlockTime){
		this.unlockTime = unlockTime;
	}
	/**
	* 
	* @return Long
    */
	public Long getWalletId(){
		return walletId;
	}
	/**
	* 
	*/
	public void setWalletId(Long walletId){
		this.walletId = walletId;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("memberName:").append(getMemberName()).append(";");
		sb.append("reason:").append(getReason()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("unlockTime:").append(getUnlockTime()).append(";");
		sb.append("walletId:").append(getWalletId()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		return sb.toString();
	}
}
