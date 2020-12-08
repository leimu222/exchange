package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [fee服务实现]
 */
public class FeeStastic  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Long id;
	/**
     * 手续费
     */
	private java.math.BigDecimal amount;
	/**
     * 单位
     */
	private String unit;
	/**
     * 交易对
     */
	private String symbol;
	/**
     * 日期yyy-MM-dd
     */
	private java.util.Date date;
	/**
     * 时间戳
     */
	private Long sequence;
	/**
     * 奖金贡献值
     */
	private java.math.BigDecimal bonusAmount;
	
	// setter and getter
	/**
	* 主键
	* @return Long
    */
	public Long getId(){
		return id;
	}
	/**
	* 主键
	*/
	public void setId(Long id){
		this.id = id;
	}
	/**
	* 手续费
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 手续费
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 单位
	* @return String
    */
	public String getUnit(){
		return unit;
	}
	/**
	* 单位
	*/
	public void setUnit(String unit){
		this.unit = unit;
	}
	/**
	* 交易对
	* @return String
    */
	public String getSymbol(){
		return symbol;
	}
	/**
	* 交易对
	*/
	public void setSymbol(String symbol){
		this.symbol = symbol;
	}
	/**
	* 日期yyy-MM-dd
	* @return java.util.Date
    */
	public java.util.Date getDate(){
		return date;
	}
	/**
	* 日期yyy-MM-dd
	*/
	public void setDate(java.util.Date date){
		this.date = date;
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
	* 奖金贡献值
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBonusAmount(){
		return bonusAmount;
	}
	/**
	* 奖金贡献值
	*/
	public void setBonusAmount(java.math.BigDecimal bonusAmount){
		this.bonusAmount = bonusAmount;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("unit:").append(getUnit()).append(";");
		sb.append("symbol:").append(getSymbol()).append(";");
		sb.append("date:").append(getDate()).append(";");
		sb.append("sequence:").append(getSequence()).append(";");
		sb.append("bonusAmount:").append(getBonusAmount()).append(";");
		return sb.toString();
	}
}
