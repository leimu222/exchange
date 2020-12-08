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
 * @date 2020-12-08 18:16:04
 * Description: [department单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentServiceImplTest  {

	@Autowired
	private IDepartmentService departmentService;

	/**
	* 查询department
	*/
	@Test
	public void selectDepartmentById() {
		Department department = departmentService.selectDepartmentById(1);
		System.out.println(department.toString());
	}

	/**
	* 查询department列表
	*/
	@Test
	public void selectDepartmentList() {
		List<Department> list = departmentService.selectDepartmentList(new Department());
		for(Department model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增department
	*/
	@Test
	public void insertDepartment() {
		for (int i = 1;i < 30; i++) {
			Department department = new Department();
			departmentService.insertDepartment(department);
		}
	}

	/**
	* 修改department
	*/
	@Test
	public void updateDepartment() {
		Department department = new Department();
		departmentService.updateDepartment(department);
	}

	/**
	* 批量删除department
	*/
	@Test
	public void deleteDepartmentByIds() {
	}

	/**
	* 删除department信息
	*/
	@Test
	public void deleteDepartmentById() {
	}

}
