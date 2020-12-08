package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public class UnblockMemberRobot  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * memberId
     */
	private Long memberId;
	/**
     * 交易对
     */
	private String symbol;
	/**
     * 过期时间
     */
	private java.util.Date expireTime;
	/**
     * 状态 0-关闭 1-开启
     */
	private Boolean status;
	/**
     * 
     */
	private java.util.Date updateTime;
	/**
     * 版本锁
     */
	private Long version;
	
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
	* memberId
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* memberId
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 交易对
	* @return String
    */
	public String getSymbol(){
		return symbol;
	}
	/**
	* 交易对
	*/
	public void setSymbol(String symbol){
		this.symbol = symbol;
	}
	/**
	* 过期时间
	* @return java.util.Date
    */
	public java.util.Date getExpireTime(){
		return expireTime;
	}
	/**
	* 过期时间
	*/
	public void setExpireTime(java.util.Date expireTime){
		this.expireTime = expireTime;
	}
	/**
	* 状态 0-关闭 1-开启
	* @return Boolean
    */
	public Boolean getStatus(){
		return status;
	}
	/**
	* 状态 0-关闭 1-开启
	*/
	public void setStatus(Boolean status){
		this.status = status;
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
	* 版本锁
	* @return Long
    */
	public Long getVersion(){
		return version;
	}
	/**
	* 版本锁
	*/
	public void setVersion(Long version){
		this.version = version;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("symbol:").append(getSymbol()).append(";");
		sb.append("expireTime:").append(getExpireTime()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		return sb.toString();
	}
}
