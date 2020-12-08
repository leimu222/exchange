package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [lever服务实现]
 */
public class LeverWallet  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 可用余额
     */
	private java.math.BigDecimal balance;
	/**
     * 冻结余额
     */
	private java.math.BigDecimal frozenBalance;
	/**
     * 钱包是否锁定
     */
	private Integer isLock;
	/**
     * 
     */
	private Long memberId;
	/**
     * 
     */
	private String memberName;
	/**
     * 是否处于爆仓状态
     */
	private Integer status;
	/**
     * 
     */
	private Integer version;
	/**
     * 
     */
	private String coinId;
	/**
     * 
     */
	private Long leverCoinId;
	/**
     * 
     */
	private String email;
	/**
     * 
     */
	private String mobilePhone;
	
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
	* 可用余额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBalance(){
		return balance;
	}
	/**
	* 可用余额
	*/
	public void setBalance(java.math.BigDecimal balance){
		this.balance = balance;
	}
	/**
	* 冻结余额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFrozenBalance(){
		return frozenBalance;
	}
	/**
	* 冻结余额
	*/
	public void setFrozenBalance(java.math.BigDecimal frozenBalance){
		this.frozenBalance = frozenBalance;
	}
	/**
	* 钱包是否锁定
	* @return Integer
    */
	public Integer getIsLock(){
		return isLock;
	}
	/**
	* 钱包是否锁定
	*/
	public void setIsLock(Integer isLock){
		this.isLock = isLock;
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
	* 是否处于爆仓状态
	* @return Integer
    */
	public Integer getStatus(){
		return status;
	}
	/**
	* 是否处于爆仓状态
	*/
	public void setStatus(Integer status){
		this.status = status;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getVersion(){
		return version;
	}
	/**
	* 
	*/
	public void setVersion(Integer version){
		this.version = version;
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
	* @return String
    */
	public String getEmail(){
		return email;
	}
	/**
	* 
	*/
	public void setEmail(String email){
		this.email = email;
	}
	/**
	* 
	* @return String
    */
	public String getMobilePhone(){
		return mobilePhone;
	}
	/**
	* 
	*/
	public void setMobilePhone(String mobilePhone){
		this.mobilePhone = mobilePhone;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("balance:").append(getBalance()).append(";");
		sb.append("frozenBalance:").append(getFrozenBalance()).append(";");
		sb.append("isLock:").append(getIsLock()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("memberName:").append(getMemberName()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		sb.append("leverCoinId:").append(getLeverCoinId()).append(";");
		sb.append("email:").append(getEmail()).append(";");
		sb.append("mobilePhone:").append(getMobilePhone()).append(";");
		return sb.toString();
	}
}
