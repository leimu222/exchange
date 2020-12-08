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
public class UnblockMemberOperateRecordServiceImplTest  {

	@Autowired
	private IUnblockMemberOperateRecordService unblockMemberOperateRecordService;

	/**
	* 查询unblock
	*/
	@Test
	public void selectUnblockMemberOperateRecordById() {
		UnblockMemberOperateRecord unblockMemberOperateRecord = unblockMemberOperateRecordService.selectUnblockMemberOperateRecordById(1);
		System.out.println(unblockMemberOperateRecord.toString());
	}

	/**
	* 查询unblock列表
	*/
	@Test
	public void selectUnblockMemberOperateRecordList() {
		List<UnblockMemberOperateRecord> list = unblockMemberOperateRecordService.selectUnblockMemberOperateRecordList(new UnblockMemberOperateRecord());
		for(UnblockMemberOperateRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增unblock
	*/
	@Test
	public void insertUnblockMemberOperateRecord() {
		for (int i = 1;i < 30; i++) {
			UnblockMemberOperateRecord unblockMemberOperateRecord = new UnblockMemberOperateRecord();
			unblockMemberOperateRecordService.insertUnblockMemberOperateRecord(unblockMemberOperateRecord);
		}
	}

	/**
	* 修改unblock
	*/
	@Test
	public void updateUnblockMemberOperateRecord() {
		UnblockMemberOperateRecord unblockMemberOperateRecord = new UnblockMemberOperateRecord();
		unblockMemberOperateRecordService.updateUnblockMemberOperateRecord(unblockMemberOperateRecord);
	}

	/**
	* 批量删除unblock
	*/
	@Test
	public void deleteUnblockMemberOperateRecordByIds() {
	}

	/**
	* 删除unblock信息
	*/
	@Test
	public void deleteUnblockMemberOperateRecordById() {
	}

}
