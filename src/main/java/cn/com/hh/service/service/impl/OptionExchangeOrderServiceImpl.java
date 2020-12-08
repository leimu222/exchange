package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionExchangeOrderMapper;
import com.common.api.model.OptionExchangeOrder;
import com.common.api.service.IOptionExchangeOrderService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [option服务实现]
 */
@Service
public class OptionExchangeOrderServiceImpl implements IOptionExchangeOrderService {
	@Autowired
	private OptionExchangeOrderMapper optionExchangeOrderMapper;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionExchangeOrder selectOptionExchangeOrderById(Long id) {
		return optionExchangeOrderMapper.selectOptionExchangeOrderById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionExchangeOrder option
	* @return option
	*/
	@Override
	public List<OptionExchangeOrder> selectOptionExchangeOrderList(OptionExchangeOrder optionExchangeOrder) {
		return optionExchangeOrderMapper.selectOptionExchangeOrderList(optionExchangeOrder);
	}

	/**
	* 新增option
	*
	* @param optionExchangeOrder option
	* @return 结果
	*/
	@Override
	public int insertOptionExchangeOrder(OptionExchangeOrder optionExchangeOrder) {
		return optionExchangeOrderMapper.insertOptionExchangeOrder(optionExchangeOrder);
	}

	/**
	* 修改option
	*
	* @param optionExchangeOrder option
	* @return 结果
	*/
	@Override
	public int updateOptionExchangeOrder(OptionExchangeOrder optionExchangeOrder) {
		return optionExchangeOrderMapper.updateOptionExchangeOrder(optionExchangeOrder);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionExchangeOrderByIds(Long[] ids) {
		return optionExchangeOrderMapper.deleteOptionExchangeOrderByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionExchangeOrderById(Long id) {
		return optionExchangeOrderMapper.deleteOptionExchangeOrderById(id);
	}

}
