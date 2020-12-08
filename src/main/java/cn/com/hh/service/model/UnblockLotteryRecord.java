package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public class UnblockLotteryRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 会员编码
     */
	private Long memberId;
	/**
     * 关联抽奖配置主键
     */
	private Long lotteryId;
	/**
     * 是否中奖 0 否 1 是
     */
	private String lotteryLevel;
	/**
     * 中奖说明
     */
	private String lotteryInstruction;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private Long sequence;
	/**
     * 是否中奖 0 否 1 是
     */
	private Integer isWinne;
	/**
     * 币种
     */
	private String coin;
	/**
     * 中奖金额
     */
	private java.math.BigDecimal amount;
	
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
	* 关联抽奖配置主键
	* @return Long
    */
	public Long getLotteryId(){
		return lotteryId;
	}
	/**
	* 关联抽奖配置主键
	*/
	public void setLotteryId(Long lotteryId){
		this.lotteryId = lotteryId;
	}
	/**
	* 是否中奖 0 否 1 是
	* @return String
    */
	public String getLotteryLevel(){
		return lotteryLevel;
	}
	/**
	* 是否中奖 0 否 1 是
	*/
	public void setLotteryLevel(String lotteryLevel){
		this.lotteryLevel = lotteryLevel;
	}
	/**
	* 中奖说明
	* @return String
    */
	public String getLotteryInstruction(){
		return lotteryInstruction;
	}
	/**
	* 中奖说明
	*/
	public void setLotteryInstruction(String lotteryInstruction){
		this.lotteryInstruction = lotteryInstruction;
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
	* 是否中奖 0 否 1 是
	* @return Integer
    */
	public Integer getIsWinne(){
		return isWinne;
	}
	/**
	* 是否中奖 0 否 1 是
	*/
	public void setIsWinne(Integer isWinne){
		this.isWinne = isWinne;
	}
	/**
	* 币种
	* @return String
    */
	public String getCoin(){
		return coin;
	}
	/**
	* 币种
	*/
	public void setCoin(String coin){
		this.coin = coin;
	}
	/**
	* 中奖金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 中奖金额
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("lotteryId:").append(getLotteryId()).append(";");
		sb.append("lotteryLevel:").append(getLotteryLevel()).append(";");
		sb.append("lotteryInstruction:").append(getLotteryInstruction()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		sb.append("isWinne:").append(getIsWinne()).append(";");
		sb.append("coin:").append(getCoin()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		return sb.toString();
	}
}
