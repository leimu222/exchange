package com.common.api.mapper;

import com.common.api.model.ExchangeCoin;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [exchange服务实现]
 */
public interface ExchangeCoinMapper{

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
	* 删除exchange
	*
	* @param symbol exchangeID
	* @return 结果
	*/
	public int deleteExchangeCoinById(String symbol);

	/**
	* 批量删除exchange
	*
	* @param symbols 需要删除的数据ID
	* @return 结果
	*/
	public int deleteExchangeCoinByIds(String[] symbols);

}
