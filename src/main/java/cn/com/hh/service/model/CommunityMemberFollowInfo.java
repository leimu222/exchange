package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [community服务实现]
 */
public class CommunityMemberFollowInfo  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private Long memberId;
	/**
     * 跟随的会员主键
     */
	private Long leaderMemberId;
	/**
     * 币种
     */
	private String coinId;
	/**
     * 跟单方式 0-固定金额跟单 1-比例跟单
     */
	private Boolean type;
	/**
     * 当type=0时，amount表示跟单金额；当type=1时，amount表示单位基准。
     */
	private java.math.BigDecimal amount;
	/**
     * 单日跟随最大本金
     */
	private java.math.BigDecimal dayMaxAmount;
	/**
     * 合约最大持仓金额
     */
	private java.math.BigDecimal holdingMaxAmount;
	/**
     * 订单止损比例
     */
	private java.math.BigDecimal stopLossRate;
	/**
     * 0-跟单中 1-关闭跟单 2-取消跟随
     */
	private Boolean status;
	/**
     * 累计跟单金额
     */
	private java.math.BigDecimal totalAmount;
	/**
     * 累计收益
     */
	private java.math.BigDecimal totalProfit;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private Long sequence;
	/**
     * 乐观锁版本号
     */
	private Long version;
	
	// setter and getter
	/**
	* 
	* @return Long
    */
	public Long getId(){
		return id;
	}
	/**
	* 
	*/
	public void setId(Long id){
		this.id = id;
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
	* 跟随的会员主键
	* @return Long
    */
	public Long getLeaderMemberId(){
		return leaderMemberId;
	}
	/**
	* 跟随的会员主键
	*/
	public void setLeaderMemberId(Long leaderMemberId){
		this.leaderMemberId = leaderMemberId;
	}
	/**
	* 币种
	* @return String
    */
	public String getCoinId(){
		return coinId;
	}
	/**
	* 币种
	*/
	public void setCoinId(String coinId){
		this.coinId = coinId;
	}
	/**
	* 跟单方式 0-固定金额跟单 1-比例跟单
	* @return Boolean
    */
	public Boolean getType(){
		return type;
	}
	/**
	* 跟单方式 0-固定金额跟单 1-比例跟单
	*/
	public void setType(Boolean type){
		this.type = type;
	}
	/**
	* 当type=0时，amount表示跟单金额；当type=1时，amount表示单位基准。
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 当type=0时，amount表示跟单金额；当type=1时，amount表示单位基准。
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 单日跟随最大本金
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getDayMaxAmount(){
		return dayMaxAmount;
	}
	/**
	* 单日跟随最大本金
	*/
	public void setDayMaxAmount(java.math.BigDecimal dayMaxAmount){
		this.dayMaxAmount = dayMaxAmount;
	}
	/**
	* 合约最大持仓金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getHoldingMaxAmount(){
		return holdingMaxAmount;
	}
	/**
	* 合约最大持仓金额
	*/
	public void setHoldingMaxAmount(java.math.BigDecimal holdingMaxAmount){
		this.holdingMaxAmount = holdingMaxAmount;
	}
	/**
	* 订单止损比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getStopLossRate(){
		return stopLossRate;
	}
	/**
	* 订单止损比例
	*/
	public void setStopLossRate(java.math.BigDecimal stopLossRate){
		this.stopLossRate = stopLossRate;
	}
	/**
	* 0-跟单中 1-关闭跟单 2-取消跟随
	* @return Boolean
    */
	public Boolean getStatus(){
		return status;
	}
	/**
	* 0-跟单中 1-关闭跟单 2-取消跟随
	*/
	public void setStatus(Boolean status){
		this.status = status;
	}
	/**
	* 累计跟单金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTotalAmount(){
		return totalAmount;
	}
	/**
	* 累计跟单金额
	*/
	public void setTotalAmount(java.math.BigDecimal totalAmount){
		this.totalAmount = totalAmount;
	}
	/**
	* 累计收益
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTotalProfit(){
		return totalProfit;
	}
	/**
	* 累计收益
	*/
	public void setTotalProfit(java.math.BigDecimal totalProfit){
		this.totalProfit = totalProfit;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("leaderMemberId:").append(getLeaderMemberId()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		sb.append("type:").append(getType()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("dayMaxAmount:").append(getDayMaxAmount()).append(";");
		sb.append("holdingMaxAmount:").append(getHoldingMaxAmount()).append(";");
		sb.append("stopLossRate:").append(getStopLossRate()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("totalAmount:").append(getTotalAmount()).append(";");
		sb.append("totalProfit:").append(getTotalProfit()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		return sb.toString();
	}
}
