package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [reward服务实现]
 */
public class RewardPromotionSetting  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private Integer effectiveTime;
	/**
     * 
     */
	private String info;
	/**
     * 
     */
	private Integer status;
	/**
     * 
     */
	private Integer type;
	/**
     * 
     */
	private java.util.Date updateTime;
	/**
     * 
     */
	private Long adminId;
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
	* @return Integer
    */
	public Integer getEffectiveTime(){
		return effectiveTime;
	}
	/**
	* 
	*/
	public void setEffectiveTime(Integer effectiveTime){
		this.effectiveTime = effectiveTime;
	}
	/**
	* 
	* @return String
    */
	public String getInfo(){
		return info;
	}
	/**
	* 
	*/
	public void setInfo(String info){
		this.info = info;
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
	* @return Integer
    */
	public Integer getType(){
		return type;
	}
	/**
	* 
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
		sb.append("effectiveTime:").append(getEffectiveTime()).append(";");
		sb.append("info:").append(getInfo()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("type:").append(getType()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		sb.append("adminId:").append(getAdminId()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		return sb.toString();
	}
}
