package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.UnblockRobotTicketMapper;
import com.common.api.model.UnblockRobotTicket;
import com.common.api.service.IUnblockRobotTicketService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [unblock服务实现]
 */
@Service
public class UnblockRobotTicketServiceImpl implements IUnblockRobotTicketService {
	@Autowired
	private UnblockRobotTicketMapper unblockRobotTicketMapper;

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	@Override
	public UnblockRobotTicket selectUnblockRobotTicketById(String id) {
		return unblockRobotTicketMapper.selectUnblockRobotTicketById(id);
	}

	/**
	* 查询unblock列表
	*
	* @param unblockRobotTicket unblock
	* @return unblock
	*/
	@Override
	public List<UnblockRobotTicket> selectUnblockRobotTicketList(UnblockRobotTicket unblockRobotTicket) {
		return unblockRobotTicketMapper.selectUnblockRobotTicketList(unblockRobotTicket);
	}

	/**
	* 新增unblock
	*
	* @param unblockRobotTicket unblock
	* @return 结果
	*/
	@Override
	public int insertUnblockRobotTicket(UnblockRobotTicket unblockRobotTicket) {
		return unblockRobotTicketMapper.insertUnblockRobotTicket(unblockRobotTicket);
	}

	/**
	* 修改unblock
	*
	* @param unblockRobotTicket unblock
	* @return 结果
	*/
	@Override
	public int updateUnblockRobotTicket(UnblockRobotTicket unblockRobotTicket) {
		return unblockRobotTicketMapper.updateUnblockRobotTicket(unblockRobotTicket);
	}

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockRobotTicketByIds(String[] ids) {
		return unblockRobotTicketMapper.deleteUnblockRobotTicketByIds(ids);
	}

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockRobotTicketById(String id) {
		return unblockRobotTicketMapper.deleteUnblockRobotTicketById(id);
	}

}
