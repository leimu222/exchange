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
public class OptionExchangeOrderConditionRecordServiceImplTest  {

	@Autowired
	private IOptionExchangeOrderConditionRecordService optionExchangeOrderConditionRecordService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionExchangeOrderConditionRecordById() {
		OptionExchangeOrderConditionRecord optionExchangeOrderConditionRecord = optionExchangeOrderConditionRecordService.selectOptionExchangeOrderConditionRecordById(1);
		System.out.println(optionExchangeOrderConditionRecord.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionExchangeOrderConditionRecordList() {
		List<OptionExchangeOrderConditionRecord> list = optionExchangeOrderConditionRecordService.selectOptionExchangeOrderConditionRecordList(new OptionExchangeOrderConditionRecord());
		for(OptionExchangeOrderConditionRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionExchangeOrderConditionRecord() {
		for (int i = 1;i < 30; i++) {
			OptionExchangeOrderConditionRecord optionExchangeOrderConditionRecord = new OptionExchangeOrderConditionRecord();
			optionExchangeOrderConditionRecordService.insertOptionExchangeOrderConditionRecord(optionExchangeOrderConditionRecord);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionExchangeOrderConditionRecord() {
		OptionExchangeOrderConditionRecord optionExchangeOrderConditionRecord = new OptionExchangeOrderConditionRecord();
		optionExchangeOrderConditionRecordService.updateOptionExchangeOrderConditionRecord(optionExchangeOrderConditionRecord);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionExchangeOrderConditionRecordByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionExchangeOrderConditionRecordById() {
	}

}
