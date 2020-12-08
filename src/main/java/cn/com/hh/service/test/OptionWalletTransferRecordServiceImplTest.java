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
public class OptionWalletTransferRecordServiceImplTest  {

	@Autowired
	private IOptionWalletTransferRecordService optionWalletTransferRecordService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionWalletTransferRecordById() {
		OptionWalletTransferRecord optionWalletTransferRecord = optionWalletTransferRecordService.selectOptionWalletTransferRecordById(1);
		System.out.println(optionWalletTransferRecord.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionWalletTransferRecordList() {
		List<OptionWalletTransferRecord> list = optionWalletTransferRecordService.selectOptionWalletTransferRecordList(new OptionWalletTransferRecord());
		for(OptionWalletTransferRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionWalletTransferRecord() {
		for (int i = 1;i < 30; i++) {
			OptionWalletTransferRecord optionWalletTransferRecord = new OptionWalletTransferRecord();
			optionWalletTransferRecordService.insertOptionWalletTransferRecord(optionWalletTransferRecord);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionWalletTransferRecord() {
		OptionWalletTransferRecord optionWalletTransferRecord = new OptionWalletTransferRecord();
		optionWalletTransferRecordService.updateOptionWalletTransferRecord(optionWalletTransferRecord);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionWalletTransferRecordByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionWalletTransferRecordById() {
	}

}
