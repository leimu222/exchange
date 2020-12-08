package com.common.api.service;

import java.util.List;

import com.common.api.model.optionStrategyHedgingOrder;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [option服务]
 */
public interface IOptionStrategyHedgingOrderService {

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionStrategyHedgingOrder selectOptionStrategyHedgingOrderById(Long id);

	/**
	* 查询option列表
	*
	* @param optionStrategyHedgingOrder option
	* @return option集合
	*/
	public List<OptionStrategyHedgingOrder> selectOptionStrategyHedgingOrderList(OptionStrategyHedgingOrder optionStrategyHedgingOrder);

	/**
	* 新增option
	*
	* @param optionStrategyHedgingOrder option
	* @return 结果
	*/
	public int insertOptionStrategyHedgingOrder(OptionStrategyHedgingOrder optionStrategyHedgingOrder);

	/**
	* 修改option
	*
	* @param optionStrategyHedgingOrder option
	* @return 结果
	*/
	public int updateOptionStrategyHedgingOrder(OptionStrategyHedgingOrder optionStrategyHedgingOrder);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionStrategyHedgingOrderByIds(Long[] ids);

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionStrategyHedgingOrderById(Long id);
	
}
