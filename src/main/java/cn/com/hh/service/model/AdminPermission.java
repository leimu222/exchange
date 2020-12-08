package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:00
  * Description: [admin服务实现]
 */
public class AdminPermission  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String title;
	/**
     * 
     */
	private String name;
	/**
     * 
     */
	private Long parentId;
	/**
     * 
     */
	private Integer sort;
	/**
     * 
     */
	private String description;
	
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
	public String getTitle(){
		return title;
	}
	/**
	* 
	*/
	public void setTitle(String title){
		this.title = title;
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
	* @return Long
    */
	public Long getParentId(){
		return parentId;
	}
	/**
	* 
	*/
	public void setParentId(Long parentId){
		this.parentId = parentId;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getSort(){
		return sort;
	}
	/**
	* 
	*/
	public void setSort(Integer sort){
		this.sort = sort;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("title:").append(getTitle()).append(";");
		sb.append("name:").append(getName()).append(";");
		sb.append("parentId:").append(getParentId()).append(";");
		sb.append("sort:").append(getSort()).append(";");
		sb.append("description:").append(getDescription()).append(";");
		return sb.toString();
	}
}
