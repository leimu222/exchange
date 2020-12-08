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
public class OptionMemberStatusRecordServiceImplTest  {

	@Autowired
	private IOptionMemberStatusRecordService optionMemberStatusRecordService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionMemberStatusRecordById() {
		OptionMemberStatusRecord optionMemberStatusRecord = optionMemberStatusRecordService.selectOptionMemberStatusRecordById(1);
		System.out.println(optionMemberStatusRecord.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionMemberStatusRecordList() {
		List<OptionMemberStatusRecord> list = optionMemberStatusRecordService.selectOptionMemberStatusRecordList(new OptionMemberStatusRecord());
		for(OptionMemberStatusRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionMemberStatusRecord() {
		for (int i = 1;i < 30; i++) {
			OptionMemberStatusRecord optionMemberStatusRecord = new OptionMemberStatusRecord();
			optionMemberStatusRecordService.insertOptionMemberStatusRecord(optionMemberStatusRecord);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionMemberStatusRecord() {
		OptionMemberStatusRecord optionMemberStatusRecord = new OptionMemberStatusRecord();
		optionMemberStatusRecordService.updateOptionMemberStatusRecord(optionMemberStatusRecord);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionMemberStatusRecordByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionMemberStatusRecordById() {
	}

}
