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
 * Description: [legal单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LegalWalletWithdrawServiceImplTest  {

	@Autowired
	private ILegalWalletWithdrawService legalWalletWithdrawService;

	/**
	* 查询legal
	*/
	@Test
	public void selectLegalWalletWithdrawById() {
		LegalWalletWithdraw legalWalletWithdraw = legalWalletWithdrawService.selectLegalWalletWithdrawById(1);
		System.out.println(legalWalletWithdraw.toString());
	}

	/**
	* 查询legal列表
	*/
	@Test
	public void selectLegalWalletWithdrawList() {
		List<LegalWalletWithdraw> list = legalWalletWithdrawService.selectLegalWalletWithdrawList(new LegalWalletWithdraw());
		for(LegalWalletWithdraw model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增legal
	*/
	@Test
	public void insertLegalWalletWithdraw() {
		for (int i = 1;i < 30; i++) {
			LegalWalletWithdraw legalWalletWithdraw = new LegalWalletWithdraw();
			legalWalletWithdrawService.insertLegalWalletWithdraw(legalWalletWithdraw);
		}
	}

	/**
	* 修改legal
	*/
	@Test
	public void updateLegalWalletWithdraw() {
		LegalWalletWithdraw legalWalletWithdraw = new LegalWalletWithdraw();
		legalWalletWithdrawService.updateLegalWalletWithdraw(legalWalletWithdraw);
	}

	/**
	* 批量删除legal
	*/
	@Test
	public void deleteLegalWalletWithdrawByIds() {
	}

	/**
	* 删除legal信息
	*/
	@Test
	public void deleteLegalWalletWithdrawById() {
	}

}
