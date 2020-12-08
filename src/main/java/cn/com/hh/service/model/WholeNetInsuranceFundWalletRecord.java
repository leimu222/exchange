package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [whole服务实现]
 */
public class WholeNetInsuranceFundWalletRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 数量
     */
	private java.math.BigDecimal amount;
	/**
     * 币种
     */
	private String coin;
	/**
     * 来源 0-一等奖中奖进入保险基金 1-
     */
	private Boolean type;
	/**
     * 备注
     */
	private String remark;
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
	* 来源 0-一等奖中奖进入保险基金 1-
	* @return Boolean
    */
	public Boolean getType(){
		return type;
	}
	/**
	* 来源 0-一等奖中奖进入保险基金 1-
	*/
	public void setType(Boolean type){
		this.type = type;
	}
	/**
	* 备注
	* @return String
    */
	public String getRemark(){
		return remark;
	}
	/**
	* 备注
	*/
	public void setRemark(String remark){
		this.remark = remark;
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
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("coin:").append(getCoin()).append(";");
		sb.append("type:").append(getType()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		return sb.toString();
	}
}
