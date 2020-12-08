package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ExchangeOrderMapper;
import com.common.api.model.ExchangeOrder;
import com.common.api.service.IExchangeOrderService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [exchange服务实现]
 */
@Service
public class ExchangeOrderServiceImpl implements IExchangeOrderService {
	@Autowired
	private ExchangeOrderMapper exchangeOrderMapper;

	/**
	* 查询exchange
	*
	* @param orderId exchangeID
	* @return exchange
	*/
	@Override
	public ExchangeOrder selectExchangeOrderById(String orderId) {
		return exchangeOrderMapper.selectExchangeOrderById(orderId);
	}

	/**
	* 查询exchange列表
	*
	* @param exchangeOrder exchange
	* @return exchange
	*/
	@Override
	public List<ExchangeOrder> selectExchangeOrderList(ExchangeOrder exchangeOrder) {
		return exchangeOrderMapper.selectExchangeOrderList(exchangeOrder);
	}

	/**
	* 新增exchange
	*
	* @param exchangeOrder exchange
	* @return 结果
	*/
	@Override
	public int insertExchangeOrder(ExchangeOrder exchangeOrder) {
		return exchangeOrderMapper.insertExchangeOrder(exchangeOrder);
	}

	/**
	* 修改exchange
	*
	* @param exchangeOrder exchange
	* @return 结果
	*/
	@Override
	public int updateExchangeOrder(ExchangeOrder exchangeOrder) {
		return exchangeOrderMapper.updateExchangeOrder(exchangeOrder);
	}

	/**
	* 批量删除exchange
	*
	* @param orderIds 需要删除的exchangeID
	* @return 结果
	*/
	@Override
	public int deleteExchangeOrderByIds(String[] orderIds) {
		return exchangeOrderMapper.deleteExchangeOrderByIds(orderIds);
	}

	/**
	* 删除exchange信息
	*
	* @param orderId exchangeID
	* @return 结果
	*/
	@Override
	public int deleteExchangeOrderById(String orderId) {
		return exchangeOrderMapper.deleteExchangeOrderById(orderId);
	}

}
