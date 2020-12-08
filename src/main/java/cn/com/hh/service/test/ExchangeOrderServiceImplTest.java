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
public class ExchangeOrderServiceImplTest  {

	@Autowired
	private IExchangeOrderService exchangeOrderService;

	/**
	* 查询exchange
	*/
	@Test
	public void selectExchangeOrderById() {
		ExchangeOrder exchangeOrder = exchangeOrderService.selectExchangeOrderById(1);
		System.out.println(exchangeOrder.toString());
	}

	/**
	* 查询exchange列表
	*/
	@Test
	public void selectExchangeOrderList() {
		List<ExchangeOrder> list = exchangeOrderService.selectExchangeOrderList(new ExchangeOrder());
		for(ExchangeOrder model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增exchange
	*/
	@Test
	public void insertExchangeOrder() {
		for (int i = 1;i < 30; i++) {
			ExchangeOrder exchangeOrder = new ExchangeOrder();
			exchangeOrderService.insertExchangeOrder(exchangeOrder);
		}
	}

	/**
	* 修改exchange
	*/
	@Test
	public void updateExchangeOrder() {
		ExchangeOrder exchangeOrder = new ExchangeOrder();
		exchangeOrderService.updateExchangeOrder(exchangeOrder);
	}

	/**
	* 批量删除exchange
	*/
	@Test
	public void deleteExchangeOrderByIds() {
	}

	/**
	* 删除exchange信息
	*/
	@Test
	public void deleteExchangeOrderById() {
	}

}
