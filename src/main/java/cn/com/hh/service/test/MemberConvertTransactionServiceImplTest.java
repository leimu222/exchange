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
public class MemberConvertTransactionServiceImplTest  {

	@Autowired
	private IMemberConvertTransactionService memberConvertTransactionService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberConvertTransactionById() {
		MemberConvertTransaction memberConvertTransaction = memberConvertTransactionService.selectMemberConvertTransactionById(1);
		System.out.println(memberConvertTransaction.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberConvertTransactionList() {
		List<MemberConvertTransaction> list = memberConvertTransactionService.selectMemberConvertTransactionList(new MemberConvertTransaction());
		for(MemberConvertTransaction model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberConvertTransaction() {
		for (int i = 1;i < 30; i++) {
			MemberConvertTransaction memberConvertTransaction = new MemberConvertTransaction();
			memberConvertTransactionService.insertMemberConvertTransaction(memberConvertTransaction);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberConvertTransaction() {
		MemberConvertTransaction memberConvertTransaction = new MemberConvertTransaction();
		memberConvertTransactionService.updateMemberConvertTransaction(memberConvertTransaction);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberConvertTransactionByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberConvertTransactionById() {
	}

}
