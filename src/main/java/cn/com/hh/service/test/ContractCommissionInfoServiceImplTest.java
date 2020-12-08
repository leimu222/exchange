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
 * @date 2020-12-08 18:16:02
 * Description: [contract单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ContractCommissionInfoServiceImplTest  {

	@Autowired
	private IContractCommissionInfoService contractCommissionInfoService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractCommissionInfoById() {
		ContractCommissionInfo contractCommissionInfo = contractCommissionInfoService.selectContractCommissionInfoById(1);
		System.out.println(contractCommissionInfo.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractCommissionInfoList() {
		List<ContractCommissionInfo> list = contractCommissionInfoService.selectContractCommissionInfoList(new ContractCommissionInfo());
		for(ContractCommissionInfo model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractCommissionInfo() {
		for (int i = 1;i < 30; i++) {
			ContractCommissionInfo contractCommissionInfo = new ContractCommissionInfo();
			contractCommissionInfoService.insertContractCommissionInfo(contractCommissionInfo);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractCommissionInfo() {
		ContractCommissionInfo contractCommissionInfo = new ContractCommissionInfo();
		contractCommissionInfoService.updateContractCommissionInfo(contractCommissionInfo);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractCommissionInfoByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractCommissionInfoById() {
	}

}
