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
 * Description: [member单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberBonusServiceImplTest  {

	@Autowired
	private IMemberBonusService memberBonusService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberBonusById() {
		MemberBonus memberBonus = memberBonusService.selectMemberBonusById(1);
		System.out.println(memberBonus.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberBonusList() {
		List<MemberBonus> list = memberBonusService.selectMemberBonusList(new MemberBonus());
		for(MemberBonus model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberBonus() {
		for (int i = 1;i < 30; i++) {
			MemberBonus memberBonus = new MemberBonus();
			memberBonusService.insertMemberBonus(memberBonus);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberBonus() {
		MemberBonus memberBonus = new MemberBonus();
		memberBonusService.updateMemberBonus(memberBonus);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberBonusByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberBonusById() {
	}

}
