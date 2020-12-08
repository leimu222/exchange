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
 * Description: [country单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CountryServiceImplTest  {

	@Autowired
	private ICountryService countryService;

	/**
	* 查询country
	*/
	@Test
	public void selectCountryById() {
		Country country = countryService.selectCountryById(1);
		System.out.println(country.toString());
	}

	/**
	* 查询country列表
	*/
	@Test
	public void selectCountryList() {
		List<Country> list = countryService.selectCountryList(new Country());
		for(Country model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增country
	*/
	@Test
	public void insertCountry() {
		for (int i = 1;i < 30; i++) {
			Country country = new Country();
			countryService.insertCountry(country);
		}
	}

	/**
	* 修改country
	*/
	@Test
	public void updateCountry() {
		Country country = new Country();
		countryService.updateCountry(country);
	}

	/**
	* 批量删除country
	*/
	@Test
	public void deleteCountryByIds() {
	}

	/**
	* 删除country信息
	*/
	@Test
	public void deleteCountryById() {
	}

}
