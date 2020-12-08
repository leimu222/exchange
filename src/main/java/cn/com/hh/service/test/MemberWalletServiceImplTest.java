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
public class MemberWalletServiceImplTest  {

	@Autowired
	private IMemberWalletService memberWalletService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberWalletById() {
		MemberWallet memberWallet = memberWalletService.selectMemberWalletById(1);
		System.out.println(memberWallet.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberWalletList() {
		List<MemberWallet> list = memberWalletService.selectMemberWalletList(new MemberWallet());
		for(MemberWallet model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberWallet() {
		for (int i = 1;i < 30; i++) {
			MemberWallet memberWallet = new MemberWallet();
			memberWalletService.insertMemberWallet(memberWallet);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberWallet() {
		MemberWallet memberWallet = new MemberWallet();
		memberWalletService.updateMemberWallet(memberWallet);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberWalletByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberWalletById() {
	}

}
