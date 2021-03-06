package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionExchangeOrderTiggerMapper;
import com.common.api.model.OptionExchangeOrderTigger;
import com.common.api.service.IOptionExchangeOrderTiggerService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [option服务实现]
 */
@Service
public class OptionExchangeOrderTiggerServiceImpl implements IOptionExchangeOrderTiggerService {
	@Autowired
	private OptionExchangeOrderTiggerMapper optionExchangeOrderTiggerMapper;

	/**
	* 查询option
	*
	* @param orderId optionID
	* @return option
	*/
	@Override
	public OptionExchangeOrderTigger selectOptionExchangeOrderTiggerById(Long orderId) {
		return optionExchangeOrderTiggerMapper.selectOptionExchangeOrderTiggerById(orderId);
	}

	/**
	* 查询option列表
	*
	* @param optionExchangeOrderTigger option
	* @return option
	*/
	@Override
	public List<OptionExchangeOrderTigger> selectOptionExchangeOrderTiggerList(OptionExchangeOrderTigger optionExchangeOrderTigger) {
		return optionExchangeOrderTiggerMapper.selectOptionExchangeOrderTiggerList(optionExchangeOrderTigger);
	}

	/**
	* 新增option
	*
	* @param optionExchangeOrderTigger option
	* @return 结果
	*/
	@Override
	public int insertOptionExchangeOrderTigger(OptionExchangeOrderTigger optionExchangeOrderTigger) {
		return optionExchangeOrderTiggerMapper.insertOptionExchangeOrderTigger(optionExchangeOrderTigger);
	}

	/**
	* 修改option
	*
	* @param optionExchangeOrderTigger option
	* @return 结果
	*/
	@Override
	public int updateOptionExchangeOrderTigger(OptionExchangeOrderTigger optionExchangeOrderTigger) {
		return optionExchangeOrderTiggerMapper.updateOptionExchangeOrderTigger(optionExchangeOrderTigger);
	}

	/**
	* 批量删除option
	*
	* @param orderIds 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionExchangeOrderTiggerByIds(Long[] orderIds) {
		return optionExchangeOrderTiggerMapper.deleteOptionExchangeOrderTiggerByIds(orderIds);
	}

	/**
	* 删除option信息
	*
	* @param orderId optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionExchangeOrderTiggerById(Long orderId) {
		return optionExchangeOrderTiggerMapper.deleteOptionExchangeOrderTiggerById(orderId);
	}

}
