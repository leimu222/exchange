package com.common.api.service;

import java.util.List;

import com.common.api.model.sysAddressPool;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [sysBiz服务]
 */
public interface ISysAddressPoolBizService {

	/**
	* 查询sys
	*
	* @param address sysID
	* @return sys
	*/
	public SysAddressPool selectSysAddressPoolById(String address);

	/**
	* 查询sys列表
	*
	* @param sysAddressPool sys
	* @return sys集合
	*/
	public List<SysAddressPool> selectSysAddressPoolList(SysAddressPool sysAddressPool);

	/**
	* 新增sys
	*
	* @param sysAddressPool sys
	* @return 结果
	*/
	public int insertSysAddressPool(SysAddressPool sysAddressPool);

	/**
	* 修改sys
	*
	* @param sysAddressPool sys
	* @return 结果
	*/
	public int updateSysAddressPool(SysAddressPool sysAddressPool);

	/**
	* 批量删除sys
	*
	* @param addresss 需要删除的sysID
	* @return 结果
	*/
	public int deleteSysAddressPoolByIds(String[] addresss);

	/**
	* 删除sys信息
	*
	* @param address sysID
	* @return 结果
	*/
	public int deleteSysAddressPoolById(String address);
	
}
