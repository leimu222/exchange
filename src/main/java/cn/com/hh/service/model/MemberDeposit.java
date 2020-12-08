package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public class MemberDeposit  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String address;
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
	private Long memberId;
	/**
     * 
     */
	private String txid;
	/**
     * 
     */
	private String unit;
	/**
     * 0未归集，1已归集
     */
	private Integer collectType;
	/**
     * 0-未链上转账,1-已链上转账
     */
	private Integer transfer;
	
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
	* @return String
    */
	public String getAddress(){
		return address;
	}
	/**
	* 
	*/
	public void setAddress(String address){
		this.address = address;
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
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 
	* @return String
    */
	public String getTxid(){
		return txid;
	}
	/**
	* 
	*/
	public void setTxid(String txid){
		this.txid = txid;
	}
	/**
	* 
	* @return String
    */
	public String getUnit(){
		return unit;
	}
	/**
	* 
	*/
	public void setUnit(String unit){
		this.unit = unit;
	}
	/**
	* 0未归集，1已归集
	* @return Integer
    */
	public Integer getCollectType(){
		return collectType;
	}
	/**
	* 0未归集，1已归集
	*/
	public void setCollectType(Integer collectType){
		this.collectType = collectType;
	}
	/**
	* 0-未链上转账,1-已链上转账
	* @return Integer
    */
	public Integer getTransfer(){
		return transfer;
	}
	/**
	* 0-未链上转账,1-已链上转账
	*/
	public void setTransfer(Integer transfer){
		this.transfer = transfer;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("address:").append(getAddress()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("txid:").append(getTxid()).append(";");
		sb.append("unit:").append(getUnit()).append(";");
		sb.append("collectType:").append(getCollectType()).append(";");
		sb.append("transfer:").append(getTransfer()).append(";");
		return sb.toString();
	}
}
