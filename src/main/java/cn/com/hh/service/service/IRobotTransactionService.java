package com.common.api.service;

import java.util.List;

import com.common.api.model.robotTransaction;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [robot服务]
 */
public interface IRobotTransactionService {

	/**
	* 查询robot
	*
	* @param id robotID
	* @return robot
	*/
	public RobotTransaction selectRobotTransactionById(Long id);

	/**
	* 查询robot列表
	*
	* @param robotTransaction robot
	* @return robot集合
	*/
	public List<RobotTransaction> selectRobotTransactionList(RobotTransaction robotTransaction);

	/**
	* 新增robot
	*
	* @param robotTransaction robot
	* @return 结果
	*/
	public int insertRobotTransaction(RobotTransaction robotTransaction);

	/**
	* 修改robot
	*
	* @param robotTransaction robot
	* @return 结果
	*/
	public int updateRobotTransaction(RobotTransaction robotTransaction);

	/**
	* 批量删除robot
	*
	* @param ids 需要删除的robotID
	* @return 结果
	*/
	public int deleteRobotTransactionByIds(Long[] ids);

	/**
	* 删除robot信息
	*
	* @param id robotID
	* @return 结果
	*/
	public int deleteRobotTransactionById(Long id);
	
}
