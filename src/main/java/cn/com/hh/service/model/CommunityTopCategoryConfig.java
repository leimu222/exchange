package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [community服务实现]
 */
public class CommunityTopCategoryConfig  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Integer selectMore;
	/**
     * 
     */
	private String id;
	/**
     * 
     */
	private String name;
	/**
     * 
     */
	private String enName;
	/**
     * 
     */
	private Integer orderId;
	
	// setter and getter
	/**
	* 
	* @return Integer
    */
	public Integer getSelectMore(){
		return selectMore;
	}
	/**
	* 
	*/
	public void setSelectMore(Integer selectMore){
		this.selectMore = selectMore;
	}
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
		sb.append("selectMore:").append(getSelectMore()).append(";");
		sb.append("id:").append(getId()).append(";");
		sb.append("name:").append(getName()).append(";");
		sb.append("enName:").append(getEnName()).append(";");
		sb.append("orderId:").append(getOrderId()).append(";");
		return sb.toString();
	}
}
