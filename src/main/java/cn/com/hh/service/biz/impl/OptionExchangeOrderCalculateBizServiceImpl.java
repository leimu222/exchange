package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionExchangeOrderCalculateMapper;
import com.common.api.model.OptionExchangeOrderCalculate;
import com.common.api.service.IOptionExchangeOrderCalculateService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [optionBiz服务实现]
 */
@Service
public class OptionExchangeOrderCalculateBizServiceImpl extends CommonService implements IOptionExchangeOrderCalculateBizService {
	@Autowired
	private IOptionExchangeOrderCalculateService optionExchangeOrderCalculateService;

	/**
	* 查询option
	*
	* @param orderId optionID
	* @return option
	*/
	@Override
	public OptionExchangeOrderCalculate selectOptionExchangeOrderCalculateById(Long orderId) {
		return optionExchangeOrderCalculateService.selectOptionExchangeOrderCalculateById(orderId);
	}

	/**
	* 查询option列表
	*
	* @param optionExchangeOrderCalculate option
	* @return option
	*/
	@Override
	public List<OptionExchangeOrderCalculate> selectOptionExchangeOrderCalculateList(OptionExchangeOrderCalculate optionExchangeOrderCalculate) {
		return optionExchangeOrderCalculateService.selectOptionExchangeOrderCalculateList(optionExchangeOrderCalculate);
	}

	/**
	* 新增option
	*
	* @param optionExchangeOrderCalculate option
	* @return 结果
	*/
	@Override
	public int insertOptionExchangeOrderCalculate(OptionExchangeOrderCalculate optionExchangeOrderCalculate) {
		return optionExchangeOrderCalculateService.insertOptionExchangeOrderCalculate(optionExchangeOrderCalculate);
	}

	/**
	* 修改option
	*
	* @param optionExchangeOrderCalculate option
	* @return 结果
	*/
	@Override
	public int updateOptionExchangeOrderCalculate(OptionExchangeOrderCalculate optionExchangeOrderCalculate) {
		return optionExchangeOrderCalculateService.updateOptionExchangeOrderCalculate(optionExchangeOrderCalculate);
	}

	/**
	* 批量删除option
	*
	* @param orderIds 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionExchangeOrderCalculateByIds(Long[] orderIds) {
		return optionExchangeOrderCalculateService.deleteOptionExchangeOrderCalculateByIds(orderIds);
	}

	/**
	* 删除option信息
	*
	* @param orderId optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionExchangeOrderCalculateById(Long orderId) {
		return optionExchangeOrderCalculateService.deleteOptionExchangeOrderCalculateById(orderId);
	}

}
