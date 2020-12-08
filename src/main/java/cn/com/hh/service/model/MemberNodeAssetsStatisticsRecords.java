package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public class MemberNodeAssetsStatisticsRecords  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 用户资金统计记录表id
     */
	private Long id;
	/**
     * 节点id
     */
	private Long memberId;
	/**
     * 节点名称
     */
	private String username;
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
     * 节点账号权益
     */
	private java.math.BigDecimal nodeAccountEquity;
	/**
     * 账号权益
     */
	private java.math.BigDecimal accountEquity;
	/**
     * 节点占用保证金
     */
	private java.math.BigDecimal nodeMargin;
	/**
     * 净盈亏
     */
	private java.math.BigDecimal netProfit;
	
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
	* 节点id
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 节点id
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 节点名称
	* @return String
    */
	public String getUsername(){
		return username;
	}
	/**
	* 节点名称
	*/
	public void setUsername(String username){
		this.username = username;
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
	* 节点账号权益
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getNodeAccountEquity(){
		return nodeAccountEquity;
	}
	/**
	* 节点账号权益
	*/
	public void setNodeAccountEquity(java.math.BigDecimal nodeAccountEquity){
		this.nodeAccountEquity = nodeAccountEquity;
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
	* 节点占用保证金
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getNodeMargin(){
		return nodeMargin;
	}
	/**
	* 节点占用保证金
	*/
	public void setNodeMargin(java.math.BigDecimal nodeMargin){
		this.nodeMargin = nodeMargin;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("username:").append(getUsername()).append(";");
		sb.append("totalDeposit:").append(getTotalDeposit()).append(";");
		sb.append("totalWithdraw:").append(getTotalWithdraw()).append(";");
		sb.append("netDeposit:").append(getNetDeposit()).append(";");
		sb.append("nodeAccountEquity:").append(getNodeAccountEquity()).append(";");
		sb.append("accountEquity:").append(getAccountEquity()).append(";");
		sb.append("nodeMargin:").append(getNodeMargin()).append(";");
		sb.append("netProfit:").append(getNetProfit()).append(";");
		return sb.toString();
	}
}
