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
public class ContractExchangeOrderTiggerServiceImplTest  {

	@Autowired
	private IContractExchangeOrderTiggerService contractExchangeOrderTiggerService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractExchangeOrderTiggerById() {
		ContractExchangeOrderTigger contractExchangeOrderTigger = contractExchangeOrderTiggerService.selectContractExchangeOrderTiggerById(1);
		System.out.println(contractExchangeOrderTigger.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractExchangeOrderTiggerList() {
		List<ContractExchangeOrderTigger> list = contractExchangeOrderTiggerService.selectContractExchangeOrderTiggerList(new ContractExchangeOrderTigger());
		for(ContractExchangeOrderTigger model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractExchangeOrderTigger() {
		for (int i = 1;i < 30; i++) {
			ContractExchangeOrderTigger contractExchangeOrderTigger = new ContractExchangeOrderTigger();
			contractExchangeOrderTiggerService.insertContractExchangeOrderTigger(contractExchangeOrderTigger);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractExchangeOrderTigger() {
		ContractExchangeOrderTigger contractExchangeOrderTigger = new ContractExchangeOrderTigger();
		contractExchangeOrderTiggerService.updateContractExchangeOrderTigger(contractExchangeOrderTigger);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractExchangeOrderTiggerByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractExchangeOrderTiggerById() {
	}

}
