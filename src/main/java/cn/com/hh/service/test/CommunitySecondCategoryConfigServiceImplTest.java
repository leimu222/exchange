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
public class CommunitySecondCategoryConfigServiceImplTest  {

	@Autowired
	private ICommunitySecondCategoryConfigService communitySecondCategoryConfigService;

	/**
	* 查询community
	*/
	@Test
	public void selectCommunitySecondCategoryConfigById() {
		CommunitySecondCategoryConfig communitySecondCategoryConfig = communitySecondCategoryConfigService.selectCommunitySecondCategoryConfigById(1);
		System.out.println(communitySecondCategoryConfig.toString());
	}

	/**
	* 查询community列表
	*/
	@Test
	public void selectCommunitySecondCategoryConfigList() {
		List<CommunitySecondCategoryConfig> list = communitySecondCategoryConfigService.selectCommunitySecondCategoryConfigList(new CommunitySecondCategoryConfig());
		for(CommunitySecondCategoryConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增community
	*/
	@Test
	public void insertCommunitySecondCategoryConfig() {
		for (int i = 1;i < 30; i++) {
			CommunitySecondCategoryConfig communitySecondCategoryConfig = new CommunitySecondCategoryConfig();
			communitySecondCategoryConfigService.insertCommunitySecondCategoryConfig(communitySecondCategoryConfig);
		}
	}

	/**
	* 修改community
	*/
	@Test
	public void updateCommunitySecondCategoryConfig() {
		CommunitySecondCategoryConfig communitySecondCategoryConfig = new CommunitySecondCategoryConfig();
		communitySecondCategoryConfigService.updateCommunitySecondCategoryConfig(communitySecondCategoryConfig);
	}

	/**
	* 批量删除community
	*/
	@Test
	public void deleteCommunitySecondCategoryConfigByIds() {
	}

	/**
	* 删除community信息
	*/
	@Test
	public void deleteCommunitySecondCategoryConfigById() {
	}

}
