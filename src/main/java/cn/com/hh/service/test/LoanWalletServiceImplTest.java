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
 * Description: [loan单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoanWalletServiceImplTest  {

	@Autowired
	private ILoanWalletService loanWalletService;

	/**
	* 查询loan
	*/
	@Test
	public void selectLoanWalletById() {
		LoanWallet loanWallet = loanWalletService.selectLoanWalletById(1);
		System.out.println(loanWallet.toString());
	}

	/**
	* 查询loan列表
	*/
	@Test
	public void selectLoanWalletList() {
		List<LoanWallet> list = loanWalletService.selectLoanWalletList(new LoanWallet());
		for(LoanWallet model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增loan
	*/
	@Test
	public void insertLoanWallet() {
		for (int i = 1;i < 30; i++) {
			LoanWallet loanWallet = new LoanWallet();
			loanWalletService.insertLoanWallet(loanWallet);
		}
	}

	/**
	* 修改loan
	*/
	@Test
	public void updateLoanWallet() {
		LoanWallet loanWallet = new LoanWallet();
		loanWalletService.updateLoanWallet(loanWallet);
	}

	/**
	* 批量删除loan
	*/
	@Test
	public void deleteLoanWalletByIds() {
	}

	/**
	* 删除loan信息
	*/
	@Test
	public void deleteLoanWalletById() {
	}

}
