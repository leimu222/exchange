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
public class ContractExchangeOrderCalculateServiceImplTest  {

	@Autowired
	private IContractExchangeOrderCalculateService contractExchangeOrderCalculateService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractExchangeOrderCalculateById() {
		ContractExchangeOrderCalculate contractExchangeOrderCalculate = contractExchangeOrderCalculateService.selectContractExchangeOrderCalculateById(1);
		System.out.println(contractExchangeOrderCalculate.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractExchangeOrderCalculateList() {
		List<ContractExchangeOrderCalculate> list = contractExchangeOrderCalculateService.selectContractExchangeOrderCalculateList(new ContractExchangeOrderCalculate());
		for(ContractExchangeOrderCalculate model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractExchangeOrderCalculate() {
		for (int i = 1;i < 30; i++) {
			ContractExchangeOrderCalculate contractExchangeOrderCalculate = new ContractExchangeOrderCalculate();
			contractExchangeOrderCalculateService.insertContractExchangeOrderCalculate(contractExchangeOrderCalculate);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractExchangeOrderCalculate() {
		ContractExchangeOrderCalculate contractExchangeOrderCalculate = new ContractExchangeOrderCalculate();
		contractExchangeOrderCalculateService.updateContractExchangeOrderCalculate(contractExchangeOrderCalculate);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractExchangeOrderCalculateByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractExchangeOrderCalculateById() {
	}

}
