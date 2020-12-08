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
public class ContractDoubleDirectionWalletServiceImplTest  {

	@Autowired
	private IContractDoubleDirectionWalletService contractDoubleDirectionWalletService;

	/**
	* 查询contract
	*/
	@Test
	public void selectContractDoubleDirectionWalletById() {
		ContractDoubleDirectionWallet contractDoubleDirectionWallet = contractDoubleDirectionWalletService.selectContractDoubleDirectionWalletById(1);
		System.out.println(contractDoubleDirectionWallet.toString());
	}

	/**
	* 查询contract列表
	*/
	@Test
	public void selectContractDoubleDirectionWalletList() {
		List<ContractDoubleDirectionWallet> list = contractDoubleDirectionWalletService.selectContractDoubleDirectionWalletList(new ContractDoubleDirectionWallet());
		for(ContractDoubleDirectionWallet model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增contract
	*/
	@Test
	public void insertContractDoubleDirectionWallet() {
		for (int i = 1;i < 30; i++) {
			ContractDoubleDirectionWallet contractDoubleDirectionWallet = new ContractDoubleDirectionWallet();
			contractDoubleDirectionWalletService.insertContractDoubleDirectionWallet(contractDoubleDirectionWallet);
		}
	}

	/**
	* 修改contract
	*/
	@Test
	public void updateContractDoubleDirectionWallet() {
		ContractDoubleDirectionWallet contractDoubleDirectionWallet = new ContractDoubleDirectionWallet();
		contractDoubleDirectionWalletService.updateContractDoubleDirectionWallet(contractDoubleDirectionWallet);
	}

	/**
	* 批量删除contract
	*/
	@Test
	public void deleteContractDoubleDirectionWalletByIds() {
	}

	/**
	* 删除contract信息
	*/
	@Test
	public void deleteContractDoubleDirectionWalletById() {
	}

}
