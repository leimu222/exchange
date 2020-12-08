package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [pool服务实现]
 */
public class PoolGrade  implements Serializable {

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
     * 等级下限
     */
	private java.math.BigDecimal lowerLimit;
	/**
     * 等级上限
     */
	private java.math.BigDecimal upperLimit;
	/**
     * 基础算力
     */
	private java.math.BigDecimal basePower;
	/**
     * 直推比率(0.2)
     */
	private java.math.BigDecimal directPushRate;
	/**
     * 间推比率(0.1)
     */
	private java.math.BigDecimal indirectPushRate;
	/**
     * 3 级(含)以上,释放平计算力(0.1)
     */
	private java.math.BigDecimal sameLevelRate;
	
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
	* 等级下限
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getLowerLimit(){
		return lowerLimit;
	}
	/**
	* 等级下限
	*/
	public void setLowerLimit(java.math.BigDecimal lowerLimit){
		this.lowerLimit = lowerLimit;
	}
	/**
	* 等级上限
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getUpperLimit(){
		return upperLimit;
	}
	/**
	* 等级上限
	*/
	public void setUpperLimit(java.math.BigDecimal upperLimit){
		this.upperLimit = upperLimit;
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
	/**
	* 直推比率(0.2)
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getDirectPushRate(){
		return directPushRate;
	}
	/**
	* 直推比率(0.2)
	*/
	public void setDirectPushRate(java.math.BigDecimal directPushRate){
		this.directPushRate = directPushRate;
	}
	/**
	* 间推比率(0.1)
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getIndirectPushRate(){
		return indirectPushRate;
	}
	/**
	* 间推比率(0.1)
	*/
	public void setIndirectPushRate(java.math.BigDecimal indirectPushRate){
		this.indirectPushRate = indirectPushRate;
	}
	/**
	* 3 级(含)以上,释放平计算力(0.1)
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getSameLevelRate(){
		return sameLevelRate;
	}
	/**
	* 3 级(含)以上,释放平计算力(0.1)
	*/
	public void setSameLevelRate(java.math.BigDecimal sameLevelRate){
		this.sameLevelRate = sameLevelRate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("gradeCode:").append(getGradeCode()).append(";");
		sb.append("gradeName:").append(getGradeName()).append(";");
		sb.append("lowerLimit:").append(getLowerLimit()).append(";");
		sb.append("upperLimit:").append(getUpperLimit()).append(";");
		sb.append("basePower:").append(getBasePower()).append(";");
		sb.append("directPushRate:").append(getDirectPushRate()).append(";");
		sb.append("indirectPushRate:").append(getIndirectPushRate()).append(";");
		sb.append("sameLevelRate:").append(getSameLevelRate()).append(";");
		return sb.toString();
	}
}
