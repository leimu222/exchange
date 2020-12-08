package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public class MemberWallet  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String address;
	/**
     * 可用余额
     */
	private java.math.BigDecimal balance;
	/**
     * 冻结余额
     */
	private java.math.BigDecimal frozenBalance;
	/**
     * 待释放余额
     */
	private java.math.BigDecimal releaseBalance;
	/**
     * 解封钱包-待解封锁仓币种数量
     */
	private java.math.BigDecimal blockBalance;
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
	* 
	* @return String
    */
	public String getAddress(){
		return address;
	}
	/**
	* 
	*/
	public void setAddress(String address){
		this.address = address;
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
	* 待释放余额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getReleaseBalance(){
		return releaseBalance;
	}
	/**
	* 待释放余额
	*/
	public void setReleaseBalance(java.math.BigDecimal releaseBalance){
		this.releaseBalance = releaseBalance;
	}
	/**
	* 解封钱包-待解封锁仓币种数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBlockBalance(){
		return blockBalance;
	}
	/**
	* 解封钱包-待解封锁仓币种数量
	*/
	public void setBlockBalance(java.math.BigDecimal blockBalance){
		this.blockBalance = blockBalance;
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
		sb.append("address:").append(getAddress()).append(";");
		sb.append("balance:").append(getBalance()).append(";");
		sb.append("frozenBalance:").append(getFrozenBalance()).append(";");
		sb.append("releaseBalance:").append(getReleaseBalance()).append(";");
		sb.append("blockBalance:").append(getBlockBalance()).append(";");
		sb.append("isLock:").append(getIsLock()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		return sb.toString();
	}
}
