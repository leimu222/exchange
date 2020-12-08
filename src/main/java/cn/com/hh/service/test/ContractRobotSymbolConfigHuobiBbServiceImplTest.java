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
public class ContractRobotSymbolConfigHuobiBbServiceImplTest  {

	@Autowired
	private IContractRobotSymbolConfigHuobiBbService contractRobotSymbolConfigHuobiBbService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractRobotSymbolConfigHuobiBbById() {
		ContractRobotSymbolConfigHuobiBb contractRobotSymbolConfigHuobiBb = contractRobotSymbolConfigHuobiBbService.selectContractRobotSymbolConfigHuobiBbById(1);
		System.out.println(contractRobotSymbolConfigHuobiBb.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractRobotSymbolConfigHuobiBbList() {
		List<ContractRobotSymbolConfigHuobiBb> list = contractRobotSymbolConfigHuobiBbService.selectContractRobotSymbolConfigHuobiBbList(new ContractRobotSymbolConfigHuobiBb());
		for(ContractRobotSymbolConfigHuobiBb model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractRobotSymbolConfigHuobiBb() {
		for (int i = 1;i < 30; i++) {
			ContractRobotSymbolConfigHuobiBb contractRobotSymbolConfigHuobiBb = new ContractRobotSymbolConfigHuobiBb();
			contractRobotSymbolConfigHuobiBbService.insertContractRobotSymbolConfigHuobiBb(contractRobotSymbolConfigHuobiBb);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractRobotSymbolConfigHuobiBb() {
		ContractRobotSymbolConfigHuobiBb contractRobotSymbolConfigHuobiBb = new ContractRobotSymbolConfigHuobiBb();
		contractRobotSymbolConfigHuobiBbService.updateContractRobotSymbolConfigHuobiBb(contractRobotSymbolConfigHuobiBb);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractRobotSymbolConfigHuobiBbByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractRobotSymbolConfigHuobiBbById() {
	}

}
