package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionExchangeOrderCloseMapper;
import com.common.api.model.OptionExchangeOrderClose;
import com.common.api.service.IOptionExchangeOrderCloseService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [option服务实现]
 */
@Service
public class OptionExchangeOrderCloseServiceImpl implements IOptionExchangeOrderCloseService {
	@Autowired
	private OptionExchangeOrderCloseMapper optionExchangeOrderCloseMapper;

	/**
	* 查询option
	*
	* @param orderId optionID
	* @return option
	*/
	@Override
	public OptionExchangeOrderClose selectOptionExchangeOrderCloseById(Long orderId) {
		return optionExchangeOrderCloseMapper.selectOptionExchangeOrderCloseById(orderId);
	}

	/**
	* 查询option列表
	*
	* @param optionExchangeOrderClose option
	* @return option
	*/
	@Override
	public List<OptionExchangeOrderClose> selectOptionExchangeOrderCloseList(OptionExchangeOrderClose optionExchangeOrderClose) {
		return optionExchangeOrderCloseMapper.selectOptionExchangeOrderCloseList(optionExchangeOrderClose);
	}

	/**
	* 新增option
	*
	* @param optionExchangeOrderClose option
	* @return 结果
	*/
	@Override
	public int insertOptionExchangeOrderClose(OptionExchangeOrderClose optionExchangeOrderClose) {
		return optionExchangeOrderCloseMapper.insertOptionExchangeOrderClose(optionExchangeOrderClose);
	}

	/**
	* 修改option
	*
	* @param optionExchangeOrderClose option
	* @return 结果
	*/
	@Override
	public int updateOptionExchangeOrderClose(OptionExchangeOrderClose optionExchangeOrderClose) {
		return optionExchangeOrderCloseMapper.updateOptionExchangeOrderClose(optionExchangeOrderClose);
	}

	/**
	* 批量删除option
	*
	* @param orderIds 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionExchangeOrderCloseByIds(Long[] orderIds) {
		return optionExchangeOrderCloseMapper.deleteOptionExchangeOrderCloseByIds(orderIds);
	}

	/**
	* 删除option信息
	*
	* @param orderId optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionExchangeOrderCloseById(Long orderId) {
		return optionExchangeOrderCloseMapper.deleteOptionExchangeOrderCloseById(orderId);
	}

}
