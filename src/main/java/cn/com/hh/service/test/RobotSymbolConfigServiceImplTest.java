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
public class RobotSymbolConfigServiceImplTest  {

	@Autowired
	private IRobotSymbolConfigService robotSymbolConfigService;

	/**
	* 查询robot
	*/
	@Test
	public void selectRobotSymbolConfigById() {
		RobotSymbolConfig robotSymbolConfig = robotSymbolConfigService.selectRobotSymbolConfigById(1);
		System.out.println(robotSymbolConfig.toString());
	}

	/**
	* 查询robot列表
	*/
	@Test
	public void selectRobotSymbolConfigList() {
		List<RobotSymbolConfig> list = robotSymbolConfigService.selectRobotSymbolConfigList(new RobotSymbolConfig());
		for(RobotSymbolConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增robot
	*/
	@Test
	public void insertRobotSymbolConfig() {
		for (int i = 1;i < 30; i++) {
			RobotSymbolConfig robotSymbolConfig = new RobotSymbolConfig();
			robotSymbolConfigService.insertRobotSymbolConfig(robotSymbolConfig);
		}
	}

	/**
	* 修改robot
	*/
	@Test
	public void updateRobotSymbolConfig() {
		RobotSymbolConfig robotSymbolConfig = new RobotSymbolConfig();
		robotSymbolConfigService.updateRobotSymbolConfig(robotSymbolConfig);
	}

	/**
	* 批量删除robot
	*/
	@Test
	public void deleteRobotSymbolConfigByIds() {
	}

	/**
	* 删除robot信息
	*/
	@Test
	public void deleteRobotSymbolConfigById() {
	}

}
