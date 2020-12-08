package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:00
  * Description: [admin服务实现]
 */
public class AdminOperateContractWalletLog  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String accessIp;
	/**
     * 
     */
	private String accessMethod;
	/**
     * 
     */
	private java.util.Date accessTime;
	/**
     * 
     */
	private Long adminId;
	/**
     * 
     */
	private Integer module;
	/**
     * 
     */
	private String operation;
	/**
     * 
     */
	private String uri;
	
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
	public String getAccessIp(){
		return accessIp;
	}
	/**
	* 
	*/
	public void setAccessIp(String accessIp){
		this.accessIp = accessIp;
	}
	/**
	* 
	* @return String
    */
	public String getAccessMethod(){
		return accessMethod;
	}
	/**
	* 
	*/
	public void setAccessMethod(String accessMethod){
		this.accessMethod = accessMethod;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getAccessTime(){
		return accessTime;
	}
	/**
	* 
	*/
	public void setAccessTime(java.util.Date accessTime){
		this.accessTime = accessTime;
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
	/**
	* 
	* @return Integer
    */
	public Integer getModule(){
		return module;
	}
	/**
	* 
	*/
	public void setModule(Integer module){
		this.module = module;
	}
	/**
	* 
	* @return String
    */
	public String getOperation(){
		return operation;
	}
	/**
	* 
	*/
	public void setOperation(String operation){
		this.operation = operation;
	}
	/**
	* 
	* @return String
    */
	public String getUri(){
		return uri;
	}
	/**
	* 
	*/
	public void setUri(String uri){
		this.uri = uri;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("accessIp:").append(getAccessIp()).append(";");
		sb.append("accessMethod:").append(getAccessMethod()).append(";");
		sb.append("accessTime:").append(getAccessTime()).append(";");
		sb.append("adminId:").append(getAdminId()).append(";");
		sb.append("module:").append(getModule()).append(";");
		sb.append("operation:").append(getOperation()).append(";");
		sb.append("uri:").append(getUri()).append(";");
		return sb.toString();
	}
}
