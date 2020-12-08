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
public class ExchangeRateServiceImplTest  {

	@Autowired
	private IExchangeRateService exchangeRateService;

	/**
	* 查询exchange
	*/
	@Test
	public void selectExchangeRateById() {
		ExchangeRate exchangeRate = exchangeRateService.selectExchangeRateById(1);
		System.out.println(exchangeRate.toString());
	}

	/**
	* 查询exchange列表
	*/
	@Test
	public void selectExchangeRateList() {
		List<ExchangeRate> list = exchangeRateService.selectExchangeRateList(new ExchangeRate());
		for(ExchangeRate model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增exchange
	*/
	@Test
	public void insertExchangeRate() {
		for (int i = 1;i < 30; i++) {
			ExchangeRate exchangeRate = new ExchangeRate();
			exchangeRateService.insertExchangeRate(exchangeRate);
		}
	}

	/**
	* 修改exchange
	*/
	@Test
	public void updateExchangeRate() {
		ExchangeRate exchangeRate = new ExchangeRate();
		exchangeRateService.updateExchangeRate(exchangeRate);
	}

	/**
	* 批量删除exchange
	*/
	@Test
	public void deleteExchangeRateByIds() {
	}

	/**
	* 删除exchange信息
	*/
	@Test
	public void deleteExchangeRateById() {
	}

}
