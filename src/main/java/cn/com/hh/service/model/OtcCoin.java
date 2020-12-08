package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [otc服务实现]
 */
public class OtcCoin  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 买入广告最低发布数量
     */
	private java.math.BigDecimal buyMinAmount;
	/**
     * 币种精度
     */
	private Integer coinScale;
	/**
     * 
     */
	private Integer isPlatformCoin;
	/**
     * 交易手续费率
     */
	private java.math.BigDecimal jyRate;
	/**
     * 广告上架后自动下架时间，单位为秒，0表示不过期
     */
	private Integer maxTradingTime;
	/**
     * 最大挂单数量，0表示不限制
     */
	private Integer maxVolume;
	/**
     * 
     */
	private String name;
	/**
     * 
     */
	private String nameCn;
	/**
     * 卖出广告最低发布数量
     */
	private java.math.BigDecimal sellMinAmount;
	/**
     * 
     */
	private Integer sort;
	/**
     * 
     */
	private Integer status;
	/**
     * 
     */
	private String unit;
	
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
	* 买入广告最低发布数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBuyMinAmount(){
		return buyMinAmount;
	}
	/**
	* 买入广告最低发布数量
	*/
	public void setBuyMinAmount(java.math.BigDecimal buyMinAmount){
		this.buyMinAmount = buyMinAmount;
	}
	/**
	* 币种精度
	* @return Integer
    */
	public Integer getCoinScale(){
		return coinScale;
	}
	/**
	* 币种精度
	*/
	public void setCoinScale(Integer coinScale){
		this.coinScale = coinScale;
	}
	/**
	* 
	* @return Integer
    */
	public Integer getIsPlatformCoin(){
		return isPlatformCoin;
	}
	/**
	* 
	*/
	public void setIsPlatformCoin(Integer isPlatformCoin){
		this.isPlatformCoin = isPlatformCoin;
	}
	/**
	* 交易手续费率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getJyRate(){
		return jyRate;
	}
	/**
	* 交易手续费率
	*/
	public void setJyRate(java.math.BigDecimal jyRate){
		this.jyRate = jyRate;
	}
	/**
	* 广告上架后自动下架时间，单位为秒，0表示不过期
	* @return Integer
    */
	public Integer getMaxTradingTime(){
		return maxTradingTime;
	}
	/**
	* 广告上架后自动下架时间，单位为秒，0表示不过期
	*/
	public void setMaxTradingTime(Integer maxTradingTime){
		this.maxTradingTime = maxTradingTime;
	}
	/**
	* 最大挂单数量，0表示不限制
	* @return Integer
    */
	public Integer getMaxVolume(){
		return maxVolume;
	}
	/**
	* 最大挂单数量，0表示不限制
	*/
	public void setMaxVolume(Integer maxVolume){
		this.maxVolume = maxVolume;
	}
	/**
	* 
	* @return String
    */
	public String getName(){
		return name;
	}
	/**
	* 
	*/
	public void setName(String name){
		this.name = name;
	}
	/**
	* 
	* @return String
    */
	public String getNameCn(){
		return nameCn;
	}
	/**
	* 
	*/
	public void setNameCn(String nameCn){
		this.nameCn = nameCn;
	}
	/**
	* 卖出广告最低发布数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getSellMinAmount(){
		return sellMinAmount;
	}
	/**
	* 卖出广告最低发布数量
	*/
	public void setSellMinAmount(java.math.BigDecimal sellMinAmount){
		this.sellMinAmount = sellMinAmount;
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
	* @return Integer
    */
	public Integer getStatus(){
		return status;
	}
	/**
	* 
	*/
	public void setStatus(Integer status){
		this.status = status;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("buyMinAmount:").append(getBuyMinAmount()).append(";");
		sb.append("coinScale:").append(getCoinScale()).append(";");
		sb.append("isPlatformCoin:").append(getIsPlatformCoin()).append(";");
		sb.append("jyRate:").append(getJyRate()).append(";");
		sb.append("maxTradingTime:").append(getMaxTradingTime()).append(";");
		sb.append("maxVolume:").append(getMaxVolume()).append(";");
		sb.append("name:").append(getName()).append(";");
		sb.append("nameCn:").append(getNameCn()).append(";");
		sb.append("sellMinAmount:").append(getSellMinAmount()).append(";");
		sb.append("sort:").append(getSort()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("unit:").append(getUnit()).append(";");
		return sb.toString();
	}
}
