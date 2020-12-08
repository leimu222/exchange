package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [reward服务实现]
 */
public class RewardWallet  implements Serializable {

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
     * 
     */
	private String coinUnit;
	/**
     * 冻结余额
     */
	private java.math.BigDecimal frozenBalance;
	/**
     * 钱包不是锁定
     */
	private Integer isLock;
	/**
     * 
     */
	private Long memberId;
	/**
     * 
     */
	private Integer version;
	
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
	* 钱包不是锁定
	* @return Integer
    */
	public Integer getIsLock(){
		return isLock;
	}
	/**
	* 钱包不是锁定
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("balance:").append(getBalance()).append(";");
		sb.append("coinUnit:").append(getCoinUnit()).append(";");
		sb.append("frozenBalance:").append(getFrozenBalance()).append(";");
		sb.append("isLock:").append(getIsLock()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		return sb.toString();
	}
}
