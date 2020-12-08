package com.common.api.mapper;

import com.common.api.model.OptionRobotSymbolConfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public interface OptionRobotSymbolConfigMapper{

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
	* 删除option
	*
	* @param symbol optionID
	* @return 结果
	*/
	public int deleteOptionRobotSymbolConfigById(String symbol);

	/**
	* 批量删除option
	*
	* @param symbols 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionRobotSymbolConfigByIds(String[] symbols);

}
