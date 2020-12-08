package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ExchangeRateMapper;
import com.common.api.model.ExchangeRate;
import com.common.api.service.IExchangeRateService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [exchangeBiz服务实现]
 */
@Service
public class ExchangeRateBizServiceImpl extends CommonService implements IExchangeRateBizService {
	@Autowired
	private IExchangeRateService exchangeRateService;

	/**
	* 查询exchange
	*
	* @param id exchangeID
	* @return exchange
	*/
	@Override
	public ExchangeRate selectExchangeRateById(Long id) {
		return exchangeRateService.selectExchangeRateById(id);
	}

	/**
	* 查询exchange列表
	*
	* @param exchangeRate exchange
	* @return exchange
	*/
	@Override
	public List<ExchangeRate> selectExchangeRateList(ExchangeRate exchangeRate) {
		return exchangeRateService.selectExchangeRateList(exchangeRate);
	}

	/**
	* 新增exchange
	*
	* @param exchangeRate exchange
	* @return 结果
	*/
	@Override
	public int insertExchangeRate(ExchangeRate exchangeRate) {
		return exchangeRateService.insertExchangeRate(exchangeRate);
	}

	/**
	* 修改exchange
	*
	* @param exchangeRate exchange
	* @return 结果
	*/
	@Override
	public int updateExchangeRate(ExchangeRate exchangeRate) {
		return exchangeRateService.updateExchangeRate(exchangeRate);
	}

	/**
	* 批量删除exchange
	*
	* @param ids 需要删除的exchangeID
	* @return 结果
	*/
	@Override
	public int deleteExchangeRateByIds(Long[] ids) {
		return exchangeRateService.deleteExchangeRateByIds(ids);
	}

	/**
	* 删除exchange信息
	*
	* @param id exchangeID
	* @return 结果
	*/
	@Override
	public int deleteExchangeRateById(Long id) {
		return exchangeRateService.deleteExchangeRateById(id);
	}

}
