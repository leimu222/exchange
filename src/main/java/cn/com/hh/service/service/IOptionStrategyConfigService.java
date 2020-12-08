package com.common.api.service;

import java.util.List;

import com.common.api.model.optionStrategyConfig;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [option服务]
 */
public interface IOptionStrategyConfigService {

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionStrategyConfig selectOptionStrategyConfigById(Long id);

	/**
	* 查询option列表
	*
	* @param optionStrategyConfig option
	* @return option集合
	*/
	public List<OptionStrategyConfig> selectOptionStrategyConfigList(OptionStrategyConfig optionStrategyConfig);

	/**
	* 新增option
	*
	* @param optionStrategyConfig option
	* @return 结果
	*/
	public int insertOptionStrategyConfig(OptionStrategyConfig optionStrategyConfig);

	/**
	* 修改option
	*
	* @param optionStrategyConfig option
	* @return 结果
	*/
	public int updateOptionStrategyConfig(OptionStrategyConfig optionStrategyConfig);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionStrategyConfigByIds(Long[] ids);

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionStrategyConfigById(Long id);
	
}
