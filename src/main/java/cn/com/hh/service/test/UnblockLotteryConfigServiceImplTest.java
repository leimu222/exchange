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
public class UnblockLotteryConfigServiceImplTest  {

	@Autowired
	private IUnblockLotteryConfigService unblockLotteryConfigService;

	/**
	* 查询unblock
	*/
	@Test
	public void selectUnblockLotteryConfigById() {
		UnblockLotteryConfig unblockLotteryConfig = unblockLotteryConfigService.selectUnblockLotteryConfigById(1);
		System.out.println(unblockLotteryConfig.toString());
	}

	/**
	* 查询unblock列表
	*/
	@Test
	public void selectUnblockLotteryConfigList() {
		List<UnblockLotteryConfig> list = unblockLotteryConfigService.selectUnblockLotteryConfigList(new UnblockLotteryConfig());
		for(UnblockLotteryConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增unblock
	*/
	@Test
	public void insertUnblockLotteryConfig() {
		for (int i = 1;i < 30; i++) {
			UnblockLotteryConfig unblockLotteryConfig = new UnblockLotteryConfig();
			unblockLotteryConfigService.insertUnblockLotteryConfig(unblockLotteryConfig);
		}
	}

	/**
	* 修改unblock
	*/
	@Test
	public void updateUnblockLotteryConfig() {
		UnblockLotteryConfig unblockLotteryConfig = new UnblockLotteryConfig();
		unblockLotteryConfigService.updateUnblockLotteryConfig(unblockLotteryConfig);
	}

	/**
	* 批量删除unblock
	*/
	@Test
	public void deleteUnblockLotteryConfigByIds() {
	}

	/**
	* 删除unblock信息
	*/
	@Test
	public void deleteUnblockLotteryConfigById() {
	}

}
