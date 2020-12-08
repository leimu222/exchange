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
 * @date 2020-12-08 18:15:59
 * Description: [about单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AboutUsServiceImplTest  {

	@Autowired
	private IAboutUsService aboutUsService;

	/**
	* 查询about
	*/
	@Test
	public void selectAboutUsById() {
		AboutUs aboutUs = aboutUsService.selectAboutUsById(1);
		System.out.println(aboutUs.toString());
	}

	/**
	* 查询about列表
	*/
	@Test
	public void selectAboutUsList() {
		List<AboutUs> list = aboutUsService.selectAboutUsList(new AboutUs());
		for(AboutUs model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增about
	*/
	@Test
	public void insertAboutUs() {
		for (int i = 1;i < 30; i++) {
			AboutUs aboutUs = new AboutUs();
			aboutUsService.insertAboutUs(aboutUs);
		}
	}

	/**
	* 修改about
	*/
	@Test
	public void updateAboutUs() {
		AboutUs aboutUs = new AboutUs();
		aboutUsService.updateAboutUs(aboutUs);
	}

	/**
	* 批量删除about
	*/
	@Test
	public void deleteAboutUsByIds() {
	}

	/**
	* 删除about信息
	*/
	@Test
	public void deleteAboutUsById() {
	}

}
