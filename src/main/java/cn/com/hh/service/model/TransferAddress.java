package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [transfer服务实现]
 */
public class TransferAddress  implements Serializable {

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
     * 最低转账数目
     */
	private java.math.BigDecimal minAmount;
	/**
     * 
     */
	private Integer status;
	/**
     * 转账手续费率
     */
	private java.math.BigDecimal transferFee;
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
	* 最低转账数目
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMinAmount(){
		return minAmount;
	}
	/**
	* 最低转账数目
	*/
	public void setMinAmount(java.math.BigDecimal minAmount){
		this.minAmount = minAmount;
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
	* 转账手续费率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTransferFee(){
		return transferFee;
	}
	/**
	* 转账手续费率
	*/
	public void setTransferFee(java.math.BigDecimal transferFee){
		this.transferFee = transferFee;
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
		sb.append("minAmount:").append(getMinAmount()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("transferFee:").append(getTransferFee()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		return sb.toString();
	}
}
