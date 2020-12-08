package com.common.api.mapper;

import com.common.api.model.SysHelp;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [sys服务实现]
 */
public interface SysHelpMapper{

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
	* 删除sys
	*
	* @param id sysID
	* @return 结果
	*/
	public int deleteSysHelpById(Long id);

	/**
	* 批量删除sys
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteSysHelpByIds(Long[] ids);

}
