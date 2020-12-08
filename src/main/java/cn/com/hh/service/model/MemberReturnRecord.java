package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public class MemberReturnRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Long id;
	/**
     * 用户ID
     */
	private Long memberId;
	/**
     * 盈亏金额
     */
	private java.math.BigDecimal profitLossAmount;
	/**
     * 盈亏返佣比例
     */
	private java.math.BigDecimal profitLossReturnRate;
	/**
     * 盈亏返佣金额
     */
	private java.math.BigDecimal profitLossReturnAmount;
	/**
     * 手续费金额
     */
	private java.math.BigDecimal feeAmount;
	/**
     * 手续费返佣比例
     */
	private java.math.BigDecimal feeReturnRate;
	/**
     * 手续费返佣金额
     */
	private java.math.BigDecimal feeReturnAmount;
	/**
     * 计算的起始时间戳
     */
	private Long calStartSeq;
	/**
     * 计算的结束时间戳
     */
	private Long calEndSeq;
	/**
     * 团队用户ID
     */
	private Long teamMemberId;
	/**
     * 团队用户状态（1节点，2代理，3市场管理员）
     */
	private Integer teamMemberStatus;
	/**
     * 创建时间戳
     */
	private Long createSeq;
	
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
	* 用户ID
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 用户ID
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 盈亏金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getProfitLossAmount(){
		return profitLossAmount;
	}
	/**
	* 盈亏金额
	*/
	public void setProfitLossAmount(java.math.BigDecimal profitLossAmount){
		this.profitLossAmount = profitLossAmount;
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
	* 盈亏返佣金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getProfitLossReturnAmount(){
		return profitLossReturnAmount;
	}
	/**
	* 盈亏返佣金额
	*/
	public void setProfitLossReturnAmount(java.math.BigDecimal profitLossReturnAmount){
		this.profitLossReturnAmount = profitLossReturnAmount;
	}
	/**
	* 手续费金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFeeAmount(){
		return feeAmount;
	}
	/**
	* 手续费金额
	*/
	public void setFeeAmount(java.math.BigDecimal feeAmount){
		this.feeAmount = feeAmount;
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
	* 手续费返佣金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFeeReturnAmount(){
		return feeReturnAmount;
	}
	/**
	* 手续费返佣金额
	*/
	public void setFeeReturnAmount(java.math.BigDecimal feeReturnAmount){
		this.feeReturnAmount = feeReturnAmount;
	}
	/**
	* 计算的起始时间戳
	* @return Long
    */
	public Long getCalStartSeq(){
		return calStartSeq;
	}
	/**
	* 计算的起始时间戳
	*/
	public void setCalStartSeq(Long calStartSeq){
		this.calStartSeq = calStartSeq;
	}
	/**
	* 计算的结束时间戳
	* @return Long
    */
	public Long getCalEndSeq(){
		return calEndSeq;
	}
	/**
	* 计算的结束时间戳
	*/
	public void setCalEndSeq(Long calEndSeq){
		this.calEndSeq = calEndSeq;
	}
	/**
	* 团队用户ID
	* @return Long
    */
	public Long getTeamMemberId(){
		return teamMemberId;
	}
	/**
	* 团队用户ID
	*/
	public void setTeamMemberId(Long teamMemberId){
		this.teamMemberId = teamMemberId;
	}
	/**
	* 团队用户状态（1节点，2代理，3市场管理员）
	* @return Integer
    */
	public Integer getTeamMemberStatus(){
		return teamMemberStatus;
	}
	/**
	* 团队用户状态（1节点，2代理，3市场管理员）
	*/
	public void setTeamMemberStatus(Integer teamMemberStatus){
		this.teamMemberStatus = teamMemberStatus;
	}
	/**
	* 创建时间戳
	* @return Long
    */
	public Long getCreateSeq(){
		return createSeq;
	}
	/**
	* 创建时间戳
	*/
	public void setCreateSeq(Long createSeq){
		this.createSeq = createSeq;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("profitLossAmount:").append(getProfitLossAmount()).append(";");
		sb.append("profitLossReturnRate:").append(getProfitLossReturnRate()).append(";");
		sb.append("profitLossReturnAmount:").append(getProfitLossReturnAmount()).append(";");
		sb.append("feeAmount:").append(getFeeAmount()).append(";");
		sb.append("feeReturnRate:").append(getFeeReturnRate()).append(";");
		sb.append("feeReturnAmount:").append(getFeeReturnAmount()).append(";");
		sb.append("calStartSeq:").append(getCalStartSeq()).append(";");
		sb.append("calEndSeq:").append(getCalEndSeq()).append(";");
		sb.append("teamMemberId:").append(getTeamMemberId()).append(";");
		sb.append("teamMemberStatus:").append(getTeamMemberStatus()).append(";");
		sb.append("createSeq:").append(getCreateSeq()).append(";");
		return sb.toString();
	}
}
