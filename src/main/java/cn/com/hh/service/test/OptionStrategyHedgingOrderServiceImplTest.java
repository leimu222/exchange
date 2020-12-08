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
 * @date 2020-12-08 18:16:07
 * Description: [option单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OptionStrategyHedgingOrderServiceImplTest  {

	@Autowired
	private IOptionStrategyHedgingOrderService optionStrategyHedgingOrderService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionStrategyHedgingOrderById() {
		OptionStrategyHedgingOrder optionStrategyHedgingOrder = optionStrategyHedgingOrderService.selectOptionStrategyHedgingOrderById(1);
		System.out.println(optionStrategyHedgingOrder.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionStrategyHedgingOrderList() {
		List<OptionStrategyHedgingOrder> list = optionStrategyHedgingOrderService.selectOptionStrategyHedgingOrderList(new OptionStrategyHedgingOrder());
		for(OptionStrategyHedgingOrder model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionStrategyHedgingOrder() {
		for (int i = 1;i < 30; i++) {
			OptionStrategyHedgingOrder optionStrategyHedgingOrder = new OptionStrategyHedgingOrder();
			optionStrategyHedgingOrderService.insertOptionStrategyHedgingOrder(optionStrategyHedgingOrder);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionStrategyHedgingOrder() {
		OptionStrategyHedgingOrder optionStrategyHedgingOrder = new OptionStrategyHedgingOrder();
		optionStrategyHedgingOrderService.updateOptionStrategyHedgingOrder(optionStrategyHedgingOrder);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionStrategyHedgingOrderByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionStrategyHedgingOrderById() {
	}

}
