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
public class UnblockMemberRewardServiceImplTest  {

	@Autowired
	private IUnblockMemberRewardService unblockMemberRewardService;

	/**
	* 查询unblock
	*/
	@Test
	public void selectUnblockMemberRewardById() {
		UnblockMemberReward unblockMemberReward = unblockMemberRewardService.selectUnblockMemberRewardById(1);
		System.out.println(unblockMemberReward.toString());
	}

	/**
	* 查询unblock列表
	*/
	@Test
	public void selectUnblockMemberRewardList() {
		List<UnblockMemberReward> list = unblockMemberRewardService.selectUnblockMemberRewardList(new UnblockMemberReward());
		for(UnblockMemberReward model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增unblock
	*/
	@Test
	public void insertUnblockMemberReward() {
		for (int i = 1;i < 30; i++) {
			UnblockMemberReward unblockMemberReward = new UnblockMemberReward();
			unblockMemberRewardService.insertUnblockMemberReward(unblockMemberReward);
		}
	}

	/**
	* 修改unblock
	*/
	@Test
	public void updateUnblockMemberReward() {
		UnblockMemberReward unblockMemberReward = new UnblockMemberReward();
		unblockMemberRewardService.updateUnblockMemberReward(unblockMemberReward);
	}

	/**
	* 批量删除unblock
	*/
	@Test
	public void deleteUnblockMemberRewardByIds() {
	}

	/**
	* 删除unblock信息
	*/
	@Test
	public void deleteUnblockMemberRewardById() {
	}

}
