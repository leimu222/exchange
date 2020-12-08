package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [country服务实现]
 */
public class Country  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private String zhName;
	/**
     * 
     */
	private String areaCode;
	/**
     * 
     */
	private String enName;
	/**
     * 
     */
	private String language;
	/**
     * 
     */
	private String localCurrency;
	/**
     * 
     */
	private Integer sort;
	/**
     * 其他币种对人民币汇率
     */
	private java.math.BigDecimal rate;
	/**
     * 货币中文名
     */
	private String localCurrencyZh;
	
	// setter and getter
	/**
	* 
	* @return String
    */
	public String getZhName(){
		return zhName;
	}
	/**
	* 
	*/
	public void setZhName(String zhName){
		this.zhName = zhName;
	}
	/**
	* 
	* @return String
    */
	public String getAreaCode(){
		return areaCode;
	}
	/**
	* 
	*/
	public void setAreaCode(String areaCode){
		this.areaCode = areaCode;
	}
	/**
	* 
	* @return String
    */
	public String getEnName(){
		return enName;
	}
	/**
	* 
	*/
	public void setEnName(String enName){
		this.enName = enName;
	}
	/**
	* 
	* @return String
    */
	public String getLanguage(){
		return language;
	}
	/**
	* 
	*/
	public void setLanguage(String language){
		this.language = language;
	}
	/**
	* 
	* @return String
    */
	public String getLocalCurrency(){
		return localCurrency;
	}
	/**
	* 
	*/
	public void setLocalCurrency(String localCurrency){
		this.localCurrency = localCurrency;
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
	* 其他币种对人民币汇率
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getRate(){
		return rate;
	}
	/**
	* 其他币种对人民币汇率
	*/
	public void setRate(java.math.BigDecimal rate){
		this.rate = rate;
	}
	/**
	* 货币中文名
	* @return String
    */
	public String getLocalCurrencyZh(){
		return localCurrencyZh;
	}
	/**
	* 货币中文名
	*/
	public void setLocalCurrencyZh(String localCurrencyZh){
		this.localCurrencyZh = localCurrencyZh;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("zhName:").append(getZhName()).append(";");
		sb.append("areaCode:").append(getAreaCode()).append(";");
		sb.append("enName:").append(getEnName()).append(";");
		sb.append("language:").append(getLanguage()).append(";");
		sb.append("localCurrency:").append(getLocalCurrency()).append(";");
		sb.append("sort:").append(getSort()).append(";");
		sb.append("rate:").append(getRate()).append(";");
		sb.append("localCurrencyZh:").append(getLocalCurrencyZh()).append(";");
		return sb.toString();
	}
}
