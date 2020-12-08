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
public class ContractMemberTransferRecordServiceImplTest  {

	@Autowired
	private IContractMemberTransferRecordService contractMemberTransferRecordService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractMemberTransferRecordById() {
		ContractMemberTransferRecord contractMemberTransferRecord = contractMemberTransferRecordService.selectContractMemberTransferRecordById(1);
		System.out.println(contractMemberTransferRecord.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractMemberTransferRecordList() {
		List<ContractMemberTransferRecord> list = contractMemberTransferRecordService.selectContractMemberTransferRecordList(new ContractMemberTransferRecord());
		for(ContractMemberTransferRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractMemberTransferRecord() {
		for (int i = 1;i < 30; i++) {
			ContractMemberTransferRecord contractMemberTransferRecord = new ContractMemberTransferRecord();
			contractMemberTransferRecordService.insertContractMemberTransferRecord(contractMemberTransferRecord);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractMemberTransferRecord() {
		ContractMemberTransferRecord contractMemberTransferRecord = new ContractMemberTransferRecord();
		contractMemberTransferRecordService.updateContractMemberTransferRecord(contractMemberTransferRecord);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractMemberTransferRecordByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractMemberTransferRecordById() {
	}

}
