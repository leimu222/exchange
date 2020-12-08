package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionExchangeOrderCancelMapper;
import com.common.api.model.OptionExchangeOrderCancel;
import com.common.api.service.IOptionExchangeOrderCancelService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [optionBiz服务实现]
 */
@Service
public class OptionExchangeOrderCancelBizServiceImpl extends CommonService implements IOptionExchangeOrderCancelBizService {
	@Autowired
	private IOptionExchangeOrderCancelService optionExchangeOrderCancelService;

	/**
	* 查询option
	*
	* @param orderId optionID
	* @return option
	*/
	@Override
	public OptionExchangeOrderCancel selectOptionExchangeOrderCancelById(Long orderId) {
		return optionExchangeOrderCancelService.selectOptionExchangeOrderCancelById(orderId);
	}

	/**
	* 查询option列表
	*
	* @param optionExchangeOrderCancel option
	* @return option
	*/
	@Override
	public List<OptionExchangeOrderCancel> selectOptionExchangeOrderCancelList(OptionExchangeOrderCancel optionExchangeOrderCancel) {
		return optionExchangeOrderCancelService.selectOptionExchangeOrderCancelList(optionExchangeOrderCancel);
	}

	/**
	* 新增option
	*
	* @param optionExchangeOrderCancel option
	* @return 结果
	*/
	@Override
	public int insertOptionExchangeOrderCancel(OptionExchangeOrderCancel optionExchangeOrderCancel) {
		return optionExchangeOrderCancelService.insertOptionExchangeOrderCancel(optionExchangeOrderCancel);
	}

	/**
	* 修改option
	*
	* @param optionExchangeOrderCancel option
	* @return 结果
	*/
	@Override
	public int updateOptionExchangeOrderCancel(OptionExchangeOrderCancel optionExchangeOrderCancel) {
		return optionExchangeOrderCancelService.updateOptionExchangeOrderCancel(optionExchangeOrderCancel);
	}

	/**
	* 批量删除option
	*
	* @param orderIds 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionExchangeOrderCancelByIds(Long[] orderIds) {
		return optionExchangeOrderCancelService.deleteOptionExchangeOrderCancelByIds(orderIds);
	}

	/**
	* 删除option信息
	*
	* @param orderId optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionExchangeOrderCancelById(Long orderId) {
		return optionExchangeOrderCancelService.deleteOptionExchangeOrderCancelById(orderId);
	}

}
