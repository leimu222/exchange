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
public class ContractStrategyHedgingOrderServiceImplTest  {

	@Autowired
	private IContractStrategyHedgingOrderService contractStrategyHedgingOrderService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractStrategyHedgingOrderById() {
		ContractStrategyHedgingOrder contractStrategyHedgingOrder = contractStrategyHedgingOrderService.selectContractStrategyHedgingOrderById(1);
		System.out.println(contractStrategyHedgingOrder.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractStrategyHedgingOrderList() {
		List<ContractStrategyHedgingOrder> list = contractStrategyHedgingOrderService.selectContractStrategyHedgingOrderList(new ContractStrategyHedgingOrder());
		for(ContractStrategyHedgingOrder model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractStrategyHedgingOrder() {
		for (int i = 1;i < 30; i++) {
			ContractStrategyHedgingOrder contractStrategyHedgingOrder = new ContractStrategyHedgingOrder();
			contractStrategyHedgingOrderService.insertContractStrategyHedgingOrder(contractStrategyHedgingOrder);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractStrategyHedgingOrder() {
		ContractStrategyHedgingOrder contractStrategyHedgingOrder = new ContractStrategyHedgingOrder();
		contractStrategyHedgingOrderService.updateContractStrategyHedgingOrder(contractStrategyHedgingOrder);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractStrategyHedgingOrderByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractStrategyHedgingOrderById() {
	}

}
