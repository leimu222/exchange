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
 * @date 2020-12-08 18:16:05
 * Description: [lever单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LeverWalletServiceImplTest  {

	@Autowired
	private ILeverWalletService leverWalletService;

	/**
	* 查询lever
	*/
	@Test
	public void selectLeverWalletById() {
		LeverWallet leverWallet = leverWalletService.selectLeverWalletById(1);
		System.out.println(leverWallet.toString());
	}

	/**
	* 查询lever列表
	*/
	@Test
	public void selectLeverWalletList() {
		List<LeverWallet> list = leverWalletService.selectLeverWalletList(new LeverWallet());
		for(LeverWallet model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增lever
	*/
	@Test
	public void insertLeverWallet() {
		for (int i = 1;i < 30; i++) {
			LeverWallet leverWallet = new LeverWallet();
			leverWalletService.insertLeverWallet(leverWallet);
		}
	}

	/**
	* 修改lever
	*/
	@Test
	public void updateLeverWallet() {
		LeverWallet leverWallet = new LeverWallet();
		leverWalletService.updateLeverWallet(leverWallet);
	}

	/**
	* 批量删除lever
	*/
	@Test
	public void deleteLeverWalletByIds() {
	}

	/**
	* 删除lever信息
	*/
	@Test
	public void deleteLeverWalletById() {
	}

}
