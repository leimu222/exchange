package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [news服务实现]
 */
public class News  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
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
	private Boolean isShow;
	/**
     * 
     */
	private Integer sort;
	/**
     * 
     */
	private String title;
	/**
     * 
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
	* @return Boolean
    */
	public Boolean getIsShow(){
		return isShow;
	}
	/**
	* 
	*/
	public void setIsShow(Boolean isShow){
		this.isShow = isShow;
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
	public String getIsTop(){
		return isTop;
	}
	/**
	* 
	*/
	public void setIsTop(String isTop){
		this.isTop = isTop;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("content:").append(getContent()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("imgUrl:").append(getImgUrl()).append(";");
		sb.append("isShow:").append(getIsShow()).append(";");
		sb.append("sort:").append(getSort()).append(";");
		sb.append("title:").append(getTitle()).append(";");
		sb.append("isTop:").append(getIsTop()).append(";");
		return sb.toString();
	}
}
