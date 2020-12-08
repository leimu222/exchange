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
 * @date 2020-12-08 18:16:02
 * Description: [coin单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CoinIssuedServiceImplTest  {

	@Autowired
	private ICoinIssuedService coinIssuedService;

	/**
	* 查询coin
	*/
	@Test
	public void selectCoinIssuedById() {
		CoinIssued coinIssued = coinIssuedService.selectCoinIssuedById(1);
		System.out.println(coinIssued.toString());
	}

	/**
	* 查询coin列表
	*/
	@Test
	public void selectCoinIssuedList() {
		List<CoinIssued> list = coinIssuedService.selectCoinIssuedList(new CoinIssued());
		for(CoinIssued model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增coin
	*/
	@Test
	public void insertCoinIssued() {
		for (int i = 1;i < 30; i++) {
			CoinIssued coinIssued = new CoinIssued();
			coinIssuedService.insertCoinIssued(coinIssued);
		}
	}

	/**
	* 修改coin
	*/
	@Test
	public void updateCoinIssued() {
		CoinIssued coinIssued = new CoinIssued();
		coinIssuedService.updateCoinIssued(coinIssued);
	}

	/**
	* 批量删除coin
	*/
	@Test
	public void deleteCoinIssuedByIds() {
	}

	/**
	* 删除coin信息
	*/
	@Test
	public void deleteCoinIssuedById() {
	}

}
