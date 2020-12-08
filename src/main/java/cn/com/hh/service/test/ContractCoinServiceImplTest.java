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
public class ContractCoinServiceImplTest  {

	@Autowired
	private IContractCoinService contractCoinService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractCoinById() {
		ContractCoin contractCoin = contractCoinService.selectContractCoinById(1);
		System.out.println(contractCoin.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractCoinList() {
		List<ContractCoin> list = contractCoinService.selectContractCoinList(new ContractCoin());
		for(ContractCoin model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractCoin() {
		for (int i = 1;i < 30; i++) {
			ContractCoin contractCoin = new ContractCoin();
			contractCoinService.insertContractCoin(contractCoin);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractCoin() {
		ContractCoin contractCoin = new ContractCoin();
		contractCoinService.updateContractCoin(contractCoin);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractCoinByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractCoinById() {
	}

}
