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
public class UnblockMemberRobotServiceImplTest  {

	@Autowired
	private IUnblockMemberRobotService unblockMemberRobotService;

	/**
	* 查询unblock
	*/
	@Test
	public void selectUnblockMemberRobotById() {
		UnblockMemberRobot unblockMemberRobot = unblockMemberRobotService.selectUnblockMemberRobotById(1);
		System.out.println(unblockMemberRobot.toString());
	}

	/**
	* 查询unblock列表
	*/
	@Test
	public void selectUnblockMemberRobotList() {
		List<UnblockMemberRobot> list = unblockMemberRobotService.selectUnblockMemberRobotList(new UnblockMemberRobot());
		for(UnblockMemberRobot model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增unblock
	*/
	@Test
	public void insertUnblockMemberRobot() {
		for (int i = 1;i < 30; i++) {
			UnblockMemberRobot unblockMemberRobot = new UnblockMemberRobot();
			unblockMemberRobotService.insertUnblockMemberRobot(unblockMemberRobot);
		}
	}

	/**
	* 修改unblock
	*/
	@Test
	public void updateUnblockMemberRobot() {
		UnblockMemberRobot unblockMemberRobot = new UnblockMemberRobot();
		unblockMemberRobotService.updateUnblockMemberRobot(unblockMemberRobot);
	}

	/**
	* 批量删除unblock
	*/
	@Test
	public void deleteUnblockMemberRobotByIds() {
	}

	/**
	* 删除unblock信息
	*/
	@Test
	public void deleteUnblockMemberRobotById() {
	}

}
