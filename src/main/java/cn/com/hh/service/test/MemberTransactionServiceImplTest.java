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
public class MemberTransactionServiceImplTest  {

	@Autowired
	private IMemberTransactionService memberTransactionService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberTransactionById() {
		MemberTransaction memberTransaction = memberTransactionService.selectMemberTransactionById(1);
		System.out.println(memberTransaction.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberTransactionList() {
		List<MemberTransaction> list = memberTransactionService.selectMemberTransactionList(new MemberTransaction());
		for(MemberTransaction model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberTransaction() {
		for (int i = 1;i < 30; i++) {
			MemberTransaction memberTransaction = new MemberTransaction();
			memberTransactionService.insertMemberTransaction(memberTransaction);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberTransaction() {
		MemberTransaction memberTransaction = new MemberTransaction();
		memberTransactionService.updateMemberTransaction(memberTransaction);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberTransactionByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberTransactionById() {
	}

}
