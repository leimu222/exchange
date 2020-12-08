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
public class MemberGradeServiceImplTest  {

	@Autowired
	private IMemberGradeService memberGradeService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberGradeById() {
		MemberGrade memberGrade = memberGradeService.selectMemberGradeById(1);
		System.out.println(memberGrade.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberGradeList() {
		List<MemberGrade> list = memberGradeService.selectMemberGradeList(new MemberGrade());
		for(MemberGrade model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberGrade() {
		for (int i = 1;i < 30; i++) {
			MemberGrade memberGrade = new MemberGrade();
			memberGradeService.insertMemberGrade(memberGrade);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberGrade() {
		MemberGrade memberGrade = new MemberGrade();
		memberGradeService.updateMemberGrade(memberGrade);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberGradeByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberGradeById() {
	}

}
