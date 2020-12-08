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
 * Description: [sys单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysCommonConfigServiceImplTest  {

	@Autowired
	private ISysCommonConfigService sysCommonConfigService;

	/**
	* 查询sys
	*/
	@Test
	public void selectSysCommonConfigById() {
		SysCommonConfig sysCommonConfig = sysCommonConfigService.selectSysCommonConfigById(1);
		System.out.println(sysCommonConfig.toString());
	}

	/**
	* 查询sys列表
	*/
	@Test
	public void selectSysCommonConfigList() {
		List<SysCommonConfig> list = sysCommonConfigService.selectSysCommonConfigList(new SysCommonConfig());
		for(SysCommonConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增sys
	*/
	@Test
	public void insertSysCommonConfig() {
		for (int i = 1;i < 30; i++) {
			SysCommonConfig sysCommonConfig = new SysCommonConfig();
			sysCommonConfigService.insertSysCommonConfig(sysCommonConfig);
		}
	}

	/**
	* 修改sys
	*/
	@Test
	public void updateSysCommonConfig() {
		SysCommonConfig sysCommonConfig = new SysCommonConfig();
		sysCommonConfigService.updateSysCommonConfig(sysCommonConfig);
	}

	/**
	* 批量删除sys
	*/
	@Test
	public void deleteSysCommonConfigByIds() {
	}

	/**
	* 删除sys信息
	*/
	@Test
	public void deleteSysCommonConfigById() {
	}

}
