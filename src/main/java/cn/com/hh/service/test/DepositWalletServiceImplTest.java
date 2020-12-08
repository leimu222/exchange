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
 * Description: [deposit单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepositWalletServiceImplTest  {

	@Autowired
	private IDepositWalletService depositWalletService;

	/**
	* 查询deposit
	*/
	@Test
	public void selectDepositWalletById() {
		DepositWallet depositWallet = depositWalletService.selectDepositWalletById(1);
		System.out.println(depositWallet.toString());
	}

	/**
	* 查询deposit列表
	*/
	@Test
	public void selectDepositWalletList() {
		List<DepositWallet> list = depositWalletService.selectDepositWalletList(new DepositWallet());
		for(DepositWallet model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增deposit
	*/
	@Test
	public void insertDepositWallet() {
		for (int i = 1;i < 30; i++) {
			DepositWallet depositWallet = new DepositWallet();
			depositWalletService.insertDepositWallet(depositWallet);
		}
	}

	/**
	* 修改deposit
	*/
	@Test
	public void updateDepositWallet() {
		DepositWallet depositWallet = new DepositWallet();
		depositWalletService.updateDepositWallet(depositWallet);
	}

	/**
	* 批量删除deposit
	*/
	@Test
	public void deleteDepositWalletByIds() {
	}

	/**
	* 删除deposit信息
	*/
	@Test
	public void deleteDepositWalletById() {
	}

}
