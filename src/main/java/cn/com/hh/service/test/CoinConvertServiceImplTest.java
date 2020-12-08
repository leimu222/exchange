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
public class CoinConvertServiceImplTest  {

	@Autowired
	private ICoinConvertService coinConvertService;

	/**
	* 查询coin
	*/
	@Test
	public void selectCoinConvertById() {
		CoinConvert coinConvert = coinConvertService.selectCoinConvertById(1);
		System.out.println(coinConvert.toString());
	}

	/**
	* 查询coin列表
	*/
	@Test
	public void selectCoinConvertList() {
		List<CoinConvert> list = coinConvertService.selectCoinConvertList(new CoinConvert());
		for(CoinConvert model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增coin
	*/
	@Test
	public void insertCoinConvert() {
		for (int i = 1;i < 30; i++) {
			CoinConvert coinConvert = new CoinConvert();
			coinConvertService.insertCoinConvert(coinConvert);
		}
	}

	/**
	* 修改coin
	*/
	@Test
	public void updateCoinConvert() {
		CoinConvert coinConvert = new CoinConvert();
		coinConvertService.updateCoinConvert(coinConvert);
	}

	/**
	* 批量删除coin
	*/
	@Test
	public void deleteCoinConvertByIds() {
	}

	/**
	* 删除coin信息
	*/
	@Test
	public void deleteCoinConvertById() {
	}

}
