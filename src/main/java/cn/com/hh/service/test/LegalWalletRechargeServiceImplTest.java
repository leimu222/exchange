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
public class LegalWalletRechargeServiceImplTest  {

	@Autowired
	private ILegalWalletRechargeService legalWalletRechargeService;

	/**
	* 查询legal
	*/
	@Test
	public void selectLegalWalletRechargeById() {
		LegalWalletRecharge legalWalletRecharge = legalWalletRechargeService.selectLegalWalletRechargeById(1);
		System.out.println(legalWalletRecharge.toString());
	}

	/**
	* 查询legal列表
	*/
	@Test
	public void selectLegalWalletRechargeList() {
		List<LegalWalletRecharge> list = legalWalletRechargeService.selectLegalWalletRechargeList(new LegalWalletRecharge());
		for(LegalWalletRecharge model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增legal
	*/
	@Test
	public void insertLegalWalletRecharge() {
		for (int i = 1;i < 30; i++) {
			LegalWalletRecharge legalWalletRecharge = new LegalWalletRecharge();
			legalWalletRechargeService.insertLegalWalletRecharge(legalWalletRecharge);
		}
	}

	/**
	* 修改legal
	*/
	@Test
	public void updateLegalWalletRecharge() {
		LegalWalletRecharge legalWalletRecharge = new LegalWalletRecharge();
		legalWalletRechargeService.updateLegalWalletRecharge(legalWalletRecharge);
	}

	/**
	* 批量删除legal
	*/
	@Test
	public void deleteLegalWalletRechargeByIds() {
	}

	/**
	* 删除legal信息
	*/
	@Test
	public void deleteLegalWalletRechargeById() {
	}

}
