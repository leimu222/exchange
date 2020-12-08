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
public class AdminServiceImplTest  {

	@Autowired
	private IAdminService adminService;

	/**
	* 查询admin
	*/
	@Test
	public void selectAdminById() {
		Admin admin = adminService.selectAdminById(1);
		System.out.println(admin.toString());
	}

	/**
	* 查询admin列表
	*/
	@Test
	public void selectAdminList() {
		List<Admin> list = adminService.selectAdminList(new Admin());
		for(Admin model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增admin
	*/
	@Test
	public void insertAdmin() {
		for (int i = 1;i < 30; i++) {
			Admin admin = new Admin();
			adminService.insertAdmin(admin);
		}
	}

	/**
	* 修改admin
	*/
	@Test
	public void updateAdmin() {
		Admin admin = new Admin();
		adminService.updateAdmin(admin);
	}

	/**
	* 批量删除admin
	*/
	@Test
	public void deleteAdminByIds() {
	}

	/**
	* 删除admin信息
	*/
	@Test
	public void deleteAdminById() {
	}

}
