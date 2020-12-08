package com.common.api.service;

import java.util.List;

import com.common.api.model.country;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [countryBiz服务]
 */
public interface ICountryBizService {

	/**
	* 查询country
	*
	* @param zhName countryID
	* @return country
	*/
	public Country selectCountryById(String zhName);

	/**
	* 查询country列表
	*
	* @param country country
	* @return country集合
	*/
	public List<Country> selectCountryList(Country country);

	/**
	* 新增country
	*
	* @param country country
	* @return 结果
	*/
	public int insertCountry(Country country);

	/**
	* 修改country
	*
	* @param country country
	* @return 结果
	*/
	public int updateCountry(Country country);

	/**
	* 批量删除country
	*
	* @param zhNames 需要删除的countryID
	* @return 结果
	*/
	public int deleteCountryByIds(String[] zhNames);

	/**
	* 删除country信息
	*
	* @param zhName countryID
	* @return 结果
	*/
	public int deleteCountryById(String zhName);
	
}
