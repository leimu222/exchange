package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public class MemberTeam  implements Serializable {

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
     * 下级用户ID
     */
	private Long lowerMemberId;
	/**
     * 代数
     */
	private Integer generation;
	/**
     * 下级用户定持数额
     */
	private java.math.BigDecimal amount;
	/**
     * 0无效会员，1有效会员
     */
	private Integer isValidMember;
	
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
	* 下级用户ID
	* @return Long
    */
	public Long getLowerMemberId(){
		return lowerMemberId;
	}
	/**
	* 下级用户ID
	*/
	public void setLowerMemberId(Long lowerMemberId){
		this.lowerMemberId = lowerMemberId;
	}
	/**
	* 代数
	* @return Integer
    */
	public Integer getGeneration(){
		return generation;
	}
	/**
	* 代数
	*/
	public void setGeneration(Integer generation){
		this.generation = generation;
	}
	/**
	* 下级用户定持数额
	* @return java.math.BigDecimal
    */
	public java.math.BigDecimal getAmount(){
		return amount;
	}
	/**
	* 下级用户定持数额
	*/
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	* 0无效会员，1有效会员
	* @return Integer
    */
	public Integer getIsValidMember(){
		return isValidMember;
	}
	/**
	* 0无效会员，1有效会员
	*/
	public void setIsValidMember(Integer isValidMember){
		this.isValidMember = isValidMember;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(getId()).append(";");
		sb.append("memberId:").append(getMemberId()).append(";");
		sb.append("lowerMemberId:").append(getLowerMemberId()).append(";");
		sb.append("generation:").append(getGeneration()).append(";");
		sb.append("amount:").append(getAmount()).append(";");
		sb.append("isValidMember:").append(getIsValidMember()).append(";");
		return sb.toString();
	}
}
