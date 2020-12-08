package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public class OptionMember  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 关联用户主键
     */
	private Long memberId;
	/**
     * 是否代理 0-否1-是
     */
	private Boolean ifProxy;
	/**
     * 代理ID
     */
	private Long proxyId;
	/**
     * 邀请码
     */
	private String invitationCode;
	/**
     * 合约返佣比例
     */
	private java.math.BigDecimal contractRebateRate;
	/**
     * 现货返佣比例
     */
	private java.math.BigDecimal spotRebateRate;
	/**
     * 节点ID（关联节点表）
     */
	private Long nodeId;
	/**
     * 状态 0-正常 1-因啥导致的暂停
     */
	private Boolean status;
	/**
     * 乐观锁版本号
     */
	private Long version;
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
	* 关联用户主键
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 关联用户主键
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 是否代理 0-否1-是
	* @return Boolean
    */
	public Boolean getIfProxy(){
		return ifProxy;
	}
	/**
	* 是否代理 0-否1-是
	*/
	public void setIfProxy(Boolean ifProxy){
		this.ifProxy = ifProxy;
	}
	/**
	* 代理ID
	* @return Long
    */
	public Long getProxyId(){
		return proxyId;
	}
	/**
	* 代理ID
	*/
	public void setProxyId(Long proxyId){
		this.proxyId = proxyId;
	}
	/**
	* 邀请码
	* @return String
    */
	public String getInvitationCode(){
		return invitationCode;
	}
	/**
	* 邀请码
	*/
	public void setInvitationCode(String invitationCode){
		this.invitationCode = invitationCode;
	}
	/**
	* 合约返佣比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getContractRebateRate(){
		return contractRebateRate;
	}
	/**
	* 合约返佣比例
	*/
	public void setContractRebateRate(java.math.BigDecimal contractRebateRate){
		this.contractRebateRate = contractRebateRate;
	}
	/**
	* 现货返佣比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getSpotRebateRate(){
		return spotRebateRate;
	}
	/**
	* 现货返佣比例
	*/
	public void setSpotRebateRate(java.math.BigDecimal spotRebateRate){
		this.spotRebateRate = spotRebateRate;
	}
	/**
	* 节点ID（关联节点表）
	* @return Long
    */
	public Long getNodeId(){
		return nodeId;
	}
	/**
	* 节点ID（关联节点表）
	*/
	public void setNodeId(Long nodeId){
		this.nodeId = nodeId;
	}
	/**
	* 状态 0-正常 1-因啥导致的暂停
	* @return Boolean
    */
	public Boolean getStatus(){
		return status;
	}
	/**
	* 状态 0-正常 1-因啥导致的暂停
	*/
	public void setStatus(Boolean status){
		this.status = status;
	}
	/**
	* 乐观锁版本号
	* @return Long
    */
	public Long getVersion(){
		return version;
	}
	/**
	* 乐观锁版本号
	*/
	public void setVersion(Long version){
		this.version = version;
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
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("ifProxy:").append(getIfProxy()).append(";");
		sb.append("proxyId:").append(getProxyId()).append(";");
		sb.append("invitationCode:").append(getInvitationCode()).append(";");
		sb.append("contractRebateRate:").append(getContractRebateRate()).append(";");
		sb.append("spotRebateRate:").append(getSpotRebateRate()).append(";");
		sb.append("nodeId:").append(getNodeId()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
