package com.common.api.service;

import java.util.List;

import com.common.api.model.department;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [department服务]
 */
public interface IDepartmentService {

	/**
	* 查询department
	*
	* @param id departmentID
	* @return department
	*/
	public Department selectDepartmentById(Long id);

	/**
	* 查询department列表
	*
	* @param department department
	* @return department集合
	*/
	public List<Department> selectDepartmentList(Department department);

	/**
	* 新增department
	*
	* @param department department
	* @return 结果
	*/
	public int insertDepartment(Department department);

	/**
	* 修改department
	*
	* @param department department
	* @return 结果
	*/
	public int updateDepartment(Department department);

	/**
	* 批量删除department
	*
	* @param ids 需要删除的departmentID
	* @return 结果
	*/
	public int deleteDepartmentByIds(Long[] ids);

	/**
	* 删除department信息
	*
	* @param id departmentID
	* @return 结果
	*/
	public int deleteDepartmentById(Long id);
	
}
