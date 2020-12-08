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
public class ContractRobotSymbolConfigHuobiServiceImplTest  {

	@Autowired
	private IContractRobotSymbolConfigHuobiService contractRobotSymbolConfigHuobiService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractRobotSymbolConfigHuobiById() {
		ContractRobotSymbolConfigHuobi contractRobotSymbolConfigHuobi = contractRobotSymbolConfigHuobiService.selectContractRobotSymbolConfigHuobiById(1);
		System.out.println(contractRobotSymbolConfigHuobi.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractRobotSymbolConfigHuobiList() {
		List<ContractRobotSymbolConfigHuobi> list = contractRobotSymbolConfigHuobiService.selectContractRobotSymbolConfigHuobiList(new ContractRobotSymbolConfigHuobi());
		for(ContractRobotSymbolConfigHuobi model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractRobotSymbolConfigHuobi() {
		for (int i = 1;i < 30; i++) {
			ContractRobotSymbolConfigHuobi contractRobotSymbolConfigHuobi = new ContractRobotSymbolConfigHuobi();
			contractRobotSymbolConfigHuobiService.insertContractRobotSymbolConfigHuobi(contractRobotSymbolConfigHuobi);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractRobotSymbolConfigHuobi() {
		ContractRobotSymbolConfigHuobi contractRobotSymbolConfigHuobi = new ContractRobotSymbolConfigHuobi();
		contractRobotSymbolConfigHuobiService.updateContractRobotSymbolConfigHuobi(contractRobotSymbolConfigHuobi);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractRobotSymbolConfigHuobiByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractRobotSymbolConfigHuobiById() {
	}

}
