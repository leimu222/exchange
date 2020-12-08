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
public class WalletConfigServiceImplTest  {

	@Autowired
	private IWalletConfigService walletConfigService;

	/**
	* 查询wallet
	*/
	@Test
	public void selectWalletConfigById() {
		WalletConfig walletConfig = walletConfigService.selectWalletConfigById(1);
		System.out.println(walletConfig.toString());
	}

	/**
	* 查询wallet列表
	*/
	@Test
	public void selectWalletConfigList() {
		List<WalletConfig> list = walletConfigService.selectWalletConfigList(new WalletConfig());
		for(WalletConfig model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增wallet
	*/
	@Test
	public void insertWalletConfig() {
		for (int i = 1;i < 30; i++) {
			WalletConfig walletConfig = new WalletConfig();
			walletConfigService.insertWalletConfig(walletConfig);
		}
	}

	/**
	* 修改wallet
	*/
	@Test
	public void updateWalletConfig() {
		WalletConfig walletConfig = new WalletConfig();
		walletConfigService.updateWalletConfig(walletConfig);
	}

	/**
	* 批量删除wallet
	*/
	@Test
	public void deleteWalletConfigByIds() {
	}

	/**
	* 删除wallet信息
	*/
	@Test
	public void deleteWalletConfigById() {
	}

}
