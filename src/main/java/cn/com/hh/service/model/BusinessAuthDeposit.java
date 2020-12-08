package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [business服务实现]
 */
public class BusinessAuthDeposit  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 保证金数额
     */
	private java.math.BigDecimal amount;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private Integer status;
	/**
     * 
     */
	private Long adminId;
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
	* 保证金数额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 保证金数额
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getCreateTime(){
		return createTime;
	}
	/**
	* 
	*/
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
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
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("adminId:").append(getAdminId()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		return sb.toString();
	}
}
