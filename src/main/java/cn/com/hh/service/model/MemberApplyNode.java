package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [member服务实现]
 */
public class MemberApplyNode  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Integer id;
	/**
     * 1普通节点，2社区节点
     */
	private Integer nodeType;
	/**
     * 
     */
	private Long memberId;
	/**
     * 金额
     */
	private java.math.BigDecimal amount;
	/**
     * 0未审核，1通过，2驳回
     */
	private Integer status;
	/**
     * 
     */
	private String remark;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private java.util.Date updateTime;
	
	// setter and getter
	/**
	* 
	* @return Integer
    */
	public Integer getId(){
		return id;
	}
	/**
	* 
	*/
	public void setId(Integer id){
		this.id = id;
	}
	/**
	* 1普通节点，2社区节点
	* @return Integer
    */
	public Integer getNodeType(){
		return nodeType;
	}
	/**
	* 1普通节点，2社区节点
	*/
	public void setNodeType(Integer nodeType){
		this.nodeType = nodeType;
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
	* 金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 金额
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 0未审核，1通过，2驳回
	* @return Integer
    */
	public Integer getStatus(){
		return status;
	}
	/**
	* 0未审核，1通过，2驳回
	*/
	public void setStatus(Integer status){
		this.status = status;
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
	public java.util.Date getUpdateTime(){
		return updateTime;
	}
	/**
	* 
	*/
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("nodeType:").append(getNodeType()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		return sb.toString();
	}
}
