package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public class OptionMemberTransferRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 用户id
     */
	private Long memberId;
	/**
     * 原代理id
     */
	private Long orginalProxyId;
	/**
     * 新代理id
     */
	private Long newProxyId;
	/**
     * 创建时间
     */
	private java.util.Date createTime;
	/**
     * 时间戳
     */
	private Long sequence;
	
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
	* 用户id
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 用户id
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 原代理id
	* @return Long
    */
	public Long getOrginalProxyId(){
		return orginalProxyId;
	}
	/**
	* 原代理id
	*/
	public void setOrginalProxyId(Long orginalProxyId){
		this.orginalProxyId = orginalProxyId;
	}
	/**
	* 新代理id
	* @return Long
    */
	public Long getNewProxyId(){
		return newProxyId;
	}
	/**
	* 新代理id
	*/
	public void setNewProxyId(Long newProxyId){
		this.newProxyId = newProxyId;
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
	/**
	* 时间戳
	* @return Long
    */
	public Long getSequence(){
		return sequence;
	}
	/**
	* 时间戳
	*/
	public void setSequence(Long sequence){
		this.sequence = sequence;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("orginalProxyId:").append(getOrginalProxyId()).append(";");
		sb.append("newProxyId:").append(getNewProxyId()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
