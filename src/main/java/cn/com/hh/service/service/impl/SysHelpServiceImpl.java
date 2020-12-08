package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.SysHelpMapper;
import com.common.api.model.SysHelp;
import com.common.api.service.ISysHelpService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [sys服务实现]
 */
@Service
public class SysHelpServiceImpl implements ISysHelpService {
	@Autowired
	private SysHelpMapper sysHelpMapper;

	/**
	* 查询sys
	*
	* @param id sysID
	* @return sys
	*/
	@Override
	public SysHelp selectSysHelpById(Long id) {
		return sysHelpMapper.selectSysHelpById(id);
	}

	/**
	* 查询sys列表
	*
	* @param sysHelp sys
	* @return sys
	*/
	@Override
	public List<SysHelp> selectSysHelpList(SysHelp sysHelp) {
		return sysHelpMapper.selectSysHelpList(sysHelp);
	}

	/**
	* 新增sys
	*
	* @param sysHelp sys
	* @return 结果
	*/
	@Override
	public int insertSysHelp(SysHelp sysHelp) {
		return sysHelpMapper.insertSysHelp(sysHelp);
	}

	/**
	* 修改sys
	*
	* @param sysHelp sys
	* @return 结果
	*/
	@Override
	public int updateSysHelp(SysHelp sysHelp) {
		return sysHelpMapper.updateSysHelp(sysHelp);
	}

	/**
	* 批量删除sys
	*
	* @param ids 需要删除的sysID
	* @return 结果
	*/
	@Override
	public int deleteSysHelpByIds(Long[] ids) {
		return sysHelpMapper.deleteSysHelpByIds(ids);
	}

	/**
	* 删除sys信息
	*
	* @param id sysID
	* @return 结果
	*/
	@Override
	public int deleteSysHelpById(Long id) {
		return sysHelpMapper.deleteSysHelpById(id);
	}

}
