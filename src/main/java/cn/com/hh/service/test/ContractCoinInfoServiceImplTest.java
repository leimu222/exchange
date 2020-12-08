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
public class ContractCoinInfoServiceImplTest  {

	@Autowired
	private IContractCoinInfoService contractCoinInfoService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractCoinInfoById() {
		ContractCoinInfo contractCoinInfo = contractCoinInfoService.selectContractCoinInfoById(1);
		System.out.println(contractCoinInfo.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractCoinInfoList() {
		List<ContractCoinInfo> list = contractCoinInfoService.selectContractCoinInfoList(new ContractCoinInfo());
		for(ContractCoinInfo model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractCoinInfo() {
		for (int i = 1;i < 30; i++) {
			ContractCoinInfo contractCoinInfo = new ContractCoinInfo();
			contractCoinInfoService.insertContractCoinInfo(contractCoinInfo);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractCoinInfo() {
		ContractCoinInfo contractCoinInfo = new ContractCoinInfo();
		contractCoinInfoService.updateContractCoinInfo(contractCoinInfo);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractCoinInfoByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractCoinInfoById() {
	}

}
