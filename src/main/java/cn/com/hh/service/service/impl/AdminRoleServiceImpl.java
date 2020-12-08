package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.AdminRoleMapper;
import com.common.api.model.AdminRole;
import com.common.api.service.IAdminRoleService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:00
 * Description: [admin服务实现]
 */
@Service
public class AdminRoleServiceImpl implements IAdminRoleService {
	@Autowired
	private AdminRoleMapper adminRoleMapper;

	/**
	* 查询admin
	*
	* @param id adminID
	* @return admin
	*/
	@Override
	public AdminRole selectAdminRoleById(Long id) {
		return adminRoleMapper.selectAdminRoleById(id);
	}

	/**
	* 查询admin列表
	*
	* @param adminRole admin
	* @return admin
	*/
	@Override
	public List<AdminRole> selectAdminRoleList(AdminRole adminRole) {
		return adminRoleMapper.selectAdminRoleList(adminRole);
	}

	/**
	* 新增admin
	*
	* @param adminRole admin
	* @return 结果
	*/
	@Override
	public int insertAdminRole(AdminRole adminRole) {
		return adminRoleMapper.insertAdminRole(adminRole);
	}

	/**
	* 修改admin
	*
	* @param adminRole admin
	* @return 结果
	*/
	@Override
	public int updateAdminRole(AdminRole adminRole) {
		return adminRoleMapper.updateAdminRole(adminRole);
	}

	/**
	* 批量删除admin
	*
	* @param ids 需要删除的adminID
	* @return 结果
	*/
	@Override
	public int deleteAdminRoleByIds(Long[] ids) {
		return adminRoleMapper.deleteAdminRoleByIds(ids);
	}

	/**
	* 删除admin信息
	*
	* @param id adminID
	* @return 结果
	*/
	@Override
	public int deleteAdminRoleById(Long id) {
		return adminRoleMapper.deleteAdminRoleById(id);
	}

}
