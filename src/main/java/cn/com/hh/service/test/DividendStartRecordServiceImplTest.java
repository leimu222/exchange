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
 * Description: [dividend单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DividendStartRecordServiceImplTest  {

	@Autowired
	private IDividendStartRecordService dividendStartRecordService;

	/**
	* 查询dividend
	*/
	@Test
	public void selectDividendStartRecordById() {
		DividendStartRecord dividendStartRecord = dividendStartRecordService.selectDividendStartRecordById(1);
		System.out.println(dividendStartRecord.toString());
	}

	/**
	* 查询dividend列表
	*/
	@Test
	public void selectDividendStartRecordList() {
		List<DividendStartRecord> list = dividendStartRecordService.selectDividendStartRecordList(new DividendStartRecord());
		for(DividendStartRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增dividend
	*/
	@Test
	public void insertDividendStartRecord() {
		for (int i = 1;i < 30; i++) {
			DividendStartRecord dividendStartRecord = new DividendStartRecord();
			dividendStartRecordService.insertDividendStartRecord(dividendStartRecord);
		}
	}

	/**
	* 修改dividend
	*/
	@Test
	public void updateDividendStartRecord() {
		DividendStartRecord dividendStartRecord = new DividendStartRecord();
		dividendStartRecordService.updateDividendStartRecord(dividendStartRecord);
	}

	/**
	* 批量删除dividend
	*/
	@Test
	public void deleteDividendStartRecordByIds() {
	}

	/**
	* 删除dividend信息
	*/
	@Test
	public void deleteDividendStartRecordById() {
	}

}
