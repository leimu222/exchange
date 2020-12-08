package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.UnblockMemberRobotMapper;
import com.common.api.model.UnblockMemberRobot;
import com.common.api.service.IUnblockMemberRobotService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [unblock服务实现]
 */
@Service
public class UnblockMemberRobotServiceImpl implements IUnblockMemberRobotService {
	@Autowired
	private UnblockMemberRobotMapper unblockMemberRobotMapper;

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	@Override
	public UnblockMemberRobot selectUnblockMemberRobotById(Long id) {
		return unblockMemberRobotMapper.selectUnblockMemberRobotById(id);
	}

	/**
	* 查询unblock列表
	*
	* @param unblockMemberRobot unblock
	* @return unblock
	*/
	@Override
	public List<UnblockMemberRobot> selectUnblockMemberRobotList(UnblockMemberRobot unblockMemberRobot) {
		return unblockMemberRobotMapper.selectUnblockMemberRobotList(unblockMemberRobot);
	}

	/**
	* 新增unblock
	*
	* @param unblockMemberRobot unblock
	* @return 结果
	*/
	@Override
	public int insertUnblockMemberRobot(UnblockMemberRobot unblockMemberRobot) {
		return unblockMemberRobotMapper.insertUnblockMemberRobot(unblockMemberRobot);
	}

	/**
	* 修改unblock
	*
	* @param unblockMemberRobot unblock
	* @return 结果
	*/
	@Override
	public int updateUnblockMemberRobot(UnblockMemberRobot unblockMemberRobot) {
		return unblockMemberRobotMapper.updateUnblockMemberRobot(unblockMemberRobot);
	}

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockMemberRobotByIds(Long[] ids) {
		return unblockMemberRobotMapper.deleteUnblockMemberRobotByIds(ids);
	}

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockMemberRobotById(Long id) {
		return unblockMemberRobotMapper.deleteUnblockMemberRobotById(id);
	}

}
