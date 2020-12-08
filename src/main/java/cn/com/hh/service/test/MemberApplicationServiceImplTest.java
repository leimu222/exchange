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
public class MemberApplicationServiceImplTest  {

	@Autowired
	private IMemberApplicationService memberApplicationService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberApplicationById() {
		MemberApplication memberApplication = memberApplicationService.selectMemberApplicationById(1);
		System.out.println(memberApplication.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberApplicationList() {
		List<MemberApplication> list = memberApplicationService.selectMemberApplicationList(new MemberApplication());
		for(MemberApplication model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberApplication() {
		for (int i = 1;i < 30; i++) {
			MemberApplication memberApplication = new MemberApplication();
			memberApplicationService.insertMemberApplication(memberApplication);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberApplication() {
		MemberApplication memberApplication = new MemberApplication();
		memberApplicationService.updateMemberApplication(memberApplication);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberApplicationByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberApplicationById() {
	}

}
