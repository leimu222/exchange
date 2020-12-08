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
public class MemberApplicationConfigServiceImplTest  {

	@Autowired
	private IMemberApplicationConfigService memberApplicationConfigService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberApplicationConfigById() {
		MemberApplicationConfig memberApplicationConfig = memberApplicationConfigService.selectMemberApplicationConfigById(1);
		System.out.println(memberApplicationConfig.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberApplicationConfigList() {
		List<MemberApplicationConfig> list = memberApplicationConfigService.selectMemberApplicationConfigList(new MemberApplicationConfig());
		for(MemberApplicationConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberApplicationConfig() {
		for (int i = 1;i < 30; i++) {
			MemberApplicationConfig memberApplicationConfig = new MemberApplicationConfig();
			memberApplicationConfigService.insertMemberApplicationConfig(memberApplicationConfig);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberApplicationConfig() {
		MemberApplicationConfig memberApplicationConfig = new MemberApplicationConfig();
		memberApplicationConfigService.updateMemberApplicationConfig(memberApplicationConfig);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberApplicationConfigByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberApplicationConfigById() {
	}

}
