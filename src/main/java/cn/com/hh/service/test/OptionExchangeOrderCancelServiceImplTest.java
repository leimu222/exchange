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
public class OptionExchangeOrderCancelServiceImplTest  {

	@Autowired
	private IOptionExchangeOrderCancelService optionExchangeOrderCancelService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionExchangeOrderCancelById() {
		OptionExchangeOrderCancel optionExchangeOrderCancel = optionExchangeOrderCancelService.selectOptionExchangeOrderCancelById(1);
		System.out.println(optionExchangeOrderCancel.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionExchangeOrderCancelList() {
		List<OptionExchangeOrderCancel> list = optionExchangeOrderCancelService.selectOptionExchangeOrderCancelList(new OptionExchangeOrderCancel());
		for(OptionExchangeOrderCancel model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionExchangeOrderCancel() {
		for (int i = 1;i < 30; i++) {
			OptionExchangeOrderCancel optionExchangeOrderCancel = new OptionExchangeOrderCancel();
			optionExchangeOrderCancelService.insertOptionExchangeOrderCancel(optionExchangeOrderCancel);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionExchangeOrderCancel() {
		OptionExchangeOrderCancel optionExchangeOrderCancel = new OptionExchangeOrderCancel();
		optionExchangeOrderCancelService.updateOptionExchangeOrderCancel(optionExchangeOrderCancel);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionExchangeOrderCancelByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionExchangeOrderCancelById() {
	}

}
