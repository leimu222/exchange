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
 * @date 2020-12-08 18:16:08
 * Description: [pool单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PoolWalletServiceImplTest  {

	@Autowired
	private IPoolWalletService poolWalletService;

	/**
	* 查询pool
	*/
	@Test
	public void selectPoolWalletById() {
		PoolWallet poolWallet = poolWalletService.selectPoolWalletById(1);
		System.out.println(poolWallet.toString());
	}

	/**
	* 查询pool列表
	*/
	@Test
	public void selectPoolWalletList() {
		List<PoolWallet> list = poolWalletService.selectPoolWalletList(new PoolWallet());
		for(PoolWallet model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增pool
	*/
	@Test
	public void insertPoolWallet() {
		for (int i = 1;i < 30; i++) {
			PoolWallet poolWallet = new PoolWallet();
			poolWalletService.insertPoolWallet(poolWallet);
		}
	}

	/**
	* 修改pool
	*/
	@Test
	public void updatePoolWallet() {
		PoolWallet poolWallet = new PoolWallet();
		poolWalletService.updatePoolWallet(poolWallet);
	}

	/**
	* 批量删除pool
	*/
	@Test
	public void deletePoolWalletByIds() {
	}

	/**
	* 删除pool信息
	*/
	@Test
	public void deletePoolWalletById() {
	}

}
