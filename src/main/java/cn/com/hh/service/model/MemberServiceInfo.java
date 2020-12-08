package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public class MemberServiceInfo  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Integer id;
	/**
     * 用户id
     */
	private Long memberId;
	/**
     * 0用户发送，1系统回复
     */
	private Integer type;
	/**
     * 回复管理员，只有type为1的时候才有值
     */
	private Long adminId;
	/**
     * 文字内容
     */
	private String content;
	/**
     * 图片url,多张图片用英文逗号隔开
     */
	private String contentImg;
	/**
     * 0未回复，1已回复，系统回复的记录状态都为1
     */
	private Integer status;
	/**
     * 创建时间yyyy-MM-dd HH:mm:ss
     */
	private java.util.Date createTime;
	/**
     * 创建时间戳
     */
	private Long sequence;
	/**
     * 管理员回复的记录id
     */
	private Integer replyId;
	
	// setter and getter
	/**
	* 
	* @return Integer
    */
	public Integer getId(){
		return id;
	}
	/**
	* 
	*/
	public void setId(Integer id){
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
	* 0用户发送，1系统回复
	* @return Integer
    */
	public Integer getType(){
		return type;
	}
	/**
	* 0用户发送，1系统回复
	*/
	public void setType(Integer type){
		this.type = type;
	}
	/**
	* 回复管理员，只有type为1的时候才有值
	* @return Long
    */
	public Long getAdminId(){
		return adminId;
	}
	/**
	* 回复管理员，只有type为1的时候才有值
	*/
	public void setAdminId(Long adminId){
		this.adminId = adminId;
	}
	/**
	* 文字内容
	* @return String
    */
	public String getContent(){
		return content;
	}
	/**
	* 文字内容
	*/
	public void setContent(String content){
		this.content = content;
	}
	/**
	* 图片url,多张图片用英文逗号隔开
	* @return String
    */
	public String getContentImg(){
		return contentImg;
	}
	/**
	* 图片url,多张图片用英文逗号隔开
	*/
	public void setContentImg(String contentImg){
		this.contentImg = contentImg;
	}
	/**
	* 0未回复，1已回复，系统回复的记录状态都为1
	* @return Integer
    */
	public Integer getStatus(){
		return status;
	}
	/**
	* 0未回复，1已回复，系统回复的记录状态都为1
	*/
	public void setStatus(Integer status){
		this.status = status;
	}
	/**
	* 创建时间yyyy-MM-dd HH:mm:ss
	* @return java.util.Date
    */
	public java.util.Date getCreateTime(){
		return createTime;
	}
	/**
	* 创建时间yyyy-MM-dd HH:mm:ss
	*/
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	/**
	* 创建时间戳
	* @return Long
    */
	public Long getSequence(){
		return sequence;
	}
	/**
	* 创建时间戳
	*/
	public void setSequence(Long sequence){
		this.sequence = sequence;
	}
	/**
	* 管理员回复的记录id
	* @return Integer
    */
	public Integer getReplyId(){
		return replyId;
	}
	/**
	* 管理员回复的记录id
	*/
	public void setReplyId(Integer replyId){
		this.replyId = replyId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("type:").append(getType()).append(";");
		sb.append("adminId:").append(getAdminId()).append(";");
		sb.append("content:").append(getContent()).append(";");
		sb.append("contentImg:").append(getContentImg()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		sb.append("replyId:").append(getReplyId()).append(";");
		return sb.toString();
	}
}
