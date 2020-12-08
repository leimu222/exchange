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
 * Description: [unblock单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UnblockExchangeSymbolServiceImplTest  {

	@Autowired
	private IUnblockExchangeSymbolService unblockExchangeSymbolService;

	/**
	* 查询unblock
	*/
	@Test
	public void selectUnblockExchangeSymbolById() {
		UnblockExchangeSymbol unblockExchangeSymbol = unblockExchangeSymbolService.selectUnblockExchangeSymbolById(1);
		System.out.println(unblockExchangeSymbol.toString());
	}

	/**
	* 查询unblock列表
	*/
	@Test
	public void selectUnblockExchangeSymbolList() {
		List<UnblockExchangeSymbol> list = unblockExchangeSymbolService.selectUnblockExchangeSymbolList(new UnblockExchangeSymbol());
		for(UnblockExchangeSymbol model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增unblock
	*/
	@Test
	public void insertUnblockExchangeSymbol() {
		for (int i = 1;i < 30; i++) {
			UnblockExchangeSymbol unblockExchangeSymbol = new UnblockExchangeSymbol();
			unblockExchangeSymbolService.insertUnblockExchangeSymbol(unblockExchangeSymbol);
		}
	}

	/**
	* 修改unblock
	*/
	@Test
	public void updateUnblockExchangeSymbol() {
		UnblockExchangeSymbol unblockExchangeSymbol = new UnblockExchangeSymbol();
		unblockExchangeSymbolService.updateUnblockExchangeSymbol(unblockExchangeSymbol);
	}

	/**
	* 批量删除unblock
	*/
	@Test
	public void deleteUnblockExchangeSymbolByIds() {
	}

	/**
	* 删除unblock信息
	*/
	@Test
	public void deleteUnblockExchangeSymbolById() {
	}

}
