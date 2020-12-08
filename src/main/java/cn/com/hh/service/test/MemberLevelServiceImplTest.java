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
public class MemberLevelServiceImplTest  {

	@Autowired
	private IMemberLevelService memberLevelService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberLevelById() {
		MemberLevel memberLevel = memberLevelService.selectMemberLevelById(1);
		System.out.println(memberLevel.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberLevelList() {
		List<MemberLevel> list = memberLevelService.selectMemberLevelList(new MemberLevel());
		for(MemberLevel model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberLevel() {
		for (int i = 1;i < 30; i++) {
			MemberLevel memberLevel = new MemberLevel();
			memberLevelService.insertMemberLevel(memberLevel);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberLevel() {
		MemberLevel memberLevel = new MemberLevel();
		memberLevelService.updateMemberLevel(memberLevel);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberLevelByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberLevelById() {
	}

}
