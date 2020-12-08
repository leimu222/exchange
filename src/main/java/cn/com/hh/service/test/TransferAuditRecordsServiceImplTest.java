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
public class TransferAuditRecordsServiceImplTest  {

	@Autowired
	private ITransferAuditRecordsService transferAuditRecordsService;

	/**
	* 查询transfer
	*/
	@Test
	public void selectTransferAuditRecordsById() {
		TransferAuditRecords transferAuditRecords = transferAuditRecordsService.selectTransferAuditRecordsById(1);
		System.out.println(transferAuditRecords.toString());
	}

	/**
	* 查询transfer列表
	*/
	@Test
	public void selectTransferAuditRecordsList() {
		List<TransferAuditRecords> list = transferAuditRecordsService.selectTransferAuditRecordsList(new TransferAuditRecords());
		for(TransferAuditRecords model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增transfer
	*/
	@Test
	public void insertTransferAuditRecords() {
		for (int i = 1;i < 30; i++) {
			TransferAuditRecords transferAuditRecords = new TransferAuditRecords();
			transferAuditRecordsService.insertTransferAuditRecords(transferAuditRecords);
		}
	}

	/**
	* 修改transfer
	*/
	@Test
	public void updateTransferAuditRecords() {
		TransferAuditRecords transferAuditRecords = new TransferAuditRecords();
		transferAuditRecordsService.updateTransferAuditRecords(transferAuditRecords);
	}

	/**
	* 批量删除transfer
	*/
	@Test
	public void deleteTransferAuditRecordsByIds() {
	}

	/**
	* 删除transfer信息
	*/
	@Test
	public void deleteTransferAuditRecordsById() {
	}

}
