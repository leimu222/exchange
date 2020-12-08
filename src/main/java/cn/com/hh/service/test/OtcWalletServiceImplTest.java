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
public class OtcWalletServiceImplTest  {

	@Autowired
	private IOtcWalletService otcWalletService;

	/**
	* 查询otc
	*/
	@Test
	public void selectOtcWalletById() {
		OtcWallet otcWallet = otcWalletService.selectOtcWalletById(1);
		System.out.println(otcWallet.toString());
	}

	/**
	* 查询otc列表
	*/
	@Test
	public void selectOtcWalletList() {
		List<OtcWallet> list = otcWalletService.selectOtcWalletList(new OtcWallet());
		for(OtcWallet model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增otc
	*/
	@Test
	public void insertOtcWallet() {
		for (int i = 1;i < 30; i++) {
			OtcWallet otcWallet = new OtcWallet();
			otcWalletService.insertOtcWallet(otcWallet);
		}
	}

	/**
	* 修改otc
	*/
	@Test
	public void updateOtcWallet() {
		OtcWallet otcWallet = new OtcWallet();
		otcWalletService.updateOtcWallet(otcWallet);
	}

	/**
	* 批量删除otc
	*/
	@Test
	public void deleteOtcWalletByIds() {
	}

	/**
	* 删除otc信息
	*/
	@Test
	public void deleteOtcWalletById() {
	}

}
