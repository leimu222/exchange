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
public class ContractWalletFrozenFlowRecordServiceImplTest  {

	@Autowired
	private IContractWalletFrozenFlowRecordService contractWalletFrozenFlowRecordService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractWalletFrozenFlowRecordById() {
		ContractWalletFrozenFlowRecord contractWalletFrozenFlowRecord = contractWalletFrozenFlowRecordService.selectContractWalletFrozenFlowRecordById(1);
		System.out.println(contractWalletFrozenFlowRecord.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractWalletFrozenFlowRecordList() {
		List<ContractWalletFrozenFlowRecord> list = contractWalletFrozenFlowRecordService.selectContractWalletFrozenFlowRecordList(new ContractWalletFrozenFlowRecord());
		for(ContractWalletFrozenFlowRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractWalletFrozenFlowRecord() {
		for (int i = 1;i < 30; i++) {
			ContractWalletFrozenFlowRecord contractWalletFrozenFlowRecord = new ContractWalletFrozenFlowRecord();
			contractWalletFrozenFlowRecordService.insertContractWalletFrozenFlowRecord(contractWalletFrozenFlowRecord);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractWalletFrozenFlowRecord() {
		ContractWalletFrozenFlowRecord contractWalletFrozenFlowRecord = new ContractWalletFrozenFlowRecord();
		contractWalletFrozenFlowRecordService.updateContractWalletFrozenFlowRecord(contractWalletFrozenFlowRecord);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractWalletFrozenFlowRecordByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractWalletFrozenFlowRecordById() {
	}

}
