package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [member服务实现]
 */
public class MemberApplication  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private Integer auditStatus;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private String idCard;
	/**
     * 
     */
	private String identityCardImgFront;
	/**
     * 
     */
	private String identityCardImgInHand;
	/**
     * 
     */
	private String identityCardImgReverse;
	/**
     * 
     */
	private String videoUrl;
	/**
     * 
     */
	private String realName;
	/**
     * 
     */
	private String rejectReason;
	/**
     * 认证类型
     */
	private Integer type;
	/**
     * 
     */
	private java.util.Date updateTime;
	/**
     * 
     */
	private Long memberId;
	/**
     * kyc等级
     */
	private Integer kycStatus;
	/**
     * 视频认证随机数
     */
	private String videoRandom;
	
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
	* @return Integer
    */
	public Integer getAuditStatus(){
		return auditStatus;
	}
	/**
	* 
	*/
	public void setAuditStatus(Integer auditStatus){
		this.auditStatus = auditStatus;
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
	* @return String
    */
	public String getIdCard(){
		return idCard;
	}
	/**
	* 
	*/
	public void setIdCard(String idCard){
		this.idCard = idCard;
	}
	/**
	* 
	* @return String
    */
	public String getIdentityCardImgFront(){
		return identityCardImgFront;
	}
	/**
	* 
	*/
	public void setIdentityCardImgFront(String identityCardImgFront){
		this.identityCardImgFront = identityCardImgFront;
	}
	/**
	* 
	* @return String
    */
	public String getIdentityCardImgInHand(){
		return identityCardImgInHand;
	}
	/**
	* 
	*/
	public void setIdentityCardImgInHand(String identityCardImgInHand){
		this.identityCardImgInHand = identityCardImgInHand;
	}
	/**
	* 
	* @return String
    */
	public String getIdentityCardImgReverse(){
		return identityCardImgReverse;
	}
	/**
	* 
	*/
	public void setIdentityCardImgReverse(String identityCardImgReverse){
		this.identityCardImgReverse = identityCardImgReverse;
	}
	/**
	* 
	* @return String
    */
	public String getVideoUrl(){
		return videoUrl;
	}
	/**
	* 
	*/
	public void setVideoUrl(String videoUrl){
		this.videoUrl = videoUrl;
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
	* @return String
    */
	public String getRejectReason(){
		return rejectReason;
	}
	/**
	* 
	*/
	public void setRejectReason(String rejectReason){
		this.rejectReason = rejectReason;
	}
	/**
	* 认证类型
	* @return Integer
    */
	public Integer getType(){
		return type;
	}
	/**
	* 认证类型
	*/
	public void setType(Integer type){
		this.type = type;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getUpdateTime(){
		return updateTime;
	}
	/**
	* 
	*/
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
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
	* kyc等级
	* @return Integer
    */
	public Integer getKycStatus(){
		return kycStatus;
	}
	/**
	* kyc等级
	*/
	public void setKycStatus(Integer kycStatus){
		this.kycStatus = kycStatus;
	}
	/**
	* 视频认证随机数
	* @return String
    */
	public String getVideoRandom(){
		return videoRandom;
	}
	/**
	* 视频认证随机数
	*/
	public void setVideoRandom(String videoRandom){
		this.videoRandom = videoRandom;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("auditStatus:").append(getAuditStatus()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("idCard:").append(getIdCard()).append(";");
		sb.append("identityCardImgFront:").append(getIdentityCardImgFront()).append(";");
		sb.append("identityCardImgInHand:").append(getIdentityCardImgInHand()).append(";");
		sb.append("identityCardImgReverse:").append(getIdentityCardImgReverse()).append(";");
		sb.append("videoUrl:").append(getVideoUrl()).append(";");
		sb.append("realName:").append(getRealName()).append(";");
		sb.append("rejectReason:").append(getRejectReason()).append(";");
		sb.append("type:").append(getType()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("kycStatus:").append(getKycStatus()).append(";");
		sb.append("videoRandom:").append(getVideoRandom()).append(";");
		return sb.toString();
	}
}
