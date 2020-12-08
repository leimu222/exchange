package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [data服务实现]
 */
public class DataDictionary  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String bond;
	/**
     * 
     */
	private String comment;
	/**
     * 
     */
	private java.util.Date creationTime;
	/**
     * 
     */
	private String imgUrl;
	/**
     * 
     */
	private java.util.Date updateTime;
	/**
     * 
     */
	private String value;
	
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
	public String getBond(){
		return bond;
	}
	/**
	* 
	*/
	public void setBond(String bond){
		this.bond = bond;
	}
	/**
	* 
	* @return String
    */
	public String getComment(){
		return comment;
	}
	/**
	* 
	*/
	public void setComment(String comment){
		this.comment = comment;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getCreationTime(){
		return creationTime;
	}
	/**
	* 
	*/
	public void setCreationTime(java.util.Date creationTime){
		this.creationTime = creationTime;
	}
	/**
	* 
	* @return String
    */
	public String getImgUrl(){
		return imgUrl;
	}
	/**
	* 
	*/
	public void setImgUrl(String imgUrl){
		this.imgUrl = imgUrl;
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
	* @return String
    */
	public String getValue(){
		return value;
	}
	/**
	* 
	*/
	public void setValue(String value){
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("bond:").append(getBond()).append(";");
		sb.append("comment:").append(getComment()).append(";");
		sb.append("creationTime:").append(getCreationTime()).append(";");
		sb.append("imgUrl:").append(getImgUrl()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		sb.append("value:").append(getValue()).append(";");
		return sb.toString();
	}
}
