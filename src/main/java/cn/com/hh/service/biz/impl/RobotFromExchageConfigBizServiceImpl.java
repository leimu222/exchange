package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.RobotFromExchageConfigMapper;
import com.common.api.model.RobotFromExchageConfig;
import com.common.api.service.IRobotFromExchageConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [robotBiz服务实现]
 */
@Service
public class RobotFromExchageConfigBizServiceImpl extends CommonService implements IRobotFromExchageConfigBizService {
	@Autowired
	private IRobotFromExchageConfigService robotFromExchageConfigService;

	/**
	* 查询robot
	*
	* @param id robotID
	* @return robot
	*/
	@Override
	public RobotFromExchageConfig selectRobotFromExchageConfigById(Long id) {
		return robotFromExchageConfigService.selectRobotFromExchageConfigById(id);
	}

	/**
	* 查询robot列表
	*
	* @param robotFromExchageConfig robot
	* @return robot
	*/
	@Override
	public List<RobotFromExchageConfig> selectRobotFromExchageConfigList(RobotFromExchageConfig robotFromExchageConfig) {
		return robotFromExchageConfigService.selectRobotFromExchageConfigList(robotFromExchageConfig);
	}

	/**
	* 新增robot
	*
	* @param robotFromExchageConfig robot
	* @return 结果
	*/
	@Override
	public int insertRobotFromExchageConfig(RobotFromExchageConfig robotFromExchageConfig) {
		return robotFromExchageConfigService.insertRobotFromExchageConfig(robotFromExchageConfig);
	}

	/**
	* 修改robot
	*
	* @param robotFromExchageConfig robot
	* @return 结果
	*/
	@Override
	public int updateRobotFromExchageConfig(RobotFromExchageConfig robotFromExchageConfig) {
		return robotFromExchageConfigService.updateRobotFromExchageConfig(robotFromExchageConfig);
	}

	/**
	* 批量删除robot
	*
	* @param ids 需要删除的robotID
	* @return 结果
	*/
	@Override
	public int deleteRobotFromExchageConfigByIds(Long[] ids) {
		return robotFromExchageConfigService.deleteRobotFromExchageConfigByIds(ids);
	}

	/**
	* 删除robot信息
	*
	* @param id robotID
	* @return 结果
	*/
	@Override
	public int deleteRobotFromExchageConfigById(Long id) {
		return robotFromExchageConfigService.deleteRobotFromExchageConfigById(id);
	}

}
