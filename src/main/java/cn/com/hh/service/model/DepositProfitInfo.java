package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [deposit服务实现]
 */
public class DepositProfitInfo  implements Serializable {

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
     * 理财记录id
     */
	private Integer depositId;
	/**
     * 收益
     */
	private java.math.BigDecimal amount;
	/**
     * 资金账户收益
     */
	private java.math.BigDecimal fundAmount;
	/**
     * 理财账户收益
     */
	private java.math.BigDecimal depositAmount;
	/**
     * 币种名称，默认USDT
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
	* 理财记录id
	* @return Integer
    */
	public Integer getDepositId(){
		return depositId;
	}
	/**
	* 理财记录id
	*/
	public void setDepositId(Integer depositId){
		this.depositId = depositId;
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
	* 资金账户收益
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFundAmount(){
		return fundAmount;
	}
	/**
	* 资金账户收益
	*/
	public void setFundAmount(java.math.BigDecimal fundAmount){
		this.fundAmount = fundAmount;
	}
	/**
	* 理财账户收益
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getDepositAmount(){
		return depositAmount;
	}
	/**
	* 理财账户收益
	*/
	public void setDepositAmount(java.math.BigDecimal depositAmount){
		this.depositAmount = depositAmount;
	}
	/**
	* 币种名称，默认USDT
	* @return String
    */
	public String getCoinName(){
		return coinName;
	}
	/**
	* 币种名称，默认USDT
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("depositId:").append(getDepositId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("fundAmount:").append(getFundAmount()).append(";");
		sb.append("depositAmount:").append(getDepositAmount()).append(";");
		sb.append("coinName:").append(getCoinName()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		sb.append("time:").append(getTime()).append(";");
		return sb.toString();
	}
}
