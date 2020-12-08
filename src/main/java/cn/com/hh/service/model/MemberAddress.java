package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [member服务实现]
 */
public class MemberAddress  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String address;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private java.util.Date deleteTime;
	/**
     * 
     */
	private Long memberId;
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
	private String coinId;
	
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
	public String getAddress(){
		return address;
	}
	/**
	* 
	*/
	public void setAddress(String address){
		this.address = address;
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
	public java.util.Date getDeleteTime(){
		return deleteTime;
	}
	/**
	* 
	*/
	public void setDeleteTime(java.util.Date deleteTime){
		this.deleteTime = deleteTime;
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
	* @return String
    */
	public String getCoinId(){
		return coinId;
	}
	/**
	* 
	*/
	public void setCoinId(String coinId){
		this.coinId = coinId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("address:").append(getAddress()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("deleteTime:").append(getDeleteTime()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		return sb.toString();
	}
}
