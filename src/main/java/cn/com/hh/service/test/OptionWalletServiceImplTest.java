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
 * @date 2020-12-08 18:16:07
 * Description: [option单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OptionWalletServiceImplTest  {

	@Autowired
	private IOptionWalletService optionWalletService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionWalletById() {
		OptionWallet optionWallet = optionWalletService.selectOptionWalletById(1);
		System.out.println(optionWallet.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionWalletList() {
		List<OptionWallet> list = optionWalletService.selectOptionWalletList(new OptionWallet());
		for(OptionWallet model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionWallet() {
		for (int i = 1;i < 30; i++) {
			OptionWallet optionWallet = new OptionWallet();
			optionWalletService.insertOptionWallet(optionWallet);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionWallet() {
		OptionWallet optionWallet = new OptionWallet();
		optionWalletService.updateOptionWallet(optionWallet);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionWalletByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionWalletById() {
	}

}
