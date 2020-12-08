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
public class MemberApiKeyServiceImplTest  {

	@Autowired
	private IMemberApiKeyService memberApiKeyService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberApiKeyById() {
		MemberApiKey memberApiKey = memberApiKeyService.selectMemberApiKeyById(1);
		System.out.println(memberApiKey.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberApiKeyList() {
		List<MemberApiKey> list = memberApiKeyService.selectMemberApiKeyList(new MemberApiKey());
		for(MemberApiKey model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberApiKey() {
		for (int i = 1;i < 30; i++) {
			MemberApiKey memberApiKey = new MemberApiKey();
			memberApiKeyService.insertMemberApiKey(memberApiKey);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberApiKey() {
		MemberApiKey memberApiKey = new MemberApiKey();
		memberApiKeyService.updateMemberApiKey(memberApiKey);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberApiKeyByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberApiKeyById() {
	}

}
