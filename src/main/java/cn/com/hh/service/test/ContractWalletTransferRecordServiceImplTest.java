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
 * Description: [contract单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ContractWalletTransferRecordServiceImplTest  {

	@Autowired
	private IContractWalletTransferRecordService contractWalletTransferRecordService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractWalletTransferRecordById() {
		ContractWalletTransferRecord contractWalletTransferRecord = contractWalletTransferRecordService.selectContractWalletTransferRecordById(1);
		System.out.println(contractWalletTransferRecord.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractWalletTransferRecordList() {
		List<ContractWalletTransferRecord> list = contractWalletTransferRecordService.selectContractWalletTransferRecordList(new ContractWalletTransferRecord());
		for(ContractWalletTransferRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractWalletTransferRecord() {
		for (int i = 1;i < 30; i++) {
			ContractWalletTransferRecord contractWalletTransferRecord = new ContractWalletTransferRecord();
			contractWalletTransferRecordService.insertContractWalletTransferRecord(contractWalletTransferRecord);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractWalletTransferRecord() {
		ContractWalletTransferRecord contractWalletTransferRecord = new ContractWalletTransferRecord();
		contractWalletTransferRecordService.updateContractWalletTransferRecord(contractWalletTransferRecord);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractWalletTransferRecordByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractWalletTransferRecordById() {
	}

}
