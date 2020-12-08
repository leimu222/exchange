package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public class MemberConvertTransaction  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Integer id;
	/**
     * 用户id
     */
	private Long memberId;
	/**
     * 被兑换的币种
     */
	private String baseCoin;
	/**
     * 兑换的币种
     */
	private String convertCoin;
	/**
     * 被兑换的币种数量
     */
	private Double amount;
	/**
     * 兑换的数量
     */
	private Double convertAmount;
	/**
     * 手续费，单位是被兑换的币
     */
	private Double feeAmount;
	/**
     * 兑换时间
     */
	private java.util.Date createTime;
	/**
     * 兑换时汇率
     */
	private Double rate;
	/**
     * 
     */
	private Long sequence;
	
	// setter and getter
	/**
	* 
	* @return Integer
    */
	public Integer getId(){
		return id;
	}
	/**
	* 
	*/
	public void setId(Integer id){
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
	* 被兑换的币种
	* @return String
    */
	public String getBaseCoin(){
		return baseCoin;
	}
	/**
	* 被兑换的币种
	*/
	public void setBaseCoin(String baseCoin){
		this.baseCoin = baseCoin;
	}
	/**
	* 兑换的币种
	* @return String
    */
	public String getConvertCoin(){
		return convertCoin;
	}
	/**
	* 兑换的币种
	*/
	public void setConvertCoin(String convertCoin){
		this.convertCoin = convertCoin;
	}
	/**
	* 被兑换的币种数量
	* @return Double
    */
	public Double getAmount(){
		return amount;
	}
	/**
	* 被兑换的币种数量
	*/
	public void setAmount(Double amount){
		this.amount = amount;
	}
	/**
	* 兑换的数量
	* @return Double
    */
	public Double getConvertAmount(){
		return convertAmount;
	}
	/**
	* 兑换的数量
	*/
	public void setConvertAmount(Double convertAmount){
		this.convertAmount = convertAmount;
	}
	/**
	* 手续费，单位是被兑换的币
	* @return Double
    */
	public Double getFeeAmount(){
		return feeAmount;
	}
	/**
	* 手续费，单位是被兑换的币
	*/
	public void setFeeAmount(Double feeAmount){
		this.feeAmount = feeAmount;
	}
	/**
	* 兑换时间
	* @return java.util.Date
    */
	public java.util.Date getCreateTime(){
		return createTime;
	}
	/**
	* 兑换时间
	*/
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	/**
	* 兑换时汇率
	* @return Double
    */
	public Double getRate(){
		return rate;
	}
	/**
	* 兑换时汇率
	*/
	public void setRate(Double rate){
		this.rate = rate;
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
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("baseCoin:").append(getBaseCoin()).append(";");
		sb.append("convertCoin:").append(getConvertCoin()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("convertAmount:").append(getConvertAmount()).append(";");
		sb.append("feeAmount:").append(getFeeAmount()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("rate:").append(getRate()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
