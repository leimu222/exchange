package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.AdminRolePermissionMapper;
import com.common.api.model.AdminRolePermission;
import com.common.api.service.IAdminRolePermissionService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:00
 * Description: [adminBiz服务实现]
 */
@Service
public class AdminRolePermissionBizServiceImpl extends CommonService implements IAdminRolePermissionBizService {
	@Autowired
	private IAdminRolePermissionService adminRolePermissionService;

	/**
	* 查询admin
	*
	* @param roleId adminID
	* @return admin
	*/
	@Override
	public AdminRolePermission selectAdminRolePermissionById(Long roleId) {
		return adminRolePermissionService.selectAdminRolePermissionById(roleId);
	}

	/**
	* 查询admin列表
	*
	* @param adminRolePermission admin
	* @return admin
	*/
	@Override
	public List<AdminRolePermission> selectAdminRolePermissionList(AdminRolePermission adminRolePermission) {
		return adminRolePermissionService.selectAdminRolePermissionList(adminRolePermission);
	}

	/**
	* 新增admin
	*
	* @param adminRolePermission admin
	* @return 结果
	*/
	@Override
	public int insertAdminRolePermission(AdminRolePermission adminRolePermission) {
		return adminRolePermissionService.insertAdminRolePermission(adminRolePermission);
	}

	/**
	* 修改admin
	*
	* @param adminRolePermission admin
	* @return 结果
	*/
	@Override
	public int updateAdminRolePermission(AdminRolePermission adminRolePermission) {
		return adminRolePermissionService.updateAdminRolePermission(adminRolePermission);
	}

	/**
	* 批量删除admin
	*
	* @param roleIds 需要删除的adminID
	* @return 结果
	*/
	@Override
	public int deleteAdminRolePermissionByIds(Long[] roleIds) {
		return adminRolePermissionService.deleteAdminRolePermissionByIds(roleIds);
	}

	/**
	* 删除admin信息
	*
	* @param roleId adminID
	* @return 结果
	*/
	@Override
	public int deleteAdminRolePermissionById(Long roleId) {
		return adminRolePermissionService.deleteAdminRolePermissionById(roleId);
	}

}
