package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [coin服务实现]
 */
public class CoinCollectLog  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Integer id;
	/**
     * 币种名称，关联coin表name
     */
	private String coinName;
	/**
     * 用户id
     */
	private Long memberId;
	/**
     * 被归集的地址
     */
	private String address;
	/**
     * 归集地址，一般为冷钱包地址
     */
	private String toAddress;
	/**
     * 归集数量
     */
	private Double amount;
	/**
     * 交易hash
     */
	private String txHash;
	/**
     * 归集时间
     */
	private java.util.Date time;
	
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
	* 币种名称，关联coin表name
	* @return String
    */
	public String getCoinName(){
		return coinName;
	}
	/**
	* 币种名称，关联coin表name
	*/
	public void setCoinName(String coinName){
		this.coinName = coinName;
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
	* 被归集的地址
	* @return String
    */
	public String getAddress(){
		return address;
	}
	/**
	* 被归集的地址
	*/
	public void setAddress(String address){
		this.address = address;
	}
	/**
	* 归集地址，一般为冷钱包地址
	* @return String
    */
	public String getToAddress(){
		return toAddress;
	}
	/**
	* 归集地址，一般为冷钱包地址
	*/
	public void setToAddress(String toAddress){
		this.toAddress = toAddress;
	}
	/**
	* 归集数量
	* @return Double
    */
	public Double getAmount(){
		return amount;
	}
	/**
	* 归集数量
	*/
	public void setAmount(Double amount){
		this.amount = amount;
	}
	/**
	* 交易hash
	* @return String
    */
	public String getTxHash(){
		return txHash;
	}
	/**
	* 交易hash
	*/
	public void setTxHash(String txHash){
		this.txHash = txHash;
	}
	/**
	* 归集时间
	* @return java.util.Date
    */
	public java.util.Date getTime(){
		return time;
	}
	/**
	* 归集时间
	*/
	public void setTime(java.util.Date time){
		this.time = time;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("coinName:").append(getCoinName()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("address:").append(getAddress()).append(";");
		sb.append("toAddress:").append(getToAddress()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("txHash:").append(getTxHash()).append(";");
		sb.append("time:").append(getTime()).append(";");
		return sb.toString();
	}
}
