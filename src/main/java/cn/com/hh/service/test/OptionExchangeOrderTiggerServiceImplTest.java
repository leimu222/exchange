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
public class OptionExchangeOrderTiggerServiceImplTest  {

	@Autowired
	private IOptionExchangeOrderTiggerService optionExchangeOrderTiggerService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionExchangeOrderTiggerById() {
		OptionExchangeOrderTigger optionExchangeOrderTigger = optionExchangeOrderTiggerService.selectOptionExchangeOrderTiggerById(1);
		System.out.println(optionExchangeOrderTigger.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionExchangeOrderTiggerList() {
		List<OptionExchangeOrderTigger> list = optionExchangeOrderTiggerService.selectOptionExchangeOrderTiggerList(new OptionExchangeOrderTigger());
		for(OptionExchangeOrderTigger model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionExchangeOrderTigger() {
		for (int i = 1;i < 30; i++) {
			OptionExchangeOrderTigger optionExchangeOrderTigger = new OptionExchangeOrderTigger();
			optionExchangeOrderTiggerService.insertOptionExchangeOrderTigger(optionExchangeOrderTigger);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionExchangeOrderTigger() {
		OptionExchangeOrderTigger optionExchangeOrderTigger = new OptionExchangeOrderTigger();
		optionExchangeOrderTiggerService.updateOptionExchangeOrderTigger(optionExchangeOrderTigger);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionExchangeOrderTiggerByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionExchangeOrderTiggerById() {
	}

}
