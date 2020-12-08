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
 * @date 2020-12-08 18:16:04
 * Description: [exchange单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ExchangeFavorSymbolServiceImplTest  {

	@Autowired
	private IExchangeFavorSymbolService exchangeFavorSymbolService;

	/**
	* 查询exchange
	*/
	@Test
	public void selectExchangeFavorSymbolById() {
		ExchangeFavorSymbol exchangeFavorSymbol = exchangeFavorSymbolService.selectExchangeFavorSymbolById(1);
		System.out.println(exchangeFavorSymbol.toString());
	}

	/**
	* 查询exchange列表
	*/
	@Test
	public void selectExchangeFavorSymbolList() {
		List<ExchangeFavorSymbol> list = exchangeFavorSymbolService.selectExchangeFavorSymbolList(new ExchangeFavorSymbol());
		for(ExchangeFavorSymbol model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增exchange
	*/
	@Test
	public void insertExchangeFavorSymbol() {
		for (int i = 1;i < 30; i++) {
			ExchangeFavorSymbol exchangeFavorSymbol = new ExchangeFavorSymbol();
			exchangeFavorSymbolService.insertExchangeFavorSymbol(exchangeFavorSymbol);
		}
	}

	/**
	* 修改exchange
	*/
	@Test
	public void updateExchangeFavorSymbol() {
		ExchangeFavorSymbol exchangeFavorSymbol = new ExchangeFavorSymbol();
		exchangeFavorSymbolService.updateExchangeFavorSymbol(exchangeFavorSymbol);
	}

	/**
	* 批量删除exchange
	*/
	@Test
	public void deleteExchangeFavorSymbolByIds() {
	}

	/**
	* 删除exchange信息
	*/
	@Test
	public void deleteExchangeFavorSymbolById() {
	}

}
