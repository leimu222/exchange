package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [platform服务实现]
 */
public class PlatformTransaction  implements Serializable {

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
	private String bizOrderId;
	/**
     * 
     */
	private String day;
	/**
     * 
     */
	private Integer direction;
	/**
     * 
     */
	private java.util.Date time;
	/**
     * 
     */
	private Integer type;
	
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
	* @return String
    */
	public String getBizOrderId(){
		return bizOrderId;
	}
	/**
	* 
	*/
	public void setBizOrderId(String bizOrderId){
		this.bizOrderId = bizOrderId;
	}
	/**
	* 
	* @return String
    */
	public String getDay(){
		return day;
	}
	/**
	* 
	*/
	public void setDay(String day){
		this.day = day;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getDirection(){
		return direction;
	}
	/**
	* 
	*/
	public void setDirection(Integer direction){
		this.direction = direction;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getTime(){
		return time;
	}
	/**
	* 
	*/
	public void setTime(java.util.Date time){
		this.time = time;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getType(){
		return type;
	}
	/**
	* 
	*/
	public void setType(Integer type){
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("bizOrderId:").append(getBizOrderId()).append(";");
		sb.append("day:").append(getDay()).append(";");
		sb.append("direction:").append(getDirection()).append(";");
		sb.append("time:").append(getTime()).append(";");
		sb.append("type:").append(getType()).append(";");
		return sb.toString();
	}
}
