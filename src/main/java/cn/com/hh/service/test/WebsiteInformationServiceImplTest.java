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
 * @date 2020-12-08 18:16:09
 * Description: [website单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WebsiteInformationServiceImplTest  {

	@Autowired
	private IWebsiteInformationService websiteInformationService;

	/**
	* 查询website
	*/
	@Test
	public void selectWebsiteInformationById() {
		WebsiteInformation websiteInformation = websiteInformationService.selectWebsiteInformationById(1);
		System.out.println(websiteInformation.toString());
	}

	/**
	* 查询website列表
	*/
	@Test
	public void selectWebsiteInformationList() {
		List<WebsiteInformation> list = websiteInformationService.selectWebsiteInformationList(new WebsiteInformation());
		for(WebsiteInformation model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增website
	*/
	@Test
	public void insertWebsiteInformation() {
		for (int i = 1;i < 30; i++) {
			WebsiteInformation websiteInformation = new WebsiteInformation();
			websiteInformationService.insertWebsiteInformation(websiteInformation);
		}
	}

	/**
	* 修改website
	*/
	@Test
	public void updateWebsiteInformation() {
		WebsiteInformation websiteInformation = new WebsiteInformation();
		websiteInformationService.updateWebsiteInformation(websiteInformation);
	}

	/**
	* 批量删除website
	*/
	@Test
	public void deleteWebsiteInformationByIds() {
	}

	/**
	* 删除website信息
	*/
	@Test
	public void deleteWebsiteInformationById() {
	}

}
