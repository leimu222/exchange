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
public class UnblockMemberDayUnlockRecordServiceImplTest  {

	@Autowired
	private IUnblockMemberDayUnlockRecordService unblockMemberDayUnlockRecordService;

	/**
	* 查询unblock
	*/
	@Test
	public void selectUnblockMemberDayUnlockRecordById() {
		UnblockMemberDayUnlockRecord unblockMemberDayUnlockRecord = unblockMemberDayUnlockRecordService.selectUnblockMemberDayUnlockRecordById(1);
		System.out.println(unblockMemberDayUnlockRecord.toString());
	}

	/**
	* 查询unblock列表
	*/
	@Test
	public void selectUnblockMemberDayUnlockRecordList() {
		List<UnblockMemberDayUnlockRecord> list = unblockMemberDayUnlockRecordService.selectUnblockMemberDayUnlockRecordList(new UnblockMemberDayUnlockRecord());
		for(UnblockMemberDayUnlockRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增unblock
	*/
	@Test
	public void insertUnblockMemberDayUnlockRecord() {
		for (int i = 1;i < 30; i++) {
			UnblockMemberDayUnlockRecord unblockMemberDayUnlockRecord = new UnblockMemberDayUnlockRecord();
			unblockMemberDayUnlockRecordService.insertUnblockMemberDayUnlockRecord(unblockMemberDayUnlockRecord);
		}
	}

	/**
	* 修改unblock
	*/
	@Test
	public void updateUnblockMemberDayUnlockRecord() {
		UnblockMemberDayUnlockRecord unblockMemberDayUnlockRecord = new UnblockMemberDayUnlockRecord();
		unblockMemberDayUnlockRecordService.updateUnblockMemberDayUnlockRecord(unblockMemberDayUnlockRecord);
	}

	/**
	* 批量删除unblock
	*/
	@Test
	public void deleteUnblockMemberDayUnlockRecordByIds() {
	}

	/**
	* 删除unblock信息
	*/
	@Test
	public void deleteUnblockMemberDayUnlockRecordById() {
	}

}
