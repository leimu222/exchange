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
 * @date 2020-12-08 18:16:05
 * Description: [gift单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GiftConfigServiceImplTest  {

	@Autowired
	private IGiftConfigService giftConfigService;

	/**
	* 查询gift
	*/
	@Test
	public void selectGiftConfigById() {
		GiftConfig giftConfig = giftConfigService.selectGiftConfigById(1);
		System.out.println(giftConfig.toString());
	}

	/**
	* 查询gift列表
	*/
	@Test
	public void selectGiftConfigList() {
		List<GiftConfig> list = giftConfigService.selectGiftConfigList(new GiftConfig());
		for(GiftConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增gift
	*/
	@Test
	public void insertGiftConfig() {
		for (int i = 1;i < 30; i++) {
			GiftConfig giftConfig = new GiftConfig();
			giftConfigService.insertGiftConfig(giftConfig);
		}
	}

	/**
	* 修改gift
	*/
	@Test
	public void updateGiftConfig() {
		GiftConfig giftConfig = new GiftConfig();
		giftConfigService.updateGiftConfig(giftConfig);
	}

	/**
	* 批量删除gift
	*/
	@Test
	public void deleteGiftConfigByIds() {
	}

	/**
	* 删除gift信息
	*/
	@Test
	public void deleteGiftConfigById() {
	}

}
