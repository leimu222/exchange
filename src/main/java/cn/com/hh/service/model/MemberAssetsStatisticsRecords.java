package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [member服务实现]
 */
public class MemberAssetsStatisticsRecords  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 用户资金统计记录表id
     */
	private Long id;
	/**
     * 会员id
     */
	private Long memberId;
	/**
     * 代理id
     */
	private Long proxyId;
	/**
     * 节点id
     */
	private Long nodeId;
	/**
     * 总入金
     */
	private java.math.BigDecimal totalDeposit;
	/**
     * 总出金
     */
	private java.math.BigDecimal totalWithdraw;
	/**
     * 净入金
     */
	private java.math.BigDecimal netDeposit;
	/**
     * 冻结保证金
     */
	private java.math.BigDecimal freezeMargin;
	/**
     * 可用资产
     */
	private java.math.BigDecimal assets;
	/**
     * 账号权益
     */
	private java.math.BigDecimal accountEquity;
	/**
     * 开仓(持仓)手续费
     */
	private java.math.BigDecimal handlingFee;
	/**
     * 持仓盈亏
     */
	private java.math.BigDecimal handlingProfit;
	/**
     * 持仓利息
     */
	private java.math.BigDecimal handlingInterest;
	/**
     * 平仓盈亏
     */
	private java.math.BigDecimal closeProfit;
	/**
     * 平仓手续费
     */
	private java.math.BigDecimal closeFee;
	/**
     * 净盈亏
     */
	private java.math.BigDecimal netProfit;
	/**
     * 风险率
     */
	private java.math.BigDecimal riskRate;
	/**
     * 平仓次数
     */
	private Integer closeNum;
	
	// setter and getter
	/**
	* 用户资金统计记录表id
	* @return Long
    */
	public Long getId(){
		return id;
	}
	/**
	* 用户资金统计记录表id
	*/
	public void setId(Long id){
		this.id = id;
	}
	/**
	* 会员id
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 会员id
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 代理id
	* @return Long
    */
	public Long getProxyId(){
		return proxyId;
	}
	/**
	* 代理id
	*/
	public void setProxyId(Long proxyId){
		this.proxyId = proxyId;
	}
	/**
	* 节点id
	* @return Long
    */
	public Long getNodeId(){
		return nodeId;
	}
	/**
	* 节点id
	*/
	public void setNodeId(Long nodeId){
		this.nodeId = nodeId;
	}
	/**
	* 总入金
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTotalDeposit(){
		return totalDeposit;
	}
	/**
	* 总入金
	*/
	public void setTotalDeposit(java.math.BigDecimal totalDeposit){
		this.totalDeposit = totalDeposit;
	}
	/**
	* 总出金
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTotalWithdraw(){
		return totalWithdraw;
	}
	/**
	* 总出金
	*/
	public void setTotalWithdraw(java.math.BigDecimal totalWithdraw){
		this.totalWithdraw = totalWithdraw;
	}
	/**
	* 净入金
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getNetDeposit(){
		return netDeposit;
	}
	/**
	* 净入金
	*/
	public void setNetDeposit(java.math.BigDecimal netDeposit){
		this.netDeposit = netDeposit;
	}
	/**
	* 冻结保证金
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFreezeMargin(){
		return freezeMargin;
	}
	/**
	* 冻结保证金
	*/
	public void setFreezeMargin(java.math.BigDecimal freezeMargin){
		this.freezeMargin = freezeMargin;
	}
	/**
	* 可用资产
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAssets(){
		return assets;
	}
	/**
	* 可用资产
	*/
	public void setAssets(java.math.BigDecimal assets){
		this.assets = assets;
	}
	/**
	* 账号权益
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAccountEquity(){
		return accountEquity;
	}
	/**
	* 账号权益
	*/
	public void setAccountEquity(java.math.BigDecimal accountEquity){
		this.accountEquity = accountEquity;
	}
	/**
	* 开仓(持仓)手续费
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getHandlingFee(){
		return handlingFee;
	}
	/**
	* 开仓(持仓)手续费
	*/
	public void setHandlingFee(java.math.BigDecimal handlingFee){
		this.handlingFee = handlingFee;
	}
	/**
	* 持仓盈亏
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getHandlingProfit(){
		return handlingProfit;
	}
	/**
	* 持仓盈亏
	*/
	public void setHandlingProfit(java.math.BigDecimal handlingProfit){
		this.handlingProfit = handlingProfit;
	}
	/**
	* 持仓利息
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getHandlingInterest(){
		return handlingInterest;
	}
	/**
	* 持仓利息
	*/
	public void setHandlingInterest(java.math.BigDecimal handlingInterest){
		this.handlingInterest = handlingInterest;
	}
	/**
	* 平仓盈亏
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getCloseProfit(){
		return closeProfit;
	}
	/**
	* 平仓盈亏
	*/
	public void setCloseProfit(java.math.BigDecimal closeProfit){
		this.closeProfit = closeProfit;
	}
	/**
	* 平仓手续费
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getCloseFee(){
		return closeFee;
	}
	/**
	* 平仓手续费
	*/
	public void setCloseFee(java.math.BigDecimal closeFee){
		this.closeFee = closeFee;
	}
	/**
	* 净盈亏
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getNetProfit(){
		return netProfit;
	}
	/**
	* 净盈亏
	*/
	public void setNetProfit(java.math.BigDecimal netProfit){
		this.netProfit = netProfit;
	}
	/**
	* 风险率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getRiskRate(){
		return riskRate;
	}
	/**
	* 风险率
	*/
	public void setRiskRate(java.math.BigDecimal riskRate){
		this.riskRate = riskRate;
	}
	/**
	* 平仓次数
	* @return Integer
    */
	public Integer getCloseNum(){
		return closeNum;
	}
	/**
	* 平仓次数
	*/
	public void setCloseNum(Integer closeNum){
		this.closeNum = closeNum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("proxyId:").append(getProxyId()).append(";");
		sb.append("nodeId:").append(getNodeId()).append(";");
		sb.append("totalDeposit:").append(getTotalDeposit()).append(";");
		sb.append("totalWithdraw:").append(getTotalWithdraw()).append(";");
		sb.append("netDeposit:").append(getNetDeposit()).append(";");
		sb.append("freezeMargin:").append(getFreezeMargin()).append(";");
		sb.append("assets:").append(getAssets()).append(";");
		sb.append("accountEquity:").append(getAccountEquity()).append(";");
		sb.append("handlingFee:").append(getHandlingFee()).append(";");
		sb.append("handlingProfit:").append(getHandlingProfit()).append(";");
		sb.append("handlingInterest:").append(getHandlingInterest()).append(";");
		sb.append("closeProfit:").append(getCloseProfit()).append(";");
		sb.append("closeFee:").append(getCloseFee()).append(";");
		sb.append("netProfit:").append(getNetProfit()).append(";");
		sb.append("riskRate:").append(getRiskRate()).append(";");
		sb.append("closeNum:").append(getCloseNum()).append(";");
		return sb.toString();
	}
}
