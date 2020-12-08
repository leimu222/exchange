package com.common.api.mapper;

import com.common.api.model.ExchangeRate;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [exchange服务实现]
 */
public interface ExchangeRateMapper{

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
	* 删除exchange
	*
	* @param id exchangeID
	* @return 结果
	*/
	public int deleteExchangeRateById(Long id);

	/**
	* 批量删除exchange
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteExchangeRateByIds(Long[] ids);

}
