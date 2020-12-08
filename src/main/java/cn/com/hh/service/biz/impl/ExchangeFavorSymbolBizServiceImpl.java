package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ExchangeFavorSymbolMapper;
import com.common.api.model.ExchangeFavorSymbol;
import com.common.api.service.IExchangeFavorSymbolService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [exchangeBiz服务实现]
 */
@Service
public class ExchangeFavorSymbolBizServiceImpl extends CommonService implements IExchangeFavorSymbolBizService {
	@Autowired
	private IExchangeFavorSymbolService exchangeFavorSymbolService;

	/**
	* 查询exchange
	*
	* @param id exchangeID
	* @return exchange
	*/
	@Override
	public ExchangeFavorSymbol selectExchangeFavorSymbolById(Long id) {
		return exchangeFavorSymbolService.selectExchangeFavorSymbolById(id);
	}

	/**
	* 查询exchange列表
	*
	* @param exchangeFavorSymbol exchange
	* @return exchange
	*/
	@Override
	public List<ExchangeFavorSymbol> selectExchangeFavorSymbolList(ExchangeFavorSymbol exchangeFavorSymbol) {
		return exchangeFavorSymbolService.selectExchangeFavorSymbolList(exchangeFavorSymbol);
	}

	/**
	* 新增exchange
	*
	* @param exchangeFavorSymbol exchange
	* @return 结果
	*/
	@Override
	public int insertExchangeFavorSymbol(ExchangeFavorSymbol exchangeFavorSymbol) {
		return exchangeFavorSymbolService.insertExchangeFavorSymbol(exchangeFavorSymbol);
	}

	/**
	* 修改exchange
	*
	* @param exchangeFavorSymbol exchange
	* @return 结果
	*/
	@Override
	public int updateExchangeFavorSymbol(ExchangeFavorSymbol exchangeFavorSymbol) {
		return exchangeFavorSymbolService.updateExchangeFavorSymbol(exchangeFavorSymbol);
	}

	/**
	* 批量删除exchange
	*
	* @param ids 需要删除的exchangeID
	* @return 结果
	*/
	@Override
	public int deleteExchangeFavorSymbolByIds(Long[] ids) {
		return exchangeFavorSymbolService.deleteExchangeFavorSymbolByIds(ids);
	}

	/**
	* 删除exchange信息
	*
	* @param id exchangeID
	* @return 结果
	*/
	@Override
	public int deleteExchangeFavorSymbolById(Long id) {
		return exchangeFavorSymbolService.deleteExchangeFavorSymbolById(id);
	}

}
