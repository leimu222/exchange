package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.AdminMapper;
import com.common.api.model.Admin;
import com.common.api.service.IAdminService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:00
 * Description: [adminBiz服务实现]
 */
@Service
public class AdminBizServiceImpl extends CommonService implements IAdminBizService {
	@Autowired
	private IAdminService adminService;

	/**
	* 查询admin
	*
	* @param id adminID
	* @return admin
	*/
	@Override
	public Admin selectAdminById(Long id) {
		return adminService.selectAdminById(id);
	}

	/**
	* 查询admin列表
	*
	* @param admin admin
	* @return admin
	*/
	@Override
	public List<Admin> selectAdminList(Admin admin) {
		return adminService.selectAdminList(admin);
	}

	/**
	* 新增admin
	*
	* @param admin admin
	* @return 结果
	*/
	@Override
	public int insertAdmin(Admin admin) {
		return adminService.insertAdmin(admin);
	}

	/**
	* 修改admin
	*
	* @param admin admin
	* @return 结果
	*/
	@Override
	public int updateAdmin(Admin admin) {
		return adminService.updateAdmin(admin);
	}

	/**
	* 批量删除admin
	*
	* @param ids 需要删除的adminID
	* @return 结果
	*/
	@Override
	public int deleteAdminByIds(Long[] ids) {
		return adminService.deleteAdminByIds(ids);
	}

	/**
	* 删除admin信息
	*
	* @param id adminID
	* @return 结果
	*/
	@Override
	public int deleteAdminById(Long id) {
		return adminService.deleteAdminById(id);
	}

}
