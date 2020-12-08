package com.common.api.service;

import java.util.List;

import com.common.api.model.adminRolePermission;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:00
 * Description: [adminBiz服务]
 */
public interface IAdminRolePermissionBizService {

	/**
	* 查询admin
	*
	* @param roleId adminID
	* @return admin
	*/
	public AdminRolePermission selectAdminRolePermissionById(Long roleId);

	/**
	* 查询admin列表
	*
	* @param adminRolePermission admin
	* @return admin集合
	*/
	public List<AdminRolePermission> selectAdminRolePermissionList(AdminRolePermission adminRolePermission);

	/**
	* 新增admin
	*
	* @param adminRolePermission admin
	* @return 结果
	*/
	public int insertAdminRolePermission(AdminRolePermission adminRolePermission);

	/**
	* 修改admin
	*
	* @param adminRolePermission admin
	* @return 结果
	*/
	public int updateAdminRolePermission(AdminRolePermission adminRolePermission);

	/**
	* 批量删除admin
	*
	* @param roleIds 需要删除的adminID
	* @return 结果
	*/
	public int deleteAdminRolePermissionByIds(Long[] roleIds);

	/**
	* 删除admin信息
	*
	* @param roleId adminID
	* @return 结果
	*/
	public int deleteAdminRolePermissionById(Long roleId);
	
}
