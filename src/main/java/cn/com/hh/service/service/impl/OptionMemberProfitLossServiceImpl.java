package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionMemberProfitLossMapper;
import com.common.api.model.OptionMemberProfitLoss;
import com.common.api.service.IOptionMemberProfitLossService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [option服务实现]
 */
@Service
public class OptionMemberProfitLossServiceImpl implements IOptionMemberProfitLossService {
	@Autowired
	private OptionMemberProfitLossMapper optionMemberProfitLossMapper;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionMemberProfitLoss selectOptionMemberProfitLossById(Long id) {
		return optionMemberProfitLossMapper.selectOptionMemberProfitLossById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionMemberProfitLoss option
	* @return option
	*/
	@Override
	public List<OptionMemberProfitLoss> selectOptionMemberProfitLossList(OptionMemberProfitLoss optionMemberProfitLoss) {
		return optionMemberProfitLossMapper.selectOptionMemberProfitLossList(optionMemberProfitLoss);
	}

	/**
	* 新增option
	*
	* @param optionMemberProfitLoss option
	* @return 结果
	*/
	@Override
	public int insertOptionMemberProfitLoss(OptionMemberProfitLoss optionMemberProfitLoss) {
		return optionMemberProfitLossMapper.insertOptionMemberProfitLoss(optionMemberProfitLoss);
	}

	/**
	* 修改option
	*
	* @param optionMemberProfitLoss option
	* @return 结果
	*/
	@Override
	public int updateOptionMemberProfitLoss(OptionMemberProfitLoss optionMemberProfitLoss) {
		return optionMemberProfitLossMapper.updateOptionMemberProfitLoss(optionMemberProfitLoss);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionMemberProfitLossByIds(Long[] ids) {
		return optionMemberProfitLossMapper.deleteOptionMemberProfitLossByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionMemberProfitLossById(Long id) {
		return optionMemberProfitLossMapper.deleteOptionMemberProfitLossById(id);
	}

}
