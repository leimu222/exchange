package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [community服务实现]
 */
public class CommunityMemberTraderApply  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private String id;
	/**
     * 关联请求的用户主键
     */
	private Long memberId;
	/**
     * 0-申请中 1-审核通过 2-审核不通过
     */
	private Integer status;
	/**
     * 审核配置
     */
	private String remark;
	/**
     * 审核时间
     */
	private java.util.Date replyTime;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private Long sequence;
	/**
     * 真实姓名
     */
	private String realName;
	/**
     * 身份证号
     */
	private String cardId;
	/**
     * 手机号方便审核
     */
	private String phone;
	
	// setter and getter
	/**
	* 
	* @return String
    */
	public String getId(){
		return id;
	}
	/**
	* 
	*/
	public void setId(String id){
		this.id = id;
	}
	/**
	* 关联请求的用户主键
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 关联请求的用户主键
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 0-申请中 1-审核通过 2-审核不通过
	* @return Integer
    */
	public Integer getStatus(){
		return status;
	}
	/**
	* 0-申请中 1-审核通过 2-审核不通过
	*/
	public void setStatus(Integer status){
		this.status = status;
	}
	/**
	* 审核配置
	* @return String
    */
	public String getRemark(){
		return remark;
	}
	/**
	* 审核配置
	*/
	public void setRemark(String remark){
		this.remark = remark;
	}
	/**
	* 审核时间
	* @return java.util.Date
    */
	public java.util.Date getReplyTime(){
		return replyTime;
	}
	/**
	* 审核时间
	*/
	public void setReplyTime(java.util.Date replyTime){
		this.replyTime = replyTime;
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
	/**
	* 真实姓名
	* @return String
    */
	public String getRealName(){
		return realName;
	}
	/**
	* 真实姓名
	*/
	public void setRealName(String realName){
		this.realName = realName;
	}
	/**
	* 身份证号
	* @return String
    */
	public String getCardId(){
		return cardId;
	}
	/**
	* 身份证号
	*/
	public void setCardId(String cardId){
		this.cardId = cardId;
	}
	/**
	* 手机号方便审核
	* @return String
    */
	public String getPhone(){
		return phone;
	}
	/**
	* 手机号方便审核
	*/
	public void setPhone(String phone){
		this.phone = phone;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("replyTime:").append(getReplyTime()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		sb.append("realName:").append(getRealName()).append(";");
		sb.append("cardId:").append(getCardId()).append(";");
		sb.append("phone:").append(getPhone()).append(";");
		return sb.toString();
	}
}
