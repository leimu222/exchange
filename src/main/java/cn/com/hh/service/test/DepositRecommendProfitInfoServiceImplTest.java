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
 * @date 2020-12-08 18:16:04
 * Description: [deposit单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepositRecommendProfitInfoServiceImplTest  {

	@Autowired
	private IDepositRecommendProfitInfoService depositRecommendProfitInfoService;

	/**
	* 查询deposit
	*/
	@Test
	public void selectDepositRecommendProfitInfoById() {
		DepositRecommendProfitInfo depositRecommendProfitInfo = depositRecommendProfitInfoService.selectDepositRecommendProfitInfoById(1);
		System.out.println(depositRecommendProfitInfo.toString());
	}

	/**
	* 查询deposit列表
	*/
	@Test
	public void selectDepositRecommendProfitInfoList() {
		List<DepositRecommendProfitInfo> list = depositRecommendProfitInfoService.selectDepositRecommendProfitInfoList(new DepositRecommendProfitInfo());
		for(DepositRecommendProfitInfo model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增deposit
	*/
	@Test
	public void insertDepositRecommendProfitInfo() {
		for (int i = 1;i < 30; i++) {
			DepositRecommendProfitInfo depositRecommendProfitInfo = new DepositRecommendProfitInfo();
			depositRecommendProfitInfoService.insertDepositRecommendProfitInfo(depositRecommendProfitInfo);
		}
	}

	/**
	* 修改deposit
	*/
	@Test
	public void updateDepositRecommendProfitInfo() {
		DepositRecommendProfitInfo depositRecommendProfitInfo = new DepositRecommendProfitInfo();
		depositRecommendProfitInfoService.updateDepositRecommendProfitInfo(depositRecommendProfitInfo);
	}

	/**
	* 批量删除deposit
	*/
	@Test
	public void deleteDepositRecommendProfitInfoByIds() {
	}

	/**
	* 删除deposit信息
	*/
	@Test
	public void deleteDepositRecommendProfitInfoById() {
	}

}
