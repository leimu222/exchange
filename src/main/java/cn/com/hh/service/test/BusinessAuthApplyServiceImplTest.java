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
 * Description: [business单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessAuthApplyServiceImplTest  {

	@Autowired
	private IBusinessAuthApplyService businessAuthApplyService;

	/**
	* 查询business
	*/
	@Test
	public void selectBusinessAuthApplyById() {
		BusinessAuthApply businessAuthApply = businessAuthApplyService.selectBusinessAuthApplyById(1);
		System.out.println(businessAuthApply.toString());
	}

	/**
	* 查询business列表
	*/
	@Test
	public void selectBusinessAuthApplyList() {
		List<BusinessAuthApply> list = businessAuthApplyService.selectBusinessAuthApplyList(new BusinessAuthApply());
		for(BusinessAuthApply model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增business
	*/
	@Test
	public void insertBusinessAuthApply() {
		for (int i = 1;i < 30; i++) {
			BusinessAuthApply businessAuthApply = new BusinessAuthApply();
			businessAuthApplyService.insertBusinessAuthApply(businessAuthApply);
		}
	}

	/**
	* 修改business
	*/
	@Test
	public void updateBusinessAuthApply() {
		BusinessAuthApply businessAuthApply = new BusinessAuthApply();
		businessAuthApplyService.updateBusinessAuthApply(businessAuthApply);
	}

	/**
	* 批量删除business
	*/
	@Test
	public void deleteBusinessAuthApplyByIds() {
	}

	/**
	* 删除business信息
	*/
	@Test
	public void deleteBusinessAuthApplyById() {
	}

}
