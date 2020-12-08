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
 * @date 2020-12-08 18:16:07
 * Description: [option单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OptionRobotSymbolConfigServiceImplTest  {

	@Autowired
	private IOptionRobotSymbolConfigService optionRobotSymbolConfigService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionRobotSymbolConfigById() {
		OptionRobotSymbolConfig optionRobotSymbolConfig = optionRobotSymbolConfigService.selectOptionRobotSymbolConfigById(1);
		System.out.println(optionRobotSymbolConfig.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionRobotSymbolConfigList() {
		List<OptionRobotSymbolConfig> list = optionRobotSymbolConfigService.selectOptionRobotSymbolConfigList(new OptionRobotSymbolConfig());
		for(OptionRobotSymbolConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionRobotSymbolConfig() {
		for (int i = 1;i < 30; i++) {
			OptionRobotSymbolConfig optionRobotSymbolConfig = new OptionRobotSymbolConfig();
			optionRobotSymbolConfigService.insertOptionRobotSymbolConfig(optionRobotSymbolConfig);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionRobotSymbolConfig() {
		OptionRobotSymbolConfig optionRobotSymbolConfig = new OptionRobotSymbolConfig();
		optionRobotSymbolConfigService.updateOptionRobotSymbolConfig(optionRobotSymbolConfig);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionRobotSymbolConfigByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionRobotSymbolConfigById() {
	}

}
