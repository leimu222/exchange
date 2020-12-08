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
public class OptionMemberTransferRecordServiceImplTest  {

	@Autowired
	private IOptionMemberTransferRecordService optionMemberTransferRecordService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionMemberTransferRecordById() {
		OptionMemberTransferRecord optionMemberTransferRecord = optionMemberTransferRecordService.selectOptionMemberTransferRecordById(1);
		System.out.println(optionMemberTransferRecord.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionMemberTransferRecordList() {
		List<OptionMemberTransferRecord> list = optionMemberTransferRecordService.selectOptionMemberTransferRecordList(new OptionMemberTransferRecord());
		for(OptionMemberTransferRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionMemberTransferRecord() {
		for (int i = 1;i < 30; i++) {
			OptionMemberTransferRecord optionMemberTransferRecord = new OptionMemberTransferRecord();
			optionMemberTransferRecordService.insertOptionMemberTransferRecord(optionMemberTransferRecord);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionMemberTransferRecord() {
		OptionMemberTransferRecord optionMemberTransferRecord = new OptionMemberTransferRecord();
		optionMemberTransferRecordService.updateOptionMemberTransferRecord(optionMemberTransferRecord);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionMemberTransferRecordByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionMemberTransferRecordById() {
	}

}
