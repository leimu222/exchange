package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [airdrop服务实现]
 */
public class Airdrop  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private Integer errorIndex;
	/**
     * 
     */
	private String errorMsg;
	/**
     * 
     */
	private String fileName;
	/**
     * 
     */
	private Integer status;
	/**
     * 
     */
	private Integer successCount;
	/**
     * 
     */
	private Long adminId;
	
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
	* @return Integer
    */
	public Integer getErrorIndex(){
		return errorIndex;
	}
	/**
	* 
	*/
	public void setErrorIndex(Integer errorIndex){
		this.errorIndex = errorIndex;
	}
	/**
	* 
	* @return String
    */
	public String getErrorMsg(){
		return errorMsg;
	}
	/**
	* 
	*/
	public void setErrorMsg(String errorMsg){
		this.errorMsg = errorMsg;
	}
	/**
	* 
	* @return String
    */
	public String getFileName(){
		return fileName;
	}
	/**
	* 
	*/
	public void setFileName(String fileName){
		this.fileName = fileName;
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
	public Integer getSuccessCount(){
		return successCount;
	}
	/**
	* 
	*/
	public void setSuccessCount(Integer successCount){
		this.successCount = successCount;
	}
	/**
	* 
	* @return Long
    */
	public Long getAdminId(){
		return adminId;
	}
	/**
	* 
	*/
	public void setAdminId(Long adminId){
		this.adminId = adminId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("errorIndex:").append(getErrorIndex()).append(";");
		sb.append("errorMsg:").append(getErrorMsg()).append(";");
		sb.append("fileName:").append(getFileName()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("successCount:").append(getSuccessCount()).append(";");
		sb.append("adminId:").append(getAdminId()).append(";");
		return sb.toString();
	}
}
