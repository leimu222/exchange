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
public class DepositProfitInfoServiceImplTest  {

	@Autowired
	private IDepositProfitInfoService depositProfitInfoService;

	/**
	* 查询deposit
	*/
	@Test
	public void selectDepositProfitInfoById() {
		DepositProfitInfo depositProfitInfo = depositProfitInfoService.selectDepositProfitInfoById(1);
		System.out.println(depositProfitInfo.toString());
	}

	/**
	* 查询deposit列表
	*/
	@Test
	public void selectDepositProfitInfoList() {
		List<DepositProfitInfo> list = depositProfitInfoService.selectDepositProfitInfoList(new DepositProfitInfo());
		for(DepositProfitInfo model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增deposit
	*/
	@Test
	public void insertDepositProfitInfo() {
		for (int i = 1;i < 30; i++) {
			DepositProfitInfo depositProfitInfo = new DepositProfitInfo();
			depositProfitInfoService.insertDepositProfitInfo(depositProfitInfo);
		}
	}

	/**
	* 修改deposit
	*/
	@Test
	public void updateDepositProfitInfo() {
		DepositProfitInfo depositProfitInfo = new DepositProfitInfo();
		depositProfitInfoService.updateDepositProfitInfo(depositProfitInfo);
	}

	/**
	* 批量删除deposit
	*/
	@Test
	public void deleteDepositProfitInfoByIds() {
	}

	/**
	* 删除deposit信息
	*/
	@Test
	public void deleteDepositProfitInfoById() {
	}

}
