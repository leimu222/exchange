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
public class OptionStrategyExchangeConfigServiceImplTest  {

	@Autowired
	private IOptionStrategyExchangeConfigService optionStrategyExchangeConfigService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionStrategyExchangeConfigById() {
		OptionStrategyExchangeConfig optionStrategyExchangeConfig = optionStrategyExchangeConfigService.selectOptionStrategyExchangeConfigById(1);
		System.out.println(optionStrategyExchangeConfig.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionStrategyExchangeConfigList() {
		List<OptionStrategyExchangeConfig> list = optionStrategyExchangeConfigService.selectOptionStrategyExchangeConfigList(new OptionStrategyExchangeConfig());
		for(OptionStrategyExchangeConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionStrategyExchangeConfig() {
		for (int i = 1;i < 30; i++) {
			OptionStrategyExchangeConfig optionStrategyExchangeConfig = new OptionStrategyExchangeConfig();
			optionStrategyExchangeConfigService.insertOptionStrategyExchangeConfig(optionStrategyExchangeConfig);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionStrategyExchangeConfig() {
		OptionStrategyExchangeConfig optionStrategyExchangeConfig = new OptionStrategyExchangeConfig();
		optionStrategyExchangeConfigService.updateOptionStrategyExchangeConfig(optionStrategyExchangeConfig);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionStrategyExchangeConfigByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionStrategyExchangeConfigById() {
	}

}
