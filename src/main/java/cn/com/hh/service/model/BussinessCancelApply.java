package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [bussiness服务实现]
 */
public class BussinessCancelApply  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private java.util.Date cancelApplyTime;
	/**
     * 
     */
	private String depositRecordId;
	/**
     * 
     */
	private String detail;
	/**
     * 
     */
	private java.util.Date handleTime;
	/**
     * 
     */
	private String reason;
	/**
     * 
     */
	private Integer status;
	/**
     * 
     */
	private Long memberId;
	
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
	* @return java.util.Date
    */
	public java.util.Date getCancelApplyTime(){
		return cancelApplyTime;
	}
	/**
	* 
	*/
	public void setCancelApplyTime(java.util.Date cancelApplyTime){
		this.cancelApplyTime = cancelApplyTime;
	}
	/**
	* 
	* @return String
    */
	public String getDepositRecordId(){
		return depositRecordId;
	}
	/**
	* 
	*/
	public void setDepositRecordId(String depositRecordId){
		this.depositRecordId = depositRecordId;
	}
	/**
	* 
	* @return String
    */
	public String getDetail(){
		return detail;
	}
	/**
	* 
	*/
	public void setDetail(String detail){
		this.detail = detail;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getHandleTime(){
		return handleTime;
	}
	/**
	* 
	*/
	public void setHandleTime(java.util.Date handleTime){
		this.handleTime = handleTime;
	}
	/**
	* 
	* @return String
    */
	public String getReason(){
		return reason;
	}
	/**
	* 
	*/
	public void setReason(String reason){
		this.reason = reason;
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
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("cancelApplyTime:").append(getCancelApplyTime()).append(";");
		sb.append("depositRecordId:").append(getDepositRecordId()).append(";");
		sb.append("detail:").append(getDetail()).append(";");
		sb.append("handleTime:").append(getHandleTime()).append(";");
		sb.append("reason:").append(getReason()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		return sb.toString();
	}
}
