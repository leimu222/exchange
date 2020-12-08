package com.common.api.service;

import java.util.List;

import com.common.api.model.optionExchangeOrder;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [option服务]
 */
public interface IOptionExchangeOrderService {

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionExchangeOrder selectOptionExchangeOrderById(Long id);

	/**
	* 查询option列表
	*
	* @param optionExchangeOrder option
	* @return option集合
	*/
	public List<OptionExchangeOrder> selectOptionExchangeOrderList(OptionExchangeOrder optionExchangeOrder);

	/**
	* 新增option
	*
	* @param optionExchangeOrder option
	* @return 结果
	*/
	public int insertOptionExchangeOrder(OptionExchangeOrder optionExchangeOrder);

	/**
	* 修改option
	*
	* @param optionExchangeOrder option
	* @return 结果
	*/
	public int updateOptionExchangeOrder(OptionExchangeOrder optionExchangeOrder);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderByIds(Long[] ids);

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderById(Long id);
	
}
