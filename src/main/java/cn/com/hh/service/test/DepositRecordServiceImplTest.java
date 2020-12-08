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
 * @date 2020-12-08 18:16:04
 * Description: [deposit单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepositRecordServiceImplTest  {

	@Autowired
	private IDepositRecordService depositRecordService;

	/**
	* 查询deposit
	*/
	@Test
	public void selectDepositRecordById() {
		DepositRecord depositRecord = depositRecordService.selectDepositRecordById(1);
		System.out.println(depositRecord.toString());
	}

	/**
	* 查询deposit列表
	*/
	@Test
	public void selectDepositRecordList() {
		List<DepositRecord> list = depositRecordService.selectDepositRecordList(new DepositRecord());
		for(DepositRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增deposit
	*/
	@Test
	public void insertDepositRecord() {
		for (int i = 1;i < 30; i++) {
			DepositRecord depositRecord = new DepositRecord();
			depositRecordService.insertDepositRecord(depositRecord);
		}
	}

	/**
	* 修改deposit
	*/
	@Test
	public void updateDepositRecord() {
		DepositRecord depositRecord = new DepositRecord();
		depositRecordService.updateDepositRecord(depositRecord);
	}

	/**
	* 批量删除deposit
	*/
	@Test
	public void deleteDepositRecordByIds() {
	}

	/**
	* 删除deposit信息
	*/
	@Test
	public void deleteDepositRecordById() {
	}

}
