package com.common.api.service;

import java.util.List;

import com.common.api.model.adminPermission;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:00
 * Description: [adminBiz服务]
 */
public interface IAdminPermissionBizService {

	/**
	* 查询admin
	*
	* @param id adminID
	* @return admin
	*/
	public AdminPermission selectAdminPermissionById(Long id);

	/**
	* 查询admin列表
	*
	* @param adminPermission admin
	* @return admin集合
	*/
	public List<AdminPermission> selectAdminPermissionList(AdminPermission adminPermission);

	/**
	* 新增admin
	*
	* @param adminPermission admin
	* @return 结果
	*/
	public int insertAdminPermission(AdminPermission adminPermission);

	/**
	* 修改admin
	*
	* @param adminPermission admin
	* @return 结果
	*/
	public int updateAdminPermission(AdminPermission adminPermission);

	/**
	* 批量删除admin
	*
	* @param ids 需要删除的adminID
	* @return 结果
	*/
	public int deleteAdminPermissionByIds(Long[] ids);

	/**
	* 删除admin信息
	*
	* @param id adminID
	* @return 结果
	*/
	public int deleteAdminPermissionById(Long id);
	
}
