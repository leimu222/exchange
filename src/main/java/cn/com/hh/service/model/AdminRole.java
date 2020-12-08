package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:00
  * Description: [admin服务实现]
 */
public class AdminRole  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String description;
	/**
     * 
     */
	private String role;
	
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
	* @return String
    */
	public String getDescription(){
		return description;
	}
	/**
	* 
	*/
	public void setDescription(String description){
		this.description = description;
	}
	/**
	* 
	* @return String
    */
	public String getRole(){
		return role;
	}
	/**
	* 
	*/
	public void setRole(String role){
		this.role = role;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("description:").append(getDescription()).append(";");
		sb.append("role:").append(getRole()).append(";");
		return sb.toString();
	}
}
