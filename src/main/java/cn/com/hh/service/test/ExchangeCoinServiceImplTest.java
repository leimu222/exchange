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
 * Description: [exchange单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ExchangeCoinServiceImplTest  {

	@Autowired
	private IExchangeCoinService exchangeCoinService;

	/**
	* 查询exchange
	*/
	@Test
	public void selectExchangeCoinById() {
		ExchangeCoin exchangeCoin = exchangeCoinService.selectExchangeCoinById(1);
		System.out.println(exchangeCoin.toString());
	}

	/**
	* 查询exchange列表
	*/
	@Test
	public void selectExchangeCoinList() {
		List<ExchangeCoin> list = exchangeCoinService.selectExchangeCoinList(new ExchangeCoin());
		for(ExchangeCoin model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增exchange
	*/
	@Test
	public void insertExchangeCoin() {
		for (int i = 1;i < 30; i++) {
			ExchangeCoin exchangeCoin = new ExchangeCoin();
			exchangeCoinService.insertExchangeCoin(exchangeCoin);
		}
	}

	/**
	* 修改exchange
	*/
	@Test
	public void updateExchangeCoin() {
		ExchangeCoin exchangeCoin = new ExchangeCoin();
		exchangeCoinService.updateExchangeCoin(exchangeCoin);
	}

	/**
	* 批量删除exchange
	*/
	@Test
	public void deleteExchangeCoinByIds() {
	}

	/**
	* 删除exchange信息
	*/
	@Test
	public void deleteExchangeCoinById() {
	}

}
