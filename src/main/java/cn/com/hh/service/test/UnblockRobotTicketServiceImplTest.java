package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [unblock单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UnblockRobotTicketServiceImplTest  {

	@Autowired
	private IUnblockRobotTicketService unblockRobotTicketService;

	/**
	* 查询unblock
	*/
	@Test
	public void selectUnblockRobotTicketById() {
		UnblockRobotTicket unblockRobotTicket = unblockRobotTicketService.selectUnblockRobotTicketById(1);
		System.out.println(unblockRobotTicket.toString());
	}

	/**
	* 查询unblock列表
	*/
	@Test
	public void selectUnblockRobotTicketList() {
		List<UnblockRobotTicket> list = unblockRobotTicketService.selectUnblockRobotTicketList(new UnblockRobotTicket());
		for(UnblockRobotTicket model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增unblock
	*/
	@Test
	public void insertUnblockRobotTicket() {
		for (int i = 1;i < 30; i++) {
			UnblockRobotTicket unblockRobotTicket = new UnblockRobotTicket();
			unblockRobotTicketService.insertUnblockRobotTicket(unblockRobotTicket);
		}
	}

	/**
	* 修改unblock
	*/
	@Test
	public void updateUnblockRobotTicket() {
		UnblockRobotTicket unblockRobotTicket = new UnblockRobotTicket();
		unblockRobotTicketService.updateUnblockRobotTicket(unblockRobotTicket);
	}

	/**
	* 批量删除unblock
	*/
	@Test
	public void deleteUnblockRobotTicketByIds() {
	}

	/**
	* 删除unblock信息
	*/
	@Test
	public void deleteUnblockRobotTicketById() {
	}

}
