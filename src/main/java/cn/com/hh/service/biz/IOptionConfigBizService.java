package com.common.api.service;

import java.util.List;

import com.common.api.model.optionConfig;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [optionBiz服务]
 */
public interface IOptionConfigBizService {

	/**
	* 查询option
	*
	* @param configKey optionID
	* @return option
	*/
	public OptionConfig selectOptionConfigById(String configKey);

	/**
	* 查询option列表
	*
	* @param optionConfig option
	* @return option集合
	*/
	public List<OptionConfig> selectOptionConfigList(OptionConfig optionConfig);

	/**
	* 新增option
	*
	* @param optionConfig option
	* @return 结果
	*/
	public int insertOptionConfig(OptionConfig optionConfig);

	/**
	* 修改option
	*
	* @param optionConfig option
	* @return 结果
	*/
	public int updateOptionConfig(OptionConfig optionConfig);

	/**
	* 批量删除option
	*
	* @param configKeys 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionConfigByIds(String[] configKeys);

	/**
	* 删除option信息
	*
	* @param configKey optionID
	* @return 结果
	*/
	public int deleteOptionConfigById(String configKey);
	
}
