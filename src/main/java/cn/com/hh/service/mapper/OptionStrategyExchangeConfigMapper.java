package com.common.api.mapper;

import com.common.api.model.OptionStrategyExchangeConfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public interface OptionStrategyExchangeConfigMapper{

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
	* 删除option
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionStrategyExchangeConfigById(Long id);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionStrategyExchangeConfigByIds(Long[] ids);

}
