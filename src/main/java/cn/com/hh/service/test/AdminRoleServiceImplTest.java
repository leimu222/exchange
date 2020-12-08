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
public class AdminRoleServiceImplTest  {

	@Autowired
	private IAdminRoleService adminRoleService;

	/**
	* 查询admin
	*/
	@Test
	public void selectAdminRoleById() {
		AdminRole adminRole = adminRoleService.selectAdminRoleById(1);
		System.out.println(adminRole.toString());
	}

	/**
	* 查询admin列表
	*/
	@Test
	public void selectAdminRoleList() {
		List<AdminRole> list = adminRoleService.selectAdminRoleList(new AdminRole());
		for(AdminRole model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增admin
	*/
	@Test
	public void insertAdminRole() {
		for (int i = 1;i < 30; i++) {
			AdminRole adminRole = new AdminRole();
			adminRoleService.insertAdminRole(adminRole);
		}
	}

	/**
	* 修改admin
	*/
	@Test
	public void updateAdminRole() {
		AdminRole adminRole = new AdminRole();
		adminRoleService.updateAdminRole(adminRole);
	}

	/**
	* 批量删除admin
	*/
	@Test
	public void deleteAdminRoleByIds() {
	}

	/**
	* 删除admin信息
	*/
	@Test
	public void deleteAdminRoleById() {
	}

}
