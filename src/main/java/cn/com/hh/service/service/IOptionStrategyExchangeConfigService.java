package com.common.api.service;

import java.util.List;

import com.common.api.model.optionStrategyExchangeConfig;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [option服务]
 */
public interface IOptionStrategyExchangeConfigService {

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionStrategyExchangeConfig selectOptionStrategyExchangeConfigById(Long id);

	/**
	* 查询option列表
	*
	* @param optionStrategyExchangeConfig option
	* @return option集合
	*/
	public List<OptionStrategyExchangeConfig> selectOptionStrategyExchangeConfigList(OptionStrategyExchangeConfig optionStrategyExchangeConfig);

	/**
	* 新增option
	*
	* @param optionStrategyExchangeConfig option
	* @return 结果
	*/
	public int insertOptionStrategyExchangeConfig(OptionStrategyExchangeConfig optionStrategyExchangeConfig);

	/**
	* 修改option
	*
	* @param optionStrategyExchangeConfig option
	* @return 结果
	*/
	public int updateOptionStrategyExchangeConfig(OptionStrategyExchangeConfig optionStrategyExchangeConfig);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionStrategyExchangeConfigByIds(Long[] ids);

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionStrategyExchangeConfigById(Long id);
	
}
