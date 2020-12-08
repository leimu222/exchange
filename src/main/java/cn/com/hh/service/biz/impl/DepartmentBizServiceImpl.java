package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.DepartmentMapper;
import com.common.api.model.Department;
import com.common.api.service.IDepartmentService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [departmentBiz服务实现]
 */
@Service
public class DepartmentBizServiceImpl extends CommonService implements IDepartmentBizService {
	@Autowired
	private IDepartmentService departmentService;

	/**
	* 查询department
	*
	* @param id departmentID
	* @return department
	*/
	@Override
	public Department selectDepartmentById(Long id) {
		return departmentService.selectDepartmentById(id);
	}

	/**
	* 查询department列表
	*
	* @param department department
	* @return department
	*/
	@Override
	public List<Department> selectDepartmentList(Department department) {
		return departmentService.selectDepartmentList(department);
	}

	/**
	* 新增department
	*
	* @param department department
	* @return 结果
	*/
	@Override
	public int insertDepartment(Department department) {
		return departmentService.insertDepartment(department);
	}

	/**
	* 修改department
	*
	* @param department department
	* @return 结果
	*/
	@Override
	public int updateDepartment(Department department) {
		return departmentService.updateDepartment(department);
	}

	/**
	* 批量删除department
	*
	* @param ids 需要删除的departmentID
	* @return 结果
	*/
	@Override
	public int deleteDepartmentByIds(Long[] ids) {
		return departmentService.deleteDepartmentByIds(ids);
	}

	/**
	* 删除department信息
	*
	* @param id departmentID
	* @return 结果
	*/
	@Override
	public int deleteDepartmentById(Long id) {
		return departmentService.deleteDepartmentById(id);
	}

}
