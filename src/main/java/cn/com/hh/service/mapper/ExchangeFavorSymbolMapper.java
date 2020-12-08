package com.common.api.mapper;

import com.common.api.model.ExchangeFavorSymbol;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [exchange服务实现]
 */
public interface ExchangeFavorSymbolMapper{

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
	* 删除exchange
	*
	* @param id exchangeID
	* @return 结果
	*/
	public int deleteExchangeFavorSymbolById(Long id);

	/**
	* 批量删除exchange
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteExchangeFavorSymbolByIds(Long[] ids);

}
