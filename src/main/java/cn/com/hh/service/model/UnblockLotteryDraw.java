package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public class UnblockLotteryDraw  implements Serializable {

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
     * 抽奖消耗的次数（交易赠送抽奖次数）
     */
	private Long lotteryTransCount;
	/**
     * 交易轮数
     */
	private Long transCount;
	/**
     * 抽奖剩余次数
     */
	private Long lotteryDrawCount;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private java.util.Date updateTime;
	
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
	* 抽奖消耗的次数（交易赠送抽奖次数）
	* @return Long
    */
	public Long getLotteryTransCount(){
		return lotteryTransCount;
	}
	/**
	* 抽奖消耗的次数（交易赠送抽奖次数）
	*/
	public void setLotteryTransCount(Long lotteryTransCount){
		this.lotteryTransCount = lotteryTransCount;
	}
	/**
	* 交易轮数
	* @return Long
    */
	public Long getTransCount(){
		return transCount;
	}
	/**
	* 交易轮数
	*/
	public void setTransCount(Long transCount){
		this.transCount = transCount;
	}
	/**
	* 抽奖剩余次数
	* @return Long
    */
	public Long getLotteryDrawCount(){
		return lotteryDrawCount;
	}
	/**
	* 抽奖剩余次数
	*/
	public void setLotteryDrawCount(Long lotteryDrawCount){
		this.lotteryDrawCount = lotteryDrawCount;
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
	* @return java.util.Date
    */
	public java.util.Date getUpdateTime(){
		return updateTime;
	}
	/**
	* 
	*/
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("lotteryTransCount:").append(getLotteryTransCount()).append(";");
		sb.append("transCount:").append(getTransCount()).append(";");
		sb.append("lotteryDrawCount:").append(getLotteryDrawCount()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		return sb.toString();
	}
}
