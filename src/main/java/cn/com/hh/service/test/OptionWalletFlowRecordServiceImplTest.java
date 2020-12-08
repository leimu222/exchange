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
public class OptionWalletFlowRecordServiceImplTest  {

	@Autowired
	private IOptionWalletFlowRecordService optionWalletFlowRecordService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionWalletFlowRecordById() {
		OptionWalletFlowRecord optionWalletFlowRecord = optionWalletFlowRecordService.selectOptionWalletFlowRecordById(1);
		System.out.println(optionWalletFlowRecord.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionWalletFlowRecordList() {
		List<OptionWalletFlowRecord> list = optionWalletFlowRecordService.selectOptionWalletFlowRecordList(new OptionWalletFlowRecord());
		for(OptionWalletFlowRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionWalletFlowRecord() {
		for (int i = 1;i < 30; i++) {
			OptionWalletFlowRecord optionWalletFlowRecord = new OptionWalletFlowRecord();
			optionWalletFlowRecordService.insertOptionWalletFlowRecord(optionWalletFlowRecord);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionWalletFlowRecord() {
		OptionWalletFlowRecord optionWalletFlowRecord = new OptionWalletFlowRecord();
		optionWalletFlowRecordService.updateOptionWalletFlowRecord(optionWalletFlowRecord);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionWalletFlowRecordByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionWalletFlowRecordById() {
	}

}
