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
public class CommunityMemberFollowInfoServiceImplTest  {

	@Autowired
	private ICommunityMemberFollowInfoService communityMemberFollowInfoService;

	/**
	* 查询community
	*/
	@Test
	public void selectCommunityMemberFollowInfoById() {
		CommunityMemberFollowInfo communityMemberFollowInfo = communityMemberFollowInfoService.selectCommunityMemberFollowInfoById(1);
		System.out.println(communityMemberFollowInfo.toString());
	}

	/**
	* 查询community列表
	*/
	@Test
	public void selectCommunityMemberFollowInfoList() {
		List<CommunityMemberFollowInfo> list = communityMemberFollowInfoService.selectCommunityMemberFollowInfoList(new CommunityMemberFollowInfo());
		for(CommunityMemberFollowInfo model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增community
	*/
	@Test
	public void insertCommunityMemberFollowInfo() {
		for (int i = 1;i < 30; i++) {
			CommunityMemberFollowInfo communityMemberFollowInfo = new CommunityMemberFollowInfo();
			communityMemberFollowInfoService.insertCommunityMemberFollowInfo(communityMemberFollowInfo);
		}
	}

	/**
	* 修改community
	*/
	@Test
	public void updateCommunityMemberFollowInfo() {
		CommunityMemberFollowInfo communityMemberFollowInfo = new CommunityMemberFollowInfo();
		communityMemberFollowInfoService.updateCommunityMemberFollowInfo(communityMemberFollowInfo);
	}

	/**
	* 批量删除community
	*/
	@Test
	public void deleteCommunityMemberFollowInfoByIds() {
	}

	/**
	* 删除community信息
	*/
	@Test
	public void deleteCommunityMemberFollowInfoById() {
	}

}
