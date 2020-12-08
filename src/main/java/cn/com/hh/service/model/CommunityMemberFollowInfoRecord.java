package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [community服务实现]
 */
public class CommunityMemberFollowInfoRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private Long memberId;
	/**
     * 跟单管理主键
     */
	private Long followId;
	/**
     * 操作类型：0-新建 1-再次跟随 2-修改内容 3-跟单开启 4-跟单关闭 5-取消跟随
     */
	private Integer type;
	/**
     * 旧内容
     */
	private String oldInfo;
	/**
     * 
     */
	private java.util.Date createTime;
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
	* 
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 跟单管理主键
	* @return Long
    */
	public Long getFollowId(){
		return followId;
	}
	/**
	* 跟单管理主键
	*/
	public void setFollowId(Long followId){
		this.followId = followId;
	}
	/**
	* 操作类型：0-新建 1-再次跟随 2-修改内容 3-跟单开启 4-跟单关闭 5-取消跟随
	* @return Integer
    */
	public Integer getType(){
		return type;
	}
	/**
	* 操作类型：0-新建 1-再次跟随 2-修改内容 3-跟单开启 4-跟单关闭 5-取消跟随
	*/
	public void setType(Integer type){
		this.type = type;
	}
	/**
	* 旧内容
	* @return String
    */
	public String getOldInfo(){
		return oldInfo;
	}
	/**
	* 旧内容
	*/
	public void setOldInfo(String oldInfo){
		this.oldInfo = oldInfo;
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
		sb.append("followId:").append(getFollowId()).append(";");
		sb.append("type:").append(getType()).append(";");
		sb.append("oldInfo:").append(getOldInfo()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
