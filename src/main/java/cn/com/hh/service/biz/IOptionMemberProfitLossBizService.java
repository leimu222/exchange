package com.common.api.service;

import java.util.List;

import com.common.api.model.optionMemberProfitLoss;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [optionBiz服务]
 */
public interface IOptionMemberProfitLossBizService {

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionMemberProfitLoss selectOptionMemberProfitLossById(Long id);

	/**
	* 查询option列表
	*
	* @param optionMemberProfitLoss option
	* @return option集合
	*/
	public List<OptionMemberProfitLoss> selectOptionMemberProfitLossList(OptionMemberProfitLoss optionMemberProfitLoss);

	/**
	* 新增option
	*
	* @param optionMemberProfitLoss option
	* @return 结果
	*/
	public int insertOptionMemberProfitLoss(OptionMemberProfitLoss optionMemberProfitLoss);

	/**
	* 修改option
	*
	* @param optionMemberProfitLoss option
	* @return 结果
	*/
	public int updateOptionMemberProfitLoss(OptionMemberProfitLoss optionMemberProfitLoss);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionMemberProfitLossByIds(Long[] ids);

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionMemberProfitLossById(Long id);
	
}
