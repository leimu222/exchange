package com.common.api.service;

import java.util.List;

import com.common.api.model.optionExchangeOrderCalculate;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [option服务]
 */
public interface IOptionExchangeOrderCalculateService {

	/**
	* 查询option
	*
	* @param orderId optionID
	* @return option
	*/
	public OptionExchangeOrderCalculate selectOptionExchangeOrderCalculateById(Long orderId);

	/**
	* 查询option列表
	*
	* @param optionExchangeOrderCalculate option
	* @return option集合
	*/
	public List<OptionExchangeOrderCalculate> selectOptionExchangeOrderCalculateList(OptionExchangeOrderCalculate optionExchangeOrderCalculate);

	/**
	* 新增option
	*
	* @param optionExchangeOrderCalculate option
	* @return 结果
	*/
	public int insertOptionExchangeOrderCalculate(OptionExchangeOrderCalculate optionExchangeOrderCalculate);

	/**
	* 修改option
	*
	* @param optionExchangeOrderCalculate option
	* @return 结果
	*/
	public int updateOptionExchangeOrderCalculate(OptionExchangeOrderCalculate optionExchangeOrderCalculate);

	/**
	* 批量删除option
	*
	* @param orderIds 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderCalculateByIds(Long[] orderIds);

	/**
	* 删除option信息
	*
	* @param orderId optionID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderCalculateById(Long orderId);
	
}
