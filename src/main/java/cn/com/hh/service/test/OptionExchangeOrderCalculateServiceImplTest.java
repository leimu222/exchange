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
public class OptionExchangeOrderCalculateServiceImplTest  {

	@Autowired
	private IOptionExchangeOrderCalculateService optionExchangeOrderCalculateService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionExchangeOrderCalculateById() {
		OptionExchangeOrderCalculate optionExchangeOrderCalculate = optionExchangeOrderCalculateService.selectOptionExchangeOrderCalculateById(1);
		System.out.println(optionExchangeOrderCalculate.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionExchangeOrderCalculateList() {
		List<OptionExchangeOrderCalculate> list = optionExchangeOrderCalculateService.selectOptionExchangeOrderCalculateList(new OptionExchangeOrderCalculate());
		for(OptionExchangeOrderCalculate model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionExchangeOrderCalculate() {
		for (int i = 1;i < 30; i++) {
			OptionExchangeOrderCalculate optionExchangeOrderCalculate = new OptionExchangeOrderCalculate();
			optionExchangeOrderCalculateService.insertOptionExchangeOrderCalculate(optionExchangeOrderCalculate);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionExchangeOrderCalculate() {
		OptionExchangeOrderCalculate optionExchangeOrderCalculate = new OptionExchangeOrderCalculate();
		optionExchangeOrderCalculateService.updateOptionExchangeOrderCalculate(optionExchangeOrderCalculate);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionExchangeOrderCalculateByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionExchangeOrderCalculateById() {
	}

}
