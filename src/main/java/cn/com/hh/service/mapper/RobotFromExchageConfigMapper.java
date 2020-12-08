package com.common.api.mapper;

import com.common.api.model.RobotFromExchageConfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [robot服务实现]
 */
public interface RobotFromExchageConfigMapper{

	/**
	* 查询robot
	*
	* @param id robotID
	* @return robot
	*/
	public RobotFromExchageConfig selectRobotFromExchageConfigById(Long id);

	/**
	* 查询robot列表
	*
	* @param robotFromExchageConfig robot
	* @return robot集合
	*/
	public List<RobotFromExchageConfig> selectRobotFromExchageConfigList(RobotFromExchageConfig robotFromExchageConfig);

	/**
	* 新增robot
	*
	* @param robotFromExchageConfig robot
	* @return 结果
	*/
	public int insertRobotFromExchageConfig(RobotFromExchageConfig robotFromExchageConfig);

	/**
	* 修改robot
	*
	* @param robotFromExchageConfig robot
	* @return 结果
	*/
	public int updateRobotFromExchageConfig(RobotFromExchageConfig robotFromExchageConfig);

	/**
	* 删除robot
	*
	* @param id robotID
	* @return 结果
	*/
	public int deleteRobotFromExchageConfigById(Long id);

	/**
	* 批量删除robot
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteRobotFromExchageConfigByIds(Long[] ids);

}
