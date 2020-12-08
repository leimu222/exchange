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
 * @date 2020-12-08 18:16:01
 * Description: [app单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppRevisionServiceImplTest  {

	@Autowired
	private IAppRevisionService appRevisionService;

	/**
	* 查询app
	*/
	@Test
	public void selectAppRevisionById() {
		AppRevision appRevision = appRevisionService.selectAppRevisionById(1);
		System.out.println(appRevision.toString());
	}

	/**
	* 查询app列表
	*/
	@Test
	public void selectAppRevisionList() {
		List<AppRevision> list = appRevisionService.selectAppRevisionList(new AppRevision());
		for(AppRevision model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增app
	*/
	@Test
	public void insertAppRevision() {
		for (int i = 1;i < 30; i++) {
			AppRevision appRevision = new AppRevision();
			appRevisionService.insertAppRevision(appRevision);
		}
	}

	/**
	* 修改app
	*/
	@Test
	public void updateAppRevision() {
		AppRevision appRevision = new AppRevision();
		appRevisionService.updateAppRevision(appRevision);
	}

	/**
	* 批量删除app
	*/
	@Test
	public void deleteAppRevisionByIds() {
	}

	/**
	* 删除app信息
	*/
	@Test
	public void deleteAppRevisionById() {
	}

}
