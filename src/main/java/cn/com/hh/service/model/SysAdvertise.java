package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [sys服务实现]
 */
public class SysAdvertise  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private String serialNumber;
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
	private String endTime;
	/**
     * 
     */
	private String linkUrl;
	/**
     * 
     */
	private String name;
	/**
     * 
     */
	private String remark;
	/**
     * 
     */
	private Integer sort;
	/**
     * 
     */
	private String startTime;
	/**
     * 
     */
	private Integer status;
	/**
     * 0-app首页轮播，1-pc首页轮播，2-pc分类广告，3-pc首页背景，4-pc兑币页背景，5-pc法币页背景，6-pc帮助页背景，7-pc公告页背景
     */
	private Integer sysAdvertiseLocation;
	/**
     * 
     */
	private String url;
	
	// setter and getter
	/**
	* 
	* @return String
    */
	public String getSerialNumber(){
		return serialNumber;
	}
	/**
	* 
	*/
	public void setSerialNumber(String serialNumber){
		this.serialNumber = serialNumber;
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
	public String getEndTime(){
		return endTime;
	}
	/**
	* 
	*/
	public void setEndTime(String endTime){
		this.endTime = endTime;
	}
	/**
	* 
	* @return String
    */
	public String getLinkUrl(){
		return linkUrl;
	}
	/**
	* 
	*/
	public void setLinkUrl(String linkUrl){
		this.linkUrl = linkUrl;
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
	public String getStartTime(){
		return startTime;
	}
	/**
	* 
	*/
	public void setStartTime(String startTime){
		this.startTime = startTime;
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
	* 0-app首页轮播，1-pc首页轮播，2-pc分类广告，3-pc首页背景，4-pc兑币页背景，5-pc法币页背景，6-pc帮助页背景，7-pc公告页背景
	* @return Integer
    */
	public Integer getSysAdvertiseLocation(){
		return sysAdvertiseLocation;
	}
	/**
	* 0-app首页轮播，1-pc首页轮播，2-pc分类广告，3-pc首页背景，4-pc兑币页背景，5-pc法币页背景，6-pc帮助页背景，7-pc公告页背景
	*/
	public void setSysAdvertiseLocation(Integer sysAdvertiseLocation){
		this.sysAdvertiseLocation = sysAdvertiseLocation;
	}
	/**
	* 
	* @return String
    */
	public String getUrl(){
		return url;
	}
	/**
	* 
	*/
	public void setUrl(String url){
		this.url = url;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("serialNumber:").append(getSerialNumber()).append(";");
		sb.append("author:").append(getAuthor()).append(";");
		sb.append("content:").append(getContent()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("endTime:").append(getEndTime()).append(";");
		sb.append("linkUrl:").append(getLinkUrl()).append(";");
		sb.append("name:").append(getName()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("sort:").append(getSort()).append(";");
		sb.append("startTime:").append(getStartTime()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("sysAdvertiseLocation:").append(getSysAdvertiseLocation()).append(";");
		sb.append("url:").append(getUrl()).append(";");
		return sb.toString();
	}
}
