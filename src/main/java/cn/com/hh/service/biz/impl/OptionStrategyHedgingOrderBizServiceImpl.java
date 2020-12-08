package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionStrategyHedgingOrderMapper;
import com.common.api.model.OptionStrategyHedgingOrder;
import com.common.api.service.IOptionStrategyHedgingOrderService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [optionBiz服务实现]
 */
@Service
public class OptionStrategyHedgingOrderBizServiceImpl extends CommonService implements IOptionStrategyHedgingOrderBizService {
	@Autowired
	private IOptionStrategyHedgingOrderService optionStrategyHedgingOrderService;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionStrategyHedgingOrder selectOptionStrategyHedgingOrderById(Long id) {
		return optionStrategyHedgingOrderService.selectOptionStrategyHedgingOrderById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionStrategyHedgingOrder option
	* @return option
	*/
	@Override
	public List<OptionStrategyHedgingOrder> selectOptionStrategyHedgingOrderList(OptionStrategyHedgingOrder optionStrategyHedgingOrder) {
		return optionStrategyHedgingOrderService.selectOptionStrategyHedgingOrderList(optionStrategyHedgingOrder);
	}

	/**
	* 新增option
	*
	* @param optionStrategyHedgingOrder option
	* @return 结果
	*/
	@Override
	public int insertOptionStrategyHedgingOrder(OptionStrategyHedgingOrder optionStrategyHedgingOrder) {
		return optionStrategyHedgingOrderService.insertOptionStrategyHedgingOrder(optionStrategyHedgingOrder);
	}

	/**
	* 修改option
	*
	* @param optionStrategyHedgingOrder option
	* @return 结果
	*/
	@Override
	public int updateOptionStrategyHedgingOrder(OptionStrategyHedgingOrder optionStrategyHedgingOrder) {
		return optionStrategyHedgingOrderService.updateOptionStrategyHedgingOrder(optionStrategyHedgingOrder);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionStrategyHedgingOrderByIds(Long[] ids) {
		return optionStrategyHedgingOrderService.deleteOptionStrategyHedgingOrderByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionStrategyHedgingOrderById(Long id) {
		return optionStrategyHedgingOrderService.deleteOptionStrategyHedgingOrderById(id);
	}

}
