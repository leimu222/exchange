package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [poundage服务实现]
 */
public class PoundageConvertEth  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String coinId;
	/**
     * 
     */
	private String direction;
	/**
     * 
     */
	private String ethUsdtRate;
	/**
     * 
     */
	private String exchangeOrderId;
	/**
     * 
     */
	private Long memberId;
	/**
     * 
     */
	private java.math.BigDecimal mineAmount;
	/**
     * 
     */
	private java.math.BigDecimal poundageAmount;
	/**
     * 
     */
	private java.math.BigDecimal poundageAmountEth;
	/**
     * 
     */
	private String symbol;
	/**
     * 
     */
	private java.util.Date transactionTime;
	/**
     * 
     */
	private String type;
	/**
     * 
     */
	private String usdtRate;
	
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
	public String getCoinId(){
		return coinId;
	}
	/**
	* 
	*/
	public void setCoinId(String coinId){
		this.coinId = coinId;
	}
	/**
	* 
	* @return String
    */
	public String getDirection(){
		return direction;
	}
	/**
	* 
	*/
	public void setDirection(String direction){
		this.direction = direction;
	}
	/**
	* 
	* @return String
    */
	public String getEthUsdtRate(){
		return ethUsdtRate;
	}
	/**
	* 
	*/
	public void setEthUsdtRate(String ethUsdtRate){
		this.ethUsdtRate = ethUsdtRate;
	}
	/**
	* 
	* @return String
    */
	public String getExchangeOrderId(){
		return exchangeOrderId;
	}
	/**
	* 
	*/
	public void setExchangeOrderId(String exchangeOrderId){
		this.exchangeOrderId = exchangeOrderId;
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
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMineAmount(){
		return mineAmount;
	}
	/**
	* 
	*/
	public void setMineAmount(java.math.BigDecimal mineAmount){
		this.mineAmount = mineAmount;
	}
	/**
	* 
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPoundageAmount(){
		return poundageAmount;
	}
	/**
	* 
	*/
	public void setPoundageAmount(java.math.BigDecimal poundageAmount){
		this.poundageAmount = poundageAmount;
	}
	/**
	* 
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPoundageAmountEth(){
		return poundageAmountEth;
	}
	/**
	* 
	*/
	public void setPoundageAmountEth(java.math.BigDecimal poundageAmountEth){
		this.poundageAmountEth = poundageAmountEth;
	}
	/**
	* 
	* @return String
    */
	public String getSymbol(){
		return symbol;
	}
	/**
	* 
	*/
	public void setSymbol(String symbol){
		this.symbol = symbol;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getTransactionTime(){
		return transactionTime;
	}
	/**
	* 
	*/
	public void setTransactionTime(java.util.Date transactionTime){
		this.transactionTime = transactionTime;
	}
	/**
	* 
	* @return String
    */
	public String getType(){
		return type;
	}
	/**
	* 
	*/
	public void setType(String type){
		this.type = type;
	}
	/**
	* 
	* @return String
    */
	public String getUsdtRate(){
		return usdtRate;
	}
	/**
	* 
	*/
	public void setUsdtRate(String usdtRate){
		this.usdtRate = usdtRate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		sb.append("direction:").append(getDirection()).append(";");
		sb.append("ethUsdtRate:").append(getEthUsdtRate()).append(";");
		sb.append("exchangeOrderId:").append(getExchangeOrderId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("mineAmount:").append(getMineAmount()).append(";");
		sb.append("poundageAmount:").append(getPoundageAmount()).append(";");
		sb.append("poundageAmountEth:").append(getPoundageAmountEth()).append(";");
		sb.append("symbol:").append(getSymbol()).append(";");
		sb.append("transactionTime:").append(getTransactionTime()).append(";");
		sb.append("type:").append(getType()).append(";");
		sb.append("usdtRate:").append(getUsdtRate()).append(";");
		return sb.toString();
	}
}
