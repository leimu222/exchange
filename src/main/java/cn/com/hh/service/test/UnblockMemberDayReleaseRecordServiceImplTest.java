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
public class UnblockMemberDayReleaseRecordServiceImplTest  {

	@Autowired
	private IUnblockMemberDayReleaseRecordService unblockMemberDayReleaseRecordService;

	/**
	* 查询unblock
	*/
	@Test
	public void selectUnblockMemberDayReleaseRecordById() {
		UnblockMemberDayReleaseRecord unblockMemberDayReleaseRecord = unblockMemberDayReleaseRecordService.selectUnblockMemberDayReleaseRecordById(1);
		System.out.println(unblockMemberDayReleaseRecord.toString());
	}

	/**
	* 查询unblock列表
	*/
	@Test
	public void selectUnblockMemberDayReleaseRecordList() {
		List<UnblockMemberDayReleaseRecord> list = unblockMemberDayReleaseRecordService.selectUnblockMemberDayReleaseRecordList(new UnblockMemberDayReleaseRecord());
		for(UnblockMemberDayReleaseRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增unblock
	*/
	@Test
	public void insertUnblockMemberDayReleaseRecord() {
		for (int i = 1;i < 30; i++) {
			UnblockMemberDayReleaseRecord unblockMemberDayReleaseRecord = new UnblockMemberDayReleaseRecord();
			unblockMemberDayReleaseRecordService.insertUnblockMemberDayReleaseRecord(unblockMemberDayReleaseRecord);
		}
	}

	/**
	* 修改unblock
	*/
	@Test
	public void updateUnblockMemberDayReleaseRecord() {
		UnblockMemberDayReleaseRecord unblockMemberDayReleaseRecord = new UnblockMemberDayReleaseRecord();
		unblockMemberDayReleaseRecordService.updateUnblockMemberDayReleaseRecord(unblockMemberDayReleaseRecord);
	}

	/**
	* 批量删除unblock
	*/
	@Test
	public void deleteUnblockMemberDayReleaseRecordByIds() {
	}

	/**
	* 删除unblock信息
	*/
	@Test
	public void deleteUnblockMemberDayReleaseRecordById() {
	}

}
