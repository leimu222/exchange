package com.common.api.mapper;

import com.common.api.model.RobotSymbolConfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [robot服务实现]
 */
public interface RobotSymbolConfigMapper{

	/**
	* 查询robot
	*
	* @param symbol robotID
	* @return robot
	*/
	public RobotSymbolConfig selectRobotSymbolConfigById(String symbol);

	/**
	* 查询robot列表
	*
	* @param robotSymbolConfig robot
	* @return robot集合
	*/
	public List<RobotSymbolConfig> selectRobotSymbolConfigList(RobotSymbolConfig robotSymbolConfig);

	/**
	* 新增robot
	*
	* @param robotSymbolConfig robot
	* @return 结果
	*/
	public int insertRobotSymbolConfig(RobotSymbolConfig robotSymbolConfig);

	/**
	* 修改robot
	*
	* @param robotSymbolConfig robot
	* @return 结果
	*/
	public int updateRobotSymbolConfig(RobotSymbolConfig robotSymbolConfig);

	/**
	* 删除robot
	*
	* @param symbol robotID
	* @return 结果
	*/
	public int deleteRobotSymbolConfigById(String symbol);

	/**
	* 批量删除robot
	*
	* @param symbols 需要删除的数据ID
	* @return 结果
	*/
	public int deleteRobotSymbolConfigByIds(String[] symbols);

}
