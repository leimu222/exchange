package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [dividend服务实现]
 */
public class DividendStartRecord  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 数量
     */
	private java.math.BigDecimal amount;
	/**
     * 
     */
	private java.util.Date date;
	/**
     * 
     */
	private Long end;
	/**
     * 
     */
	private java.util.Date endDate;
	/**
     * 比例
     */
	private java.math.BigDecimal rate;
	/**
     * 
     */
	private Long start;
	/**
     * 
     */
	private java.util.Date startDate;
	/**
     * 
     */
	private String unit;
	/**
     * 
     */
	private Long adminId;
	
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
	* 数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 数量
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getDate(){
		return date;
	}
	/**
	* 
	*/
	public void setDate(java.util.Date date){
		this.date = date;
	}
	/**
	* 
	* @return Long
    */
	public Long getEnd(){
		return end;
	}
	/**
	* 
	*/
	public void setEnd(Long end){
		this.end = end;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getEndDate(){
		return endDate;
	}
	/**
	* 
	*/
	public void setEndDate(java.util.Date endDate){
		this.endDate = endDate;
	}
	/**
	* 比例
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getRate(){
		return rate;
	}
	/**
	* 比例
	*/
	public void setRate(java.math.BigDecimal rate){
		this.rate = rate;
	}
	/**
	* 
	* @return Long
    */
	public Long getStart(){
		return start;
	}
	/**
	* 
	*/
	public void setStart(Long start){
		this.start = start;
	}
	/**
	* 
	* @return java.util.Date
    */
	public java.util.Date getStartDate(){
		return startDate;
	}
	/**
	* 
	*/
	public void setStartDate(java.util.Date startDate){
		this.startDate = startDate;
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
	/**
	* 
	* @return Long
    */
	public Long getAdminId(){
		return adminId;
	}
	/**
	* 
	*/
	public void setAdminId(Long adminId){
		this.adminId = adminId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("date:").append(getDate()).append(";");
		sb.append("end:").append(getEnd()).append(";");
		sb.append("endDate:").append(getEndDate()).append(";");
		sb.append("rate:").append(getRate()).append(";");
		sb.append("start:").append(getStart()).append(";");
		sb.append("startDate:").append(getStartDate()).append(";");
		sb.append("unit:").append(getUnit()).append(";");
		sb.append("adminId:").append(getAdminId()).append(";");
		return sb.toString();
	}
}
