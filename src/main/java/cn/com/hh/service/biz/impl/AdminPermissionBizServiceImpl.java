package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.AdminPermissionMapper;
import com.common.api.model.AdminPermission;
import com.common.api.service.IAdminPermissionService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:00
 * Description: [adminBiz服务实现]
 */
@Service
public class AdminPermissionBizServiceImpl extends CommonService implements IAdminPermissionBizService {
	@Autowired
	private IAdminPermissionService adminPermissionService;

	/**
	* 查询admin
	*
	* @param id adminID
	* @return admin
	*/
	@Override
	public AdminPermission selectAdminPermissionById(Long id) {
		return adminPermissionService.selectAdminPermissionById(id);
	}

	/**
	* 查询admin列表
	*
	* @param adminPermission admin
	* @return admin
	*/
	@Override
	public List<AdminPermission> selectAdminPermissionList(AdminPermission adminPermission) {
		return adminPermissionService.selectAdminPermissionList(adminPermission);
	}

	/**
	* 新增admin
	*
	* @param adminPermission admin
	* @return 结果
	*/
	@Override
	public int insertAdminPermission(AdminPermission adminPermission) {
		return adminPermissionService.insertAdminPermission(adminPermission);
	}

	/**
	* 修改admin
	*
	* @param adminPermission admin
	* @return 结果
	*/
	@Override
	public int updateAdminPermission(AdminPermission adminPermission) {
		return adminPermissionService.updateAdminPermission(adminPermission);
	}

	/**
	* 批量删除admin
	*
	* @param ids 需要删除的adminID
	* @return 结果
	*/
	@Override
	public int deleteAdminPermissionByIds(Long[] ids) {
		return adminPermissionService.deleteAdminPermissionByIds(ids);
	}

	/**
	* 删除admin信息
	*
	* @param id adminID
	* @return 结果
	*/
	@Override
	public int deleteAdminPermissionById(Long id) {
		return adminPermissionService.deleteAdminPermissionById(id);
	}

}
