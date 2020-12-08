package com.common.api.service;

import java.util.List;

import com.common.api.model.admin;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:00
 * Description: [adminBiz服务]
 */
public interface IAdminBizService {

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
	* 批量删除admin
	*
	* @param ids 需要删除的adminID
	* @return 结果
	*/
	public int deleteAdminByIds(Long[] ids);

	/**
	* 删除admin信息
	*
	* @param id adminID
	* @return 结果
	*/
	public int deleteAdminById(Long id);
	
}
