package com.common.api.model;

import java.io.Serializable;
/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:00
  * Description: [admin服务实现]
 */
public class AdminRolePermission  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Long roleId;
	/**
     * 
     */
	private Long ruleId;
	
	// setter and getter
	/**
	* 
	* @return Long
    */
	public Long getRoleId(){
		return roleId;
	}
	/**
	* 
	*/
	public void setRoleId(Long roleId){
		this.roleId = roleId;
	}
	/**
	* 
	* @return Long
    */
	public Long getRuleId(){
		return ruleId;
	}
	/**
	* 
	*/
	public void setRuleId(Long ruleId){
		this.ruleId = ruleId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("roleId:").append(getRoleId()).append(";");
		sb.append("ruleId:").append(getRuleId()).append(";");
		return sb.toString();
	}
}
