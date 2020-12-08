package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [wallet服务实现]
 */
public class WalletConfig  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Integer id;
	/**
     * 0热钱包，1冷钱包
     */
	private Integer type;
	/**
     * 币种名称，如BTC
     */
	private String coinName;
	/**
     * 钱包地址
     */
	private String address;
	/**
     * 钱包余额
     */
	private java.math.BigDecimal balance;
	/**
     * 归集比例，大于等于0，小于等于1
     */
	private java.math.BigDecimal collectRate;
	
	// setter and getter
	/**
	* 主键
	* @return Integer
    */
	public Integer getId(){
		return id;
	}
	/**
	* 主键
	*/
	public void setId(Integer id){
		this.id = id;
	}
	/**
	* 0热钱包，1冷钱包
	* @return Integer
    */
	public Integer getType(){
		return type;
	}
	/**
	* 0热钱包，1冷钱包
	*/
	public void setType(Integer type){
		this.type = type;
	}
	/**
	* 币种名称，如BTC
	* @return String
    */
	public String getCoinName(){
		return coinName;
	}
	/**
	* 币种名称，如BTC
	*/
	public void setCoinName(String coinName){
		this.coinName = coinName;
	}
	/**
	* 钱包地址
	* @return String
    */
	public String getAddress(){
		return address;
	}
	/**
	* 钱包地址
	*/
	public void setAddress(String address){
		this.address = address;
	}
	/**
	* 钱包余额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBalance(){
		return balance;
	}
	/**
	* 钱包余额
	*/
	public void setBalance(java.math.BigDecimal balance){
		this.balance = balance;
	}
	/**
	* 归集比例，大于等于0，小于等于1
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getCollectRate(){
		return collectRate;
	}
	/**
	* 归集比例，大于等于0，小于等于1
	*/
	public void setCollectRate(java.math.BigDecimal collectRate){
		this.collectRate = collectRate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("type:").append(getType()).append(";");
		sb.append("coinName:").append(getCoinName()).append(";");
		sb.append("address:").append(getAddress()).append(";");
		sb.append("balance:").append(getBalance()).append(";");
		sb.append("collectRate:").append(getCollectRate()).append(";");
		return sb.toString();
	}
}
