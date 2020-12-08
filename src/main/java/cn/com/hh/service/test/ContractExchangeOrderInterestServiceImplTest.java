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
public class ContractExchangeOrderInterestServiceImplTest  {

	@Autowired
	private IContractExchangeOrderInterestService contractExchangeOrderInterestService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractExchangeOrderInterestById() {
		ContractExchangeOrderInterest contractExchangeOrderInterest = contractExchangeOrderInterestService.selectContractExchangeOrderInterestById(1);
		System.out.println(contractExchangeOrderInterest.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractExchangeOrderInterestList() {
		List<ContractExchangeOrderInterest> list = contractExchangeOrderInterestService.selectContractExchangeOrderInterestList(new ContractExchangeOrderInterest());
		for(ContractExchangeOrderInterest model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractExchangeOrderInterest() {
		for (int i = 1;i < 30; i++) {
			ContractExchangeOrderInterest contractExchangeOrderInterest = new ContractExchangeOrderInterest();
			contractExchangeOrderInterestService.insertContractExchangeOrderInterest(contractExchangeOrderInterest);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractExchangeOrderInterest() {
		ContractExchangeOrderInterest contractExchangeOrderInterest = new ContractExchangeOrderInterest();
		contractExchangeOrderInterestService.updateContractExchangeOrderInterest(contractExchangeOrderInterest);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractExchangeOrderInterestByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractExchangeOrderInterestById() {
	}

}
