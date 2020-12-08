package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public class OptionExchangeOrderCalculate  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 订单主键
     */
	private Long orderId;
	/**
     * 订单交易对价格
     */
	private java.math.BigDecimal symbolPrice;
	/**
     * 收益，为负表示亏损
     */
	private java.math.BigDecimal profit;
	/**
     * 涨跌率
     */
	private java.math.BigDecimal rate;
	/**
     * 更新时间
     */
	private java.util.Date updateTime;
	/**
     * 乐观锁
     */
	private Long version;
	
	// setter and getter
	/**
	* 订单主键
	* @return Long
    */
	public Long getOrderId(){
		return orderId;
	}
	/**
	* 订单主键
	*/
	public void setOrderId(Long orderId){
		this.orderId = orderId;
	}
	/**
	* 订单交易对价格
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getSymbolPrice(){
		return symbolPrice;
	}
	/**
	* 订单交易对价格
	*/
	public void setSymbolPrice(java.math.BigDecimal symbolPrice){
		this.symbolPrice = symbolPrice;
	}
	/**
	* 收益，为负表示亏损
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getProfit(){
		return profit;
	}
	/**
	* 收益，为负表示亏损
	*/
	public void setProfit(java.math.BigDecimal profit){
		this.profit = profit;
	}
	/**
	* 涨跌率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getRate(){
		return rate;
	}
	/**
	* 涨跌率
	*/
	public void setRate(java.math.BigDecimal rate){
		this.rate = rate;
	}
	/**
	* 更新时间
	* @return java.util.Date
    */
	public java.util.Date getUpdateTime(){
		return updateTime;
	}
	/**
	* 更新时间
	*/
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}
	/**
	* 乐观锁
	* @return Long
    */
	public Long getVersion(){
		return version;
	}
	/**
	* 乐观锁
	*/
	public void setVersion(Long version){
		this.version = version;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("orderId:").append(getOrderId()).append(";");
		sb.append("symbolPrice:").append(getSymbolPrice()).append(";");
		sb.append("profit:").append(getProfit()).append(";");
		sb.append("rate:").append(getRate()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		sb.append("version:").append(getVersion()).append(";");
		return sb.toString();
	}
}
