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
public class OptionStrategyConfigServiceImplTest  {

	@Autowired
	private IOptionStrategyConfigService optionStrategyConfigService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionStrategyConfigById() {
		OptionStrategyConfig optionStrategyConfig = optionStrategyConfigService.selectOptionStrategyConfigById(1);
		System.out.println(optionStrategyConfig.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionStrategyConfigList() {
		List<OptionStrategyConfig> list = optionStrategyConfigService.selectOptionStrategyConfigList(new OptionStrategyConfig());
		for(OptionStrategyConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionStrategyConfig() {
		for (int i = 1;i < 30; i++) {
			OptionStrategyConfig optionStrategyConfig = new OptionStrategyConfig();
			optionStrategyConfigService.insertOptionStrategyConfig(optionStrategyConfig);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionStrategyConfig() {
		OptionStrategyConfig optionStrategyConfig = new OptionStrategyConfig();
		optionStrategyConfigService.updateOptionStrategyConfig(optionStrategyConfig);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionStrategyConfigByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionStrategyConfigById() {
	}

}
