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
 * Description: [lever单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LeverCoinServiceImplTest  {

	@Autowired
	private ILeverCoinService leverCoinService;

	/**
	* 查询lever
	*/
	@Test
	public void selectLeverCoinById() {
		LeverCoin leverCoin = leverCoinService.selectLeverCoinById(1);
		System.out.println(leverCoin.toString());
	}

	/**
	* 查询lever列表
	*/
	@Test
	public void selectLeverCoinList() {
		List<LeverCoin> list = leverCoinService.selectLeverCoinList(new LeverCoin());
		for(LeverCoin model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增lever
	*/
	@Test
	public void insertLeverCoin() {
		for (int i = 1;i < 30; i++) {
			LeverCoin leverCoin = new LeverCoin();
			leverCoinService.insertLeverCoin(leverCoin);
		}
	}

	/**
	* 修改lever
	*/
	@Test
	public void updateLeverCoin() {
		LeverCoin leverCoin = new LeverCoin();
		leverCoinService.updateLeverCoin(leverCoin);
	}

	/**
	* 批量删除lever
	*/
	@Test
	public void deleteLeverCoinByIds() {
	}

	/**
	* 删除lever信息
	*/
	@Test
	public void deleteLeverCoinById() {
	}

}
