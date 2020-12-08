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
 * Description: [platform单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PlatformTransactionServiceImplTest  {

	@Autowired
	private IPlatformTransactionService platformTransactionService;

	/**
	* 查询platform
	*/
	@Test
	public void selectPlatformTransactionById() {
		PlatformTransaction platformTransaction = platformTransactionService.selectPlatformTransactionById(1);
		System.out.println(platformTransaction.toString());
	}

	/**
	* 查询platform列表
	*/
	@Test
	public void selectPlatformTransactionList() {
		List<PlatformTransaction> list = platformTransactionService.selectPlatformTransactionList(new PlatformTransaction());
		for(PlatformTransaction model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增platform
	*/
	@Test
	public void insertPlatformTransaction() {
		for (int i = 1;i < 30; i++) {
			PlatformTransaction platformTransaction = new PlatformTransaction();
			platformTransactionService.insertPlatformTransaction(platformTransaction);
		}
	}

	/**
	* 修改platform
	*/
	@Test
	public void updatePlatformTransaction() {
		PlatformTransaction platformTransaction = new PlatformTransaction();
		platformTransactionService.updatePlatformTransaction(platformTransaction);
	}

	/**
	* 批量删除platform
	*/
	@Test
	public void deletePlatformTransactionByIds() {
	}

	/**
	* 删除platform信息
	*/
	@Test
	public void deletePlatformTransactionById() {
	}

}
