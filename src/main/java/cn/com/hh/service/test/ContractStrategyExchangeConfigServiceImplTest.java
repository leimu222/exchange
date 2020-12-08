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
public class ContractStrategyExchangeConfigServiceImplTest  {

	@Autowired
	private IContractStrategyExchangeConfigService contractStrategyExchangeConfigService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractStrategyExchangeConfigById() {
		ContractStrategyExchangeConfig contractStrategyExchangeConfig = contractStrategyExchangeConfigService.selectContractStrategyExchangeConfigById(1);
		System.out.println(contractStrategyExchangeConfig.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractStrategyExchangeConfigList() {
		List<ContractStrategyExchangeConfig> list = contractStrategyExchangeConfigService.selectContractStrategyExchangeConfigList(new ContractStrategyExchangeConfig());
		for(ContractStrategyExchangeConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractStrategyExchangeConfig() {
		for (int i = 1;i < 30; i++) {
			ContractStrategyExchangeConfig contractStrategyExchangeConfig = new ContractStrategyExchangeConfig();
			contractStrategyExchangeConfigService.insertContractStrategyExchangeConfig(contractStrategyExchangeConfig);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractStrategyExchangeConfig() {
		ContractStrategyExchangeConfig contractStrategyExchangeConfig = new ContractStrategyExchangeConfig();
		contractStrategyExchangeConfigService.updateContractStrategyExchangeConfig(contractStrategyExchangeConfig);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractStrategyExchangeConfigByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractStrategyExchangeConfigById() {
	}

}
