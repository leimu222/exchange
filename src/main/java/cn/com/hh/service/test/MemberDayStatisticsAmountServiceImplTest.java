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
public class MemberDayStatisticsAmountServiceImplTest  {

	@Autowired
	private IMemberDayStatisticsAmountService memberDayStatisticsAmountService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberDayStatisticsAmountById() {
		MemberDayStatisticsAmount memberDayStatisticsAmount = memberDayStatisticsAmountService.selectMemberDayStatisticsAmountById(1);
		System.out.println(memberDayStatisticsAmount.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberDayStatisticsAmountList() {
		List<MemberDayStatisticsAmount> list = memberDayStatisticsAmountService.selectMemberDayStatisticsAmountList(new MemberDayStatisticsAmount());
		for(MemberDayStatisticsAmount model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberDayStatisticsAmount() {
		for (int i = 1;i < 30; i++) {
			MemberDayStatisticsAmount memberDayStatisticsAmount = new MemberDayStatisticsAmount();
			memberDayStatisticsAmountService.insertMemberDayStatisticsAmount(memberDayStatisticsAmount);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberDayStatisticsAmount() {
		MemberDayStatisticsAmount memberDayStatisticsAmount = new MemberDayStatisticsAmount();
		memberDayStatisticsAmountService.updateMemberDayStatisticsAmount(memberDayStatisticsAmount);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberDayStatisticsAmountByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberDayStatisticsAmountById() {
	}

}
