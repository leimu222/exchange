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
 * Description: [hot单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HotWalletInfoServiceImplTest  {

	@Autowired
	private IHotWalletInfoService hotWalletInfoService;

	/**
	* 查询hot
	*/
	@Test
	public void selectHotWalletInfoById() {
		HotWalletInfo hotWalletInfo = hotWalletInfoService.selectHotWalletInfoById(1);
		System.out.println(hotWalletInfo.toString());
	}

	/**
	* 查询hot列表
	*/
	@Test
	public void selectHotWalletInfoList() {
		List<HotWalletInfo> list = hotWalletInfoService.selectHotWalletInfoList(new HotWalletInfo());
		for(HotWalletInfo model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增hot
	*/
	@Test
	public void insertHotWalletInfo() {
		for (int i = 1;i < 30; i++) {
			HotWalletInfo hotWalletInfo = new HotWalletInfo();
			hotWalletInfoService.insertHotWalletInfo(hotWalletInfo);
		}
	}

	/**
	* 修改hot
	*/
	@Test
	public void updateHotWalletInfo() {
		HotWalletInfo hotWalletInfo = new HotWalletInfo();
		hotWalletInfoService.updateHotWalletInfo(hotWalletInfo);
	}

	/**
	* 批量删除hot
	*/
	@Test
	public void deleteHotWalletInfoByIds() {
	}

	/**
	* 删除hot信息
	*/
	@Test
	public void deleteHotWalletInfoById() {
	}

}
