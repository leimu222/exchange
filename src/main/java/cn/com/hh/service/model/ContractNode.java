package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public class ContractNode  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Long id;
	/**
     * 节点名称
     */
	private String nodeName;
	/**
     * 手续费返佣比例
     */
	private java.math.BigDecimal feeReturnRate;
	/**
     * 盈亏返佣比例
     */
	private java.math.BigDecimal profitLossReturnRate;
	/**
     * 持仓费返佣比例
     */
	private java.math.BigDecimal holdFeeReturnRate;
	/**
     * 预警率
     */
	private java.math.BigDecimal warningRate;
	/**
     * 转移率
     */
	private java.math.BigDecimal transferRate;
	/**
     * 平仓率
     */
	private java.math.BigDecimal closeRate;
	/**
     * 虚充金额
     */
	private java.math.BigDecimal virtualRechargeAmount;
	/**
     * 保证金
     */
	private java.math.BigDecimal depositAmount;
	/**
     * 会员状态（1节点，2代理，3市场管理员）
     */
	private Integer memberStatus;
	/**
     * 用户id
     */
	private String memberId;
	/**
     * 是否有效 1：启用，2：禁止
     */
	private Integer enable;
	/**
     * 保证金限制比例（备用字段）
     */
	private java.math.BigDecimal depositLimitRate;
	/**
     * 上级节点（备用字段）
     */
	private String lastNodeId;
	/**
     * 超级节点（备用字段）
     */
	private String superNodeId;
	/**
     * 节点级别（1为超级节点，2为二级节点等）（备用字段）
     */
	private Integer nodeLevel;
	/**
     * 节点类型（备用字段）
     */
	private String nodeType;
	/**
     * 对应后台管理员初始密码
     */
	private String initpwd;
	
	// setter and getter
	/**
	* 主键
	* @return Long
    */
	public Long getId(){
		return id;
	}
	/**
	* 主键
	*/
	public void setId(Long id){
		this.id = id;
	}
	/**
	* 节点名称
	* @return String
    */
	public String getNodeName(){
		return nodeName;
	}
	/**
	* 节点名称
	*/
	public void setNodeName(String nodeName){
		this.nodeName = nodeName;
	}
	/**
	* 手续费返佣比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFeeReturnRate(){
		return feeReturnRate;
	}
	/**
	* 手续费返佣比例
	*/
	public void setFeeReturnRate(java.math.BigDecimal feeReturnRate){
		this.feeReturnRate = feeReturnRate;
	}
	/**
	* 盈亏返佣比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getProfitLossReturnRate(){
		return profitLossReturnRate;
	}
	/**
	* 盈亏返佣比例
	*/
	public void setProfitLossReturnRate(java.math.BigDecimal profitLossReturnRate){
		this.profitLossReturnRate = profitLossReturnRate;
	}
	/**
	* 持仓费返佣比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getHoldFeeReturnRate(){
		return holdFeeReturnRate;
	}
	/**
	* 持仓费返佣比例
	*/
	public void setHoldFeeReturnRate(java.math.BigDecimal holdFeeReturnRate){
		this.holdFeeReturnRate = holdFeeReturnRate;
	}
	/**
	* 预警率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getWarningRate(){
		return warningRate;
	}
	/**
	* 预警率
	*/
	public void setWarningRate(java.math.BigDecimal warningRate){
		this.warningRate = warningRate;
	}
	/**
	* 转移率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTransferRate(){
		return transferRate;
	}
	/**
	* 转移率
	*/
	public void setTransferRate(java.math.BigDecimal transferRate){
		this.transferRate = transferRate;
	}
	/**
	* 平仓率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getCloseRate(){
		return closeRate;
	}
	/**
	* 平仓率
	*/
	public void setCloseRate(java.math.BigDecimal closeRate){
		this.closeRate = closeRate;
	}
	/**
	* 虚充金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getVirtualRechargeAmount(){
		return virtualRechargeAmount;
	}
	/**
	* 虚充金额
	*/
	public void setVirtualRechargeAmount(java.math.BigDecimal virtualRechargeAmount){
		this.virtualRechargeAmount = virtualRechargeAmount;
	}
	/**
	* 保证金
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getDepositAmount(){
		return depositAmount;
	}
	/**
	* 保证金
	*/
	public void setDepositAmount(java.math.BigDecimal depositAmount){
		this.depositAmount = depositAmount;
	}
	/**
	* 会员状态（1节点，2代理，3市场管理员）
	* @return Integer
    */
	public Integer getMemberStatus(){
		return memberStatus;
	}
	/**
	* 会员状态（1节点，2代理，3市场管理员）
	*/
	public void setMemberStatus(Integer memberStatus){
		this.memberStatus = memberStatus;
	}
	/**
	* 用户id
	* @return String
    */
	public String getMemberId(){
		return memberId;
	}
	/**
	* 用户id
	*/
	public void setMemberId(String memberId){
		this.memberId = memberId;
	}
	/**
	* 是否有效 1：启用，2：禁止
	* @return Integer
    */
	public Integer getEnable(){
		return enable;
	}
	/**
	* 是否有效 1：启用，2：禁止
	*/
	public void setEnable(Integer enable){
		this.enable = enable;
	}
	/**
	* 保证金限制比例（备用字段）
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getDepositLimitRate(){
		return depositLimitRate;
	}
	/**
	* 保证金限制比例（备用字段）
	*/
	public void setDepositLimitRate(java.math.BigDecimal depositLimitRate){
		this.depositLimitRate = depositLimitRate;
	}
	/**
	* 上级节点（备用字段）
	* @return String
    */
	public String getLastNodeId(){
		return lastNodeId;
	}
	/**
	* 上级节点（备用字段）
	*/
	public void setLastNodeId(String lastNodeId){
		this.lastNodeId = lastNodeId;
	}
	/**
	* 超级节点（备用字段）
	* @return String
    */
	public String getSuperNodeId(){
		return superNodeId;
	}
	/**
	* 超级节点（备用字段）
	*/
	public void setSuperNodeId(String superNodeId){
		this.superNodeId = superNodeId;
	}
	/**
	* 节点级别（1为超级节点，2为二级节点等）（备用字段）
	* @return Integer
    */
	public Integer getNodeLevel(){
		return nodeLevel;
	}
	/**
	* 节点级别（1为超级节点，2为二级节点等）（备用字段）
	*/
	public void setNodeLevel(Integer nodeLevel){
		this.nodeLevel = nodeLevel;
	}
	/**
	* 节点类型（备用字段）
	* @return String
    */
	public String getNodeType(){
		return nodeType;
	}
	/**
	* 节点类型（备用字段）
	*/
	public void setNodeType(String nodeType){
		this.nodeType = nodeType;
	}
	/**
	* 对应后台管理员初始密码
	* @return String
    */
	public String getInitpwd(){
		return initpwd;
	}
	/**
	* 对应后台管理员初始密码
	*/
	public void setInitpwd(String initpwd){
		this.initpwd = initpwd;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("nodeName:").append(getNodeName()).append(";");
		sb.append("feeReturnRate:").append(getFeeReturnRate()).append(";");
		sb.append("profitLossReturnRate:").append(getProfitLossReturnRate()).append(";");
		sb.append("holdFeeReturnRate:").append(getHoldFeeReturnRate()).append(";");
		sb.append("warningRate:").append(getWarningRate()).append(";");
		sb.append("transferRate:").append(getTransferRate()).append(";");
		sb.append("closeRate:").append(getCloseRate()).append(";");
		sb.append("virtualRechargeAmount:").append(getVirtualRechargeAmount()).append(";");
		sb.append("depositAmount:").append(getDepositAmount()).append(";");
		sb.append("memberStatus:").append(getMemberStatus()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("enable:").append(getEnable()).append(";");
		sb.append("depositLimitRate:").append(getDepositLimitRate()).append(";");
		sb.append("lastNodeId:").append(getLastNodeId()).append(";");
		sb.append("superNodeId:").append(getSuperNodeId()).append(";");
		sb.append("nodeLevel:").append(getNodeLevel()).append(";");
		sb.append("nodeType:").append(getNodeType()).append(";");
		sb.append("initpwd:").append(getInitpwd()).append(";");
		return sb.toString();
	}
}
