package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [vote服务实现]
 */
public class VoteDetail  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private java.math.BigDecimal amount;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private Long userId;
	/**
     * 
     */
	private Integer voteAmount;
	/**
     * 
     */
	private Long preCoinId;
	/**
     * 
     */
	private Long voteId;
	
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
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 
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
	* @return Long
    */
	public Long getUserId(){
		return userId;
	}
	/**
	* 
	*/
	public void setUserId(Long userId){
		this.userId = userId;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getVoteAmount(){
		return voteAmount;
	}
	/**
	* 
	*/
	public void setVoteAmount(Integer voteAmount){
		this.voteAmount = voteAmount;
	}
	/**
	* 
	* @return Long
    */
	public Long getPreCoinId(){
		return preCoinId;
	}
	/**
	* 
	*/
	public void setPreCoinId(Long preCoinId){
		this.preCoinId = preCoinId;
	}
	/**
	* 
	* @return Long
    */
	public Long getVoteId(){
		return voteId;
	}
	/**
	* 
	*/
	public void setVoteId(Long voteId){
		this.voteId = voteId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("userId:").append(getUserId()).append(";");
		sb.append("voteAmount:").append(getVoteAmount()).append(";");
		sb.append("preCoinId:").append(getPreCoinId()).append(";");
		sb.append("voteId:").append(getVoteId()).append(";");
		return sb.toString();
	}
}
