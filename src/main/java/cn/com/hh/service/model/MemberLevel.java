package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public class MemberLevel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private Boolean isDefault;
	/**
     * 
     */
	private String name;
	/**
     * 
     */
	private String remark;
	
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
	* @return Boolean
    */
	public Boolean getIsDefault(){
		return isDefault;
	}
	/**
	* 
	*/
	public void setIsDefault(Boolean isDefault){
		this.isDefault = isDefault;
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
	public String getRemark(){
		return remark;
	}
	/**
	* 
	*/
	public void setRemark(String remark){
		this.remark = remark;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("isDefault:").append(getIsDefault()).append(";");
		sb.append("name:").append(getName()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		return sb.toString();
	}
}
