package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [init服务实现]
 */
public class InitPlate  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String finalPrice;
	/**
     * 
     */
	private String initPrice;
	/**
     * 
     */
	private String interferenceFactor;
	/**
     * 
     */
	private String relativeTime;
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
	public String getFinalPrice(){
		return finalPrice;
	}
	/**
	* 
	*/
	public void setFinalPrice(String finalPrice){
		this.finalPrice = finalPrice;
	}
	/**
	* 
	* @return String
    */
	public String getInitPrice(){
		return initPrice;
	}
	/**
	* 
	*/
	public void setInitPrice(String initPrice){
		this.initPrice = initPrice;
	}
	/**
	* 
	* @return String
    */
	public String getInterferenceFactor(){
		return interferenceFactor;
	}
	/**
	* 
	*/
	public void setInterferenceFactor(String interferenceFactor){
		this.interferenceFactor = interferenceFactor;
	}
	/**
	* 
	* @return String
    */
	public String getRelativeTime(){
		return relativeTime;
	}
	/**
	* 
	*/
	public void setRelativeTime(String relativeTime){
		this.relativeTime = relativeTime;
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
		sb.append("finalPrice:").append(getFinalPrice()).append(";");
		sb.append("initPrice:").append(getInitPrice()).append(";");
		sb.append("interferenceFactor:").append(getInterferenceFactor()).append(";");
		sb.append("relativeTime:").append(getRelativeTime()).append(";");
		sb.append("symbol:").append(getSymbol()).append(";");
		return sb.toString();
	}
}
