package com.common.api.service;

import java.util.List;

import com.common.api.model.optionExchangeOrderFee;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [optionBiz服务]
 */
public interface IOptionExchangeOrderFeeBizService {

	/**
	* 查询option
	*
	* @param orderId optionID
	* @return option
	*/
	public OptionExchangeOrderFee selectOptionExchangeOrderFeeById(Long orderId);

	/**
	* 查询option列表
	*
	* @param optionExchangeOrderFee option
	* @return option集合
	*/
	public List<OptionExchangeOrderFee> selectOptionExchangeOrderFeeList(OptionExchangeOrderFee optionExchangeOrderFee);

	/**
	* 新增option
	*
	* @param optionExchangeOrderFee option
	* @return 结果
	*/
	public int insertOptionExchangeOrderFee(OptionExchangeOrderFee optionExchangeOrderFee);

	/**
	* 修改option
	*
	* @param optionExchangeOrderFee option
	* @return 结果
	*/
	public int updateOptionExchangeOrderFee(OptionExchangeOrderFee optionExchangeOrderFee);

	/**
	* 批量删除option
	*
	* @param orderIds 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderFeeByIds(Long[] orderIds);

	/**
	* 删除option信息
	*
	* @param orderId optionID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderFeeById(Long orderId);
	
}
