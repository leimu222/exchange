package com.common.api.mapper;

import com.common.api.model.AdminAccessLog;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:00
  * Description: [admin服务实现]
 */
public interface AdminAccessLogMapper{

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
	* 删除admin
	*
	* @param id adminID
	* @return 结果
	*/
	public int deleteAdminAccessLogById(Long id);

	/**
	* 批量删除admin
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteAdminAccessLogByIds(Long[] ids);

}
