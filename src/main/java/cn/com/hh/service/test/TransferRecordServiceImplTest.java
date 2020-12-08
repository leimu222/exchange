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
 * Description: [transfer单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TransferRecordServiceImplTest  {

	@Autowired
	private ITransferRecordService transferRecordService;

	/**
	* 查询transfer
	*/
	@Test
	public void selectTransferRecordById() {
		TransferRecord transferRecord = transferRecordService.selectTransferRecordById(1);
		System.out.println(transferRecord.toString());
	}

	/**
	* 查询transfer列表
	*/
	@Test
	public void selectTransferRecordList() {
		List<TransferRecord> list = transferRecordService.selectTransferRecordList(new TransferRecord());
		for(TransferRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增transfer
	*/
	@Test
	public void insertTransferRecord() {
		for (int i = 1;i < 30; i++) {
			TransferRecord transferRecord = new TransferRecord();
			transferRecordService.insertTransferRecord(transferRecord);
		}
	}

	/**
	* 修改transfer
	*/
	@Test
	public void updateTransferRecord() {
		TransferRecord transferRecord = new TransferRecord();
		transferRecordService.updateTransferRecord(transferRecord);
	}

	/**
	* 批量删除transfer
	*/
	@Test
	public void deleteTransferRecordByIds() {
	}

	/**
	* 删除transfer信息
	*/
	@Test
	public void deleteTransferRecordById() {
	}

}
