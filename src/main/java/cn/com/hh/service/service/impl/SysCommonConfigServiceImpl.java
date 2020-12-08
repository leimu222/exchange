package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.SysCommonConfigMapper;
import com.common.api.model.SysCommonConfig;
import com.common.api.service.ISysCommonConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [sys服务实现]
 */
@Service
public class SysCommonConfigServiceImpl implements ISysCommonConfigService {
	@Autowired
	private SysCommonConfigMapper sysCommonConfigMapper;

	/**
	* 查询sys
	*
	* @param id sysID
	* @return sys
	*/
	@Override
	public SysCommonConfig selectSysCommonConfigById(Long id) {
		return sysCommonConfigMapper.selectSysCommonConfigById(id);
	}

	/**
	* 查询sys列表
	*
	* @param sysCommonConfig sys
	* @return sys
	*/
	@Override
	public List<SysCommonConfig> selectSysCommonConfigList(SysCommonConfig sysCommonConfig) {
		return sysCommonConfigMapper.selectSysCommonConfigList(sysCommonConfig);
	}

	/**
	* 新增sys
	*
	* @param sysCommonConfig sys
	* @return 结果
	*/
	@Override
	public int insertSysCommonConfig(SysCommonConfig sysCommonConfig) {
		return sysCommonConfigMapper.insertSysCommonConfig(sysCommonConfig);
	}

	/**
	* 修改sys
	*
	* @param sysCommonConfig sys
	* @return 结果
	*/
	@Override
	public int updateSysCommonConfig(SysCommonConfig sysCommonConfig) {
		return sysCommonConfigMapper.updateSysCommonConfig(sysCommonConfig);
	}

	/**
	* 批量删除sys
	*
	* @param ids 需要删除的sysID
	* @return 结果
	*/
	@Override
	public int deleteSysCommonConfigByIds(Long[] ids) {
		return sysCommonConfigMapper.deleteSysCommonConfigByIds(ids);
	}

	/**
	* 删除sys信息
	*
	* @param id sysID
	* @return 结果
	*/
	@Override
	public int deleteSysCommonConfigById(Long id) {
		return sysCommonConfigMapper.deleteSysCommonConfigById(id);
	}

}
