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
 * Description: [pre单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PreCoinServiceImplTest  {

	@Autowired
	private IPreCoinService preCoinService;

	/**
	* 查询pre
	*/
	@Test
	public void selectPreCoinById() {
		PreCoin preCoin = preCoinService.selectPreCoinById(1);
		System.out.println(preCoin.toString());
	}

	/**
	* 查询pre列表
	*/
	@Test
	public void selectPreCoinList() {
		List<PreCoin> list = preCoinService.selectPreCoinList(new PreCoin());
		for(PreCoin model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增pre
	*/
	@Test
	public void insertPreCoin() {
		for (int i = 1;i < 30; i++) {
			PreCoin preCoin = new PreCoin();
			preCoinService.insertPreCoin(preCoin);
		}
	}

	/**
	* 修改pre
	*/
	@Test
	public void updatePreCoin() {
		PreCoin preCoin = new PreCoin();
		preCoinService.updatePreCoin(preCoin);
	}

	/**
	* 批量删除pre
	*/
	@Test
	public void deletePreCoinByIds() {
	}

	/**
	* 删除pre信息
	*/
	@Test
	public void deletePreCoinById() {
	}

}
