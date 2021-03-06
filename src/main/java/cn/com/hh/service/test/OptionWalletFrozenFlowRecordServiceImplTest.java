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
public class OptionWalletFrozenFlowRecordServiceImplTest  {

	@Autowired
	private IOptionWalletFrozenFlowRecordService optionWalletFrozenFlowRecordService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionWalletFrozenFlowRecordById() {
		OptionWalletFrozenFlowRecord optionWalletFrozenFlowRecord = optionWalletFrozenFlowRecordService.selectOptionWalletFrozenFlowRecordById(1);
		System.out.println(optionWalletFrozenFlowRecord.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionWalletFrozenFlowRecordList() {
		List<OptionWalletFrozenFlowRecord> list = optionWalletFrozenFlowRecordService.selectOptionWalletFrozenFlowRecordList(new OptionWalletFrozenFlowRecord());
		for(OptionWalletFrozenFlowRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionWalletFrozenFlowRecord() {
		for (int i = 1;i < 30; i++) {
			OptionWalletFrozenFlowRecord optionWalletFrozenFlowRecord = new OptionWalletFrozenFlowRecord();
			optionWalletFrozenFlowRecordService.insertOptionWalletFrozenFlowRecord(optionWalletFrozenFlowRecord);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionWalletFrozenFlowRecord() {
		OptionWalletFrozenFlowRecord optionWalletFrozenFlowRecord = new OptionWalletFrozenFlowRecord();
		optionWalletFrozenFlowRecordService.updateOptionWalletFrozenFlowRecord(optionWalletFrozenFlowRecord);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionWalletFrozenFlowRecordByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionWalletFrozenFlowRecordById() {
	}

}
