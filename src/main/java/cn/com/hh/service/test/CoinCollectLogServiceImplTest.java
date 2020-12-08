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
 * @date 2020-12-08 18:16:01
 * Description: [coin单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CoinCollectLogServiceImplTest  {

	@Autowired
	private ICoinCollectLogService coinCollectLogService;

	/**
	* 查询coin
	*/
	@Test
	public void selectCoinCollectLogById() {
		CoinCollectLog coinCollectLog = coinCollectLogService.selectCoinCollectLogById(1);
		System.out.println(coinCollectLog.toString());
	}

	/**
	* 查询coin列表
	*/
	@Test
	public void selectCoinCollectLogList() {
		List<CoinCollectLog> list = coinCollectLogService.selectCoinCollectLogList(new CoinCollectLog());
		for(CoinCollectLog model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增coin
	*/
	@Test
	public void insertCoinCollectLog() {
		for (int i = 1;i < 30; i++) {
			CoinCollectLog coinCollectLog = new CoinCollectLog();
			coinCollectLogService.insertCoinCollectLog(coinCollectLog);
		}
	}

	/**
	* 修改coin
	*/
	@Test
	public void updateCoinCollectLog() {
		CoinCollectLog coinCollectLog = new CoinCollectLog();
		coinCollectLogService.updateCoinCollectLog(coinCollectLog);
	}

	/**
	* 批量删除coin
	*/
	@Test
	public void deleteCoinCollectLogByIds() {
	}

	/**
	* 删除coin信息
	*/
	@Test
	public void deleteCoinCollectLogById() {
	}

}
