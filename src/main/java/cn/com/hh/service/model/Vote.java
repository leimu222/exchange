package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [vote服务实现]
 */
public class Vote  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 每次投票消耗的平台币数量
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
	private Integer voteLimit;
	
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
	* 每次投票消耗的平台币数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 每次投票消耗的平台币数量
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
	* @return Integer
    */
	public Integer getVoteLimit(){
		return voteLimit;
	}
	/**
	* 
	*/
	public void setVoteLimit(Integer voteLimit){
		this.voteLimit = voteLimit;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("voteLimit:").append(getVoteLimit()).append(";");
		return sb.toString();
	}
}
