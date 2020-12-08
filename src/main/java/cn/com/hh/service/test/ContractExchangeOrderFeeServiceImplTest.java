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
public class ContractExchangeOrderFeeServiceImplTest  {

	@Autowired
	private IContractExchangeOrderFeeService contractExchangeOrderFeeService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractExchangeOrderFeeById() {
		ContractExchangeOrderFee contractExchangeOrderFee = contractExchangeOrderFeeService.selectContractExchangeOrderFeeById(1);
		System.out.println(contractExchangeOrderFee.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractExchangeOrderFeeList() {
		List<ContractExchangeOrderFee> list = contractExchangeOrderFeeService.selectContractExchangeOrderFeeList(new ContractExchangeOrderFee());
		for(ContractExchangeOrderFee model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractExchangeOrderFee() {
		for (int i = 1;i < 30; i++) {
			ContractExchangeOrderFee contractExchangeOrderFee = new ContractExchangeOrderFee();
			contractExchangeOrderFeeService.insertContractExchangeOrderFee(contractExchangeOrderFee);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractExchangeOrderFee() {
		ContractExchangeOrderFee contractExchangeOrderFee = new ContractExchangeOrderFee();
		contractExchangeOrderFeeService.updateContractExchangeOrderFee(contractExchangeOrderFee);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractExchangeOrderFeeByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractExchangeOrderFeeById() {
	}

}
