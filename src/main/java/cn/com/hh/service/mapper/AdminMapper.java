package com.common.api.mapper;

import com.common.api.model.Admin;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:00
  * Description: [admin服务实现]
 */
public interface AdminMapper{

	/**
	* 查询admin
	*
	* @param id adminID
	* @return admin
	*/
	public Admin selectAdminById(Long id);

	/**
	* 查询admin列表
	*
	* @param admin admin
	* @return admin集合
	*/
	public List<Admin> selectAdminList(Admin admin);

	/**
	* 新增admin
	*
	* @param admin admin
	* @return 结果
	*/
	public int insertAdmin(Admin admin);

	/**
	* 修改admin
	*
	* @param admin admin
	* @return 结果
	*/
	public int updateAdmin(Admin admin);

	/**
	* 删除admin
	*
	* @param id adminID
	* @return 结果
	*/
	public int deleteAdminById(Long id);

	/**
	* 批量删除admin
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteAdminByIds(Long[] ids);

}
