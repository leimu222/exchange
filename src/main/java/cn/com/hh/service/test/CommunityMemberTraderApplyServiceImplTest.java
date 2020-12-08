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
public class CommunityMemberTraderApplyServiceImplTest  {

	@Autowired
	private ICommunityMemberTraderApplyService communityMemberTraderApplyService;

	/**
	* 查询community
	*/
	@Test
	public void selectCommunityMemberTraderApplyById() {
		CommunityMemberTraderApply communityMemberTraderApply = communityMemberTraderApplyService.selectCommunityMemberTraderApplyById(1);
		System.out.println(communityMemberTraderApply.toString());
	}

	/**
	* 查询community列表
	*/
	@Test
	public void selectCommunityMemberTraderApplyList() {
		List<CommunityMemberTraderApply> list = communityMemberTraderApplyService.selectCommunityMemberTraderApplyList(new CommunityMemberTraderApply());
		for(CommunityMemberTraderApply model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增community
	*/
	@Test
	public void insertCommunityMemberTraderApply() {
		for (int i = 1;i < 30; i++) {
			CommunityMemberTraderApply communityMemberTraderApply = new CommunityMemberTraderApply();
			communityMemberTraderApplyService.insertCommunityMemberTraderApply(communityMemberTraderApply);
		}
	}

	/**
	* 修改community
	*/
	@Test
	public void updateCommunityMemberTraderApply() {
		CommunityMemberTraderApply communityMemberTraderApply = new CommunityMemberTraderApply();
		communityMemberTraderApplyService.updateCommunityMemberTraderApply(communityMemberTraderApply);
	}

	/**
	* 批量删除community
	*/
	@Test
	public void deleteCommunityMemberTraderApplyByIds() {
	}

	/**
	* 删除community信息
	*/
	@Test
	public void deleteCommunityMemberTraderApplyById() {
	}

}
