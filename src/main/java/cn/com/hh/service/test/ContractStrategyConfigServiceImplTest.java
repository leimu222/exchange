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
public class ContractStrategyConfigServiceImplTest  {

	@Autowired
	private IContractStrategyConfigService contractStrategyConfigService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractStrategyConfigById() {
		ContractStrategyConfig contractStrategyConfig = contractStrategyConfigService.selectContractStrategyConfigById(1);
		System.out.println(contractStrategyConfig.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractStrategyConfigList() {
		List<ContractStrategyConfig> list = contractStrategyConfigService.selectContractStrategyConfigList(new ContractStrategyConfig());
		for(ContractStrategyConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractStrategyConfig() {
		for (int i = 1;i < 30; i++) {
			ContractStrategyConfig contractStrategyConfig = new ContractStrategyConfig();
			contractStrategyConfigService.insertContractStrategyConfig(contractStrategyConfig);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractStrategyConfig() {
		ContractStrategyConfig contractStrategyConfig = new ContractStrategyConfig();
		contractStrategyConfigService.updateContractStrategyConfig(contractStrategyConfig);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractStrategyConfigByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractStrategyConfigById() {
	}

}
