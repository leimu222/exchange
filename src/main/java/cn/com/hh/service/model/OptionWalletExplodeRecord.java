package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public class OptionWalletExplodeRecord  implements Serializable {

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
	private String coin;
	/**
     * 操作的金额
     */
	private java.math.BigDecimal beforeBalance;
	/**
     * 操作完成后用户币种资产情况
     */
	private java.math.BigDecimal afterBalance;
	/**
     * 
     */
	private java.math.BigDecimal frozenAmount;
	/**
     * 为一个百分比的值
     */
	private java.math.BigDecimal riskRate;
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
	public String getCoin(){
		return coin;
	}
	/**
	* 操作的币种编码
	*/
	public void setCoin(String coin){
		this.coin = coin;
	}
	/**
	* 操作的金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBeforeBalance(){
		return beforeBalance;
	}
	/**
	* 操作的金额
	*/
	public void setBeforeBalance(java.math.BigDecimal beforeBalance){
		this.beforeBalance = beforeBalance;
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
	* 
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFrozenAmount(){
		return frozenAmount;
	}
	/**
	* 
	*/
	public void setFrozenAmount(java.math.BigDecimal frozenAmount){
		this.frozenAmount = frozenAmount;
	}
	/**
	* 为一个百分比的值
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getRiskRate(){
		return riskRate;
	}
	/**
	* 为一个百分比的值
	*/
	public void setRiskRate(java.math.BigDecimal riskRate){
		this.riskRate = riskRate;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("coin:").append(getCoin()).append(";");
		sb.append("beforeBalance:").append(getBeforeBalance()).append(";");
		sb.append("afterBalance:").append(getAfterBalance()).append(";");
		sb.append("frozenAmount:").append(getFrozenAmount()).append(";");
		sb.append("riskRate:").append(getRiskRate()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		return sb.toString();
	}
}
