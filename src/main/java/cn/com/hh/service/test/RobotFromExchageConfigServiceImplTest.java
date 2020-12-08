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
public class RobotFromExchageConfigServiceImplTest  {

	@Autowired
	private IRobotFromExchageConfigService robotFromExchageConfigService;

	/**
	* 查询robot
	*/
	@Test
	public void selectRobotFromExchageConfigById() {
		RobotFromExchageConfig robotFromExchageConfig = robotFromExchageConfigService.selectRobotFromExchageConfigById(1);
		System.out.println(robotFromExchageConfig.toString());
	}

	/**
	* 查询robot列表
	*/
	@Test
	public void selectRobotFromExchageConfigList() {
		List<RobotFromExchageConfig> list = robotFromExchageConfigService.selectRobotFromExchageConfigList(new RobotFromExchageConfig());
		for(RobotFromExchageConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增robot
	*/
	@Test
	public void insertRobotFromExchageConfig() {
		for (int i = 1;i < 30; i++) {
			RobotFromExchageConfig robotFromExchageConfig = new RobotFromExchageConfig();
			robotFromExchageConfigService.insertRobotFromExchageConfig(robotFromExchageConfig);
		}
	}

	/**
	* 修改robot
	*/
	@Test
	public void updateRobotFromExchageConfig() {
		RobotFromExchageConfig robotFromExchageConfig = new RobotFromExchageConfig();
		robotFromExchageConfigService.updateRobotFromExchageConfig(robotFromExchageConfig);
	}

	/**
	* 批量删除robot
	*/
	@Test
	public void deleteRobotFromExchageConfigByIds() {
	}

	/**
	* 删除robot信息
	*/
	@Test
	public void deleteRobotFromExchageConfigById() {
	}

}
