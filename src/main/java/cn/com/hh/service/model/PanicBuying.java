package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [panic服务实现]
 */
public class PanicBuying  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 期数
     */
	private String no;
	/**
     * 单价
     */
	private java.math.BigDecimal price;
	/**
     * 币种
     */
	private String coinUnit;
	/**
     * 总数
     */
	private java.math.BigDecimal totalNum;
	/**
     * 剩余数量
     */
	private java.math.BigDecimal remainNum;
	/**
     * 冻结数量
     */
	private java.math.BigDecimal frozenNum;
	/**
     * 总量单位
     */
	private String numUnit;
	/**
     * 抢购状态(0-抢购中,1-抢购结束,2-抢购未开始)
     */
	private Integer state;
	/**
     * 开始时间
     */
	private java.util.Date startTime;
	/**
     * 结束时间
     */
	private java.util.Date endTime;
	/**
     * 创建时间
     */
	private java.util.Date createTime;
	
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
	* 期数
	* @return String
    */
	public String getNo(){
		return no;
	}
	/**
	* 期数
	*/
	public void setNo(String no){
		this.no = no;
	}
	/**
	* 单价
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getPrice(){
		return price;
	}
	/**
	* 单价
	*/
	public void setPrice(java.math.BigDecimal price){
		this.price = price;
	}
	/**
	* 币种
	* @return String
    */
	public String getCoinUnit(){
		return coinUnit;
	}
	/**
	* 币种
	*/
	public void setCoinUnit(String coinUnit){
		this.coinUnit = coinUnit;
	}
	/**
	* 总数
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getTotalNum(){
		return totalNum;
	}
	/**
	* 总数
	*/
	public void setTotalNum(java.math.BigDecimal totalNum){
		this.totalNum = totalNum;
	}
	/**
	* 剩余数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getRemainNum(){
		return remainNum;
	}
	/**
	* 剩余数量
	*/
	public void setRemainNum(java.math.BigDecimal remainNum){
		this.remainNum = remainNum;
	}
	/**
	* 冻结数量
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getFrozenNum(){
		return frozenNum;
	}
	/**
	* 冻结数量
	*/
	public void setFrozenNum(java.math.BigDecimal frozenNum){
		this.frozenNum = frozenNum;
	}
	/**
	* 总量单位
	* @return String
    */
	public String getNumUnit(){
		return numUnit;
	}
	/**
	* 总量单位
	*/
	public void setNumUnit(String numUnit){
		this.numUnit = numUnit;
	}
	/**
	* 抢购状态(0-抢购中,1-抢购结束,2-抢购未开始)
	* @return Integer
    */
	public Integer getState(){
		return state;
	}
	/**
	* 抢购状态(0-抢购中,1-抢购结束,2-抢购未开始)
	*/
	public void setState(Integer state){
		this.state = state;
	}
	/**
	* 开始时间
	* @return java.util.Date
    */
	public java.util.Date getStartTime(){
		return startTime;
	}
	/**
	* 开始时间
	*/
	public void setStartTime(java.util.Date startTime){
		this.startTime = startTime;
	}
	/**
	* 结束时间
	* @return java.util.Date
    */
	public java.util.Date getEndTime(){
		return endTime;
	}
	/**
	* 结束时间
	*/
	public void setEndTime(java.util.Date endTime){
		this.endTime = endTime;
	}
	/**
	* 创建时间
	* @return java.util.Date
    */
	public java.util.Date getCreateTime(){
		return createTime;
	}
	/**
	* 创建时间
	*/
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("no:").append(getNo()).append(";");
		sb.append("price:").append(getPrice()).append(";");
		sb.append("coinUnit:").append(getCoinUnit()).append(";");
		sb.append("totalNum:").append(getTotalNum()).append(";");
		sb.append("remainNum:").append(getRemainNum()).append(";");
		sb.append("frozenNum:").append(getFrozenNum()).append(";");
		sb.append("numUnit:").append(getNumUnit()).append(";");
		sb.append("state:").append(getState()).append(";");
		sb.append("startTime:").append(getStartTime()).append(";");
		sb.append("endTime:").append(getEndTime()).append(";");
		sb.append("createTime:").append(getCreateTime()).append(";");
		return sb.toString();
	}
}
