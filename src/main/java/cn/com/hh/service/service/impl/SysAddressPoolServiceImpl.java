package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.SysAddressPoolMapper;
import com.common.api.model.SysAddressPool;
import com.common.api.service.ISysAddressPoolService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [sys服务实现]
 */
@Service
public class SysAddressPoolServiceImpl implements ISysAddressPoolService {
	@Autowired
	private SysAddressPoolMapper sysAddressPoolMapper;

	/**
	* 查询sys
	*
	* @param address sysID
	* @return sys
	*/
	@Override
	public SysAddressPool selectSysAddressPoolById(String address) {
		return sysAddressPoolMapper.selectSysAddressPoolById(address);
	}

	/**
	* 查询sys列表
	*
	* @param sysAddressPool sys
	* @return sys
	*/
	@Override
	public List<SysAddressPool> selectSysAddressPoolList(SysAddressPool sysAddressPool) {
		return sysAddressPoolMapper.selectSysAddressPoolList(sysAddressPool);
	}

	/**
	* 新增sys
	*
	* @param sysAddressPool sys
	* @return 结果
	*/
	@Override
	public int insertSysAddressPool(SysAddressPool sysAddressPool) {
		return sysAddressPoolMapper.insertSysAddressPool(sysAddressPool);
	}

	/**
	* 修改sys
	*
	* @param sysAddressPool sys
	* @return 结果
	*/
	@Override
	public int updateSysAddressPool(SysAddressPool sysAddressPool) {
		return sysAddressPoolMapper.updateSysAddressPool(sysAddressPool);
	}

	/**
	* 批量删除sys
	*
	* @param addresss 需要删除的sysID
	* @return 结果
	*/
	@Override
	public int deleteSysAddressPoolByIds(String[] addresss) {
		return sysAddressPoolMapper.deleteSysAddressPoolByIds(addresss);
	}

	/**
	* 删除sys信息
	*
	* @param address sysID
	* @return 结果
	*/
	@Override
	public int deleteSysAddressPoolById(String address) {
		return sysAddressPoolMapper.deleteSysAddressPoolById(address);
	}

}
