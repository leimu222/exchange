package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.RobotSymbolConfigMapper;
import com.common.api.model.RobotSymbolConfig;
import com.common.api.service.IRobotSymbolConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [robot服务实现]
 */
@Service
public class RobotSymbolConfigServiceImpl implements IRobotSymbolConfigService {
	@Autowired
	private RobotSymbolConfigMapper robotSymbolConfigMapper;

	/**
	* 查询robot
	*
	* @param symbol robotID
	* @return robot
	*/
	@Override
	public RobotSymbolConfig selectRobotSymbolConfigById(String symbol) {
		return robotSymbolConfigMapper.selectRobotSymbolConfigById(symbol);
	}

	/**
	* 查询robot列表
	*
	* @param robotSymbolConfig robot
	* @return robot
	*/
	@Override
	public List<RobotSymbolConfig> selectRobotSymbolConfigList(RobotSymbolConfig robotSymbolConfig) {
		return robotSymbolConfigMapper.selectRobotSymbolConfigList(robotSymbolConfig);
	}

	/**
	* 新增robot
	*
	* @param robotSymbolConfig robot
	* @return 结果
	*/
	@Override
	public int insertRobotSymbolConfig(RobotSymbolConfig robotSymbolConfig) {
		return robotSymbolConfigMapper.insertRobotSymbolConfig(robotSymbolConfig);
	}

	/**
	* 修改robot
	*
	* @param robotSymbolConfig robot
	* @return 结果
	*/
	@Override
	public int updateRobotSymbolConfig(RobotSymbolConfig robotSymbolConfig) {
		return robotSymbolConfigMapper.updateRobotSymbolConfig(robotSymbolConfig);
	}

	/**
	* 批量删除robot
	*
	* @param symbols 需要删除的robotID
	* @return 结果
	*/
	@Override
	public int deleteRobotSymbolConfigByIds(String[] symbols) {
		return robotSymbolConfigMapper.deleteRobotSymbolConfigByIds(symbols);
	}

	/**
	* 删除robot信息
	*
	* @param symbol robotID
	* @return 结果
	*/
	@Override
	public int deleteRobotSymbolConfigById(String symbol) {
		return robotSymbolConfigMapper.deleteRobotSymbolConfigById(symbol);
	}

}
