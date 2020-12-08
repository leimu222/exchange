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
 * @date 2020-12-08 18:16:05
 * Description: [lock单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LockPositionRecordServiceImplTest  {

	@Autowired
	private ILockPositionRecordService lockPositionRecordService;

	/**
	* 查询lock
	*/
	@Test
	public void selectLockPositionRecordById() {
		LockPositionRecord lockPositionRecord = lockPositionRecordService.selectLockPositionRecordById(1);
		System.out.println(lockPositionRecord.toString());
	}

	/**
	* 查询lock列表
	*/
	@Test
	public void selectLockPositionRecordList() {
		List<LockPositionRecord> list = lockPositionRecordService.selectLockPositionRecordList(new LockPositionRecord());
		for(LockPositionRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增lock
	*/
	@Test
	public void insertLockPositionRecord() {
		for (int i = 1;i < 30; i++) {
			LockPositionRecord lockPositionRecord = new LockPositionRecord();
			lockPositionRecordService.insertLockPositionRecord(lockPositionRecord);
		}
	}

	/**
	* 修改lock
	*/
	@Test
	public void updateLockPositionRecord() {
		LockPositionRecord lockPositionRecord = new LockPositionRecord();
		lockPositionRecordService.updateLockPositionRecord(lockPositionRecord);
	}

	/**
	* 批量删除lock
	*/
	@Test
	public void deleteLockPositionRecordByIds() {
	}

	/**
	* 删除lock信息
	*/
	@Test
	public void deleteLockPositionRecordById() {
	}

}
