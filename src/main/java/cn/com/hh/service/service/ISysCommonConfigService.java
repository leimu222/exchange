package com.common.api.service;

import java.util.List;

import com.common.api.model.sysCommonConfig;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [sys服务]
 */
public interface ISysCommonConfigService {

	/**
	* 查询sys
	*
	* @param id sysID
	* @return sys
	*/
	public SysCommonConfig selectSysCommonConfigById(Long id);

	/**
	* 查询sys列表
	*
	* @param sysCommonConfig sys
	* @return sys集合
	*/
	public List<SysCommonConfig> selectSysCommonConfigList(SysCommonConfig sysCommonConfig);

	/**
	* 新增sys
	*
	* @param sysCommonConfig sys
	* @return 结果
	*/
	public int insertSysCommonConfig(SysCommonConfig sysCommonConfig);

	/**
	* 修改sys
	*
	* @param sysCommonConfig sys
	* @return 结果
	*/
	public int updateSysCommonConfig(SysCommonConfig sysCommonConfig);

	/**
	* 批量删除sys
	*
	* @param ids 需要删除的sysID
	* @return 结果
	*/
	public int deleteSysCommonConfigByIds(Long[] ids);

	/**
	* 删除sys信息
	*
	* @param id sysID
	* @return 结果
	*/
	public int deleteSysCommonConfigById(Long id);
	
}
