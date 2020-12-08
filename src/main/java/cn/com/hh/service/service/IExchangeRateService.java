package com.common.api.service;

import java.util.List;

import com.common.api.model.exchangeRate;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [exchange服务]
 */
public interface IExchangeRateService {

	/**
	* 查询exchange
	*
	* @param id exchangeID
	* @return exchange
	*/
	public ExchangeRate selectExchangeRateById(Long id);

	/**
	* 查询exchange列表
	*
	* @param exchangeRate exchange
	* @return exchange集合
	*/
	public List<ExchangeRate> selectExchangeRateList(ExchangeRate exchangeRate);

	/**
	* 新增exchange
	*
	* @param exchangeRate exchange
	* @return 结果
	*/
	public int insertExchangeRate(ExchangeRate exchangeRate);

	/**
	* 修改exchange
	*
	* @param exchangeRate exchange
	* @return 结果
	*/
	public int updateExchangeRate(ExchangeRate exchangeRate);

	/**
	* 批量删除exchange
	*
	* @param ids 需要删除的exchangeID
	* @return 结果
	*/
	public int deleteExchangeRateByIds(Long[] ids);

	/**
	* 删除exchange信息
	*
	* @param id exchangeID
	* @return 结果
	*/
	public int deleteExchangeRateById(Long id);
	
}
