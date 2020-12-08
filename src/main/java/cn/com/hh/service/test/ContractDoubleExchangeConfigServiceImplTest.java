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
public class ContractDoubleExchangeConfigServiceImplTest  {

	@Autowired
	private IContractDoubleExchangeConfigService contractDoubleExchangeConfigService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractDoubleExchangeConfigById() {
		ContractDoubleExchangeConfig contractDoubleExchangeConfig = contractDoubleExchangeConfigService.selectContractDoubleExchangeConfigById(1);
		System.out.println(contractDoubleExchangeConfig.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractDoubleExchangeConfigList() {
		List<ContractDoubleExchangeConfig> list = contractDoubleExchangeConfigService.selectContractDoubleExchangeConfigList(new ContractDoubleExchangeConfig());
		for(ContractDoubleExchangeConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractDoubleExchangeConfig() {
		for (int i = 1;i < 30; i++) {
			ContractDoubleExchangeConfig contractDoubleExchangeConfig = new ContractDoubleExchangeConfig();
			contractDoubleExchangeConfigService.insertContractDoubleExchangeConfig(contractDoubleExchangeConfig);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractDoubleExchangeConfig() {
		ContractDoubleExchangeConfig contractDoubleExchangeConfig = new ContractDoubleExchangeConfig();
		contractDoubleExchangeConfigService.updateContractDoubleExchangeConfig(contractDoubleExchangeConfig);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractDoubleExchangeConfigByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractDoubleExchangeConfigById() {
	}

}
