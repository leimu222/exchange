package com.common.api.service;

import java.util.List;

import com.common.api.model.unblockMemberRobot;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [unblockBiz服务]
 */
public interface IUnblockMemberRobotBizService {

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	public UnblockMemberRobot selectUnblockMemberRobotById(Long id);

	/**
	* 查询unblock列表
	*
	* @param unblockMemberRobot unblock
	* @return unblock集合
	*/
	public List<UnblockMemberRobot> selectUnblockMemberRobotList(UnblockMemberRobot unblockMemberRobot);

	/**
	* 新增unblock
	*
	* @param unblockMemberRobot unblock
	* @return 结果
	*/
	public int insertUnblockMemberRobot(UnblockMemberRobot unblockMemberRobot);

	/**
	* 修改unblock
	*
	* @param unblockMemberRobot unblock
	* @return 结果
	*/
	public int updateUnblockMemberRobot(UnblockMemberRobot unblockMemberRobot);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	public int deleteUnblockMemberRobotByIds(Long[] ids);

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockMemberRobotById(Long id);
	
}
