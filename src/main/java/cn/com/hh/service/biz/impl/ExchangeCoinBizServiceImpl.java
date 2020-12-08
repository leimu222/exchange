package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ExchangeCoinMapper;
import com.common.api.model.ExchangeCoin;
import com.common.api.service.IExchangeCoinService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [exchangeBiz服务实现]
 */
@Service
public class ExchangeCoinBizServiceImpl extends CommonService implements IExchangeCoinBizService {
	@Autowired
	private IExchangeCoinService exchangeCoinService;

	/**
	* 查询exchange
	*
	* @param symbol exchangeID
	* @return exchange
	*/
	@Override
	public ExchangeCoin selectExchangeCoinById(String symbol) {
		return exchangeCoinService.selectExchangeCoinById(symbol);
	}

	/**
	* 查询exchange列表
	*
	* @param exchangeCoin exchange
	* @return exchange
	*/
	@Override
	public List<ExchangeCoin> selectExchangeCoinList(ExchangeCoin exchangeCoin) {
		return exchangeCoinService.selectExchangeCoinList(exchangeCoin);
	}

	/**
	* 新增exchange
	*
	* @param exchangeCoin exchange
	* @return 结果
	*/
	@Override
	public int insertExchangeCoin(ExchangeCoin exchangeCoin) {
		return exchangeCoinService.insertExchangeCoin(exchangeCoin);
	}

	/**
	* 修改exchange
	*
	* @param exchangeCoin exchange
	* @return 结果
	*/
	@Override
	public int updateExchangeCoin(ExchangeCoin exchangeCoin) {
		return exchangeCoinService.updateExchangeCoin(exchangeCoin);
	}

	/**
	* 批量删除exchange
	*
	* @param symbols 需要删除的exchangeID
	* @return 结果
	*/
	@Override
	public int deleteExchangeCoinByIds(String[] symbols) {
		return exchangeCoinService.deleteExchangeCoinByIds(symbols);
	}

	/**
	* 删除exchange信息
	*
	* @param symbol exchangeID
	* @return 结果
	*/
	@Override
	public int deleteExchangeCoinById(String symbol) {
		return exchangeCoinService.deleteExchangeCoinById(symbol);
	}

}
