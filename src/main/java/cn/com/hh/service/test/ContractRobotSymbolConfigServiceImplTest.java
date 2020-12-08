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
public class ContractRobotSymbolConfigServiceImplTest  {

	@Autowired
	private IContractRobotSymbolConfigService contractRobotSymbolConfigService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractRobotSymbolConfigById() {
		ContractRobotSymbolConfig contractRobotSymbolConfig = contractRobotSymbolConfigService.selectContractRobotSymbolConfigById(1);
		System.out.println(contractRobotSymbolConfig.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractRobotSymbolConfigList() {
		List<ContractRobotSymbolConfig> list = contractRobotSymbolConfigService.selectContractRobotSymbolConfigList(new ContractRobotSymbolConfig());
		for(ContractRobotSymbolConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractRobotSymbolConfig() {
		for (int i = 1;i < 30; i++) {
			ContractRobotSymbolConfig contractRobotSymbolConfig = new ContractRobotSymbolConfig();
			contractRobotSymbolConfigService.insertContractRobotSymbolConfig(contractRobotSymbolConfig);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractRobotSymbolConfig() {
		ContractRobotSymbolConfig contractRobotSymbolConfig = new ContractRobotSymbolConfig();
		contractRobotSymbolConfigService.updateContractRobotSymbolConfig(contractRobotSymbolConfig);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractRobotSymbolConfigByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractRobotSymbolConfigById() {
	}

}
