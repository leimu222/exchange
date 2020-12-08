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
public class ContractDoubleMemberStrategyOrderServiceImplTest  {

	@Autowired
	private IContractDoubleMemberStrategyOrderService contractDoubleMemberStrategyOrderService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractDoubleMemberStrategyOrderById() {
		ContractDoubleMemberStrategyOrder contractDoubleMemberStrategyOrder = contractDoubleMemberStrategyOrderService.selectContractDoubleMemberStrategyOrderById(1);
		System.out.println(contractDoubleMemberStrategyOrder.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractDoubleMemberStrategyOrderList() {
		List<ContractDoubleMemberStrategyOrder> list = contractDoubleMemberStrategyOrderService.selectContractDoubleMemberStrategyOrderList(new ContractDoubleMemberStrategyOrder());
		for(ContractDoubleMemberStrategyOrder model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractDoubleMemberStrategyOrder() {
		for (int i = 1;i < 30; i++) {
			ContractDoubleMemberStrategyOrder contractDoubleMemberStrategyOrder = new ContractDoubleMemberStrategyOrder();
			contractDoubleMemberStrategyOrderService.insertContractDoubleMemberStrategyOrder(contractDoubleMemberStrategyOrder);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractDoubleMemberStrategyOrder() {
		ContractDoubleMemberStrategyOrder contractDoubleMemberStrategyOrder = new ContractDoubleMemberStrategyOrder();
		contractDoubleMemberStrategyOrderService.updateContractDoubleMemberStrategyOrder(contractDoubleMemberStrategyOrder);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractDoubleMemberStrategyOrderByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractDoubleMemberStrategyOrderById() {
	}

}
