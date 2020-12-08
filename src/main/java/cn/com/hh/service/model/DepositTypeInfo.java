package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [deposit服务实现]
 */
public class DepositTypeInfo  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Integer id;
	/**
     * 套餐名称
     */
	private String name;
	/**
     * 周期
     */
	private Integer cycle;
	/**
     * 日收益率
     */
	private java.math.BigDecimal dayProfitRate;
	/**
     * 投资最小额
     */
	private java.math.BigDecimal investmentMin;
	/**
     * 投资最大额度
     */
	private java.math.BigDecimal investmentMax;
	/**
     * 备注
     */
	private String remark;
	/**
     * 0不可用，1可用
     */
	private Integer status;
	/**
     * 投资币种名称，默认USDT
     */
	private String investCoin;
	/**
     * 收益币种，默认USTD
     */
	private String profitCoin;
	/**
     * 违约扣除本金比例
     */
	private java.math.BigDecimal breakRate;
	
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
	* 套餐名称
	* @return String
    */
	public String getName(){
		return name;
	}
	/**
	* 套餐名称
	*/
	public void setName(String name){
		this.name = name;
	}
	/**
	* 周期
	* @return Integer
    */
	public Integer getCycle(){
		return cycle;
	}
	/**
	* 周期
	*/
	public void setCycle(Integer cycle){
		this.cycle = cycle;
	}
	/**
	* 日收益率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getDayProfitRate(){
		return dayProfitRate;
	}
	/**
	* 日收益率
	*/
	public void setDayProfitRate(java.math.BigDecimal dayProfitRate){
		this.dayProfitRate = dayProfitRate;
	}
	/**
	* 投资最小额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getInvestmentMin(){
		return investmentMin;
	}
	/**
	* 投资最小额
	*/
	public void setInvestmentMin(java.math.BigDecimal investmentMin){
		this.investmentMin = investmentMin;
	}
	/**
	* 投资最大额度
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getInvestmentMax(){
		return investmentMax;
	}
	/**
	* 投资最大额度
	*/
	public void setInvestmentMax(java.math.BigDecimal investmentMax){
		this.investmentMax = investmentMax;
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
	* 0不可用，1可用
	* @return Integer
    */
	public Integer getStatus(){
		return status;
	}
	/**
	* 0不可用，1可用
	*/
	public void setStatus(Integer status){
		this.status = status;
	}
	/**
	* 投资币种名称，默认USDT
	* @return String
    */
	public String getInvestCoin(){
		return investCoin;
	}
	/**
	* 投资币种名称，默认USDT
	*/
	public void setInvestCoin(String investCoin){
		this.investCoin = investCoin;
	}
	/**
	* 收益币种，默认USTD
	* @return String
    */
	public String getProfitCoin(){
		return profitCoin;
	}
	/**
	* 收益币种，默认USTD
	*/
	public void setProfitCoin(String profitCoin){
		this.profitCoin = profitCoin;
	}
	/**
	* 违约扣除本金比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBreakRate(){
		return breakRate;
	}
	/**
	* 违约扣除本金比例
	*/
	public void setBreakRate(java.math.BigDecimal breakRate){
		this.breakRate = breakRate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("name:").append(getName()).append(";");
		sb.append("cycle:").append(getCycle()).append(";");
		sb.append("dayProfitRate:").append(getDayProfitRate()).append(";");
		sb.append("investmentMin:").append(getInvestmentMin()).append(";");
		sb.append("investmentMax:").append(getInvestmentMax()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("investCoin:").append(getInvestCoin()).append(";");
		sb.append("profitCoin:").append(getProfitCoin()).append(";");
		sb.append("breakRate:").append(getBreakRate()).append(";");
		return sb.toString();
	}
}
