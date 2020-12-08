package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [hot服务实现]
 */
public class HotWalletInfo  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Integer id;
	/**
     * 热钱包地址
     */
	private String address;
	/**
     * 热钱包私钥
     */
	private String privateKey;
	/**
     * 公链类型，1BTC,2ETH
     */
	private Integer chainType;
	
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
	* 热钱包地址
	* @return String
    */
	public String getAddress(){
		return address;
	}
	/**
	* 热钱包地址
	*/
	public void setAddress(String address){
		this.address = address;
	}
	/**
	* 热钱包私钥
	* @return String
    */
	public String getPrivateKey(){
		return privateKey;
	}
	/**
	* 热钱包私钥
	*/
	public void setPrivateKey(String privateKey){
		this.privateKey = privateKey;
	}
	/**
	* 公链类型，1BTC,2ETH
	* @return Integer
    */
	public Integer getChainType(){
		return chainType;
	}
	/**
	* 公链类型，1BTC,2ETH
	*/
	public void setChainType(Integer chainType){
		this.chainType = chainType;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("address:").append(getAddress()).append(";");
		sb.append("privateKey:").append(getPrivateKey()).append(";");
		sb.append("chainType:").append(getChainType()).append(";");
		return sb.toString();
	}
}
