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
 * @date 2020-12-08 18:16:08
 * Description: [project单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectApiKeyServiceImplTest  {

	@Autowired
	private IProjectApiKeyService projectApiKeyService;

	/**
	* 查询project
	*/
	@Test
	public void selectProjectApiKeyById() {
		ProjectApiKey projectApiKey = projectApiKeyService.selectProjectApiKeyById(1);
		System.out.println(projectApiKey.toString());
	}

	/**
	* 查询project列表
	*/
	@Test
	public void selectProjectApiKeyList() {
		List<ProjectApiKey> list = projectApiKeyService.selectProjectApiKeyList(new ProjectApiKey());
		for(ProjectApiKey model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增project
	*/
	@Test
	public void insertProjectApiKey() {
		for (int i = 1;i < 30; i++) {
			ProjectApiKey projectApiKey = new ProjectApiKey();
			projectApiKeyService.insertProjectApiKey(projectApiKey);
		}
	}

	/**
	* 修改project
	*/
	@Test
	public void updateProjectApiKey() {
		ProjectApiKey projectApiKey = new ProjectApiKey();
		projectApiKeyService.updateProjectApiKey(projectApiKey);
	}

	/**
	* 批量删除project
	*/
	@Test
	public void deleteProjectApiKeyByIds() {
	}

	/**
	* 删除project信息
	*/
	@Test
	public void deleteProjectApiKeyById() {
	}

}
