package com.common.api.mapper;

import com.common.api.model.SysAdvertise;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [sys服务实现]
 */
public interface SysAdvertiseMapper{

	/**
	* 查询sys
	*
	* @param serialNumber sysID
	* @return sys
	*/
	public SysAdvertise selectSysAdvertiseById(String serialNumber);

	/**
	* 查询sys列表
	*
	* @param sysAdvertise sys
	* @return sys集合
	*/
	public List<SysAdvertise> selectSysAdvertiseList(SysAdvertise sysAdvertise);

	/**
	* 新增sys
	*
	* @param sysAdvertise sys
	* @return 结果
	*/
	public int insertSysAdvertise(SysAdvertise sysAdvertise);

	/**
	* 修改sys
	*
	* @param sysAdvertise sys
	* @return 结果
	*/
	public int updateSysAdvertise(SysAdvertise sysAdvertise);

	/**
	* 删除sys
	*
	* @param serialNumber sysID
	* @return 结果
	*/
	public int deleteSysAdvertiseById(String serialNumber);

	/**
	* 批量删除sys
	*
	* @param serialNumbers 需要删除的数据ID
	* @return 结果
	*/
	public int deleteSysAdvertiseByIds(String[] serialNumbers);

}
