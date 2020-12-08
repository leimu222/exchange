package com.common.api.service;

import java.util.List;

import com.common.api.model.exchangeCoin;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [exchangeBiz服务]
 */
public interface IExchangeCoinBizService {

	/**
	* 查询exchange
	*
	* @param symbol exchangeID
	* @return exchange
	*/
	public ExchangeCoin selectExchangeCoinById(String symbol);

	/**
	* 查询exchange列表
	*
	* @param exchangeCoin exchange
	* @return exchange集合
	*/
	public List<ExchangeCoin> selectExchangeCoinList(ExchangeCoin exchangeCoin);

	/**
	* 新增exchange
	*
	* @param exchangeCoin exchange
	* @return 结果
	*/
	public int insertExchangeCoin(ExchangeCoin exchangeCoin);

	/**
	* 修改exchange
	*
	* @param exchangeCoin exchange
	* @return 结果
	*/
	public int updateExchangeCoin(ExchangeCoin exchangeCoin);

	/**
	* 批量删除exchange
	*
	* @param symbols 需要删除的exchangeID
	* @return 结果
	*/
	public int deleteExchangeCoinByIds(String[] symbols);

	/**
	* 删除exchange信息
	*
	* @param symbol exchangeID
	* @return 结果
	*/
	public int deleteExchangeCoinById(String symbol);
	
}
