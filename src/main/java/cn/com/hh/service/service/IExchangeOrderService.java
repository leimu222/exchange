package com.common.api.service;

import java.util.List;

import com.common.api.model.exchangeOrder;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [exchange服务]
 */
public interface IExchangeOrderService {

	/**
	* 查询exchange
	*
	* @param orderId exchangeID
	* @return exchange
	*/
	public ExchangeOrder selectExchangeOrderById(String orderId);

	/**
	* 查询exchange列表
	*
	* @param exchangeOrder exchange
	* @return exchange集合
	*/
	public List<ExchangeOrder> selectExchangeOrderList(ExchangeOrder exchangeOrder);

	/**
	* 新增exchange
	*
	* @param exchangeOrder exchange
	* @return 结果
	*/
	public int insertExchangeOrder(ExchangeOrder exchangeOrder);

	/**
	* 修改exchange
	*
	* @param exchangeOrder exchange
	* @return 结果
	*/
	public int updateExchangeOrder(ExchangeOrder exchangeOrder);

	/**
	* 批量删除exchange
	*
	* @param orderIds 需要删除的exchangeID
	* @return 结果
	*/
	public int deleteExchangeOrderByIds(String[] orderIds);

	/**
	* 删除exchange信息
	*
	* @param orderId exchangeID
	* @return 结果
	*/
	public int deleteExchangeOrderById(String orderId);
	
}
