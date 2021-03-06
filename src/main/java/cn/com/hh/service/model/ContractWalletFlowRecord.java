package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [contract服务实现]
 */
public class ContractWalletFlowRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键，自增
     */
	private Long id;
	/**
     * 会员编码
     */
	private Long memberId;
	/**
     * 操作的币种编码
     */
	private String coinId;
	/**
     * 操作的金额
     */
	private java.math.BigDecimal amount;
	/**
     * 操作完成后用户币种资产情况
     */
	private java.math.BigDecimal afterBalance;
	/**
     * 操作类型,0-划转入;1-划转出;2-合约交易下单;3-合约订单平仓;4-计划订单进入持仓状态;5-后台管理员修改;6-升级成为代理;7-合约账户充币;8-返佣;9-一级节点减少返佣金额;10-节点用户增加保证金
     */
	private Integer operationType;
	/**
     * 关联操作详细记录信息
     */
	private Long relationDetailId;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private Long sequence;
	/**
     * 乐观锁
     */
	private Long version;
	/**
     * 备注
     */
	private String remark;
	/**
     * 0自由合约，1双仓合约
     */
	private Integer contractType;
	
	// setter and getter
	/**
	* 主键，自增
	* @return Long
    */
	public Long getId(){
		return id;
	}
	/**
	* 主键，自增
	*/
	public void setId(Long id){
		this.id = id;
	}
	/**
	* 会员编码
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 会员编码
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 操作的币种编码
	* @return String
    */
	public String getCoinId(){
		return coinId;
	}
	/**
	* 操作的币种编码
	*/
	public void setCoinId(String coinId){
		this.coinId = coinId;
	}
	/**
	* 操作的金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 操作的金额
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 操作完成后用户币种资产情况
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAfterBalance(){
		return afterBalance;
	}
	/**
	* 操作完成后用户币种资产情况
	*/
	public void setAfterBalance(java.math.BigDecimal afterBalance){
		this.afterBalance = afterBalance;
	}
	/**
	* 操作类型,0-划转入;1-划转出;2-合约交易下单;3-合约订单平仓;4-计划订单进入持仓状态;5-后台管理员修改;6-升级成为代理;7-合约账户充币;8-返佣;9-一级节点减少返佣金额;10-节点用户增加保证金
	* @return Integer
    */
	public Integer getOperationType(){
		return operationType;
	}
	/**
	* 操作类型,0-划转入;1-划转出;2-合约交易下单;3-合约订单平仓;4-计划订单进入持仓状态;5-后台管理员修改;6-升级成为代理;7-合约账户充币;8-返佣;9-一级节点减少返佣金额;10-节点用户增加保证金
	*/
	public void setOperationType(Integer operationType){
		this.operationType = operationType;
	}
	/**
	* 关联操作详细记录信息
	* @return Long
    */
	public Long getRelationDetailId(){
		return relationDetailId;
	}
	/**
	* 关联操作详细记录信息
	*/
	public void setRelationDetailId(Long relationDetailId){
		this.relationDetailId = relationDetailId;
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
	/**
	* 乐观锁
	* @return Long
    */
	public Long getVersion(){
		return version;
	}
	/**
	* 乐观锁
	*/
	public void setVersion(Long version){
		this.version = version;
	}
	/**
	* 备注
	* @return String
    */
	public String getRemark(){
		return remark;
	}
	/**
	* 备注
	*/
	public void setRemark(String remark){
		this.remark = remark;
	}
	/**
	* 0自由合约，1双仓合约
	* @return Integer
    */
	public Integer getContractType(){
		return contractType;
	}
	/**
	* 0自由合约，1双仓合约
	*/
	public void setContractType(Integer contractType){
		this.contractType = contractType;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("afterBalance:").append(getAfterBalance()).append(";");
		sb.append("operationType:").append(getOperationType()).append(";");
		sb.append("relationDetailId:").append(getRelationDetailId()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("contractType:").append(getContractType()).append(";");
		return sb.toString();
	}
}
