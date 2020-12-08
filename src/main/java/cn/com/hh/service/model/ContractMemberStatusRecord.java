package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public class ContractMemberStatusRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 会员ID
     */
	private Long memberId;
	/**
     * 节点会员ID
     */
	private Long nodeMemberId;
	/**
     * 
     */
	private String memberIds;
	/**
     * 改变的status值
     */
	private Integer status;
	/**
     * 
     */
	private java.util.Date time;
	/**
     * 
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
	* 会员ID
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 会员ID
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 节点会员ID
	* @return Long
    */
	public Long getNodeMemberId(){
		return nodeMemberId;
	}
	/**
	* 节点会员ID
	*/
	public void setNodeMemberId(Long nodeMemberId){
		this.nodeMemberId = nodeMemberId;
	}
	/**
	* 
	* @return String
    */
	public String getMemberIds(){
		return memberIds;
	}
	/**
	* 
	*/
	public void setMemberIds(String memberIds){
		this.memberIds = memberIds;
	}
	/**
	* 改变的status值
	* @return Integer
    */
	public Integer getStatus(){
		return status;
	}
	/**
	* 改变的status值
	*/
	public void setStatus(Integer status){
		this.status = status;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getTime(){
		return time;
	}
	/**
	* 
	*/
	public void setTime(java.util.Date time){
		this.time = time;
	}
	/**
	* 
	* @return Long
    */
	public Long getSequence(){
		return sequence;
	}
	/**
	* 
	*/
	public void setSequence(Long sequence){
		this.sequence = sequence;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("nodeMemberId:").append(getNodeMemberId()).append(";");
		sb.append("memberIds:").append(getMemberIds()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("time:").append(getTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
