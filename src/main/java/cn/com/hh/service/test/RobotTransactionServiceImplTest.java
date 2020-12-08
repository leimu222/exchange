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
 * @date 2020-12-08 18:16:08
 * Description: [robot单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RobotTransactionServiceImplTest  {

	@Autowired
	private IRobotTransactionService robotTransactionService;

	/**
	* 查询robot
	*/
	@Test
	public void selectRobotTransactionById() {
		RobotTransaction robotTransaction = robotTransactionService.selectRobotTransactionById(1);
		System.out.println(robotTransaction.toString());
	}

	/**
	* 查询robot列表
	*/
	@Test
	public void selectRobotTransactionList() {
		List<RobotTransaction> list = robotTransactionService.selectRobotTransactionList(new RobotTransaction());
		for(RobotTransaction model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增robot
	*/
	@Test
	public void insertRobotTransaction() {
		for (int i = 1;i < 30; i++) {
			RobotTransaction robotTransaction = new RobotTransaction();
			robotTransactionService.insertRobotTransaction(robotTransaction);
		}
	}

	/**
	* 修改robot
	*/
	@Test
	public void updateRobotTransaction() {
		RobotTransaction robotTransaction = new RobotTransaction();
		robotTransactionService.updateRobotTransaction(robotTransaction);
	}

	/**
	* 批量删除robot
	*/
	@Test
	public void deleteRobotTransactionByIds() {
	}

	/**
	* 删除robot信息
	*/
	@Test
	public void deleteRobotTransactionById() {
	}

}
