package com.common.api.service;

import java.util.List;

import com.common.api.model.exchangeFavorSymbol;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [exchange服务]
 */
public interface IExchangeFavorSymbolService {

	/**
	* 查询exchange
	*
	* @param id exchangeID
	* @return exchange
	*/
	public ExchangeFavorSymbol selectExchangeFavorSymbolById(Long id);

	/**
	* 查询exchange列表
	*
	* @param exchangeFavorSymbol exchange
	* @return exchange集合
	*/
	public List<ExchangeFavorSymbol> selectExchangeFavorSymbolList(ExchangeFavorSymbol exchangeFavorSymbol);

	/**
	* 新增exchange
	*
	* @param exchangeFavorSymbol exchange
	* @return 结果
	*/
	public int insertExchangeFavorSymbol(ExchangeFavorSymbol exchangeFavorSymbol);

	/**
	* 修改exchange
	*
	* @param exchangeFavorSymbol exchange
	* @return 结果
	*/
	public int updateExchangeFavorSymbol(ExchangeFavorSymbol exchangeFavorSymbol);

	/**
	* 批量删除exchange
	*
	* @param ids 需要删除的exchangeID
	* @return 结果
	*/
	public int deleteExchangeFavorSymbolByIds(Long[] ids);

	/**
	* 删除exchange信息
	*
	* @param id exchangeID
	* @return 结果
	*/
	public int deleteExchangeFavorSymbolById(Long id);
	
}
