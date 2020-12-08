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
public class OptionCommissionInfoServiceImplTest  {

	@Autowired
	private IOptionCommissionInfoService optionCommissionInfoService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionCommissionInfoById() {
		OptionCommissionInfo optionCommissionInfo = optionCommissionInfoService.selectOptionCommissionInfoById(1);
		System.out.println(optionCommissionInfo.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionCommissionInfoList() {
		List<OptionCommissionInfo> list = optionCommissionInfoService.selectOptionCommissionInfoList(new OptionCommissionInfo());
		for(OptionCommissionInfo model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionCommissionInfo() {
		for (int i = 1;i < 30; i++) {
			OptionCommissionInfo optionCommissionInfo = new OptionCommissionInfo();
			optionCommissionInfoService.insertOptionCommissionInfo(optionCommissionInfo);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionCommissionInfo() {
		OptionCommissionInfo optionCommissionInfo = new OptionCommissionInfo();
		optionCommissionInfoService.updateOptionCommissionInfo(optionCommissionInfo);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionCommissionInfoByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionCommissionInfoById() {
	}

}
