package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [exchange服务实现]
 */
public class ExchangeRate  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 1(eth)=n(usdt)
     */
	private java.math.BigDecimal ethUsdt;
	/**
     * 更新时间
     */
	private java.util.Date updateTime;
	
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
	* 1(eth)=n(usdt)
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getEthUsdt(){
		return ethUsdt;
	}
	/**
	* 1(eth)=n(usdt)
	*/
	public void setEthUsdt(java.math.BigDecimal ethUsdt){
		this.ethUsdt = ethUsdt;
	}
	/**
	* 更新时间
	* @return java.util.Date
    */
	public java.util.Date getUpdateTime(){
		return updateTime;
	}
	/**
	* 更新时间
	*/
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("ethUsdt:").append(getEthUsdt()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		return sb.toString();
	}
}
