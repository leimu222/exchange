package com.common.api.mapper;

import com.common.api.model.SysCommonConfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [sys服务实现]
 */
public interface SysCommonConfigMapper{

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
	* 删除sys
	*
	* @param id sysID
	* @return 结果
	*/
	public int deleteSysCommonConfigById(Long id);

	/**
	* 批量删除sys
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteSysCommonConfigByIds(Long[] ids);

}
