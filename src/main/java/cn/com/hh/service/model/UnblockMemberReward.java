package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public class UnblockMemberReward  implements Serializable {

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
     * 来源用户ID
     */
	private Long originMemberId;
	/**
     * 代数
     */
	private Integer generation;
	/**
     * 币种（关联coin表）
     */
	private String coin;
	/**
     * 奖金金额
     */
	private java.math.BigDecimal amount;
	/**
     * 变动后用户余额
     */
	private java.math.BigDecimal afterBalance;
	/**
     * 创建时间
     */
	private java.util.Date createTime;
	/**
     * 时间戳
     */
	private Long sequence;
	
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
	* 来源用户ID
	* @return Long
    */
	public Long getOriginMemberId(){
		return originMemberId;
	}
	/**
	* 来源用户ID
	*/
	public void setOriginMemberId(Long originMemberId){
		this.originMemberId = originMemberId;
	}
	/**
	* 代数
	* @return Integer
    */
	public Integer getGeneration(){
		return generation;
	}
	/**
	* 代数
	*/
	public void setGeneration(Integer generation){
		this.generation = generation;
	}
	/**
	* 币种（关联coin表）
	* @return String
    */
	public String getCoin(){
		return coin;
	}
	/**
	* 币种（关联coin表）
	*/
	public void setCoin(String coin){
		this.coin = coin;
	}
	/**
	* 奖金金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 奖金金额
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 变动后用户余额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAfterBalance(){
		return afterBalance;
	}
	/**
	* 变动后用户余额
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("originMemberId:").append(getOriginMemberId()).append(";");
		sb.append("generation:").append(getGeneration()).append(";");
		sb.append("coin:").append(getCoin()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("afterBalance:").append(getAfterBalance()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
