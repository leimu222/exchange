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
public class MemberMiningProfitDay20201112ServiceImplTest  {

	@Autowired
	private IMemberMiningProfitDay20201112Service memberMiningProfitDay20201112Service;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberMiningProfitDay20201112ById() {
		MemberMiningProfitDay20201112 memberMiningProfitDay20201112 = memberMiningProfitDay20201112Service.selectMemberMiningProfitDay20201112ById(1);
		System.out.println(memberMiningProfitDay20201112.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberMiningProfitDay20201112List() {
		List<MemberMiningProfitDay20201112> list = memberMiningProfitDay20201112Service.selectMemberMiningProfitDay20201112List(new MemberMiningProfitDay20201112());
		for(MemberMiningProfitDay20201112 model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberMiningProfitDay20201112() {
		for (int i = 1;i < 30; i++) {
			MemberMiningProfitDay20201112 memberMiningProfitDay20201112 = new MemberMiningProfitDay20201112();
			memberMiningProfitDay20201112Service.insertMemberMiningProfitDay20201112(memberMiningProfitDay20201112);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberMiningProfitDay20201112() {
		MemberMiningProfitDay20201112 memberMiningProfitDay20201112 = new MemberMiningProfitDay20201112();
		memberMiningProfitDay20201112Service.updateMemberMiningProfitDay20201112(memberMiningProfitDay20201112);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberMiningProfitDay20201112ByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberMiningProfitDay20201112ById() {
	}

}
