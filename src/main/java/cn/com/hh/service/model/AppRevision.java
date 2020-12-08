package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [app服务实现]
 */
public class AppRevision  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String downloadUrl;
	/**
     * 0安卓，1IOS
     */
	private Integer platform;
	/**
     * 
     */
	private java.util.Date publishTime;
	/**
     * 
     */
	private String remark;
	/**
     * 
     */
	private String version;
	
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
	public String getDownloadUrl(){
		return downloadUrl;
	}
	/**
	* 
	*/
	public void setDownloadUrl(String downloadUrl){
		this.downloadUrl = downloadUrl;
	}
	/**
	* 0安卓，1IOS
	* @return Integer
    */
	public Integer getPlatform(){
		return platform;
	}
	/**
	* 0安卓，1IOS
	*/
	public void setPlatform(Integer platform){
		this.platform = platform;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getPublishTime(){
		return publishTime;
	}
	/**
	* 
	*/
	public void setPublishTime(java.util.Date publishTime){
		this.publishTime = publishTime;
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
	* @return String
    */
	public String getVersion(){
		return version;
	}
	/**
	* 
	*/
	public void setVersion(String version){
		this.version = version;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("downloadUrl:").append(getDownloadUrl()).append(";");
		sb.append("platform:").append(getPlatform()).append(";");
		sb.append("publishTime:").append(getPublishTime()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		return sb.toString();
	}
}
