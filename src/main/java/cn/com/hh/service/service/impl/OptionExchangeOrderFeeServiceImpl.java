package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionExchangeOrderFeeMapper;
import com.common.api.model.OptionExchangeOrderFee;
import com.common.api.service.IOptionExchangeOrderFeeService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [option服务实现]
 */
@Service
public class OptionExchangeOrderFeeServiceImpl implements IOptionExchangeOrderFeeService {
	@Autowired
	private OptionExchangeOrderFeeMapper optionExchangeOrderFeeMapper;

	/**
	* 查询option
	*
	* @param orderId optionID
	* @return option
	*/
	@Override
	public OptionExchangeOrderFee selectOptionExchangeOrderFeeById(Long orderId) {
		return optionExchangeOrderFeeMapper.selectOptionExchangeOrderFeeById(orderId);
	}

	/**
	* 查询option列表
	*
	* @param optionExchangeOrderFee option
	* @return option
	*/
	@Override
	public List<OptionExchangeOrderFee> selectOptionExchangeOrderFeeList(OptionExchangeOrderFee optionExchangeOrderFee) {
		return optionExchangeOrderFeeMapper.selectOptionExchangeOrderFeeList(optionExchangeOrderFee);
	}

	/**
	* 新增option
	*
	* @param optionExchangeOrderFee option
	* @return 结果
	*/
	@Override
	public int insertOptionExchangeOrderFee(OptionExchangeOrderFee optionExchangeOrderFee) {
		return optionExchangeOrderFeeMapper.insertOptionExchangeOrderFee(optionExchangeOrderFee);
	}

	/**
	* 修改option
	*
	* @param optionExchangeOrderFee option
	* @return 结果
	*/
	@Override
	public int updateOptionExchangeOrderFee(OptionExchangeOrderFee optionExchangeOrderFee) {
		return optionExchangeOrderFeeMapper.updateOptionExchangeOrderFee(optionExchangeOrderFee);
	}

	/**
	* 批量删除option
	*
	* @param orderIds 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionExchangeOrderFeeByIds(Long[] orderIds) {
		return optionExchangeOrderFeeMapper.deleteOptionExchangeOrderFeeByIds(orderIds);
	}

	/**
	* 删除option信息
	*
	* @param orderId optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionExchangeOrderFeeById(Long orderId) {
		return optionExchangeOrderFeeMapper.deleteOptionExchangeOrderFeeById(orderId);
	}

}
