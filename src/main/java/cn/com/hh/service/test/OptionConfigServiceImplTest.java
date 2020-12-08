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
 * @date 2020-12-08 18:16:06
 * Description: [option单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OptionConfigServiceImplTest  {

	@Autowired
	private IOptionConfigService optionConfigService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionConfigById() {
		OptionConfig optionConfig = optionConfigService.selectOptionConfigById(1);
		System.out.println(optionConfig.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionConfigList() {
		List<OptionConfig> list = optionConfigService.selectOptionConfigList(new OptionConfig());
		for(OptionConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionConfig() {
		for (int i = 1;i < 30; i++) {
			OptionConfig optionConfig = new OptionConfig();
			optionConfigService.insertOptionConfig(optionConfig);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionConfig() {
		OptionConfig optionConfig = new OptionConfig();
		optionConfigService.updateOptionConfig(optionConfig);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionConfigByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionConfigById() {
	}

}
