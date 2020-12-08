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
public class CommunityMemberTraderConfigServiceImplTest  {

	@Autowired
	private ICommunityMemberTraderConfigService communityMemberTraderConfigService;

	/**
	* 查询community
	*/
	@Test
	public void selectCommunityMemberTraderConfigById() {
		CommunityMemberTraderConfig communityMemberTraderConfig = communityMemberTraderConfigService.selectCommunityMemberTraderConfigById(1);
		System.out.println(communityMemberTraderConfig.toString());
	}

	/**
	* 查询community列表
	*/
	@Test
	public void selectCommunityMemberTraderConfigList() {
		List<CommunityMemberTraderConfig> list = communityMemberTraderConfigService.selectCommunityMemberTraderConfigList(new CommunityMemberTraderConfig());
		for(CommunityMemberTraderConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增community
	*/
	@Test
	public void insertCommunityMemberTraderConfig() {
		for (int i = 1;i < 30; i++) {
			CommunityMemberTraderConfig communityMemberTraderConfig = new CommunityMemberTraderConfig();
			communityMemberTraderConfigService.insertCommunityMemberTraderConfig(communityMemberTraderConfig);
		}
	}

	/**
	* 修改community
	*/
	@Test
	public void updateCommunityMemberTraderConfig() {
		CommunityMemberTraderConfig communityMemberTraderConfig = new CommunityMemberTraderConfig();
		communityMemberTraderConfigService.updateCommunityMemberTraderConfig(communityMemberTraderConfig);
	}

	/**
	* 批量删除community
	*/
	@Test
	public void deleteCommunityMemberTraderConfigByIds() {
	}

	/**
	* 删除community信息
	*/
	@Test
	public void deleteCommunityMemberTraderConfigById() {
	}

}
