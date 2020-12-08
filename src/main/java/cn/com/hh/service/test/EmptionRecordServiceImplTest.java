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
 * Description: [emption单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmptionRecordServiceImplTest  {

	@Autowired
	private IEmptionRecordService emptionRecordService;

	/**
	* 查询emption
	*/
	@Test
	public void selectEmptionRecordById() {
		EmptionRecord emptionRecord = emptionRecordService.selectEmptionRecordById(1);
		System.out.println(emptionRecord.toString());
	}

	/**
	* 查询emption列表
	*/
	@Test
	public void selectEmptionRecordList() {
		List<EmptionRecord> list = emptionRecordService.selectEmptionRecordList(new EmptionRecord());
		for(EmptionRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增emption
	*/
	@Test
	public void insertEmptionRecord() {
		for (int i = 1;i < 30; i++) {
			EmptionRecord emptionRecord = new EmptionRecord();
			emptionRecordService.insertEmptionRecord(emptionRecord);
		}
	}

	/**
	* 修改emption
	*/
	@Test
	public void updateEmptionRecord() {
		EmptionRecord emptionRecord = new EmptionRecord();
		emptionRecordService.updateEmptionRecord(emptionRecord);
	}

	/**
	* 批量删除emption
	*/
	@Test
	public void deleteEmptionRecordByIds() {
	}

	/**
	* 删除emption信息
	*/
	@Test
	public void deleteEmptionRecordById() {
	}

}
