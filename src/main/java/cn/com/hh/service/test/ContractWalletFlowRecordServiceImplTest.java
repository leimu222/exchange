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
public class ContractWalletFlowRecordServiceImplTest  {

	@Autowired
	private IContractWalletFlowRecordService contractWalletFlowRecordService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractWalletFlowRecordById() {
		ContractWalletFlowRecord contractWalletFlowRecord = contractWalletFlowRecordService.selectContractWalletFlowRecordById(1);
		System.out.println(contractWalletFlowRecord.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractWalletFlowRecordList() {
		List<ContractWalletFlowRecord> list = contractWalletFlowRecordService.selectContractWalletFlowRecordList(new ContractWalletFlowRecord());
		for(ContractWalletFlowRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractWalletFlowRecord() {
		for (int i = 1;i < 30; i++) {
			ContractWalletFlowRecord contractWalletFlowRecord = new ContractWalletFlowRecord();
			contractWalletFlowRecordService.insertContractWalletFlowRecord(contractWalletFlowRecord);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractWalletFlowRecord() {
		ContractWalletFlowRecord contractWalletFlowRecord = new ContractWalletFlowRecord();
		contractWalletFlowRecordService.updateContractWalletFlowRecord(contractWalletFlowRecord);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractWalletFlowRecordByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractWalletFlowRecordById() {
	}

}
