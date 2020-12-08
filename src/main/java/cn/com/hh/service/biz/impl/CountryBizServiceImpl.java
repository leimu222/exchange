package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.CountryMapper;
import com.common.api.model.Country;
import com.common.api.service.ICountryService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [countryBiz服务实现]
 */
@Service
public class CountryBizServiceImpl extends CommonService implements ICountryBizService {
	@Autowired
	private ICountryService countryService;

	/**
	* 查询country
	*
	* @param zhName countryID
	* @return country
	*/
	@Override
	public Country selectCountryById(String zhName) {
		return countryService.selectCountryById(zhName);
	}

	/**
	* 查询country列表
	*
	* @param country country
	* @return country
	*/
	@Override
	public List<Country> selectCountryList(Country country) {
		return countryService.selectCountryList(country);
	}

	/**
	* 新增country
	*
	* @param country country
	* @return 结果
	*/
	@Override
	public int insertCountry(Country country) {
		return countryService.insertCountry(country);
	}

	/**
	* 修改country
	*
	* @param country country
	* @return 结果
	*/
	@Override
	public int updateCountry(Country country) {
		return countryService.updateCountry(country);
	}

	/**
	* 批量删除country
	*
	* @param zhNames 需要删除的countryID
	* @return 结果
	*/
	@Override
	public int deleteCountryByIds(String[] zhNames) {
		return countryService.deleteCountryByIds(zhNames);
	}

	/**
	* 删除country信息
	*
	* @param zhName countryID
	* @return 结果
	*/
	@Override
	public int deleteCountryById(String zhName) {
		return countryService.deleteCountryById(zhName);
	}

}
