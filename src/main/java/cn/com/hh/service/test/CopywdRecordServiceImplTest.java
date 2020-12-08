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
 * Description: [copywd单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CopywdRecordServiceImplTest  {

	@Autowired
	private ICopywdRecordService copywdRecordService;

	/**
	* 查询copywd
	*/
	@Test
	public void selectCopywdRecordById() {
		CopywdRecord copywdRecord = copywdRecordService.selectCopywdRecordById(1);
		System.out.println(copywdRecord.toString());
	}

	/**
	* 查询copywd列表
	*/
	@Test
	public void selectCopywdRecordList() {
		List<CopywdRecord> list = copywdRecordService.selectCopywdRecordList(new CopywdRecord());
		for(CopywdRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增copywd
	*/
	@Test
	public void insertCopywdRecord() {
		for (int i = 1;i < 30; i++) {
			CopywdRecord copywdRecord = new CopywdRecord();
			copywdRecordService.insertCopywdRecord(copywdRecord);
		}
	}

	/**
	* 修改copywd
	*/
	@Test
	public void updateCopywdRecord() {
		CopywdRecord copywdRecord = new CopywdRecord();
		copywdRecordService.updateCopywdRecord(copywdRecord);
	}

	/**
	* 批量删除copywd
	*/
	@Test
	public void deleteCopywdRecordByIds() {
	}

	/**
	* 删除copywd信息
	*/
	@Test
	public void deleteCopywdRecordById() {
	}

}
