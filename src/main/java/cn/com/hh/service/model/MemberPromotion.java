package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public class MemberPromotion  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private Long inviteesId;
	/**
     * 上级
     */
	private Long inviterId;
	/**
     * 
     */
	private Integer level;
	/**
     * 创建时间
     */
	private java.util.Date createTime;
	
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
	* @return Long
    */
	public Long getInviteesId(){
		return inviteesId;
	}
	/**
	* 
	*/
	public void setInviteesId(Long inviteesId){
		this.inviteesId = inviteesId;
	}
	/**
	* 上级
	* @return Long
    */
	public Long getInviterId(){
		return inviterId;
	}
	/**
	* 上级
	*/
	public void setInviterId(Long inviterId){
		this.inviterId = inviterId;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getLevel(){
		return level;
	}
	/**
	* 
	*/
	public void setLevel(Integer level){
		this.level = level;
	}
	/**
	* 创建时间
	* @return java.util.Date
    */
	public java.util.Date getCreateTime(){
		return createTime;
	}
	/**
	* 创建时间
	*/
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("inviteesId:").append(getInviteesId()).append(";");
		sb.append("inviterId:").append(getInviterId()).append(";");
		sb.append("level:").append(getLevel()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		return sb.toString();
	}
}
