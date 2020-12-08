package com.common.api.service;

import java.util.List;

import com.common.api.model.optionCoinInfo;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [optionBiz服务]
 */
public interface IOptionCoinInfoBizService {

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionCoinInfo selectOptionCoinInfoById(Integer id);

	/**
	* 查询option列表
	*
	* @param optionCoinInfo option
	* @return option集合
	*/
	public List<OptionCoinInfo> selectOptionCoinInfoList(OptionCoinInfo optionCoinInfo);

	/**
	* 新增option
	*
	* @param optionCoinInfo option
	* @return 结果
	*/
	public int insertOptionCoinInfo(OptionCoinInfo optionCoinInfo);

	/**
	* 修改option
	*
	* @param optionCoinInfo option
	* @return 结果
	*/
	public int updateOptionCoinInfo(OptionCoinInfo optionCoinInfo);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionCoinInfoByIds(Integer[] ids);

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionCoinInfoById(Integer id);
	
}
