package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [member服务实现]
 */
public class MemberBonus  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 
     */
	private String arriveTime;
	/**
     * 
     */
	private String coinId;
	/**
     * 
     */
	private String haveTime;
	/**
     * 分红数量
     */
	private java.math.BigDecimal memBouns;
	/**
     * 
     */
	private Long memberId;
	/**
     * 当天总手续费
     */
	private java.math.BigDecimal total;
	
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
	public String getArriveTime(){
		return arriveTime;
	}
	/**
	* 
	*/
	public void setArriveTime(String arriveTime){
		this.arriveTime = arriveTime;
	}
	/**
	* 
	* @return String
    */
	public String getCoinId(){
		return coinId;
	}
	/**
	* 
	*/
	public void setCoinId(String coinId){
		this.coinId = coinId;
	}
	/**
	* 
	* @return String
    */
	public String getHaveTime(){
		return haveTime;
	}
	/**
	* 
	*/
	public void setHaveTime(String haveTime){
		this.haveTime = haveTime;
	}
	/**
	* 分红数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getMemBouns(){
		return memBouns;
	}
	/**
	* 分红数量
	*/
	public void setMemBouns(java.math.BigDecimal memBouns){
		this.memBouns = memBouns;
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
	* 当天总手续费
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTotal(){
		return total;
	}
	/**
	* 当天总手续费
	*/
	public void setTotal(java.math.BigDecimal total){
		this.total = total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("arriveTime:").append(getArriveTime()).append(";");
		sb.append("coinId:").append(getCoinId()).append(";");
		sb.append("haveTime:").append(getHaveTime()).append(";");
		sb.append("memBouns:").append(getMemBouns()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("total:").append(getTotal()).append(";");
		return sb.toString();
	}
}
