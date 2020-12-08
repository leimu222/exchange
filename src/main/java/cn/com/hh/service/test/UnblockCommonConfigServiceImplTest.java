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
public class UnblockCommonConfigServiceImplTest  {

	@Autowired
	private IUnblockCommonConfigService unblockCommonConfigService;

	/**
	* 查询unblock
	*/
	@Test
	public void selectUnblockCommonConfigById() {
		UnblockCommonConfig unblockCommonConfig = unblockCommonConfigService.selectUnblockCommonConfigById(1);
		System.out.println(unblockCommonConfig.toString());
	}

	/**
	* 查询unblock列表
	*/
	@Test
	public void selectUnblockCommonConfigList() {
		List<UnblockCommonConfig> list = unblockCommonConfigService.selectUnblockCommonConfigList(new UnblockCommonConfig());
		for(UnblockCommonConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增unblock
	*/
	@Test
	public void insertUnblockCommonConfig() {
		for (int i = 1;i < 30; i++) {
			UnblockCommonConfig unblockCommonConfig = new UnblockCommonConfig();
			unblockCommonConfigService.insertUnblockCommonConfig(unblockCommonConfig);
		}
	}

	/**
	* 修改unblock
	*/
	@Test
	public void updateUnblockCommonConfig() {
		UnblockCommonConfig unblockCommonConfig = new UnblockCommonConfig();
		unblockCommonConfigService.updateUnblockCommonConfig(unblockCommonConfig);
	}

	/**
	* 批量删除unblock
	*/
	@Test
	public void deleteUnblockCommonConfigByIds() {
	}

	/**
	* 删除unblock信息
	*/
	@Test
	public void deleteUnblockCommonConfigById() {
	}

}
