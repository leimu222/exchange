package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [exchange服务实现]
 */
public class ExchangeFavorSymbol  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String addTime;
	/**
     * 
     */
	private Long memberId;
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
	public String getAddTime(){
		return addTime;
	}
	/**
	* 
	*/
	public void setAddTime(String addTime){
		this.addTime = addTime;
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
		sb.append("addTime:").append(getAddTime()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("symbol:").append(getSymbol()).append(";");
		return sb.toString();
	}
}
