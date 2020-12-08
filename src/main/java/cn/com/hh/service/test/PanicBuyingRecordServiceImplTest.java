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
 * @date 2020-12-08 18:16:08
 * Description: [panic单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PanicBuyingRecordServiceImplTest  {

	@Autowired
	private IPanicBuyingRecordService panicBuyingRecordService;

	/**
	* 查询panic
	*/
	@Test
	public void selectPanicBuyingRecordById() {
		PanicBuyingRecord panicBuyingRecord = panicBuyingRecordService.selectPanicBuyingRecordById(1);
		System.out.println(panicBuyingRecord.toString());
	}

	/**
	* 查询panic列表
	*/
	@Test
	public void selectPanicBuyingRecordList() {
		List<PanicBuyingRecord> list = panicBuyingRecordService.selectPanicBuyingRecordList(new PanicBuyingRecord());
		for(PanicBuyingRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增panic
	*/
	@Test
	public void insertPanicBuyingRecord() {
		for (int i = 1;i < 30; i++) {
			PanicBuyingRecord panicBuyingRecord = new PanicBuyingRecord();
			panicBuyingRecordService.insertPanicBuyingRecord(panicBuyingRecord);
		}
	}

	/**
	* 修改panic
	*/
	@Test
	public void updatePanicBuyingRecord() {
		PanicBuyingRecord panicBuyingRecord = new PanicBuyingRecord();
		panicBuyingRecordService.updatePanicBuyingRecord(panicBuyingRecord);
	}

	/**
	* 批量删除panic
	*/
	@Test
	public void deletePanicBuyingRecordByIds() {
	}

	/**
	* 删除panic信息
	*/
	@Test
	public void deletePanicBuyingRecordById() {
	}

}
