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
public class UnblockLotteryRecordServiceImplTest  {

	@Autowired
	private IUnblockLotteryRecordService unblockLotteryRecordService;

	/**
	* 查询unblock
	*/
	@Test
	public void selectUnblockLotteryRecordById() {
		UnblockLotteryRecord unblockLotteryRecord = unblockLotteryRecordService.selectUnblockLotteryRecordById(1);
		System.out.println(unblockLotteryRecord.toString());
	}

	/**
	* 查询unblock列表
	*/
	@Test
	public void selectUnblockLotteryRecordList() {
		List<UnblockLotteryRecord> list = unblockLotteryRecordService.selectUnblockLotteryRecordList(new UnblockLotteryRecord());
		for(UnblockLotteryRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增unblock
	*/
	@Test
	public void insertUnblockLotteryRecord() {
		for (int i = 1;i < 30; i++) {
			UnblockLotteryRecord unblockLotteryRecord = new UnblockLotteryRecord();
			unblockLotteryRecordService.insertUnblockLotteryRecord(unblockLotteryRecord);
		}
	}

	/**
	* 修改unblock
	*/
	@Test
	public void updateUnblockLotteryRecord() {
		UnblockLotteryRecord unblockLotteryRecord = new UnblockLotteryRecord();
		unblockLotteryRecordService.updateUnblockLotteryRecord(unblockLotteryRecord);
	}

	/**
	* 批量删除unblock
	*/
	@Test
	public void deleteUnblockLotteryRecordByIds() {
	}

	/**
	* 删除unblock信息
	*/
	@Test
	public void deleteUnblockLotteryRecordById() {
	}

}
