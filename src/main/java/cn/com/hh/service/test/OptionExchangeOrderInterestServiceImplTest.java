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
public class OptionExchangeOrderInterestServiceImplTest  {

	@Autowired
	private IOptionExchangeOrderInterestService optionExchangeOrderInterestService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionExchangeOrderInterestById() {
		OptionExchangeOrderInterest optionExchangeOrderInterest = optionExchangeOrderInterestService.selectOptionExchangeOrderInterestById(1);
		System.out.println(optionExchangeOrderInterest.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionExchangeOrderInterestList() {
		List<OptionExchangeOrderInterest> list = optionExchangeOrderInterestService.selectOptionExchangeOrderInterestList(new OptionExchangeOrderInterest());
		for(OptionExchangeOrderInterest model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionExchangeOrderInterest() {
		for (int i = 1;i < 30; i++) {
			OptionExchangeOrderInterest optionExchangeOrderInterest = new OptionExchangeOrderInterest();
			optionExchangeOrderInterestService.insertOptionExchangeOrderInterest(optionExchangeOrderInterest);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionExchangeOrderInterest() {
		OptionExchangeOrderInterest optionExchangeOrderInterest = new OptionExchangeOrderInterest();
		optionExchangeOrderInterestService.updateOptionExchangeOrderInterest(optionExchangeOrderInterest);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionExchangeOrderInterestByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionExchangeOrderInterestById() {
	}

}
