package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionExchangeOrderInterestMapper;
import com.common.api.model.OptionExchangeOrderInterest;
import com.common.api.service.IOptionExchangeOrderInterestService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [option服务实现]
 */
@Service
public class OptionExchangeOrderInterestServiceImpl implements IOptionExchangeOrderInterestService {
	@Autowired
	private OptionExchangeOrderInterestMapper optionExchangeOrderInterestMapper;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionExchangeOrderInterest selectOptionExchangeOrderInterestById(Long id) {
		return optionExchangeOrderInterestMapper.selectOptionExchangeOrderInterestById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionExchangeOrderInterest option
	* @return option
	*/
	@Override
	public List<OptionExchangeOrderInterest> selectOptionExchangeOrderInterestList(OptionExchangeOrderInterest optionExchangeOrderInterest) {
		return optionExchangeOrderInterestMapper.selectOptionExchangeOrderInterestList(optionExchangeOrderInterest);
	}

	/**
	* 新增option
	*
	* @param optionExchangeOrderInterest option
	* @return 结果
	*/
	@Override
	public int insertOptionExchangeOrderInterest(OptionExchangeOrderInterest optionExchangeOrderInterest) {
		return optionExchangeOrderInterestMapper.insertOptionExchangeOrderInterest(optionExchangeOrderInterest);
	}

	/**
	* 修改option
	*
	* @param optionExchangeOrderInterest option
	* @return 结果
	*/
	@Override
	public int updateOptionExchangeOrderInterest(OptionExchangeOrderInterest optionExchangeOrderInterest) {
		return optionExchangeOrderInterestMapper.updateOptionExchangeOrderInterest(optionExchangeOrderInterest);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionExchangeOrderInterestByIds(Long[] ids) {
		return optionExchangeOrderInterestMapper.deleteOptionExchangeOrderInterestByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionExchangeOrderInterestById(Long id) {
		return optionExchangeOrderInterestMapper.deleteOptionExchangeOrderInterestById(id);
	}

}
