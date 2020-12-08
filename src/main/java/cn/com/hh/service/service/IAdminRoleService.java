package com.common.api.service;

import java.util.List;

import com.common.api.model.adminRole;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:00
 * Description: [admin服务]
 */
public interface IAdminRoleService {

	/**
	* 查询admin
	*
	* @param id adminID
	* @return admin
	*/
	public AdminRole selectAdminRoleById(Long id);

	/**
	* 查询admin列表
	*
	* @param adminRole admin
	* @return admin集合
	*/
	public List<AdminRole> selectAdminRoleList(AdminRole adminRole);

	/**
	* 新增admin
	*
	* @param adminRole admin
	* @return 结果
	*/
	public int insertAdminRole(AdminRole adminRole);

	/**
	* 修改admin
	*
	* @param adminRole admin
	* @return 结果
	*/
	public int updateAdminRole(AdminRole adminRole);

	/**
	* 批量删除admin
	*
	* @param ids 需要删除的adminID
	* @return 结果
	*/
	public int deleteAdminRoleByIds(Long[] ids);

	/**
	* 删除admin信息
	*
	* @param id adminID
	* @return 结果
	*/
	public int deleteAdminRoleById(Long id);
	
}
