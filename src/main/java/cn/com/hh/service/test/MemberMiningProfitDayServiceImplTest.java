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
public class MemberMiningProfitDayServiceImplTest  {

	@Autowired
	private IMemberMiningProfitDayService memberMiningProfitDayService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberMiningProfitDayById() {
		MemberMiningProfitDay memberMiningProfitDay = memberMiningProfitDayService.selectMemberMiningProfitDayById(1);
		System.out.println(memberMiningProfitDay.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberMiningProfitDayList() {
		List<MemberMiningProfitDay> list = memberMiningProfitDayService.selectMemberMiningProfitDayList(new MemberMiningProfitDay());
		for(MemberMiningProfitDay model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberMiningProfitDay() {
		for (int i = 1;i < 30; i++) {
			MemberMiningProfitDay memberMiningProfitDay = new MemberMiningProfitDay();
			memberMiningProfitDayService.insertMemberMiningProfitDay(memberMiningProfitDay);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberMiningProfitDay() {
		MemberMiningProfitDay memberMiningProfitDay = new MemberMiningProfitDay();
		memberMiningProfitDayService.updateMemberMiningProfitDay(memberMiningProfitDay);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberMiningProfitDayByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberMiningProfitDayById() {
	}

}
