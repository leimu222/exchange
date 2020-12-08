package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [panic服务实现]
 */
public class PanicBuyingRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 购买金额
     */
	private String amount;
	/**
     * 抢购 id
     */
	private Long panicBuyingId;
	/**
     * 期数
     */
	private String no;
	/**
     * 单价
     */
	private String price;
	/**
     * 购买数量
     */
	private String num;
	/**
     * 数量单位
     */
	private String numUnit;
	/**
     * 购买时间
     */
	private java.util.Date purchaseTime;
	/**
     * 币种
     */
	private String coinUnit;
	/**
     * 付款地址
     */
	private String payAddress;
	/**
     * 收款地址
     */
	private String receiveAddress;
	/**
     * 0-支付失败,1-支付中,2-支付完成
     */
	private Integer payStatus;
	/**
     * 支付方式:0-ETH,1-USDT
     */
	private Integer payMethod;
	/**
     * 
     */
	private String txHash;
	/**
     * 
     */
	private Long updateSeq;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private java.util.Date timeOut;
	
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
	* 购买金额
	* @return String
    */
	public String getAmount(){
		return amount;
	}
	/**
	* 购买金额
	*/
	public void setAmount(String amount){
		this.amount = amount;
	}
	/**
	* 抢购 id
	* @return Long
    */
	public Long getPanicBuyingId(){
		return panicBuyingId;
	}
	/**
	* 抢购 id
	*/
	public void setPanicBuyingId(Long panicBuyingId){
		this.panicBuyingId = panicBuyingId;
	}
	/**
	* 期数
	* @return String
    */
	public String getNo(){
		return no;
	}
	/**
	* 期数
	*/
	public void setNo(String no){
		this.no = no;
	}
	/**
	* 单价
	* @return String
    */
	public String getPrice(){
		return price;
	}
	/**
	* 单价
	*/
	public void setPrice(String price){
		this.price = price;
	}
	/**
	* 购买数量
	* @return String
    */
	public String getNum(){
		return num;
	}
	/**
	* 购买数量
	*/
	public void setNum(String num){
		this.num = num;
	}
	/**
	* 数量单位
	* @return String
    */
	public String getNumUnit(){
		return numUnit;
	}
	/**
	* 数量单位
	*/
	public void setNumUnit(String numUnit){
		this.numUnit = numUnit;
	}
	/**
	* 购买时间
	* @return java.util.Date
    */
	public java.util.Date getPurchaseTime(){
		return purchaseTime;
	}
	/**
	* 购买时间
	*/
	public void setPurchaseTime(java.util.Date purchaseTime){
		this.purchaseTime = purchaseTime;
	}
	/**
	* 币种
	* @return String
    */
	public String getCoinUnit(){
		return coinUnit;
	}
	/**
	* 币种
	*/
	public void setCoinUnit(String coinUnit){
		this.coinUnit = coinUnit;
	}
	/**
	* 付款地址
	* @return String
    */
	public String getPayAddress(){
		return payAddress;
	}
	/**
	* 付款地址
	*/
	public void setPayAddress(String payAddress){
		this.payAddress = payAddress;
	}
	/**
	* 收款地址
	* @return String
    */
	public String getReceiveAddress(){
		return receiveAddress;
	}
	/**
	* 收款地址
	*/
	public void setReceiveAddress(String receiveAddress){
		this.receiveAddress = receiveAddress;
	}
	/**
	* 0-支付失败,1-支付中,2-支付完成
	* @return Integer
    */
	public Integer getPayStatus(){
		return payStatus;
	}
	/**
	* 0-支付失败,1-支付中,2-支付完成
	*/
	public void setPayStatus(Integer payStatus){
		this.payStatus = payStatus;
	}
	/**
	* 支付方式:0-ETH,1-USDT
	* @return Integer
    */
	public Integer getPayMethod(){
		return payMethod;
	}
	/**
	* 支付方式:0-ETH,1-USDT
	*/
	public void setPayMethod(Integer payMethod){
		this.payMethod = payMethod;
	}
	/**
	* 
	* @return String
    */
	public String getTxHash(){
		return txHash;
	}
	/**
	* 
	*/
	public void setTxHash(String txHash){
		this.txHash = txHash;
	}
	/**
	* 
	* @return Long
    */
	public Long getUpdateSeq(){
		return updateSeq;
	}
	/**
	* 
	*/
	public void setUpdateSeq(Long updateSeq){
		this.updateSeq = updateSeq;
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
	* @return java.util.Date
    */
	public java.util.Date getTimeOut(){
		return timeOut;
	}
	/**
	* 
	*/
	public void setTimeOut(java.util.Date timeOut){
		this.timeOut = timeOut;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("panicBuyingId:").append(getPanicBuyingId()).append(";");
		sb.append("no:").append(getNo()).append(";");
		sb.append("price:").append(getPrice()).append(";");
		sb.append("num:").append(getNum()).append(";");
		sb.append("numUnit:").append(getNumUnit()).append(";");
		sb.append("purchaseTime:").append(getPurchaseTime()).append(";");
		sb.append("coinUnit:").append(getCoinUnit()).append(";");
		sb.append("payAddress:").append(getPayAddress()).append(";");
		sb.append("receiveAddress:").append(getReceiveAddress()).append(";");
		sb.append("payStatus:").append(getPayStatus()).append(";");
		sb.append("payMethod:").append(getPayMethod()).append(";");
		sb.append("txHash:").append(getTxHash()).append(";");
		sb.append("updateSeq:").append(getUpdateSeq()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("timeOut:").append(getTimeOut()).append(";");
		return sb.toString();
	}
}
