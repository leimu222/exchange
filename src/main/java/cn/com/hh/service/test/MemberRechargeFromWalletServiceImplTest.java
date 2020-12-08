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
 * @date 2020-12-08 18:16:06
 * Description: [member单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRechargeFromWalletServiceImplTest  {

	@Autowired
	private IMemberRechargeFromWalletService memberRechargeFromWalletService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberRechargeFromWalletById() {
		MemberRechargeFromWallet memberRechargeFromWallet = memberRechargeFromWalletService.selectMemberRechargeFromWalletById(1);
		System.out.println(memberRechargeFromWallet.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberRechargeFromWalletList() {
		List<MemberRechargeFromWallet> list = memberRechargeFromWalletService.selectMemberRechargeFromWalletList(new MemberRechargeFromWallet());
		for(MemberRechargeFromWallet model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberRechargeFromWallet() {
		for (int i = 1;i < 30; i++) {
			MemberRechargeFromWallet memberRechargeFromWallet = new MemberRechargeFromWallet();
			memberRechargeFromWalletService.insertMemberRechargeFromWallet(memberRechargeFromWallet);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberRechargeFromWallet() {
		MemberRechargeFromWallet memberRechargeFromWallet = new MemberRechargeFromWallet();
		memberRechargeFromWalletService.updateMemberRechargeFromWallet(memberRechargeFromWallet);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberRechargeFromWalletByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberRechargeFromWalletById() {
	}

}
