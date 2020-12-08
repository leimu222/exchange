package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [otc服务实现]
 */
public class OtcWalletFlowRecord  implements Serializable {

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
     * 操作的资产类型：0可用余额，1冻结余额，2待释放余额
     */
	private Integer balanceType;
	/**
     * 操作的金额
     */
	private java.math.BigDecimal amount;
	/**
     * 操作完成后用户币种资产情况
     */
	private java.math.BigDecimal afterBalance;
	/**
     * 操作类型：0后台账户充币
     */
	private Integer operationType;
	/**
     * 创建时间
     */
	private java.util.Date createTime;
	/**
     * 创建时间戳
     */
	private Long sequence;
	/**
     * 备注
     */
	private String remark;
	
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
	* 操作的资产类型：0可用余额，1冻结余额，2待释放余额
	* @return Integer
    */
	public Integer getBalanceType(){
		return balanceType;
	}
	/**
	* 操作的资产类型：0可用余额，1冻结余额，2待释放余额
	*/
	public void setBalanceType(Integer balanceType){
		this.balanceType = balanceType;
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
	* 操作类型：0后台账户充币
	* @return Integer
    */
	public Integer getOperationType(){
		return operationType;
	}
	/**
	* 操作类型：0后台账户充币
	*/
	public void setOperationType(Integer operationType){
		this.operationType = operationType;
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
	* 创建时间戳
	* @return Long
    */
	public Long getSequence(){
		return sequence;
	}
	/**
	* 创建时间戳
	*/
	public void setSequence(Long sequence){
		this.sequence = sequence;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		sb.append("balanceType:").append(getBalanceType()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("afterBalance:").append(getAfterBalance()).append(";");
		sb.append("operationType:").append(getOperationType()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		return sb.toString();
	}
}
