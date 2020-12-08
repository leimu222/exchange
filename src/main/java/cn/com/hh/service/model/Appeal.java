package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [appeal服务实现]
 */
public class Appeal  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private Long associateId;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private java.util.Date dealWithTime;
	/**
     * 
     */
	private String imgUrls;
	/**
     * 
     */
	private Long initiatorId;
	/**
     * 
     */
	private Integer isSuccess;
	/**
     * 
     */
	private String remark;
	/**
     * 
     */
	private Integer status;
	/**
     * 
     */
	private Long adminId;
	/**
     * 
     */
	private Long orderId;
	
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
	public Long getAssociateId(){
		return associateId;
	}
	/**
	* 
	*/
	public void setAssociateId(Long associateId){
		this.associateId = associateId;
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
	* @return java.util.Date
    */
	public java.util.Date getDealWithTime(){
		return dealWithTime;
	}
	/**
	* 
	*/
	public void setDealWithTime(java.util.Date dealWithTime){
		this.dealWithTime = dealWithTime;
	}
	/**
	* 
	* @return String
    */
	public String getImgUrls(){
		return imgUrls;
	}
	/**
	* 
	*/
	public void setImgUrls(String imgUrls){
		this.imgUrls = imgUrls;
	}
	/**
	* 
	* @return Long
    */
	public Long getInitiatorId(){
		return initiatorId;
	}
	/**
	* 
	*/
	public void setInitiatorId(Long initiatorId){
		this.initiatorId = initiatorId;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getIsSuccess(){
		return isSuccess;
	}
	/**
	* 
	*/
	public void setIsSuccess(Integer isSuccess){
		this.isSuccess = isSuccess;
	}
	/**
	* 
	* @return String
    */
	public String getRemark(){
		return remark;
	}
	/**
	* 
	*/
	public void setRemark(String remark){
		this.remark = remark;
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
	* @return Long
    */
	public Long getOrderId(){
		return orderId;
	}
	/**
	* 
	*/
	public void setOrderId(Long orderId){
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("associateId:").append(getAssociateId()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("dealWithTime:").append(getDealWithTime()).append(";");
		sb.append("imgUrls:").append(getImgUrls()).append(";");
		sb.append("initiatorId:").append(getInitiatorId()).append(";");
		sb.append("isSuccess:").append(getIsSuccess()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("adminId:").append(getAdminId()).append(";");
		sb.append("orderId:").append(getOrderId()).append(";");
		return sb.toString();
	}
}
