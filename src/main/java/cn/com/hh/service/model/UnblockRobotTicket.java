package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public class UnblockRobotTicket  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private String id;
	/**
     * 状态 0-未使用 1-已使用
     */
	private Boolean status;
	/**
     * 创建时间
     */
	private java.util.Date createTime;
	/**
     * ticket有效的天数，默认30天
     */
	private Integer effectiveDay;
	/**
     * 使用时间
     */
	private java.util.Date useTime;
	/**
     * 使用者的memberId
     */
	private Long memberId;
	
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
	* 状态 0-未使用 1-已使用
	* @return Boolean
    */
	public Boolean getStatus(){
		return status;
	}
	/**
	* 状态 0-未使用 1-已使用
	*/
	public void setStatus(Boolean status){
		this.status = status;
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
	* ticket有效的天数，默认30天
	* @return Integer
    */
	public Integer getEffectiveDay(){
		return effectiveDay;
	}
	/**
	* ticket有效的天数，默认30天
	*/
	public void setEffectiveDay(Integer effectiveDay){
		this.effectiveDay = effectiveDay;
	}
	/**
	* 使用时间
	* @return java.util.Date
    */
	public java.util.Date getUseTime(){
		return useTime;
	}
	/**
	* 使用时间
	*/
	public void setUseTime(java.util.Date useTime){
		this.useTime = useTime;
	}
	/**
	* 使用者的memberId
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 使用者的memberId
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("effectiveDay:").append(getEffectiveDay()).append(";");
		sb.append("useTime:").append(getUseTime()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		return sb.toString();
	}
}
