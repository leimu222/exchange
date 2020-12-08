package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public class UnblockCommonConfig  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 类型id
     */
	private Long id;
	/**
     * 名称
     */
	private String name;
	/**
     * 值
     */
	private String value;
	/**
     * 备注信息
     */
	private String remark;
	/**
     * 排序
     */
	private Integer orderId;
	/**
     * 更新时间
     */
	private java.util.Date updateTime;
	/**
     * 版本号
     */
	private Long version;
	
	// setter and getter
	/**
	* 类型id
	* @return Long
    */
	public Long getId(){
		return id;
	}
	/**
	* 类型id
	*/
	public void setId(Long id){
		this.id = id;
	}
	/**
	* 名称
	* @return String
    */
	public String getName(){
		return name;
	}
	/**
	* 名称
	*/
	public void setName(String name){
		this.name = name;
	}
	/**
	* 值
	* @return String
    */
	public String getValue(){
		return value;
	}
	/**
	* 值
	*/
	public void setValue(String value){
		this.value = value;
	}
	/**
	* 备注信息
	* @return String
    */
	public String getRemark(){
		return remark;
	}
	/**
	* 备注信息
	*/
	public void setRemark(String remark){
		this.remark = remark;
	}
	/**
	* 排序
	* @return Integer
    */
	public Integer getOrderId(){
		return orderId;
	}
	/**
	* 排序
	*/
	public void setOrderId(Integer orderId){
		this.orderId = orderId;
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
	/**
	* 版本号
	* @return Long
    */
	public Long getVersion(){
		return version;
	}
	/**
	* 版本号
	*/
	public void setVersion(Long version){
		this.version = version;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("name:").append(getName()).append(";");
		sb.append("value:").append(getValue()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("orderId:").append(getOrderId()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		return sb.toString();
	}
}
