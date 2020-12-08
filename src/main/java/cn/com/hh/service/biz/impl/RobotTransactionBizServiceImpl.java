package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.RobotTransactionMapper;
import com.common.api.model.RobotTransaction;
import com.common.api.service.IRobotTransactionService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [robotBiz服务实现]
 */
@Service
public class RobotTransactionBizServiceImpl extends CommonService implements IRobotTransactionBizService {
	@Autowired
	private IRobotTransactionService robotTransactionService;

	/**
	* 查询robot
	*
	* @param id robotID
	* @return robot
	*/
	@Override
	public RobotTransaction selectRobotTransactionById(Long id) {
		return robotTransactionService.selectRobotTransactionById(id);
	}

	/**
	* 查询robot列表
	*
	* @param robotTransaction robot
	* @return robot
	*/
	@Override
	public List<RobotTransaction> selectRobotTransactionList(RobotTransaction robotTransaction) {
		return robotTransactionService.selectRobotTransactionList(robotTransaction);
	}

	/**
	* 新增robot
	*
	* @param robotTransaction robot
	* @return 结果
	*/
	@Override
	public int insertRobotTransaction(RobotTransaction robotTransaction) {
		return robotTransactionService.insertRobotTransaction(robotTransaction);
	}

	/**
	* 修改robot
	*
	* @param robotTransaction robot
	* @return 结果
	*/
	@Override
	public int updateRobotTransaction(RobotTransaction robotTransaction) {
		return robotTransactionService.updateRobotTransaction(robotTransaction);
	}

	/**
	* 批量删除robot
	*
	* @param ids 需要删除的robotID
	* @return 结果
	*/
	@Override
	public int deleteRobotTransactionByIds(Long[] ids) {
		return robotTransactionService.deleteRobotTransactionByIds(ids);
	}

	/**
	* 删除robot信息
	*
	* @param id robotID
	* @return 结果
	*/
	@Override
	public int deleteRobotTransactionById(Long id) {
		return robotTransactionService.deleteRobotTransactionById(id);
	}

}
