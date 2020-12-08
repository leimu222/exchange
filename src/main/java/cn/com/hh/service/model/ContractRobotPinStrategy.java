package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public class ContractRobotPinStrategy  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Long id;
	/**
     * 交易对
     */
	private String symbol;
	/**
     * 状态：0-停止运行 1-正在运行，后台添加时默认1
     */
	private Boolean status;
	/**
     * 插针方向：0-涨 1-跌
     */
	private Boolean side;
	/**
     * 价格波动最小值
     */
	private java.math.BigDecimal priceRangeMin;
	/**
     * 价格波动最大值
     */
	private java.math.BigDecimal priceRangeMax;
	/**
     * 数量波动最小值
     */
	private java.math.BigDecimal amountRangeMin;
	/**
     * 数量波动最大值
     */
	private java.math.BigDecimal amountRangeMax;
	/**
     * 目标价格
     */
	private java.math.BigDecimal targetPrice;
	/**
     * 反方向倍数
     */
	private java.math.BigDecimal antiDirectionMultiple;
	/**
     * 间隔时间（单位：秒）
     */
	private Integer frequency;
	/**
     * 开始执行时间，毫秒位时间戳
     */
	private Long startEffectTime;
	/**
     * 备注信息
     */
	private String remark;
	/**
     * 
     */
	private java.util.Date createTime;
	/**
     * 
     */
	private java.util.Date updateTime;
	
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
	* 状态：0-停止运行 1-正在运行，后台添加时默认1
	* @return Boolean
    */
	public Boolean getStatus(){
		return status;
	}
	/**
	* 状态：0-停止运行 1-正在运行，后台添加时默认1
	*/
	public void setStatus(Boolean status){
		this.status = status;
	}
	/**
	* 插针方向：0-涨 1-跌
	* @return Boolean
    */
	public Boolean getSide(){
		return side;
	}
	/**
	* 插针方向：0-涨 1-跌
	*/
	public void setSide(Boolean side){
		this.side = side;
	}
	/**
	* 价格波动最小值
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPriceRangeMin(){
		return priceRangeMin;
	}
	/**
	* 价格波动最小值
	*/
	public void setPriceRangeMin(java.math.BigDecimal priceRangeMin){
		this.priceRangeMin = priceRangeMin;
	}
	/**
	* 价格波动最大值
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPriceRangeMax(){
		return priceRangeMax;
	}
	/**
	* 价格波动最大值
	*/
	public void setPriceRangeMax(java.math.BigDecimal priceRangeMax){
		this.priceRangeMax = priceRangeMax;
	}
	/**
	* 数量波动最小值
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmountRangeMin(){
		return amountRangeMin;
	}
	/**
	* 数量波动最小值
	*/
	public void setAmountRangeMin(java.math.BigDecimal amountRangeMin){
		this.amountRangeMin = amountRangeMin;
	}
	/**
	* 数量波动最大值
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmountRangeMax(){
		return amountRangeMax;
	}
	/**
	* 数量波动最大值
	*/
	public void setAmountRangeMax(java.math.BigDecimal amountRangeMax){
		this.amountRangeMax = amountRangeMax;
	}
	/**
	* 目标价格
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTargetPrice(){
		return targetPrice;
	}
	/**
	* 目标价格
	*/
	public void setTargetPrice(java.math.BigDecimal targetPrice){
		this.targetPrice = targetPrice;
	}
	/**
	* 反方向倍数
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAntiDirectionMultiple(){
		return antiDirectionMultiple;
	}
	/**
	* 反方向倍数
	*/
	public void setAntiDirectionMultiple(java.math.BigDecimal antiDirectionMultiple){
		this.antiDirectionMultiple = antiDirectionMultiple;
	}
	/**
	* 间隔时间（单位：秒）
	* @return Integer
    */
	public Integer getFrequency(){
		return frequency;
	}
	/**
	* 间隔时间（单位：秒）
	*/
	public void setFrequency(Integer frequency){
		this.frequency = frequency;
	}
	/**
	* 开始执行时间，毫秒位时间戳
	* @return Long
    */
	public Long getStartEffectTime(){
		return startEffectTime;
	}
	/**
	* 开始执行时间，毫秒位时间戳
	*/
	public void setStartEffectTime(Long startEffectTime){
		this.startEffectTime = startEffectTime;
	}
	/**
	* 备注信息
	* @return String
    */
	public String getRemark(){
		return remark;
	}
	/**
	* 备注信息
	*/
	public void setRemark(String remark){
		this.remark = remark;
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
	public java.util.Date getUpdateTime(){
		return updateTime;
	}
	/**
	* 
	*/
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("symbol:").append(getSymbol()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("side:").append(getSide()).append(";");
		sb.append("priceRangeMin:").append(getPriceRangeMin()).append(";");
		sb.append("priceRangeMax:").append(getPriceRangeMax()).append(";");
		sb.append("amountRangeMin:").append(getAmountRangeMin()).append(";");
		sb.append("amountRangeMax:").append(getAmountRangeMax()).append(";");
		sb.append("targetPrice:").append(getTargetPrice()).append(";");
		sb.append("antiDirectionMultiple:").append(getAntiDirectionMultiple()).append(";");
		sb.append("frequency:").append(getFrequency()).append(";");
		sb.append("startEffectTime:").append(getStartEffectTime()).append(";");
		sb.append("remark:").append(getRemark()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		sb.append("updateTime:").append(getUpdateTime()).append(";");
		return sb.toString();
	}
}
