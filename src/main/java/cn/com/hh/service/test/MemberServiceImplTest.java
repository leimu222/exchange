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
public class MemberServiceImplTest  {

	@Autowired
	private IMemberService memberService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberById() {
		Member member = memberService.selectMemberById(1);
		System.out.println(member.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberList() {
		List<Member> list = memberService.selectMemberList(new Member());
		for(Member model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMember() {
		for (int i = 1;i < 30; i++) {
			Member member = new Member();
			memberService.insertMember(member);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMember() {
		Member member = new Member();
		memberService.updateMember(member);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberById() {
	}

}
