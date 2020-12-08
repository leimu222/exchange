package com.common.api.service;

import java.util.List;

import com.common.api.model.robotFromExchageConfig;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [robot服务]
 */
public interface IRobotFromExchageConfigService {

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
	* 批量删除robot
	*
	* @param ids 需要删除的robotID
	* @return 结果
	*/
	public int deleteRobotFromExchageConfigByIds(Long[] ids);

	/**
	* 删除robot信息
	*
	* @param id robotID
	* @return 结果
	*/
	public int deleteRobotFromExchageConfigById(Long id);
	
}
