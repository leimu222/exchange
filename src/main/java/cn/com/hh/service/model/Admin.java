package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:00
  * Description: [admin服务实现]
 */
public class Admin  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String areaCode;
	/**
     * 
     */
	private String avatar;
	/**
     * 
     */
	private String email;
	/**
     * 
     */
	private Integer enable;
	/**
     * 
     */
	private java.util.Date googleDate;
	/**
     * 
     */
	private String googleKey;
	/**
     * 
     */
	private Integer googleState;
	/**
     * 
     */
	private String lastLoginIp;
	/**
     * 
     */
	private java.util.Date lastLoginTime;
	/**
     * 
     */
	private String mobilePhone;
	/**
     * 
     */
	private String password;
	/**
     * 
     */
	private String qq;
	/**
     * 
     */
	private String realName;
	/**
     * 
     */
	private Long roleId;
	/**
     * 
     */
	private Integer status;
	/**
     * 
     */
	private String username;
	/**
     * 
     */
	private Long departmentId;
	/**
     * 代理id（关联用户ID）
     */
	private Long proxyId;
	
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
	public String getAreaCode(){
		return areaCode;
	}
	/**
	* 
	*/
	public void setAreaCode(String areaCode){
		this.areaCode = areaCode;
	}
	/**
	* 
	* @return String
    */
	public String getAvatar(){
		return avatar;
	}
	/**
	* 
	*/
	public void setAvatar(String avatar){
		this.avatar = avatar;
	}
	/**
	* 
	* @return String
    */
	public String getEmail(){
		return email;
	}
	/**
	* 
	*/
	public void setEmail(String email){
		this.email = email;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getEnable(){
		return enable;
	}
	/**
	* 
	*/
	public void setEnable(Integer enable){
		this.enable = enable;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getGoogleDate(){
		return googleDate;
	}
	/**
	* 
	*/
	public void setGoogleDate(java.util.Date googleDate){
		this.googleDate = googleDate;
	}
	/**
	* 
	* @return String
    */
	public String getGoogleKey(){
		return googleKey;
	}
	/**
	* 
	*/
	public void setGoogleKey(String googleKey){
		this.googleKey = googleKey;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getGoogleState(){
		return googleState;
	}
	/**
	* 
	*/
	public void setGoogleState(Integer googleState){
		this.googleState = googleState;
	}
	/**
	* 
	* @return String
    */
	public String getLastLoginIp(){
		return lastLoginIp;
	}
	/**
	* 
	*/
	public void setLastLoginIp(String lastLoginIp){
		this.lastLoginIp = lastLoginIp;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getLastLoginTime(){
		return lastLoginTime;
	}
	/**
	* 
	*/
	public void setLastLoginTime(java.util.Date lastLoginTime){
		this.lastLoginTime = lastLoginTime;
	}
	/**
	* 
	* @return String
    */
	public String getMobilePhone(){
		return mobilePhone;
	}
	/**
	* 
	*/
	public void setMobilePhone(String mobilePhone){
		this.mobilePhone = mobilePhone;
	}
	/**
	* 
	* @return String
    */
	public String getPassword(){
		return password;
	}
	/**
	* 
	*/
	public void setPassword(String password){
		this.password = password;
	}
	/**
	* 
	* @return String
    */
	public String getQq(){
		return qq;
	}
	/**
	* 
	*/
	public void setQq(String qq){
		this.qq = qq;
	}
	/**
	* 
	* @return String
    */
	public String getRealName(){
		return realName;
	}
	/**
	* 
	*/
	public void setRealName(String realName){
		this.realName = realName;
	}
	/**
	* 
	* @return Long
    */
	public Long getRoleId(){
		return roleId;
	}
	/**
	* 
	*/
	public void setRoleId(Long roleId){
		this.roleId = roleId;
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
	* @return String
    */
	public String getUsername(){
		return username;
	}
	/**
	* 
	*/
	public void setUsername(String username){
		this.username = username;
	}
	/**
	* 
	* @return Long
    */
	public Long getDepartmentId(){
		return departmentId;
	}
	/**
	* 
	*/
	public void setDepartmentId(Long departmentId){
		this.departmentId = departmentId;
	}
	/**
	* 代理id（关联用户ID）
	* @return Long
    */
	public Long getProxyId(){
		return proxyId;
	}
	/**
	* 代理id（关联用户ID）
	*/
	public void setProxyId(Long proxyId){
		this.proxyId = proxyId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("areaCode:").append(getAreaCode()).append(";");
		sb.append("avatar:").append(getAvatar()).append(";");
		sb.append("email:").append(getEmail()).append(";");
		sb.append("enable:").append(getEnable()).append(";");
		sb.append("googleDate:").append(getGoogleDate()).append(";");
		sb.append("googleKey:").append(getGoogleKey()).append(";");
		sb.append("googleState:").append(getGoogleState()).append(";");
		sb.append("lastLoginIp:").append(getLastLoginIp()).append(";");
		sb.append("lastLoginTime:").append(getLastLoginTime()).append(";");
		sb.append("mobilePhone:").append(getMobilePhone()).append(";");
		sb.append("password:").append(getPassword()).append(";");
		sb.append("qq:").append(getQq()).append(";");
		sb.append("realName:").append(getRealName()).append(";");
		sb.append("roleId:").append(getRoleId()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("username:").append(getUsername()).append(";");
		sb.append("departmentId:").append(getDepartmentId()).append(";");
		sb.append("proxyId:").append(getProxyId()).append(";");
		return sb.toString();
	}
}
