package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.UnblockCommonConfigMapper;
import com.common.api.model.UnblockCommonConfig;
import com.common.api.service.IUnblockCommonConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [unblock服务实现]
 */
@Service
public class UnblockCommonConfigServiceImpl implements IUnblockCommonConfigService {
	@Autowired
	private UnblockCommonConfigMapper unblockCommonConfigMapper;

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	@Override
	public UnblockCommonConfig selectUnblockCommonConfigById(Long id) {
		return unblockCommonConfigMapper.selectUnblockCommonConfigById(id);
	}

	/**
	* 查询unblock列表
	*
	* @param unblockCommonConfig unblock
	* @return unblock
	*/
	@Override
	public List<UnblockCommonConfig> selectUnblockCommonConfigList(UnblockCommonConfig unblockCommonConfig) {
		return unblockCommonConfigMapper.selectUnblockCommonConfigList(unblockCommonConfig);
	}

	/**
	* 新增unblock
	*
	* @param unblockCommonConfig unblock
	* @return 结果
	*/
	@Override
	public int insertUnblockCommonConfig(UnblockCommonConfig unblockCommonConfig) {
		return unblockCommonConfigMapper.insertUnblockCommonConfig(unblockCommonConfig);
	}

	/**
	* 修改unblock
	*
	* @param unblockCommonConfig unblock
	* @return 结果
	*/
	@Override
	public int updateUnblockCommonConfig(UnblockCommonConfig unblockCommonConfig) {
		return unblockCommonConfigMapper.updateUnblockCommonConfig(unblockCommonConfig);
	}

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockCommonConfigByIds(Long[] ids) {
		return unblockCommonConfigMapper.deleteUnblockCommonConfigByIds(ids);
	}

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockCommonConfigById(Long id) {
		return unblockCommonConfigMapper.deleteUnblockCommonConfigById(id);
	}

}
