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
 * @date 2020-12-08 18:16:07
 * Description: [otc单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OtcCoinServiceImplTest  {

	@Autowired
	private IOtcCoinService otcCoinService;

	/**
	* 查询otc
	*/
	@Test
	public void selectOtcCoinById() {
		OtcCoin otcCoin = otcCoinService.selectOtcCoinById(1);
		System.out.println(otcCoin.toString());
	}

	/**
	* 查询otc列表
	*/
	@Test
	public void selectOtcCoinList() {
		List<OtcCoin> list = otcCoinService.selectOtcCoinList(new OtcCoin());
		for(OtcCoin model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增otc
	*/
	@Test
	public void insertOtcCoin() {
		for (int i = 1;i < 30; i++) {
			OtcCoin otcCoin = new OtcCoin();
			otcCoinService.insertOtcCoin(otcCoin);
		}
	}

	/**
	* 修改otc
	*/
	@Test
	public void updateOtcCoin() {
		OtcCoin otcCoin = new OtcCoin();
		otcCoinService.updateOtcCoin(otcCoin);
	}

	/**
	* 批量删除otc
	*/
	@Test
	public void deleteOtcCoinByIds() {
	}

	/**
	* 删除otc信息
	*/
	@Test
	public void deleteOtcCoinById() {
	}

}
