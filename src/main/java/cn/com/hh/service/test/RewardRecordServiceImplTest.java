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
public class RewardRecordServiceImplTest  {

	@Autowired
	private IRewardRecordService rewardRecordService;

	/**
	* 查询reward
	*/
	@Test
	public void selectRewardRecordById() {
		RewardRecord rewardRecord = rewardRecordService.selectRewardRecordById(1);
		System.out.println(rewardRecord.toString());
	}

	/**
	* 查询reward列表
	*/
	@Test
	public void selectRewardRecordList() {
		List<RewardRecord> list = rewardRecordService.selectRewardRecordList(new RewardRecord());
		for(RewardRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增reward
	*/
	@Test
	public void insertRewardRecord() {
		for (int i = 1;i < 30; i++) {
			RewardRecord rewardRecord = new RewardRecord();
			rewardRecordService.insertRewardRecord(rewardRecord);
		}
	}

	/**
	* 修改reward
	*/
	@Test
	public void updateRewardRecord() {
		RewardRecord rewardRecord = new RewardRecord();
		rewardRecordService.updateRewardRecord(rewardRecord);
	}

	/**
	* 批量删除reward
	*/
	@Test
	public void deleteRewardRecordByIds() {
	}

	/**
	* 删除reward信息
	*/
	@Test
	public void deleteRewardRecordById() {
	}

}
