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
public class BusinessAuthDepositServiceImplTest  {

	@Autowired
	private IBusinessAuthDepositService businessAuthDepositService;

	/**
	* 查询business
	*/
	@Test
	public void selectBusinessAuthDepositById() {
		BusinessAuthDeposit businessAuthDeposit = businessAuthDepositService.selectBusinessAuthDepositById(1);
		System.out.println(businessAuthDeposit.toString());
	}

	/**
	* 查询business列表
	*/
	@Test
	public void selectBusinessAuthDepositList() {
		List<BusinessAuthDeposit> list = businessAuthDepositService.selectBusinessAuthDepositList(new BusinessAuthDeposit());
		for(BusinessAuthDeposit model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增business
	*/
	@Test
	public void insertBusinessAuthDeposit() {
		for (int i = 1;i < 30; i++) {
			BusinessAuthDeposit businessAuthDeposit = new BusinessAuthDeposit();
			businessAuthDepositService.insertBusinessAuthDeposit(businessAuthDeposit);
		}
	}

	/**
	* 修改business
	*/
	@Test
	public void updateBusinessAuthDeposit() {
		BusinessAuthDeposit businessAuthDeposit = new BusinessAuthDeposit();
		businessAuthDepositService.updateBusinessAuthDeposit(businessAuthDeposit);
	}

	/**
	* 批量删除business
	*/
	@Test
	public void deleteBusinessAuthDepositByIds() {
	}

	/**
	* 删除business信息
	*/
	@Test
	public void deleteBusinessAuthDepositById() {
	}

}
