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
 * @date 2020-12-08 18:16:09
 * Description: [withdraw单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WithdrawRecordServiceImplTest  {

	@Autowired
	private IWithdrawRecordService withdrawRecordService;

	/**
	* 查询withdraw
	*/
	@Test
	public void selectWithdrawRecordById() {
		WithdrawRecord withdrawRecord = withdrawRecordService.selectWithdrawRecordById(1);
		System.out.println(withdrawRecord.toString());
	}

	/**
	* 查询withdraw列表
	*/
	@Test
	public void selectWithdrawRecordList() {
		List<WithdrawRecord> list = withdrawRecordService.selectWithdrawRecordList(new WithdrawRecord());
		for(WithdrawRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增withdraw
	*/
	@Test
	public void insertWithdrawRecord() {
		for (int i = 1;i < 30; i++) {
			WithdrawRecord withdrawRecord = new WithdrawRecord();
			withdrawRecordService.insertWithdrawRecord(withdrawRecord);
		}
	}

	/**
	* 修改withdraw
	*/
	@Test
	public void updateWithdrawRecord() {
		WithdrawRecord withdrawRecord = new WithdrawRecord();
		withdrawRecordService.updateWithdrawRecord(withdrawRecord);
	}

	/**
	* 批量删除withdraw
	*/
	@Test
	public void deleteWithdrawRecordByIds() {
	}

	/**
	* 删除withdraw信息
	*/
	@Test
	public void deleteWithdrawRecordById() {
	}

}
