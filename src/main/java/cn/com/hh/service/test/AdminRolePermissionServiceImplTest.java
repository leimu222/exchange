package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:00
 * Description: [admin单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminRolePermissionServiceImplTest  {

	@Autowired
	private IAdminRolePermissionService adminRolePermissionService;

	/**
	* 查询admin
	*/
	@Test
	public void selectAdminRolePermissionById() {
		AdminRolePermission adminRolePermission = adminRolePermissionService.selectAdminRolePermissionById(1);
		System.out.println(adminRolePermission.toString());
	}

	/**
	* 查询admin列表
	*/
	@Test
	public void selectAdminRolePermissionList() {
		List<AdminRolePermission> list = adminRolePermissionService.selectAdminRolePermissionList(new AdminRolePermission());
		for(AdminRolePermission model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增admin
	*/
	@Test
	public void insertAdminRolePermission() {
		for (int i = 1;i < 30; i++) {
			AdminRolePermission adminRolePermission = new AdminRolePermission();
			adminRolePermissionService.insertAdminRolePermission(adminRolePermission);
		}
	}

	/**
	* 修改admin
	*/
	@Test
	public void updateAdminRolePermission() {
		AdminRolePermission adminRolePermission = new AdminRolePermission();
		adminRolePermissionService.updateAdminRolePermission(adminRolePermission);
	}

	/**
	* 批量删除admin
	*/
	@Test
	public void deleteAdminRolePermissionByIds() {
	}

	/**
	* 删除admin信息
	*/
	@Test
	public void deleteAdminRolePermissionById() {
	}

}
