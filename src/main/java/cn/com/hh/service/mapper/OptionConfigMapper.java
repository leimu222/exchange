package com.common.api.mapper;

import com.common.api.model.OptionConfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [option服务实现]
 */
public interface OptionConfigMapper{

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
	* 删除option
	*
	* @param configKey optionID
	* @return 结果
	*/
	public int deleteOptionConfigById(String configKey);

	/**
	* 批量删除option
	*
	* @param configKeys 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionConfigByIds(String[] configKeys);

}
