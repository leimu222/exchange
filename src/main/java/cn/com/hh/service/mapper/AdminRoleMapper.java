package com.common.api.mapper;

import com.common.api.model.AdminRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:00
  * Description: [admin服务实现]
 */
public interface AdminRoleMapper{

	/**
	* 查询admin
	*
	* @param id adminID
	* @return admin
	*/
	public AdminRole selectAdminRoleById(Long id);

	/**
	* 查询admin列表
	*
	* @param adminRole admin
	* @return admin集合
	*/
	public List<AdminRole> selectAdminRoleList(AdminRole adminRole);

	/**
	* 新增admin
	*
	* @param adminRole admin
	* @return 结果
	*/
	public int insertAdminRole(AdminRole adminRole);

	/**
	* 修改admin
	*
	* @param adminRole admin
	* @return 结果
	*/
	public int updateAdminRole(AdminRole adminRole);

	/**
	* 删除admin
	*
	* @param id adminID
	* @return 结果
	*/
	public int deleteAdminRoleById(Long id);

	/**
	* 批量删除admin
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteAdminRoleByIds(Long[] ids);

}
