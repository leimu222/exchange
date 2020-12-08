package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [pool服务实现]
 */
public class PoolNode  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long id;
	/**
     * 等级
     */
	private Integer gradeCode;
	/**
     * 等级名
     */
	private String gradeName;
	/**
     * 节点条件1(n个有效账户)
     */
	private Integer conditionOne;
	/**
     * 节点条件2(不低于 200u/账户)
     */
	private java.math.BigDecimal conditionTwo;
	/**
     * 节点条件3(总计 n 个 QTQ)
     */
	private java.math.BigDecimal conditionThree;
	/**
     * 节点奖励
     */
	private java.math.BigDecimal nodeReward;
	/**
     * 基础算力
     */
	private java.math.BigDecimal basePower;
	
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
	* 等级
	* @return Integer
    */
	public Integer getGradeCode(){
		return gradeCode;
	}
	/**
	* 等级
	*/
	public void setGradeCode(Integer gradeCode){
		this.gradeCode = gradeCode;
	}
	/**
	* 等级名
	* @return String
    */
	public String getGradeName(){
		return gradeName;
	}
	/**
	* 等级名
	*/
	public void setGradeName(String gradeName){
		this.gradeName = gradeName;
	}
	/**
	* 节点条件1(n个有效账户)
	* @return Integer
    */
	public Integer getConditionOne(){
		return conditionOne;
	}
	/**
	* 节点条件1(n个有效账户)
	*/
	public void setConditionOne(Integer conditionOne){
		this.conditionOne = conditionOne;
	}
	/**
	* 节点条件2(不低于 200u/账户)
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getConditionTwo(){
		return conditionTwo;
	}
	/**
	* 节点条件2(不低于 200u/账户)
	*/
	public void setConditionTwo(java.math.BigDecimal conditionTwo){
		this.conditionTwo = conditionTwo;
	}
	/**
	* 节点条件3(总计 n 个 QTQ)
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getConditionThree(){
		return conditionThree;
	}
	/**
	* 节点条件3(总计 n 个 QTQ)
	*/
	public void setConditionThree(java.math.BigDecimal conditionThree){
		this.conditionThree = conditionThree;
	}
	/**
	* 节点奖励
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getNodeReward(){
		return nodeReward;
	}
	/**
	* 节点奖励
	*/
	public void setNodeReward(java.math.BigDecimal nodeReward){
		this.nodeReward = nodeReward;
	}
	/**
	* 基础算力
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getBasePower(){
		return basePower;
	}
	/**
	* 基础算力
	*/
	public void setBasePower(java.math.BigDecimal basePower){
		this.basePower = basePower;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("gradeCode:").append(getGradeCode()).append(";");
		sb.append("gradeName:").append(getGradeName()).append(";");
		sb.append("conditionOne:").append(getConditionOne()).append(";");
		sb.append("conditionTwo:").append(getConditionTwo()).append(";");
		sb.append("conditionThree:").append(getConditionThree()).append(";");
		sb.append("nodeReward:").append(getNodeReward()).append(";");
		sb.append("basePower:").append(getBasePower()).append(";");
		return sb.toString();
	}
}
