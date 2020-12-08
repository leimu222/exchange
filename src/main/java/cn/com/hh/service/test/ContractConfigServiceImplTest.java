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
 * @date 2020-12-08 18:16:02
 * Description: [contract单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ContractConfigServiceImplTest  {

	@Autowired
	private IContractConfigService contractConfigService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractConfigById() {
		ContractConfig contractConfig = contractConfigService.selectContractConfigById(1);
		System.out.println(contractConfig.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractConfigList() {
		List<ContractConfig> list = contractConfigService.selectContractConfigList(new ContractConfig());
		for(ContractConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractConfig() {
		for (int i = 1;i < 30; i++) {
			ContractConfig contractConfig = new ContractConfig();
			contractConfigService.insertContractConfig(contractConfig);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractConfig() {
		ContractConfig contractConfig = new ContractConfig();
		contractConfigService.updateContractConfig(contractConfig);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractConfigByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractConfigById() {
	}

}
