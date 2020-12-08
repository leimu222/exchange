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
public class OptionWalletExplodeRecordServiceImplTest  {

	@Autowired
	private IOptionWalletExplodeRecordService optionWalletExplodeRecordService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionWalletExplodeRecordById() {
		OptionWalletExplodeRecord optionWalletExplodeRecord = optionWalletExplodeRecordService.selectOptionWalletExplodeRecordById(1);
		System.out.println(optionWalletExplodeRecord.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionWalletExplodeRecordList() {
		List<OptionWalletExplodeRecord> list = optionWalletExplodeRecordService.selectOptionWalletExplodeRecordList(new OptionWalletExplodeRecord());
		for(OptionWalletExplodeRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionWalletExplodeRecord() {
		for (int i = 1;i < 30; i++) {
			OptionWalletExplodeRecord optionWalletExplodeRecord = new OptionWalletExplodeRecord();
			optionWalletExplodeRecordService.insertOptionWalletExplodeRecord(optionWalletExplodeRecord);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionWalletExplodeRecord() {
		OptionWalletExplodeRecord optionWalletExplodeRecord = new OptionWalletExplodeRecord();
		optionWalletExplodeRecordService.updateOptionWalletExplodeRecord(optionWalletExplodeRecord);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionWalletExplodeRecordByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionWalletExplodeRecordById() {
	}

}
