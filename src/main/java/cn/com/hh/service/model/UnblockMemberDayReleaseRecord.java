package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public class UnblockMemberDayReleaseRecord  implements Serializable {

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
     * 关联解锁记录主键
     */
	private Long unlockId;
	/**
     * 最终释放的币种数量
     */
	private java.math.BigDecimal amount;
	/**
     * 释放前币种可用余额数量
     */
	private java.math.BigDecimal beforeBalance;
	/**
     * 释放后币种可用余额数量
     */
	private java.math.BigDecimal afterBalance;
	/**
     * 创建时间
     */
	private java.util.Date createTime;
	/**
     * 创建时间戳
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
	* 关联解锁记录主键
	* @return Long
    */
	public Long getUnlockId(){
		return unlockId;
	}
	/**
	* 关联解锁记录主键
	*/
	public void setUnlockId(Long unlockId){
		this.unlockId = unlockId;
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
	* 释放前币种可用余额数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBeforeBalance(){
		return beforeBalance;
	}
	/**
	* 释放前币种可用余额数量
	*/
	public void setBeforeBalance(java.math.BigDecimal beforeBalance){
		this.beforeBalance = beforeBalance;
	}
	/**
	* 释放后币种可用余额数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAfterBalance(){
		return afterBalance;
	}
	/**
	* 释放后币种可用余额数量
	*/
	public void setAfterBalance(java.math.BigDecimal afterBalance){
		this.afterBalance = afterBalance;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("coin:").append(getCoin()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("unlockId:").append(getUnlockId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("beforeBalance:").append(getBeforeBalance()).append(";");
		sb.append("afterBalance:").append(getAfterBalance()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
