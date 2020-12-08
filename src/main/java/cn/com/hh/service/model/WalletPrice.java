package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [wallet服务实现]
 */
public class WalletPrice  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Integer id;
	/**
     * 
     */
	private String name;
	/**
     * 
     */
	private Integer gasPrice;
	/**
     * 
     */
	private Integer gasLimit;
	
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
	* 
	* @return String
    */
	public String getName(){
		return name;
	}
	/**
	* 
	*/
	public void setName(String name){
		this.name = name;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getGasPrice(){
		return gasPrice;
	}
	/**
	* 
	*/
	public void setGasPrice(Integer gasPrice){
		this.gasPrice = gasPrice;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getGasLimit(){
		return gasLimit;
	}
	/**
	* 
	*/
	public void setGasLimit(Integer gasLimit){
		this.gasLimit = gasLimit;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("name:").append(getName()).append(";");
		sb.append("gasPrice:").append(getGasPrice()).append(";");
		sb.append("gasLimit:").append(getGasLimit()).append(";");
		return sb.toString();
	}
}
