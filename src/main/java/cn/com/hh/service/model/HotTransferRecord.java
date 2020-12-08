package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [hot服务实现]
 */
public class HotTransferRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private Long adminId;
	/**
     * 转账金额
     */
	private java.math.BigDecimal amount;
	/**
     * 热钱包余额
     */
	private java.math.BigDecimal balance;
	/**
     * 
     */
	private String coldAddress;
	/**
     * 矿工费
     */
	private java.math.BigDecimal minerFee;
	/**
     * 
     */
	private String transactionNumber;
	/**
     * 
     */
	private java.util.Date transferTime;
	/**
     * 
     */
	private String unit;
	
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
	* @return Long
    */
	public Long getAdminId(){
		return adminId;
	}
	/**
	* 
	*/
	public void setAdminId(Long adminId){
		this.adminId = adminId;
	}
	/**
	* 转账金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 转账金额
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 热钱包余额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBalance(){
		return balance;
	}
	/**
	* 热钱包余额
	*/
	public void setBalance(java.math.BigDecimal balance){
		this.balance = balance;
	}
	/**
	* 
	* @return String
    */
	public String getColdAddress(){
		return coldAddress;
	}
	/**
	* 
	*/
	public void setColdAddress(String coldAddress){
		this.coldAddress = coldAddress;
	}
	/**
	* 矿工费
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMinerFee(){
		return minerFee;
	}
	/**
	* 矿工费
	*/
	public void setMinerFee(java.math.BigDecimal minerFee){
		this.minerFee = minerFee;
	}
	/**
	* 
	* @return String
    */
	public String getTransactionNumber(){
		return transactionNumber;
	}
	/**
	* 
	*/
	public void setTransactionNumber(String transactionNumber){
		this.transactionNumber = transactionNumber;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getTransferTime(){
		return transferTime;
	}
	/**
	* 
	*/
	public void setTransferTime(java.util.Date transferTime){
		this.transferTime = transferTime;
	}
	/**
	* 
	* @return String
    */
	public String getUnit(){
		return unit;
	}
	/**
	* 
	*/
	public void setUnit(String unit){
		this.unit = unit;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("adminId:").append(getAdminId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("balance:").append(getBalance()).append(";");
		sb.append("coldAddress:").append(getColdAddress()).append(";");
		sb.append("minerFee:").append(getMinerFee()).append(";");
		sb.append("transactionNumber:").append(getTransactionNumber()).append(";");
		sb.append("transferTime:").append(getTransferTime()).append(";");
		sb.append("unit:").append(getUnit()).append(";");
		return sb.toString();
	}
}
