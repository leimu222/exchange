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
 * @date 2020-12-08 18:16:02
 * Description: [community单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CommunityMemberServiceImplTest  {

	@Autowired
	private ICommunityMemberService communityMemberService;

	/**
	* 查询community
	*/
	@Test
	public void selectCommunityMemberById() {
		CommunityMember communityMember = communityMemberService.selectCommunityMemberById(1);
		System.out.println(communityMember.toString());
	}

	/**
	* 查询community列表
	*/
	@Test
	public void selectCommunityMemberList() {
		List<CommunityMember> list = communityMemberService.selectCommunityMemberList(new CommunityMember());
		for(CommunityMember model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增community
	*/
	@Test
	public void insertCommunityMember() {
		for (int i = 1;i < 30; i++) {
			CommunityMember communityMember = new CommunityMember();
			communityMemberService.insertCommunityMember(communityMember);
		}
	}

	/**
	* 修改community
	*/
	@Test
	public void updateCommunityMember() {
		CommunityMember communityMember = new CommunityMember();
		communityMemberService.updateCommunityMember(communityMember);
	}

	/**
	* 批量删除community
	*/
	@Test
	public void deleteCommunityMemberByIds() {
	}

	/**
	* 删除community信息
	*/
	@Test
	public void deleteCommunityMemberById() {
	}

}
