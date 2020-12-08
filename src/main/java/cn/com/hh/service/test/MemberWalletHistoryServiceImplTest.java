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
public class MemberWalletHistoryServiceImplTest  {

	@Autowired
	private IMemberWalletHistoryService memberWalletHistoryService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberWalletHistoryById() {
		MemberWalletHistory memberWalletHistory = memberWalletHistoryService.selectMemberWalletHistoryById(1);
		System.out.println(memberWalletHistory.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberWalletHistoryList() {
		List<MemberWalletHistory> list = memberWalletHistoryService.selectMemberWalletHistoryList(new MemberWalletHistory());
		for(MemberWalletHistory model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberWalletHistory() {
		for (int i = 1;i < 30; i++) {
			MemberWalletHistory memberWalletHistory = new MemberWalletHistory();
			memberWalletHistoryService.insertMemberWalletHistory(memberWalletHistory);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberWalletHistory() {
		MemberWalletHistory memberWalletHistory = new MemberWalletHistory();
		memberWalletHistoryService.updateMemberWalletHistory(memberWalletHistory);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberWalletHistoryByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberWalletHistoryById() {
	}

}
