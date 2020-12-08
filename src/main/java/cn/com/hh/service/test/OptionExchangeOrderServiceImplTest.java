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
public class OptionExchangeOrderServiceImplTest  {

	@Autowired
	private IOptionExchangeOrderService optionExchangeOrderService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionExchangeOrderById() {
		OptionExchangeOrder optionExchangeOrder = optionExchangeOrderService.selectOptionExchangeOrderById(1);
		System.out.println(optionExchangeOrder.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionExchangeOrderList() {
		List<OptionExchangeOrder> list = optionExchangeOrderService.selectOptionExchangeOrderList(new OptionExchangeOrder());
		for(OptionExchangeOrder model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionExchangeOrder() {
		for (int i = 1;i < 30; i++) {
			OptionExchangeOrder optionExchangeOrder = new OptionExchangeOrder();
			optionExchangeOrderService.insertOptionExchangeOrder(optionExchangeOrder);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionExchangeOrder() {
		OptionExchangeOrder optionExchangeOrder = new OptionExchangeOrder();
		optionExchangeOrderService.updateOptionExchangeOrder(optionExchangeOrder);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionExchangeOrderByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionExchangeOrderById() {
	}

}
