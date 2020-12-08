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
public class CommunityTopCategoryConfigServiceImplTest  {

	@Autowired
	private ICommunityTopCategoryConfigService communityTopCategoryConfigService;

	/**
	* 查询community
	*/
	@Test
	public void selectCommunityTopCategoryConfigById() {
		CommunityTopCategoryConfig communityTopCategoryConfig = communityTopCategoryConfigService.selectCommunityTopCategoryConfigById(1);
		System.out.println(communityTopCategoryConfig.toString());
	}

	/**
	* 查询community列表
	*/
	@Test
	public void selectCommunityTopCategoryConfigList() {
		List<CommunityTopCategoryConfig> list = communityTopCategoryConfigService.selectCommunityTopCategoryConfigList(new CommunityTopCategoryConfig());
		for(CommunityTopCategoryConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增community
	*/
	@Test
	public void insertCommunityTopCategoryConfig() {
		for (int i = 1;i < 30; i++) {
			CommunityTopCategoryConfig communityTopCategoryConfig = new CommunityTopCategoryConfig();
			communityTopCategoryConfigService.insertCommunityTopCategoryConfig(communityTopCategoryConfig);
		}
	}

	/**
	* 修改community
	*/
	@Test
	public void updateCommunityTopCategoryConfig() {
		CommunityTopCategoryConfig communityTopCategoryConfig = new CommunityTopCategoryConfig();
		communityTopCategoryConfigService.updateCommunityTopCategoryConfig(communityTopCategoryConfig);
	}

	/**
	* 批量删除community
	*/
	@Test
	public void deleteCommunityTopCategoryConfigByIds() {
	}

	/**
	* 删除community信息
	*/
	@Test
	public void deleteCommunityTopCategoryConfigById() {
	}

}
