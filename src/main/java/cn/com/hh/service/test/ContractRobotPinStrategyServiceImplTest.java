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
public class ContractRobotPinStrategyServiceImplTest  {

	@Autowired
	private IContractRobotPinStrategyService contractRobotPinStrategyService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractRobotPinStrategyById() {
		ContractRobotPinStrategy contractRobotPinStrategy = contractRobotPinStrategyService.selectContractRobotPinStrategyById(1);
		System.out.println(contractRobotPinStrategy.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractRobotPinStrategyList() {
		List<ContractRobotPinStrategy> list = contractRobotPinStrategyService.selectContractRobotPinStrategyList(new ContractRobotPinStrategy());
		for(ContractRobotPinStrategy model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractRobotPinStrategy() {
		for (int i = 1;i < 30; i++) {
			ContractRobotPinStrategy contractRobotPinStrategy = new ContractRobotPinStrategy();
			contractRobotPinStrategyService.insertContractRobotPinStrategy(contractRobotPinStrategy);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractRobotPinStrategy() {
		ContractRobotPinStrategy contractRobotPinStrategy = new ContractRobotPinStrategy();
		contractRobotPinStrategyService.updateContractRobotPinStrategy(contractRobotPinStrategy);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractRobotPinStrategyByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractRobotPinStrategyById() {
	}

}
