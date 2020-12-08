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
public class OptionExchangeOrderFeeServiceImplTest  {

	@Autowired
	private IOptionExchangeOrderFeeService optionExchangeOrderFeeService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionExchangeOrderFeeById() {
		OptionExchangeOrderFee optionExchangeOrderFee = optionExchangeOrderFeeService.selectOptionExchangeOrderFeeById(1);
		System.out.println(optionExchangeOrderFee.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionExchangeOrderFeeList() {
		List<OptionExchangeOrderFee> list = optionExchangeOrderFeeService.selectOptionExchangeOrderFeeList(new OptionExchangeOrderFee());
		for(OptionExchangeOrderFee model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionExchangeOrderFee() {
		for (int i = 1;i < 30; i++) {
			OptionExchangeOrderFee optionExchangeOrderFee = new OptionExchangeOrderFee();
			optionExchangeOrderFeeService.insertOptionExchangeOrderFee(optionExchangeOrderFee);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionExchangeOrderFee() {
		OptionExchangeOrderFee optionExchangeOrderFee = new OptionExchangeOrderFee();
		optionExchangeOrderFeeService.updateOptionExchangeOrderFee(optionExchangeOrderFee);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionExchangeOrderFeeByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionExchangeOrderFeeById() {
	}

}
