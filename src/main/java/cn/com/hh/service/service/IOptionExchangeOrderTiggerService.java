package com.common.api.service;

import java.util.List;

import com.common.api.model.optionExchangeOrderTigger;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [option服务]
 */
public interface IOptionExchangeOrderTiggerService {

	/**
	* 查询option
	*
	* @param orderId optionID
	* @return option
	*/
	public OptionExchangeOrderTigger selectOptionExchangeOrderTiggerById(Long orderId);

	/**
	* 查询option列表
	*
	* @param optionExchangeOrderTigger option
	* @return option集合
	*/
	public List<OptionExchangeOrderTigger> selectOptionExchangeOrderTiggerList(OptionExchangeOrderTigger optionExchangeOrderTigger);

	/**
	* 新增option
	*
	* @param optionExchangeOrderTigger option
	* @return 结果
	*/
	public int insertOptionExchangeOrderTigger(OptionExchangeOrderTigger optionExchangeOrderTigger);

	/**
	* 修改option
	*
	* @param optionExchangeOrderTigger option
	* @return 结果
	*/
	public int updateOptionExchangeOrderTigger(OptionExchangeOrderTigger optionExchangeOrderTigger);

	/**
	* 批量删除option
	*
	* @param orderIds 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderTiggerByIds(Long[] orderIds);

	/**
	* 删除option信息
	*
	* @param orderId optionID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderTiggerById(Long orderId);
	
}
