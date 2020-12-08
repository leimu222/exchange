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
public class ContractWalletServiceImplTest  {

	@Autowired
	private IContractWalletService contractWalletService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractWalletById() {
		ContractWallet contractWallet = contractWalletService.selectContractWalletById(1);
		System.out.println(contractWallet.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractWalletList() {
		List<ContractWallet> list = contractWalletService.selectContractWalletList(new ContractWallet());
		for(ContractWallet model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractWallet() {
		for (int i = 1;i < 30; i++) {
			ContractWallet contractWallet = new ContractWallet();
			contractWalletService.insertContractWallet(contractWallet);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractWallet() {
		ContractWallet contractWallet = new ContractWallet();
		contractWalletService.updateContractWallet(contractWallet);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractWalletByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractWalletById() {
	}

}
