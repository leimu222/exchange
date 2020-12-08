package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public class MemberTransaction  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String address;
	/**
     * 
     */
	private Long airdropId;
	/**
     * 充币金额
     */
	private java.math.BigDecimal amount;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private java.math.BigDecimal fee;
	/**
     * 
     */
	private Integer flag;
	/**
     * 
     */
	private Long memberId;
	/**
     * 
     */
	private String symbol;
	/**
     * 
     */
	private Integer type;
	/**
     * 时间戳
     */
	private Long sequence;
	/**
     * 购买抽奖次数
     */
	private Long lotteryCount;
	/**
     * 变动后余额
     */
	private java.math.BigDecimal afterBalance;
	/**
     * 收益来源用户id
     */
	private Long fromMemberId;
	
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
	* @return String
    */
	public String getAddress(){
		return address;
	}
	/**
	* 
	*/
	public void setAddress(String address){
		this.address = address;
	}
	/**
	* 
	* @return Long
    */
	public Long getAirdropId(){
		return airdropId;
	}
	/**
	* 
	*/
	public void setAirdropId(Long airdropId){
		this.airdropId = airdropId;
	}
	/**
	* 充币金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 充币金额
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
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
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFee(){
		return fee;
	}
	/**
	* 
	*/
	public void setFee(java.math.BigDecimal fee){
		this.fee = fee;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getFlag(){
		return flag;
	}
	/**
	* 
	*/
	public void setFlag(Integer flag){
		this.flag = flag;
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
	* 
	* @return String
    */
	public String getSymbol(){
		return symbol;
	}
	/**
	* 
	*/
	public void setSymbol(String symbol){
		this.symbol = symbol;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getType(){
		return type;
	}
	/**
	* 
	*/
	public void setType(Integer type){
		this.type = type;
	}
	/**
	* 时间戳
	* @return Long
    */
	public Long getSequence(){
		return sequence;
	}
	/**
	* 时间戳
	*/
	public void setSequence(Long sequence){
		this.sequence = sequence;
	}
	/**
	* 购买抽奖次数
	* @return Long
    */
	public Long getLotteryCount(){
		return lotteryCount;
	}
	/**
	* 购买抽奖次数
	*/
	public void setLotteryCount(Long lotteryCount){
		this.lotteryCount = lotteryCount;
	}
	/**
	* 变动后余额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAfterBalance(){
		return afterBalance;
	}
	/**
	* 变动后余额
	*/
	public void setAfterBalance(java.math.BigDecimal afterBalance){
		this.afterBalance = afterBalance;
	}
	/**
	* 收益来源用户id
	* @return Long
    */
	public Long getFromMemberId(){
		return fromMemberId;
	}
	/**
	* 收益来源用户id
	*/
	public void setFromMemberId(Long fromMemberId){
		this.fromMemberId = fromMemberId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("address:").append(getAddress()).append(";");
		sb.append("airdropId:").append(getAirdropId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("fee:").append(getFee()).append(";");
		sb.append("flag:").append(getFlag()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("symbol:").append(getSymbol()).append(";");
		sb.append("type:").append(getType()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		sb.append("lotteryCount:").append(getLotteryCount()).append(";");
		sb.append("afterBalance:").append(getAfterBalance()).append(";");
		sb.append("fromMemberId:").append(getFromMemberId()).append(";");
		return sb.toString();
	}
}
