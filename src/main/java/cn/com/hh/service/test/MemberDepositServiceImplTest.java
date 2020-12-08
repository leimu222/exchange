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
public class MemberDepositServiceImplTest  {

	@Autowired
	private IMemberDepositService memberDepositService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberDepositById() {
		MemberDeposit memberDeposit = memberDepositService.selectMemberDepositById(1);
		System.out.println(memberDeposit.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberDepositList() {
		List<MemberDeposit> list = memberDepositService.selectMemberDepositList(new MemberDeposit());
		for(MemberDeposit model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberDeposit() {
		for (int i = 1;i < 30; i++) {
			MemberDeposit memberDeposit = new MemberDeposit();
			memberDepositService.insertMemberDeposit(memberDeposit);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberDeposit() {
		MemberDeposit memberDeposit = new MemberDeposit();
		memberDepositService.updateMemberDeposit(memberDeposit);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberDepositByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberDepositById() {
	}

}
