package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public class UnblockMemberDayUnlockRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 应释放的币种
     */
	private String coin;
	/**
     * 会员编码
     */
	private Long memberId;
	/**
     * 交易的币种总量
     */
	private java.math.BigDecimal tradedAmount;
	/**
     * 释放比例
     */
	private java.math.BigDecimal singleRoundReleaseRate;
	/**
     * 锁仓总量
     */
	private java.math.BigDecimal blockBalance;
	/**
     * 锁仓总量最大释放限制比例
     */
	private java.math.BigDecimal dayMaxReleaseRate;
	/**
     * 单日最大释放数量限制
     */
	private java.math.BigDecimal dayMaxReleaseAmount;
	/**
     * 最终释放的币种数量
     */
	private java.math.BigDecimal amount;
	/**
     * 释放状态  0-未释放 1-已释放
     */
	private Boolean status;
	/**
     * 创建时间
     */
	private java.util.Date createTime;
	/**
     * 释放时间
     */
	private java.util.Date releaseTime;
	/**
     * 
     */
	private Long sequence;
	
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
	* 应释放的币种
	* @return String
    */
	public String getCoin(){
		return coin;
	}
	/**
	* 应释放的币种
	*/
	public void setCoin(String coin){
		this.coin = coin;
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
	* 交易的币种总量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTradedAmount(){
		return tradedAmount;
	}
	/**
	* 交易的币种总量
	*/
	public void setTradedAmount(java.math.BigDecimal tradedAmount){
		this.tradedAmount = tradedAmount;
	}
	/**
	* 释放比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getSingleRoundReleaseRate(){
		return singleRoundReleaseRate;
	}
	/**
	* 释放比例
	*/
	public void setSingleRoundReleaseRate(java.math.BigDecimal singleRoundReleaseRate){
		this.singleRoundReleaseRate = singleRoundReleaseRate;
	}
	/**
	* 锁仓总量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBlockBalance(){
		return blockBalance;
	}
	/**
	* 锁仓总量
	*/
	public void setBlockBalance(java.math.BigDecimal blockBalance){
		this.blockBalance = blockBalance;
	}
	/**
	* 锁仓总量最大释放限制比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getDayMaxReleaseRate(){
		return dayMaxReleaseRate;
	}
	/**
	* 锁仓总量最大释放限制比例
	*/
	public void setDayMaxReleaseRate(java.math.BigDecimal dayMaxReleaseRate){
		this.dayMaxReleaseRate = dayMaxReleaseRate;
	}
	/**
	* 单日最大释放数量限制
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getDayMaxReleaseAmount(){
		return dayMaxReleaseAmount;
	}
	/**
	* 单日最大释放数量限制
	*/
	public void setDayMaxReleaseAmount(java.math.BigDecimal dayMaxReleaseAmount){
		this.dayMaxReleaseAmount = dayMaxReleaseAmount;
	}
	/**
	* 最终释放的币种数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 最终释放的币种数量
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 释放状态  0-未释放 1-已释放
	* @return Boolean
    */
	public Boolean getStatus(){
		return status;
	}
	/**
	* 释放状态  0-未释放 1-已释放
	*/
	public void setStatus(Boolean status){
		this.status = status;
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
	* 释放时间
	* @return java.util.Date
    */
	public java.util.Date getReleaseTime(){
		return releaseTime;
	}
	/**
	* 释放时间
	*/
	public void setReleaseTime(java.util.Date releaseTime){
		this.releaseTime = releaseTime;
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
		sb.append("id:").append(getId()).append(";");
		sb.append("coin:").append(getCoin()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("tradedAmount:").append(getTradedAmount()).append(";");
		sb.append("singleRoundReleaseRate:").append(getSingleRoundReleaseRate()).append(";");
		sb.append("blockBalance:").append(getBlockBalance()).append(";");
		sb.append("dayMaxReleaseRate:").append(getDayMaxReleaseRate()).append(";");
		sb.append("dayMaxReleaseAmount:").append(getDayMaxReleaseAmount()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("releaseTime:").append(getReleaseTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
