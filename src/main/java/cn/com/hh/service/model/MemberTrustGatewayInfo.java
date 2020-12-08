package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public class MemberTrustGatewayInfo  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long memberId;
	/**
     * 
     */
	private String coin;
	/**
     * 信任状态 0-关闭 1-开启
     */
	private Boolean status;
	/**
     * 更新时间
     */
	private java.util.Date updateTime;
	
	// setter and getter
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
	public String getCoin(){
		return coin;
	}
	/**
	* 
	*/
	public void setCoin(String coin){
		this.coin = coin;
	}
	/**
	* 信任状态 0-关闭 1-开启
	* @return Boolean
    */
	public Boolean getStatus(){
		return status;
	}
	/**
	* 信任状态 0-关闭 1-开启
	*/
	public void setStatus(Boolean status){
		this.status = status;
	}
	/**
	* 更新时间
	* @return java.util.Date
    */
	public java.util.Date getUpdateTime(){
		return updateTime;
	}
	/**
	* 更新时间
	*/
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("coin:").append(getCoin()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		return sb.toString();
	}
}
