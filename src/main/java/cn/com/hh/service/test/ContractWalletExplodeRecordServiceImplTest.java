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
public class ContractWalletExplodeRecordServiceImplTest  {

	@Autowired
	private IContractWalletExplodeRecordService contractWalletExplodeRecordService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractWalletExplodeRecordById() {
		ContractWalletExplodeRecord contractWalletExplodeRecord = contractWalletExplodeRecordService.selectContractWalletExplodeRecordById(1);
		System.out.println(contractWalletExplodeRecord.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractWalletExplodeRecordList() {
		List<ContractWalletExplodeRecord> list = contractWalletExplodeRecordService.selectContractWalletExplodeRecordList(new ContractWalletExplodeRecord());
		for(ContractWalletExplodeRecord model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractWalletExplodeRecord() {
		for (int i = 1;i < 30; i++) {
			ContractWalletExplodeRecord contractWalletExplodeRecord = new ContractWalletExplodeRecord();
			contractWalletExplodeRecordService.insertContractWalletExplodeRecord(contractWalletExplodeRecord);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractWalletExplodeRecord() {
		ContractWalletExplodeRecord contractWalletExplodeRecord = new ContractWalletExplodeRecord();
		contractWalletExplodeRecordService.updateContractWalletExplodeRecord(contractWalletExplodeRecord);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractWalletExplodeRecordByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractWalletExplodeRecordById() {
	}

}
