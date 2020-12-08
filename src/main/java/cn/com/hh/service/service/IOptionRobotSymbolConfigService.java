package com.common.api.service;

import java.util.List;

import com.common.api.model.optionRobotSymbolConfig;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [option服务]
 */
public interface IOptionRobotSymbolConfigService {

	/**
	* 查询option
	*
	* @param symbol optionID
	* @return option
	*/
	public OptionRobotSymbolConfig selectOptionRobotSymbolConfigById(String symbol);

	/**
	* 查询option列表
	*
	* @param optionRobotSymbolConfig option
	* @return option集合
	*/
	public List<OptionRobotSymbolConfig> selectOptionRobotSymbolConfigList(OptionRobotSymbolConfig optionRobotSymbolConfig);

	/**
	* 新增option
	*
	* @param optionRobotSymbolConfig option
	* @return 结果
	*/
	public int insertOptionRobotSymbolConfig(OptionRobotSymbolConfig optionRobotSymbolConfig);

	/**
	* 修改option
	*
	* @param optionRobotSymbolConfig option
	* @return 结果
	*/
	public int updateOptionRobotSymbolConfig(OptionRobotSymbolConfig optionRobotSymbolConfig);

	/**
	* 批量删除option
	*
	* @param symbols 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionRobotSymbolConfigByIds(String[] symbols);

	/**
	* 删除option信息
	*
	* @param symbol optionID
	* @return 结果
	*/
	public int deleteOptionRobotSymbolConfigById(String symbol);
	
}
