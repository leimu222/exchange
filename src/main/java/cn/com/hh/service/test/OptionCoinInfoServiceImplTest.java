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
public class OptionCoinInfoServiceImplTest  {

	@Autowired
	private IOptionCoinInfoService optionCoinInfoService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionCoinInfoById() {
		OptionCoinInfo optionCoinInfo = optionCoinInfoService.selectOptionCoinInfoById(1);
		System.out.println(optionCoinInfo.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionCoinInfoList() {
		List<OptionCoinInfo> list = optionCoinInfoService.selectOptionCoinInfoList(new OptionCoinInfo());
		for(OptionCoinInfo model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionCoinInfo() {
		for (int i = 1;i < 30; i++) {
			OptionCoinInfo optionCoinInfo = new OptionCoinInfo();
			optionCoinInfoService.insertOptionCoinInfo(optionCoinInfo);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionCoinInfo() {
		OptionCoinInfo optionCoinInfo = new OptionCoinInfo();
		optionCoinInfoService.updateOptionCoinInfo(optionCoinInfo);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionCoinInfoByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionCoinInfoById() {
	}

}
