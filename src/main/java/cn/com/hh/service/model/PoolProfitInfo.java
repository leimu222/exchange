package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [pool服务实现]
 */
public class PoolProfitInfo  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 用户id
     */
	private Long memberId;
	/**
     * 收益
     */
	private java.math.BigDecimal amount;
	/**
     * 币种名称，默认QTQ
     */
	private String coinName;
	/**
     * 时间戳
     */
	private Long sequence;
	/**
     * 收益时间
     */
	private java.util.Date time;
	/**
     * 48-算力收益
     */
	private Integer type;
	
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
	* 用户id
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 用户id
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 收益
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 收益
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 币种名称，默认QTQ
	* @return String
    */
	public String getCoinName(){
		return coinName;
	}
	/**
	* 币种名称，默认QTQ
	*/
	public void setCoinName(String coinName){
		this.coinName = coinName;
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
	* 收益时间
	* @return java.util.Date
    */
	public java.util.Date getTime(){
		return time;
	}
	/**
	* 收益时间
	*/
	public void setTime(java.util.Date time){
		this.time = time;
	}
	/**
	* 48-算力收益
	* @return Integer
    */
	public Integer getType(){
		return type;
	}
	/**
	* 48-算力收益
	*/
	public void setType(Integer type){
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("coinName:").append(getCoinName()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		sb.append("time:").append(getTime()).append(";");
		sb.append("type:").append(getType()).append(";");
		return sb.toString();
	}
}
