package com.common.api.service;

import java.util.List;

import com.common.api.model.adminAccessLog;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:00
 * Description: [admin服务]
 */
public interface IAdminAccessLogService {

	/**
	* 查询admin
	*
	* @param id adminID
	* @return admin
	*/
	public AdminAccessLog selectAdminAccessLogById(Long id);

	/**
	* 查询admin列表
	*
	* @param adminAccessLog admin
	* @return admin集合
	*/
	public List<AdminAccessLog> selectAdminAccessLogList(AdminAccessLog adminAccessLog);

	/**
	* 新增admin
	*
	* @param adminAccessLog admin
	* @return 结果
	*/
	public int insertAdminAccessLog(AdminAccessLog adminAccessLog);

	/**
	* 修改admin
	*
	* @param adminAccessLog admin
	* @return 结果
	*/
	public int updateAdminAccessLog(AdminAccessLog adminAccessLog);

	/**
	* 批量删除admin
	*
	* @param ids 需要删除的adminID
	* @return 结果
	*/
	public int deleteAdminAccessLogByIds(Long[] ids);

	/**
	* 删除admin信息
	*
	* @param id adminID
	* @return 结果
	*/
	public int deleteAdminAccessLogById(Long id);
	
}
