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
 * Description: [coin单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CoinServiceImplTest  {

	@Autowired
	private ICoinService coinService;

	/**
	* 查询coin
	*/
	@Test
	public void selectCoinById() {
		Coin coin = coinService.selectCoinById(1);
		System.out.println(coin.toString());
	}

	/**
	* 查询coin列表
	*/
	@Test
	public void selectCoinList() {
		List<Coin> list = coinService.selectCoinList(new Coin());
		for(Coin model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增coin
	*/
	@Test
	public void insertCoin() {
		for (int i = 1;i < 30; i++) {
			Coin coin = new Coin();
			coinService.insertCoin(coin);
		}
	}

	/**
	* 修改coin
	*/
	@Test
	public void updateCoin() {
		Coin coin = new Coin();
		coinService.updateCoin(coin);
	}

	/**
	* 批量删除coin
	*/
	@Test
	public void deleteCoinByIds() {
	}

	/**
	* 删除coin信息
	*/
	@Test
	public void deleteCoinById() {
	}

}
