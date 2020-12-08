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
 * @date 2020-12-08 18:16:04
 * Description: [deposit单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepositTypeInfoServiceImplTest  {

	@Autowired
	private IDepositTypeInfoService depositTypeInfoService;

	/**
	* 查询deposit
	*/
	@Test
	public void selectDepositTypeInfoById() {
		DepositTypeInfo depositTypeInfo = depositTypeInfoService.selectDepositTypeInfoById(1);
		System.out.println(depositTypeInfo.toString());
	}

	/**
	* 查询deposit列表
	*/
	@Test
	public void selectDepositTypeInfoList() {
		List<DepositTypeInfo> list = depositTypeInfoService.selectDepositTypeInfoList(new DepositTypeInfo());
		for(DepositTypeInfo model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增deposit
	*/
	@Test
	public void insertDepositTypeInfo() {
		for (int i = 1;i < 30; i++) {
			DepositTypeInfo depositTypeInfo = new DepositTypeInfo();
			depositTypeInfoService.insertDepositTypeInfo(depositTypeInfo);
		}
	}

	/**
	* 修改deposit
	*/
	@Test
	public void updateDepositTypeInfo() {
		DepositTypeInfo depositTypeInfo = new DepositTypeInfo();
		depositTypeInfoService.updateDepositTypeInfo(depositTypeInfo);
	}

	/**
	* 批量删除deposit
	*/
	@Test
	public void deleteDepositTypeInfoByIds() {
	}

	/**
	* 删除deposit信息
	*/
	@Test
	public void deleteDepositTypeInfoById() {
	}

}
