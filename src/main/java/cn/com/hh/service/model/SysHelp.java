package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [sys服务实现]
 */
public class SysHelp  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String author;
	/**
     * 
     */
	private String content;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private String imgUrl;
	/**
     * 
     */
	private Integer sort;
	/**
     * 
     */
	private Integer status;
	/**
     * 
     */
	private Integer sysHelpClassification;
	/**
     * 
     */
	private String title;
	/**
     * 是否置顶默认非置顶
     */
	private String isTop;
	
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
	public String getAuthor(){
		return author;
	}
	/**
	* 
	*/
	public void setAuthor(String author){
		this.author = author;
	}
	/**
	* 
	* @return String
    */
	public String getContent(){
		return content;
	}
	/**
	* 
	*/
	public void setContent(String content){
		this.content = content;
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
	public Integer getSysHelpClassification(){
		return sysHelpClassification;
	}
	/**
	* 
	*/
	public void setSysHelpClassification(Integer sysHelpClassification){
		this.sysHelpClassification = sysHelpClassification;
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
	* 是否置顶默认非置顶
	* @return String
    */
	public String getIsTop(){
		return isTop;
	}
	/**
	* 是否置顶默认非置顶
	*/
	public void setIsTop(String isTop){
		this.isTop = isTop;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("author:").append(getAuthor()).append(";");
		sb.append("content:").append(getContent()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("imgUrl:").append(getImgUrl()).append(";");
		sb.append("sort:").append(getSort()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("sysHelpClassification:").append(getSysHelpClassification()).append(";");
		sb.append("title:").append(getTitle()).append(";");
		sb.append("isTop:").append(getIsTop()).append(";");
		return sb.toString();
	}
}
