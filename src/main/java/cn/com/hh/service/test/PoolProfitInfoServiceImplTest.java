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
 * Description: [pool单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PoolProfitInfoServiceImplTest  {

	@Autowired
	private IPoolProfitInfoService poolProfitInfoService;

	/**
	* 查询pool
	*/
	@Test
	public void selectPoolProfitInfoById() {
		PoolProfitInfo poolProfitInfo = poolProfitInfoService.selectPoolProfitInfoById(1);
		System.out.println(poolProfitInfo.toString());
	}

	/**
	* 查询pool列表
	*/
	@Test
	public void selectPoolProfitInfoList() {
		List<PoolProfitInfo> list = poolProfitInfoService.selectPoolProfitInfoList(new PoolProfitInfo());
		for(PoolProfitInfo model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增pool
	*/
	@Test
	public void insertPoolProfitInfo() {
		for (int i = 1;i < 30; i++) {
			PoolProfitInfo poolProfitInfo = new PoolProfitInfo();
			poolProfitInfoService.insertPoolProfitInfo(poolProfitInfo);
		}
	}

	/**
	* 修改pool
	*/
	@Test
	public void updatePoolProfitInfo() {
		PoolProfitInfo poolProfitInfo = new PoolProfitInfo();
		poolProfitInfoService.updatePoolProfitInfo(poolProfitInfo);
	}

	/**
	* 批量删除pool
	*/
	@Test
	public void deletePoolProfitInfoByIds() {
	}

	/**
	* 删除pool信息
	*/
	@Test
	public void deletePoolProfitInfoById() {
	}

}
