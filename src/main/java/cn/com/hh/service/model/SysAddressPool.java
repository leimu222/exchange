package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [sys服务实现]
 */
public class SysAddressPool  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 钱包地址
     */
	private String address;
	/**
     * 1BTC，2ETH
     */
	private Integer type;
	/**
     * 0未使用，1已使用
     */
	private Boolean status;
	
	// setter and getter
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
	* 1BTC，2ETH
	* @return Integer
    */
	public Integer getType(){
		return type;
	}
	/**
	* 1BTC，2ETH
	*/
	public void setType(Integer type){
		this.type = type;
	}
	/**
	* 0未使用，1已使用
	* @return Boolean
    */
	public Boolean getStatus(){
		return status;
	}
	/**
	* 0未使用，1已使用
	*/
	public void setStatus(Boolean status){
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("address:").append(getAddress()).append(";");
		sb.append("type:").append(getType()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		return sb.toString();
	}
}
