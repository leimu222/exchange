package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [option服务实现]
 */
public class OptionCoinInfo  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Integer id;
	/**
     * 币的名称
     */
	private String name;
	/**
     * 币中文名
     */
	private String nameCn;
	/**
     * 精度
     */
	private Integer coinScale;
	/**
     * 是否是平台币，0否，1是
     */
	private Integer isPlatformCoin;
	/**
     * 交易手续费
     */
	private java.math.BigDecimal jyRate;
	/**
     * 最大挂单数量，0表示不限
     */
	private Integer maxVolume;
	/**
     * 状态，0正常，1非法
     */
	private Integer status;
	/**
     * 序号
     */
	private Integer sort;
	/**
     * 币种单位
     */
	private String unit;
	
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
	* 币的名称
	* @return String
    */
	public String getName(){
		return name;
	}
	/**
	* 币的名称
	*/
	public void setName(String name){
		this.name = name;
	}
	/**
	* 币中文名
	* @return String
    */
	public String getNameCn(){
		return nameCn;
	}
	/**
	* 币中文名
	*/
	public void setNameCn(String nameCn){
		this.nameCn = nameCn;
	}
	/**
	* 精度
	* @return Integer
    */
	public Integer getCoinScale(){
		return coinScale;
	}
	/**
	* 精度
	*/
	public void setCoinScale(Integer coinScale){
		this.coinScale = coinScale;
	}
	/**
	* 是否是平台币，0否，1是
	* @return Integer
    */
	public Integer getIsPlatformCoin(){
		return isPlatformCoin;
	}
	/**
	* 是否是平台币，0否，1是
	*/
	public void setIsPlatformCoin(Integer isPlatformCoin){
		this.isPlatformCoin = isPlatformCoin;
	}
	/**
	* 交易手续费
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getJyRate(){
		return jyRate;
	}
	/**
	* 交易手续费
	*/
	public void setJyRate(java.math.BigDecimal jyRate){
		this.jyRate = jyRate;
	}
	/**
	* 最大挂单数量，0表示不限
	* @return Integer
    */
	public Integer getMaxVolume(){
		return maxVolume;
	}
	/**
	* 最大挂单数量，0表示不限
	*/
	public void setMaxVolume(Integer maxVolume){
		this.maxVolume = maxVolume;
	}
	/**
	* 状态，0正常，1非法
	* @return Integer
    */
	public Integer getStatus(){
		return status;
	}
	/**
	* 状态，0正常，1非法
	*/
	public void setStatus(Integer status){
		this.status = status;
	}
	/**
	* 序号
	* @return Integer
    */
	public Integer getSort(){
		return sort;
	}
	/**
	* 序号
	*/
	public void setSort(Integer sort){
		this.sort = sort;
	}
	/**
	* 币种单位
	* @return String
    */
	public String getUnit(){
		return unit;
	}
	/**
	* 币种单位
	*/
	public void setUnit(String unit){
		this.unit = unit;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("name:").append(getName()).append(";");
		sb.append("nameCn:").append(getNameCn()).append(";");
		sb.append("coinScale:").append(getCoinScale()).append(";");
		sb.append("isPlatformCoin:").append(getIsPlatformCoin()).append(";");
		sb.append("jyRate:").append(getJyRate()).append(";");
		sb.append("maxVolume:").append(getMaxVolume()).append(";");
		sb.append("status:").append(getStatus()).append(";");
		sb.append("sort:").append(getSort()).append(";");
		sb.append("unit:").append(getUnit()).append(";");
		return sb.toString();
	}
}
