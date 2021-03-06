package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.UnblockLotteryConfigMapper;
import com.common.api.model.UnblockLotteryConfig;
import com.common.api.service.IUnblockLotteryConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [unblock服务实现]
 */
@Service
public class UnblockLotteryConfigServiceImpl implements IUnblockLotteryConfigService {
	@Autowired
	private UnblockLotteryConfigMapper unblockLotteryConfigMapper;

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	@Override
	public UnblockLotteryConfig selectUnblockLotteryConfigById(Long id) {
		return unblockLotteryConfigMapper.selectUnblockLotteryConfigById(id);
	}

	/**
	* 查询unblock列表
	*
	* @param unblockLotteryConfig unblock
	* @return unblock
	*/
	@Override
	public List<UnblockLotteryConfig> selectUnblockLotteryConfigList(UnblockLotteryConfig unblockLotteryConfig) {
		return unblockLotteryConfigMapper.selectUnblockLotteryConfigList(unblockLotteryConfig);
	}

	/**
	* 新增unblock
	*
	* @param unblockLotteryConfig unblock
	* @return 结果
	*/
	@Override
	public int insertUnblockLotteryConfig(UnblockLotteryConfig unblockLotteryConfig) {
		return unblockLotteryConfigMapper.insertUnblockLotteryConfig(unblockLotteryConfig);
	}

	/**
	* 修改unblock
	*
	* @param unblockLotteryConfig unblock
	* @return 结果
	*/
	@Override
	public int updateUnblockLotteryConfig(UnblockLotteryConfig unblockLotteryConfig) {
		return unblockLotteryConfigMapper.updateUnblockLotteryConfig(unblockLotteryConfig);
	}

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockLotteryConfigByIds(Long[] ids) {
		return unblockLotteryConfigMapper.deleteUnblockLotteryConfigByIds(ids);
	}

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockLotteryConfigById(Long id) {
		return unblockLotteryConfigMapper.deleteUnblockLotteryConfigById(id);
	}

}
