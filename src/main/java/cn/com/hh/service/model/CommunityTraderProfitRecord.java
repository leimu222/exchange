package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [community服务实现]
 */
public class CommunityTraderProfitRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 关联会员编码
     */
	private Long memberId;
	/**
     * 币种
     */
	private String coinId;
	/**
     * 比例
     */
	private java.math.BigDecimal rate;
	/**
     * 数量
     */
	private java.math.BigDecimal amount;
	/**
     * 合约订单来源
     */
	private Long fromContractOrderId;
	/**
     * 跟单者memberId
     */
	private Long fromMemberId;
	/**
     * 收益 所属日期
     */
	private String belongDay;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 时间戳
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
	* 关联会员编码
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 关联会员编码
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 币种
	* @return String
    */
	public String getCoinId(){
		return coinId;
	}
	/**
	* 币种
	*/
	public void setCoinId(String coinId){
		this.coinId = coinId;
	}
	/**
	* 比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getRate(){
		return rate;
	}
	/**
	* 比例
	*/
	public void setRate(java.math.BigDecimal rate){
		this.rate = rate;
	}
	/**
	* 数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 数量
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 合约订单来源
	* @return Long
    */
	public Long getFromContractOrderId(){
		return fromContractOrderId;
	}
	/**
	* 合约订单来源
	*/
	public void setFromContractOrderId(Long fromContractOrderId){
		this.fromContractOrderId = fromContractOrderId;
	}
	/**
	* 跟单者memberId
	* @return Long
    */
	public Long getFromMemberId(){
		return fromMemberId;
	}
	/**
	* 跟单者memberId
	*/
	public void setFromMemberId(Long fromMemberId){
		this.fromMemberId = fromMemberId;
	}
	/**
	* 收益 所属日期
	* @return String
    */
	public String getBelongDay(){
		return belongDay;
	}
	/**
	* 收益 所属日期
	*/
	public void setBelongDay(String belongDay){
		this.belongDay = belongDay;
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
		sb.append("coinId:").append(getCoinId()).append(";");
		sb.append("rate:").append(getRate()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("fromContractOrderId:").append(getFromContractOrderId()).append(";");
		sb.append("fromMemberId:").append(getFromMemberId()).append(";");
		sb.append("belongDay:").append(getBelongDay()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
