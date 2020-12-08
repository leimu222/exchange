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
 * Description: [reward单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RewardActivitySettingServiceImplTest  {

	@Autowired
	private IRewardActivitySettingService rewardActivitySettingService;

	/**
	* 查询reward
	*/
	@Test
	public void selectRewardActivitySettingById() {
		RewardActivitySetting rewardActivitySetting = rewardActivitySettingService.selectRewardActivitySettingById(1);
		System.out.println(rewardActivitySetting.toString());
	}

	/**
	* 查询reward列表
	*/
	@Test
	public void selectRewardActivitySettingList() {
		List<RewardActivitySetting> list = rewardActivitySettingService.selectRewardActivitySettingList(new RewardActivitySetting());
		for(RewardActivitySetting model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增reward
	*/
	@Test
	public void insertRewardActivitySetting() {
		for (int i = 1;i < 30; i++) {
			RewardActivitySetting rewardActivitySetting = new RewardActivitySetting();
			rewardActivitySettingService.insertRewardActivitySetting(rewardActivitySetting);
		}
	}

	/**
	* 修改reward
	*/
	@Test
	public void updateRewardActivitySetting() {
		RewardActivitySetting rewardActivitySetting = new RewardActivitySetting();
		rewardActivitySettingService.updateRewardActivitySetting(rewardActivitySetting);
	}

	/**
	* 批量删除reward
	*/
	@Test
	public void deleteRewardActivitySettingByIds() {
	}

	/**
	* 删除reward信息
	*/
	@Test
	public void deleteRewardActivitySettingById() {
	}

}
