package com.common.api.service;

import java.util.List;

import com.common.api.model.sysHelp;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [sysBiz服务]
 */
public interface ISysHelpBizService {

	/**
	* 查询sys
	*
	* @param id sysID
	* @return sys
	*/
	public SysHelp selectSysHelpById(Long id);

	/**
	* 查询sys列表
	*
	* @param sysHelp sys
	* @return sys集合
	*/
	public List<SysHelp> selectSysHelpList(SysHelp sysHelp);

	/**
	* 新增sys
	*
	* @param sysHelp sys
	* @return 结果
	*/
	public int insertSysHelp(SysHelp sysHelp);

	/**
	* 修改sys
	*
	* @param sysHelp sys
	* @return 结果
	*/
	public int updateSysHelp(SysHelp sysHelp);

	/**
	* 批量删除sys
	*
	* @param ids 需要删除的sysID
	* @return 结果
	*/
	public int deleteSysHelpByIds(Long[] ids);

	/**
	* 删除sys信息
	*
	* @param id sysID
	* @return 结果
	*/
	public int deleteSysHelpById(Long id);
	
}
