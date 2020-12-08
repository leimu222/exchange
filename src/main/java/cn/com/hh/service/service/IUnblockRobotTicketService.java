package com.common.api.service;

import java.util.List;

import com.common.api.model.unblockRobotTicket;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [unblock服务]
 */
public interface IUnblockRobotTicketService {

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
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	public int deleteUnblockRobotTicketByIds(String[] ids);

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockRobotTicketById(String id);
	
}
