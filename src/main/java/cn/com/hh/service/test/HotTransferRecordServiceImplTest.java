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
 * Description: [hot单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HotTransferRecordServiceImplTest  {

	@Autowired
	private IHotTransferRecordService hotTransferRecordService;

	/**
	* 查询hot
	*/
	@Test
	public void selectHotTransferRecordById() {
		HotTransferRecord hotTransferRecord = hotTransferRecordService.selectHotTransferRecordById(1);
		System.out.println(hotTransferRecord.toString());
	}

	/**
	* 查询hot列表
	*/
	@Test
	public void selectHotTransferRecordList() {
		List<HotTransferRecord> list = hotTransferRecordService.selectHotTransferRecordList(new HotTransferRecord());
		for(HotTransferRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增hot
	*/
	@Test
	public void insertHotTransferRecord() {
		for (int i = 1;i < 30; i++) {
			HotTransferRecord hotTransferRecord = new HotTransferRecord();
			hotTransferRecordService.insertHotTransferRecord(hotTransferRecord);
		}
	}

	/**
	* 修改hot
	*/
	@Test
	public void updateHotTransferRecord() {
		HotTransferRecord hotTransferRecord = new HotTransferRecord();
		hotTransferRecordService.updateHotTransferRecord(hotTransferRecord);
	}

	/**
	* 批量删除hot
	*/
	@Test
	public void deleteHotTransferRecordByIds() {
	}

	/**
	* 删除hot信息
	*/
	@Test
	public void deleteHotTransferRecordById() {
	}

}
