package com.common.api.service;

import java.util.List;

import com.common.api.model.sysAdvertise;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [sysBiz服务]
 */
public interface ISysAdvertiseBizService {

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
	* 批量删除sys
	*
	* @param serialNumbers 需要删除的sysID
	* @return 结果
	*/
	public int deleteSysAdvertiseByIds(String[] serialNumbers);

	/**
	* 删除sys信息
	*
	* @param serialNumber sysID
	* @return 结果
	*/
	public int deleteSysAdvertiseById(String serialNumber);
	
}
