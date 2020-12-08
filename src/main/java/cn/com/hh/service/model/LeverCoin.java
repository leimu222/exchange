package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [lever服务实现]
 */
public class LeverCoin  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String baseSymbol;
	/**
     * 
     */
	private String coinSymbol;
	/**
     * 
     */
	private Integer enable;
	/**
     * 借贷利率
     */
	private java.math.BigDecimal interestRate;
	/**
     * 最小转入金额
     */
	private java.math.BigDecimal minTurnIntoAmount;
	/**
     * 最小转出金额
     */
	private java.math.BigDecimal minTurnOutAmount;
	/**
     * 
     */
	private java.math.BigDecimal proportion;
	/**
     * 
     */
	private Integer sort;
	/**
     * 
     */
	private String symbol;
	
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
	public String getBaseSymbol(){
		return baseSymbol;
	}
	/**
	* 
	*/
	public void setBaseSymbol(String baseSymbol){
		this.baseSymbol = baseSymbol;
	}
	/**
	* 
	* @return String
    */
	public String getCoinSymbol(){
		return coinSymbol;
	}
	/**
	* 
	*/
	public void setCoinSymbol(String coinSymbol){
		this.coinSymbol = coinSymbol;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getEnable(){
		return enable;
	}
	/**
	* 
	*/
	public void setEnable(Integer enable){
		this.enable = enable;
	}
	/**
	* 借贷利率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getInterestRate(){
		return interestRate;
	}
	/**
	* 借贷利率
	*/
	public void setInterestRate(java.math.BigDecimal interestRate){
		this.interestRate = interestRate;
	}
	/**
	* 最小转入金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMinTurnIntoAmount(){
		return minTurnIntoAmount;
	}
	/**
	* 最小转入金额
	*/
	public void setMinTurnIntoAmount(java.math.BigDecimal minTurnIntoAmount){
		this.minTurnIntoAmount = minTurnIntoAmount;
	}
	/**
	* 最小转出金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMinTurnOutAmount(){
		return minTurnOutAmount;
	}
	/**
	* 最小转出金额
	*/
	public void setMinTurnOutAmount(java.math.BigDecimal minTurnOutAmount){
		this.minTurnOutAmount = minTurnOutAmount;
	}
	/**
	* 
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getProportion(){
		return proportion;
	}
	/**
	* 
	*/
	public void setProportion(java.math.BigDecimal proportion){
		this.proportion = proportion;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getSort(){
		return sort;
	}
	/**
	* 
	*/
	public void setSort(Integer sort){
		this.sort = sort;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("baseSymbol:").append(getBaseSymbol()).append(";");
		sb.append("coinSymbol:").append(getCoinSymbol()).append(";");
		sb.append("enable:").append(getEnable()).append(";");
		sb.append("interestRate:").append(getInterestRate()).append(";");
		sb.append("minTurnIntoAmount:").append(getMinTurnIntoAmount()).append(";");
		sb.append("minTurnOutAmount:").append(getMinTurnOutAmount()).append(";");
		sb.append("proportion:").append(getProportion()).append(";");
		sb.append("sort:").append(getSort()).append(";");
		sb.append("symbol:").append(getSymbol()).append(";");
		return sb.toString();
	}
}
