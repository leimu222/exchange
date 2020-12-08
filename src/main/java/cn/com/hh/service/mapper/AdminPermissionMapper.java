package com.common.api.mapper;

import com.common.api.model.AdminPermission;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:00
  * Description: [admin服务实现]
 */
public interface AdminPermissionMapper{

	/**
	* 查询admin
	*
	* @param id adminID
	* @return admin
	*/
	public AdminPermission selectAdminPermissionById(Long id);

	/**
	* 查询admin列表
	*
	* @param adminPermission admin
	* @return admin集合
	*/
	public List<AdminPermission> selectAdminPermissionList(AdminPermission adminPermission);

	/**
	* 新增admin
	*
	* @param adminPermission admin
	* @return 结果
	*/
	public int insertAdminPermission(AdminPermission adminPermission);

	/**
	* 修改admin
	*
	* @param adminPermission admin
	* @return 结果
	*/
	public int updateAdminPermission(AdminPermission adminPermission);

	/**
	* 删除admin
	*
	* @param id adminID
	* @return 结果
	*/
	public int deleteAdminPermissionById(Long id);

	/**
	* 批量删除admin
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteAdminPermissionByIds(Long[] ids);

}
