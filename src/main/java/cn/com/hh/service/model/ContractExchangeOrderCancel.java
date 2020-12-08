package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public class ContractExchangeOrderCancel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 关联订单主键
     */
	private Long orderId;
	/**
     * 撤销类型 0-手动撤销 1-系统撤销
     */
	private Boolean type;
	/**
     * 撤销备注
     */
	private String reasonMsg;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private Long sequence;
	
	// setter and getter
	/**
	* 关联订单主键
	* @return Long
    */
	public Long getOrderId(){
		return orderId;
	}
	/**
	* 关联订单主键
	*/
	public void setOrderId(Long orderId){
		this.orderId = orderId;
	}
	/**
	* 撤销类型 0-手动撤销 1-系统撤销
	* @return Boolean
    */
	public Boolean getType(){
		return type;
	}
	/**
	* 撤销类型 0-手动撤销 1-系统撤销
	*/
	public void setType(Boolean type){
		this.type = type;
	}
	/**
	* 撤销备注
	* @return String
    */
	public String getReasonMsg(){
		return reasonMsg;
	}
	/**
	* 撤销备注
	*/
	public void setReasonMsg(String reasonMsg){
		this.reasonMsg = reasonMsg;
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
	* @return Long
    */
	public Long getSequence(){
		return sequence;
	}
	/**
	* 
	*/
	public void setSequence(Long sequence){
		this.sequence = sequence;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("orderId:").append(getOrderId()).append(";");
		sb.append("type:").append(getType()).append(";");
		sb.append("reasonMsg:").append(getReasonMsg()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
