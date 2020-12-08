package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.SysAdvertiseMapper;
import com.common.api.model.SysAdvertise;
import com.common.api.service.ISysAdvertiseService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [sysBiz服务实现]
 */
@Service
public class SysAdvertiseBizServiceImpl extends CommonService implements ISysAdvertiseBizService {
	@Autowired
	private ISysAdvertiseService sysAdvertiseService;

	/**
	* 查询sys
	*
	* @param serialNumber sysID
	* @return sys
	*/
	@Override
	public SysAdvertise selectSysAdvertiseById(String serialNumber) {
		return sysAdvertiseService.selectSysAdvertiseById(serialNumber);
	}

	/**
	* 查询sys列表
	*
	* @param sysAdvertise sys
	* @return sys
	*/
	@Override
	public List<SysAdvertise> selectSysAdvertiseList(SysAdvertise sysAdvertise) {
		return sysAdvertiseService.selectSysAdvertiseList(sysAdvertise);
	}

	/**
	* 新增sys
	*
	* @param sysAdvertise sys
	* @return 结果
	*/
	@Override
	public int insertSysAdvertise(SysAdvertise sysAdvertise) {
		return sysAdvertiseService.insertSysAdvertise(sysAdvertise);
	}

	/**
	* 修改sys
	*
	* @param sysAdvertise sys
	* @return 结果
	*/
	@Override
	public int updateSysAdvertise(SysAdvertise sysAdvertise) {
		return sysAdvertiseService.updateSysAdvertise(sysAdvertise);
	}

	/**
	* 批量删除sys
	*
	* @param serialNumbers 需要删除的sysID
	* @return 结果
	*/
	@Override
	public int deleteSysAdvertiseByIds(String[] serialNumbers) {
		return sysAdvertiseService.deleteSysAdvertiseByIds(serialNumbers);
	}

	/**
	* 删除sys信息
	*
	* @param serialNumber sysID
	* @return 结果
	*/
	@Override
	public int deleteSysAdvertiseById(String serialNumber) {
		return sysAdvertiseService.deleteSysAdvertiseById(serialNumber);
	}

}
