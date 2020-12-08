package com.common.api.service;

import java.util.List;

import com.common.api.model.optionExchangeOrderClose;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [optionBiz服务]
 */
public interface IOptionExchangeOrderCloseBizService {

	/**
	* 查询option
	*
	* @param orderId optionID
	* @return option
	*/
	public OptionExchangeOrderClose selectOptionExchangeOrderCloseById(Long orderId);

	/**
	* 查询option列表
	*
	* @param optionExchangeOrderClose option
	* @return option集合
	*/
	public List<OptionExchangeOrderClose> selectOptionExchangeOrderCloseList(OptionExchangeOrderClose optionExchangeOrderClose);

	/**
	* 新增option
	*
	* @param optionExchangeOrderClose option
	* @return 结果
	*/
	public int insertOptionExchangeOrderClose(OptionExchangeOrderClose optionExchangeOrderClose);

	/**
	* 修改option
	*
	* @param optionExchangeOrderClose option
	* @return 结果
	*/
	public int updateOptionExchangeOrderClose(OptionExchangeOrderClose optionExchangeOrderClose);

	/**
	* 批量删除option
	*
	* @param orderIds 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderCloseByIds(Long[] orderIds);

	/**
	* 删除option信息
	*
	* @param orderId optionID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderCloseById(Long orderId);
	
}
