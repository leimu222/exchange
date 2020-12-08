package com.common.api.service;

import java.util.List;

import com.common.api.model.optionCommissionInfo;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [optionBiz服务]
 */
public interface IOptionCommissionInfoBizService {

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionCommissionInfo selectOptionCommissionInfoById(Integer id);

	/**
	* 查询option列表
	*
	* @param optionCommissionInfo option
	* @return option集合
	*/
	public List<OptionCommissionInfo> selectOptionCommissionInfoList(OptionCommissionInfo optionCommissionInfo);

	/**
	* 新增option
	*
	* @param optionCommissionInfo option
	* @return 结果
	*/
	public int insertOptionCommissionInfo(OptionCommissionInfo optionCommissionInfo);

	/**
	* 修改option
	*
	* @param optionCommissionInfo option
	* @return 结果
	*/
	public int updateOptionCommissionInfo(OptionCommissionInfo optionCommissionInfo);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionCommissionInfoByIds(Integer[] ids);

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionCommissionInfoById(Integer id);
	
}
