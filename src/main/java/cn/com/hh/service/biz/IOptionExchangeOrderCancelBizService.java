package com.common.api.service;

import java.util.List;

import com.common.api.model.optionExchangeOrderCancel;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [optionBiz服务]
 */
public interface IOptionExchangeOrderCancelBizService {

	/**
	* 查询option
	*
	* @param orderId optionID
	* @return option
	*/
	public OptionExchangeOrderCancel selectOptionExchangeOrderCancelById(Long orderId);

	/**
	* 查询option列表
	*
	* @param optionExchangeOrderCancel option
	* @return option集合
	*/
	public List<OptionExchangeOrderCancel> selectOptionExchangeOrderCancelList(OptionExchangeOrderCancel optionExchangeOrderCancel);

	/**
	* 新增option
	*
	* @param optionExchangeOrderCancel option
	* @return 结果
	*/
	public int insertOptionExchangeOrderCancel(OptionExchangeOrderCancel optionExchangeOrderCancel);

	/**
	* 修改option
	*
	* @param optionExchangeOrderCancel option
	* @return 结果
	*/
	public int updateOptionExchangeOrderCancel(OptionExchangeOrderCancel optionExchangeOrderCancel);

	/**
	* 批量删除option
	*
	* @param orderIds 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderCancelByIds(Long[] orderIds);

	/**
	* 删除option信息
	*
	* @param orderId optionID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderCancelById(Long orderId);
	
}
