package com.common.api.mapper;

import com.common.api.model.UnblockRobotTicket;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public interface UnblockRobotTicketMapper{

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	public UnblockRobotTicket selectUnblockRobotTicketById(String id);

	/**
	* 查询unblock列表
	*
	* @param unblockRobotTicket unblock
	* @return unblock集合
	*/
	public List<UnblockRobotTicket> selectUnblockRobotTicketList(UnblockRobotTicket unblockRobotTicket);

	/**
	* 新增unblock
	*
	* @param unblockRobotTicket unblock
	* @return 结果
	*/
	public int insertUnblockRobotTicket(UnblockRobotTicket unblockRobotTicket);

	/**
	* 修改unblock
	*
	* @param unblockRobotTicket unblock
	* @return 结果
	*/
	public int updateUnblockRobotTicket(UnblockRobotTicket unblockRobotTicket);

	/**
	* 删除unblock
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockRobotTicketById(String id);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteUnblockRobotTicketByIds(String[] ids);

}
