package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [loss服务实现]
 */
public class LossThreshold  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private Integer performActions;
	/**
     * 
     */
	private Integer status;
	/**
     * 
     */
	private java.math.BigDecimal threshold;
	/**
     * 
     */
	private java.util.Date updateTime;
	/**
     * 
     */
	private Long coinId;
	
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
	public Integer getPerformActions(){
		return performActions;
	}
	/**
	* 
	*/
	public void setPerformActions(Integer performActions){
		this.performActions = performActions;
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
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getThreshold(){
		return threshold;
	}
	/**
	* 
	*/
	public void setThreshold(java.math.BigDecimal threshold){
		this.threshold = threshold;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getUpdateTime(){
		return updateTime;
	}
	/**
	* 
	*/
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}
	/**
	* 
	* @return Long
    */
	public Long getCoinId(){
		return coinId;
	}
	/**
	* 
	*/
	public void setCoinId(Long coinId){
		this.coinId = coinId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("performActions:").append(getPerformActions()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("threshold:").append(getThreshold()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		return sb.toString();
	}
}
