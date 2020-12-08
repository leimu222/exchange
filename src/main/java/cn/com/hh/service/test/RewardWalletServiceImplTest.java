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
public class RewardWalletServiceImplTest  {

	@Autowired
	private IRewardWalletService rewardWalletService;

	/**
	* 查询reward
	*/
	@Test
	public void selectRewardWalletById() {
		RewardWallet rewardWallet = rewardWalletService.selectRewardWalletById(1);
		System.out.println(rewardWallet.toString());
	}

	/**
	* 查询reward列表
	*/
	@Test
	public void selectRewardWalletList() {
		List<RewardWallet> list = rewardWalletService.selectRewardWalletList(new RewardWallet());
		for(RewardWallet model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增reward
	*/
	@Test
	public void insertRewardWallet() {
		for (int i = 1;i < 30; i++) {
			RewardWallet rewardWallet = new RewardWallet();
			rewardWalletService.insertRewardWallet(rewardWallet);
		}
	}

	/**
	* 修改reward
	*/
	@Test
	public void updateRewardWallet() {
		RewardWallet rewardWallet = new RewardWallet();
		rewardWalletService.updateRewardWallet(rewardWallet);
	}

	/**
	* 批量删除reward
	*/
	@Test
	public void deleteRewardWalletByIds() {
	}

	/**
	* 删除reward信息
	*/
	@Test
	public void deleteRewardWalletById() {
	}

}
