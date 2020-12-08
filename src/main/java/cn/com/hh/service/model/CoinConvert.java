package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [coin服务实现]
 */
public class CoinConvert  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Integer id;
	/**
     * 基币，被转换的币
     */
	private String baseCoin;
	/**
     * 转换的币
     */
	private String convertCoin;
	/**
     * 手续费
     */
	private Double fee;
	
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
	* 基币，被转换的币
	* @return String
    */
	public String getBaseCoin(){
		return baseCoin;
	}
	/**
	* 基币，被转换的币
	*/
	public void setBaseCoin(String baseCoin){
		this.baseCoin = baseCoin;
	}
	/**
	* 转换的币
	* @return String
    */
	public String getConvertCoin(){
		return convertCoin;
	}
	/**
	* 转换的币
	*/
	public void setConvertCoin(String convertCoin){
		this.convertCoin = convertCoin;
	}
	/**
	* 手续费
	* @return Double
    */
	public Double getFee(){
		return fee;
	}
	/**
	* 手续费
	*/
	public void setFee(Double fee){
		this.fee = fee;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("baseCoin:").append(getBaseCoin()).append(";");
		sb.append("convertCoin:").append(getConvertCoin()).append(";");
		sb.append("fee:").append(getFee()).append(";");
		return sb.toString();
	}
}
