package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [deposit服务实现]
 */
public class DepositRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private String id;
	/**
     * 
     */
	private java.math.BigDecimal amount;
	/**
     * 
     */
	private Integer status;
	/**
     * 
     */
	private String coinId;
	/**
     * 
     */
	private Long memberId;
	
	// setter and getter
	/**
	* 
	* @return String
    */
	public String getId(){
		return id;
	}
	/**
	* 
	*/
	public void setId(String id){
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
	public String getCoinId(){
		return coinId;
	}
	/**
	* 
	*/
	public void setCoinId(String coinId){
		this.coinId = coinId;
	}
	/**
	* 
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		return sb.toString();
	}
}
