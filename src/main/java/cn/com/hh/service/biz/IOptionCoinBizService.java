package com.common.api.service;

import java.util.List;

import com.common.api.model.optionCoin;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [optionBiz服务]
 */
public interface IOptionCoinBizService {

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionCoin selectOptionCoinById(Long id);

	/**
	* 查询option列表
	*
	* @param optionCoin option
	* @return option集合
	*/
	public List<OptionCoin> selectOptionCoinList(OptionCoin optionCoin);

	/**
	* 新增option
	*
	* @param optionCoin option
	* @return 结果
	*/
	public int insertOptionCoin(OptionCoin optionCoin);

	/**
	* 修改option
	*
	* @param optionCoin option
	* @return 结果
	*/
	public int updateOptionCoin(OptionCoin optionCoin);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionCoinByIds(Long[] ids);

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionCoinById(Long id);
	
}
