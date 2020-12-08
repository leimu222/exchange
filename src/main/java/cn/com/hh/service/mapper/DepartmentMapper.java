package com.common.api.mapper;

import com.common.api.model.Department;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [department服务实现]
 */
public interface DepartmentMapper{

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
	* 删除department
	*
	* @param id departmentID
	* @return 结果
	*/
	public int deleteDepartmentById(Long id);

	/**
	* 批量删除department
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteDepartmentByIds(Long[] ids);

}
