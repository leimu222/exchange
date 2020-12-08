package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public class ContractMemberProfitLoss  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Long id;
	/**
     * 用户ID
     */
	private Long memberId;
	/**
     * 盈亏金额
     */
	private java.math.BigDecimal profitLossAmount;
	/**
     * 盈亏类型（0用户周盈亏，1团队周盈亏，2用户总体盈亏，3团队总体盈亏）
     */
	private Integer type;
	/**
     * 周盈亏统计起始时间
     */
	private String weekStartTime;
	/**
     * 周盈亏统计结束时间
     */
	private String weekEndTime;
	
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
	* 用户ID
	* @return Long
    */
	public Long getMemberId(){
		return memberId;
	}
	/**
	* 用户ID
	*/
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}
	/**
	* 盈亏金额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getProfitLossAmount(){
		return profitLossAmount;
	}
	/**
	* 盈亏金额
	*/
	public void setProfitLossAmount(java.math.BigDecimal profitLossAmount){
		this.profitLossAmount = profitLossAmount;
	}
	/**
	* 盈亏类型（0用户周盈亏，1团队周盈亏，2用户总体盈亏，3团队总体盈亏）
	* @return Integer
    */
	public Integer getType(){
		return type;
	}
	/**
	* 盈亏类型（0用户周盈亏，1团队周盈亏，2用户总体盈亏，3团队总体盈亏）
	*/
	public void setType(Integer type){
		this.type = type;
	}
	/**
	* 周盈亏统计起始时间
	* @return String
    */
	public String getWeekStartTime(){
		return weekStartTime;
	}
	/**
	* 周盈亏统计起始时间
	*/
	public void setWeekStartTime(String weekStartTime){
		this.weekStartTime = weekStartTime;
	}
	/**
	* 周盈亏统计结束时间
	* @return String
    */
	public String getWeekEndTime(){
		return weekEndTime;
	}
	/**
	* 周盈亏统计结束时间
	*/
	public void setWeekEndTime(String weekEndTime){
		this.weekEndTime = weekEndTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("profitLossAmount:").append(getProfitLossAmount()).append(";");
		sb.append("type:").append(getType()).append(";");
		sb.append("weekStartTime:").append(getWeekStartTime()).append(";");
		sb.append("weekEndTime:").append(getWeekEndTime()).append(";");
		return sb.toString();
	}
}
