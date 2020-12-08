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
 * Description: [unblock单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UnblockLotteryIncreasedRecordServiceImplTest  {

	@Autowired
	private IUnblockLotteryIncreasedRecordService unblockLotteryIncreasedRecordService;

	/**
	* 查询unblock
	*/
	@Test
	public void selectUnblockLotteryIncreasedRecordById() {
		UnblockLotteryIncreasedRecord unblockLotteryIncreasedRecord = unblockLotteryIncreasedRecordService.selectUnblockLotteryIncreasedRecordById(1);
		System.out.println(unblockLotteryIncreasedRecord.toString());
	}

	/**
	* 查询unblock列表
	*/
	@Test
	public void selectUnblockLotteryIncreasedRecordList() {
		List<UnblockLotteryIncreasedRecord> list = unblockLotteryIncreasedRecordService.selectUnblockLotteryIncreasedRecordList(new UnblockLotteryIncreasedRecord());
		for(UnblockLotteryIncreasedRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增unblock
	*/
	@Test
	public void insertUnblockLotteryIncreasedRecord() {
		for (int i = 1;i < 30; i++) {
			UnblockLotteryIncreasedRecord unblockLotteryIncreasedRecord = new UnblockLotteryIncreasedRecord();
			unblockLotteryIncreasedRecordService.insertUnblockLotteryIncreasedRecord(unblockLotteryIncreasedRecord);
		}
	}

	/**
	* 修改unblock
	*/
	@Test
	public void updateUnblockLotteryIncreasedRecord() {
		UnblockLotteryIncreasedRecord unblockLotteryIncreasedRecord = new UnblockLotteryIncreasedRecord();
		unblockLotteryIncreasedRecordService.updateUnblockLotteryIncreasedRecord(unblockLotteryIncreasedRecord);
	}

	/**
	* 批量删除unblock
	*/
	@Test
	public void deleteUnblockLotteryIncreasedRecordByIds() {
	}

	/**
	* 删除unblock信息
	*/
	@Test
	public void deleteUnblockLotteryIncreasedRecordById() {
	}

}
