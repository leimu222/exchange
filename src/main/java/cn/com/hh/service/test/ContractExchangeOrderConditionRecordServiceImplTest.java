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
 * @date 2020-12-08 18:16:03
 * Description: [contract单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ContractExchangeOrderConditionRecordServiceImplTest  {

	@Autowired
	private IContractExchangeOrderConditionRecordService contractExchangeOrderConditionRecordService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractExchangeOrderConditionRecordById() {
		ContractExchangeOrderConditionRecord contractExchangeOrderConditionRecord = contractExchangeOrderConditionRecordService.selectContractExchangeOrderConditionRecordById(1);
		System.out.println(contractExchangeOrderConditionRecord.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractExchangeOrderConditionRecordList() {
		List<ContractExchangeOrderConditionRecord> list = contractExchangeOrderConditionRecordService.selectContractExchangeOrderConditionRecordList(new ContractExchangeOrderConditionRecord());
		for(ContractExchangeOrderConditionRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractExchangeOrderConditionRecord() {
		for (int i = 1;i < 30; i++) {
			ContractExchangeOrderConditionRecord contractExchangeOrderConditionRecord = new ContractExchangeOrderConditionRecord();
			contractExchangeOrderConditionRecordService.insertContractExchangeOrderConditionRecord(contractExchangeOrderConditionRecord);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractExchangeOrderConditionRecord() {
		ContractExchangeOrderConditionRecord contractExchangeOrderConditionRecord = new ContractExchangeOrderConditionRecord();
		contractExchangeOrderConditionRecordService.updateContractExchangeOrderConditionRecord(contractExchangeOrderConditionRecord);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractExchangeOrderConditionRecordByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractExchangeOrderConditionRecordById() {
	}

}
