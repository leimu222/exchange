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
 * @date 2020-12-08 18:16:06
 * Description: [option单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OptionCoinServiceImplTest  {

	@Autowired
	private IOptionCoinService optionCoinService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionCoinById() {
		OptionCoin optionCoin = optionCoinService.selectOptionCoinById(1);
		System.out.println(optionCoin.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionCoinList() {
		List<OptionCoin> list = optionCoinService.selectOptionCoinList(new OptionCoin());
		for(OptionCoin model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionCoin() {
		for (int i = 1;i < 30; i++) {
			OptionCoin optionCoin = new OptionCoin();
			optionCoinService.insertOptionCoin(optionCoin);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionCoin() {
		OptionCoin optionCoin = new OptionCoin();
		optionCoinService.updateOptionCoin(optionCoin);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionCoinByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionCoinById() {
	}

}
