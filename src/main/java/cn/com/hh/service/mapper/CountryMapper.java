package com.common.api.mapper;

import com.common.api.model.Country;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [country服务实现]
 */
public interface CountryMapper{

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
	* 删除country
	*
	* @param zhName countryID
	* @return 结果
	*/
	public int deleteCountryById(String zhName);

	/**
	* 批量删除country
	*
	* @param zhNames 需要删除的数据ID
	* @return 结果
	*/
	public int deleteCountryByIds(String[] zhNames);

}
