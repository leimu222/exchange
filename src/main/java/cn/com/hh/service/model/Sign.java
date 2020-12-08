package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [sign服务实现]
 */
public class Sign  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private java.math.BigDecimal amount;
	/**
     * 
     */
	private java.util.Date creationTime;
	/**
     * 
     */
	private java.util.Date endDate;
	/**
     * 
     */
	private Integer status;
	/**
     * 
     */
	private String coinName;
	
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
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getCreationTime(){
		return creationTime;
	}
	/**
	* 
	*/
	public void setCreationTime(java.util.Date creationTime){
		this.creationTime = creationTime;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getEndDate(){
		return endDate;
	}
	/**
	* 
	*/
	public void setEndDate(java.util.Date endDate){
		this.endDate = endDate;
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
	* 
	* @return String
    */
	public String getCoinName(){
		return coinName;
	}
	/**
	* 
	*/
	public void setCoinName(String coinName){
		this.coinName = coinName;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("creationTime:").append(getCreationTime()).append(";");
		sb.append("endDate:").append(getEndDate()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("coinName:").append(getCoinName()).append(";");
		return sb.toString();
	}
}
