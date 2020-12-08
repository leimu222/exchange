package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [panic服务实现]
 */
public class PanicBuyingOrder  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 付款地址
     */
	private String payAddress;
	/**
     * 收款地址
     */
	private String receiveAddress;
	/**
     * 支付状态(0-支付失败,1-支付中,2-支付完成)
     */
	private Integer payStatus;
	/**
     * 付款时间
     */
	private java.util.Date payTime;
	/**
     * 超时时间
     */
	private java.util.Date timeOut;
	/**
     * 转账完成的唯一标识
     */
	private String txHash;
	/**
     * 支付金额
     */
	private String payAmount;
	/**
     * 到账金额
     */
	private String actualAmount;
	/**
     * 购买数量
     */
	private String num;
	/**
     * 币种
     */
	private String coinUnit;
	/**
     * 数量单位
     */
	private String numUnit;
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
	* 支付状态(0-支付失败,1-支付中,2-支付完成)
	* @return Integer
    */
	public Integer getPayStatus(){
		return payStatus;
	}
	/**
	* 支付状态(0-支付失败,1-支付中,2-支付完成)
	*/
	public void setPayStatus(Integer payStatus){
		this.payStatus = payStatus;
	}
	/**
	* 付款时间
	* @return java.util.Date
    */
	public java.util.Date getPayTime(){
		return payTime;
	}
	/**
	* 付款时间
	*/
	public void setPayTime(java.util.Date payTime){
		this.payTime = payTime;
	}
	/**
	* 超时时间
	* @return java.util.Date
    */
	public java.util.Date getTimeOut(){
		return timeOut;
	}
	/**
	* 超时时间
	*/
	public void setTimeOut(java.util.Date timeOut){
		this.timeOut = timeOut;
	}
	/**
	* 转账完成的唯一标识
	* @return String
    */
	public String getTxHash(){
		return txHash;
	}
	/**
	* 转账完成的唯一标识
	*/
	public void setTxHash(String txHash){
		this.txHash = txHash;
	}
	/**
	* 支付金额
	* @return String
    */
	public String getPayAmount(){
		return payAmount;
	}
	/**
	* 支付金额
	*/
	public void setPayAmount(String payAmount){
		this.payAmount = payAmount;
	}
	/**
	* 到账金额
	* @return String
    */
	public String getActualAmount(){
		return actualAmount;
	}
	/**
	* 到账金额
	*/
	public void setActualAmount(String actualAmount){
		this.actualAmount = actualAmount;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("payAddress:").append(getPayAddress()).append(";");
		sb.append("receiveAddress:").append(getReceiveAddress()).append(";");
		sb.append("payStatus:").append(getPayStatus()).append(";");
		sb.append("payTime:").append(getPayTime()).append(";");
		sb.append("timeOut:").append(getTimeOut()).append(";");
		sb.append("txHash:").append(getTxHash()).append(";");
		sb.append("payAmount:").append(getPayAmount()).append(";");
		sb.append("actualAmount:").append(getActualAmount()).append(";");
		sb.append("num:").append(getNum()).append(";");
		sb.append("coinUnit:").append(getCoinUnit()).append(";");
		sb.append("numUnit:").append(getNumUnit()).append(";");
		sb.append("panicBuyingId:").append(getPanicBuyingId()).append(";");
		sb.append("no:").append(getNo()).append(";");
		sb.append("price:").append(getPrice()).append(";");
		return sb.toString();
	}
}
