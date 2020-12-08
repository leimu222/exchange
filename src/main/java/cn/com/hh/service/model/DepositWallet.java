package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [deposit服务实现]
 */
public class DepositWallet  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Integer id;
	/**
     * 用户id
     */
	private Long memberId;
	/**
     * 余额
     */
	private java.math.BigDecimal balance;
	/**
     * 冻结余额
     */
	private java.math.BigDecimal frozenBalance;
	/**
     * 累计转入余额
     */
	private java.math.BigDecimal totalInBalance;
	/**
     * 币种，默认USDT
     */
	private String coinId;
	/**
     * 0未锁定，1锁定
     */
	private Integer isLock;
	/**
     * 版本号
     */
	private Integer version;
	
	// setter and getter
	/**
	* 
	* @return Integer
    */
	public Integer getId(){
		return id;
	}
	/**
	* 
	*/
	public void setId(Integer id){
		this.id = id;
	}
	/**
	* 用户id
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 用户id
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 余额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBalance(){
		return balance;
	}
	/**
	* 余额
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
	* 累计转入余额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTotalInBalance(){
		return totalInBalance;
	}
	/**
	* 累计转入余额
	*/
	public void setTotalInBalance(java.math.BigDecimal totalInBalance){
		this.totalInBalance = totalInBalance;
	}
	/**
	* 币种，默认USDT
	* @return String
    */
	public String getCoinId(){
		return coinId;
	}
	/**
	* 币种，默认USDT
	*/
	public void setCoinId(String coinId){
		this.coinId = coinId;
	}
	/**
	* 0未锁定，1锁定
	* @return Integer
    */
	public Integer getIsLock(){
		return isLock;
	}
	/**
	* 0未锁定，1锁定
	*/
	public void setIsLock(Integer isLock){
		this.isLock = isLock;
	}
	/**
	* 版本号
	* @return Integer
    */
	public Integer getVersion(){
		return version;
	}
	/**
	* 版本号
	*/
	public void setVersion(Integer version){
		this.version = version;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("balance:").append(getBalance()).append(";");
		sb.append("frozenBalance:").append(getFrozenBalance()).append(";");
		sb.append("totalInBalance:").append(getTotalInBalance()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		sb.append("isLock:").append(getIsLock()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		return sb.toString();
	}
}
