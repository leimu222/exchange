package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [loan服务实现]
 */
public class LoanWallet  implements Serializable {

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
     * 抵押金额
     */
	private java.math.BigDecimal mortgageAmount;
	/**
     * 钱包是否锁定(0-不锁定,1-锁定)
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
	/**
     * 币种
     */
	private String coinName;
	
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
	* 抵押金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMortgageAmount(){
		return mortgageAmount;
	}
	/**
	* 抵押金额
	*/
	public void setMortgageAmount(java.math.BigDecimal mortgageAmount){
		this.mortgageAmount = mortgageAmount;
	}
	/**
	* 钱包是否锁定(0-不锁定,1-锁定)
	* @return Integer
    */
	public Integer getIsLock(){
		return isLock;
	}
	/**
	* 钱包是否锁定(0-不锁定,1-锁定)
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
	/**
	* 币种
	* @return String
    */
	public String getCoinName(){
		return coinName;
	}
	/**
	* 币种
	*/
	public void setCoinName(String coinName){
		this.coinName = coinName;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("balance:").append(getBalance()).append(";");
		sb.append("frozenBalance:").append(getFrozenBalance()).append(";");
		sb.append("mortgageAmount:").append(getMortgageAmount()).append(";");
		sb.append("isLock:").append(getIsLock()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		sb.append("coinName:").append(getCoinName()).append(";");
		return sb.toString();
	}
}
