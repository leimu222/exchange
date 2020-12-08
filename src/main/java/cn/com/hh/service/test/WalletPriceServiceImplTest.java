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
 * @date 2020-12-08 18:16:09
 * Description: [wallet单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WalletPriceServiceImplTest  {

	@Autowired
	private IWalletPriceService walletPriceService;

	/**
	* 查询wallet
	*/
	@Test
	public void selectWalletPriceById() {
		WalletPrice walletPrice = walletPriceService.selectWalletPriceById(1);
		System.out.println(walletPrice.toString());
	}

	/**
	* 查询wallet列表
	*/
	@Test
	public void selectWalletPriceList() {
		List<WalletPrice> list = walletPriceService.selectWalletPriceList(new WalletPrice());
		for(WalletPrice model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增wallet
	*/
	@Test
	public void insertWalletPrice() {
		for (int i = 1;i < 30; i++) {
			WalletPrice walletPrice = new WalletPrice();
			walletPriceService.insertWalletPrice(walletPrice);
		}
	}

	/**
	* 修改wallet
	*/
	@Test
	public void updateWalletPrice() {
		WalletPrice walletPrice = new WalletPrice();
		walletPriceService.updateWalletPrice(walletPrice);
	}

	/**
	* 批量删除wallet
	*/
	@Test
	public void deleteWalletPriceByIds() {
	}

	/**
	* 删除wallet信息
	*/
	@Test
	public void deleteWalletPriceById() {
	}

}
