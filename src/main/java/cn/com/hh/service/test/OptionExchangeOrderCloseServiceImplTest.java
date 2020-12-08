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
public class OptionExchangeOrderCloseServiceImplTest  {

	@Autowired
	private IOptionExchangeOrderCloseService optionExchangeOrderCloseService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionExchangeOrderCloseById() {
		OptionExchangeOrderClose optionExchangeOrderClose = optionExchangeOrderCloseService.selectOptionExchangeOrderCloseById(1);
		System.out.println(optionExchangeOrderClose.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionExchangeOrderCloseList() {
		List<OptionExchangeOrderClose> list = optionExchangeOrderCloseService.selectOptionExchangeOrderCloseList(new OptionExchangeOrderClose());
		for(OptionExchangeOrderClose model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionExchangeOrderClose() {
		for (int i = 1;i < 30; i++) {
			OptionExchangeOrderClose optionExchangeOrderClose = new OptionExchangeOrderClose();
			optionExchangeOrderCloseService.insertOptionExchangeOrderClose(optionExchangeOrderClose);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionExchangeOrderClose() {
		OptionExchangeOrderClose optionExchangeOrderClose = new OptionExchangeOrderClose();
		optionExchangeOrderCloseService.updateOptionExchangeOrderClose(optionExchangeOrderClose);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionExchangeOrderCloseByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionExchangeOrderCloseById() {
	}

}
