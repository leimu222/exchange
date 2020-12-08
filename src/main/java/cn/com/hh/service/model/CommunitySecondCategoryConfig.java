package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [community服务实现]
 */
public class CommunitySecondCategoryConfig  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private String id;
	/**
     * 
     */
	private String enName;
	/**
     * 
     */
	private String name;
	/**
     * 
     */
	private String topId;
	/**
     * 最小值
     */
	private java.math.BigDecimal min;
	/**
     * 最大值
     */
	private java.math.BigDecimal max;
	/**
     * 
     */
	private Integer orderId;
	
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
	* @return String
    */
	public String getEnName(){
		return enName;
	}
	/**
	* 
	*/
	public void setEnName(String enName){
		this.enName = enName;
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
	* @return String
    */
	public String getTopId(){
		return topId;
	}
	/**
	* 
	*/
	public void setTopId(String topId){
		this.topId = topId;
	}
	/**
	* 最小值
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMin(){
		return min;
	}
	/**
	* 最小值
	*/
	public void setMin(java.math.BigDecimal min){
		this.min = min;
	}
	/**
	* 最大值
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMax(){
		return max;
	}
	/**
	* 最大值
	*/
	public void setMax(java.math.BigDecimal max){
		this.max = max;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getOrderId(){
		return orderId;
	}
	/**
	* 
	*/
	public void setOrderId(Integer orderId){
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("enName:").append(getEnName()).append(";");
		sb.append("name:").append(getName()).append(";");
		sb.append("topId:").append(getTopId()).append(";");
		sb.append("min:").append(getMin()).append(";");
		sb.append("max:").append(getMax()).append(";");
		sb.append("orderId:").append(getOrderId()).append(";");
		return sb.toString();
	}
}
