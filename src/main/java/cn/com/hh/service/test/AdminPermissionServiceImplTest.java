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
public class AdminPermissionServiceImplTest  {

	@Autowired
	private IAdminPermissionService adminPermissionService;

	/**
	* 查询admin
	*/
	@Test
	public void selectAdminPermissionById() {
		AdminPermission adminPermission = adminPermissionService.selectAdminPermissionById(1);
		System.out.println(adminPermission.toString());
	}

	/**
	* 查询admin列表
	*/
	@Test
	public void selectAdminPermissionList() {
		List<AdminPermission> list = adminPermissionService.selectAdminPermissionList(new AdminPermission());
		for(AdminPermission model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增admin
	*/
	@Test
	public void insertAdminPermission() {
		for (int i = 1;i < 30; i++) {
			AdminPermission adminPermission = new AdminPermission();
			adminPermissionService.insertAdminPermission(adminPermission);
		}
	}

	/**
	* 修改admin
	*/
	@Test
	public void updateAdminPermission() {
		AdminPermission adminPermission = new AdminPermission();
		adminPermissionService.updateAdminPermission(adminPermission);
	}

	/**
	* 批量删除admin
	*/
	@Test
	public void deleteAdminPermissionByIds() {
	}

	/**
	* 删除admin信息
	*/
	@Test
	public void deleteAdminPermissionById() {
	}

}
