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
public class RewardPromotionSettingServiceImplTest  {

	@Autowired
	private IRewardPromotionSettingService rewardPromotionSettingService;

	/**
	* 查询reward
	*/
	@Test
	public void selectRewardPromotionSettingById() {
		RewardPromotionSetting rewardPromotionSetting = rewardPromotionSettingService.selectRewardPromotionSettingById(1);
		System.out.println(rewardPromotionSetting.toString());
	}

	/**
	* 查询reward列表
	*/
	@Test
	public void selectRewardPromotionSettingList() {
		List<RewardPromotionSetting> list = rewardPromotionSettingService.selectRewardPromotionSettingList(new RewardPromotionSetting());
		for(RewardPromotionSetting model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增reward
	*/
	@Test
	public void insertRewardPromotionSetting() {
		for (int i = 1;i < 30; i++) {
			RewardPromotionSetting rewardPromotionSetting = new RewardPromotionSetting();
			rewardPromotionSettingService.insertRewardPromotionSetting(rewardPromotionSetting);
		}
	}

	/**
	* 修改reward
	*/
	@Test
	public void updateRewardPromotionSetting() {
		RewardPromotionSetting rewardPromotionSetting = new RewardPromotionSetting();
		rewardPromotionSettingService.updateRewardPromotionSetting(rewardPromotionSetting);
	}

	/**
	* 批量删除reward
	*/
	@Test
	public void deleteRewardPromotionSettingByIds() {
	}

	/**
	* 删除reward信息
	*/
	@Test
	public void deleteRewardPromotionSettingById() {
	}

}
