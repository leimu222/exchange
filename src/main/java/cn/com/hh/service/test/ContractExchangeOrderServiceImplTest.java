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
public class ContractExchangeOrderServiceImplTest  {

	@Autowired
	private IContractExchangeOrderService contractExchangeOrderService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractExchangeOrderById() {
		ContractExchangeOrder contractExchangeOrder = contractExchangeOrderService.selectContractExchangeOrderById(1);
		System.out.println(contractExchangeOrder.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractExchangeOrderList() {
		List<ContractExchangeOrder> list = contractExchangeOrderService.selectContractExchangeOrderList(new ContractExchangeOrder());
		for(ContractExchangeOrder model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractExchangeOrder() {
		for (int i = 1;i < 30; i++) {
			ContractExchangeOrder contractExchangeOrder = new ContractExchangeOrder();
			contractExchangeOrderService.insertContractExchangeOrder(contractExchangeOrder);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractExchangeOrder() {
		ContractExchangeOrder contractExchangeOrder = new ContractExchangeOrder();
		contractExchangeOrderService.updateContractExchangeOrder(contractExchangeOrder);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractExchangeOrderByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractExchangeOrderById() {
	}

}
