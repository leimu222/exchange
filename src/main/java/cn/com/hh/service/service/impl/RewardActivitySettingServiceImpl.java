package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.RewardActivitySettingMapper;
import com.common.api.model.RewardActivitySetting;
import com.common.api.service.IRewardActivitySettingService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [reward服务实现]
 */
@Service
public class RewardActivitySettingServiceImpl implements IRewardActivitySettingService {
	@Autowired
	private RewardActivitySettingMapper rewardActivitySettingMapper;

	/**
	* 查询reward
	*
	* @param id rewardID
	* @return reward
	*/
	@Override
	public RewardActivitySetting selectRewardActivitySettingById(Long id) {
		return rewardActivitySettingMapper.selectRewardActivitySettingById(id);
	}

	/**
	* 查询reward列表
	*
	* @param rewardActivitySetting reward
	* @return reward
	*/
	@Override
	public List<RewardActivitySetting> selectRewardActivitySettingList(RewardActivitySetting rewardActivitySetting) {
		return rewardActivitySettingMapper.selectRewardActivitySettingList(rewardActivitySetting);
	}

	/**
	* 新增reward
	*
	* @param rewardActivitySetting reward
	* @return 结果
	*/
	@Override
	public int insertRewardActivitySetting(RewardActivitySetting rewardActivitySetting) {
		return rewardActivitySettingMapper.insertRewardActivitySetting(rewardActivitySetting);
	}

	/**
	* 修改reward
	*
	* @param rewardActivitySetting reward
	* @return 结果
	*/
	@Override
	public int updateRewardActivitySetting(RewardActivitySetting rewardActivitySetting) {
		return rewardActivitySettingMapper.updateRewardActivitySetting(rewardActivitySetting);
	}

	/**
	* 批量删除reward
	*
	* @param ids 需要删除的rewardID
	* @return 结果
	*/
	@Override
	public int deleteRewardActivitySettingByIds(Long[] ids) {
		return rewardActivitySettingMapper.deleteRewardActivitySettingByIds(ids);
	}

	/**
	* 删除reward信息
	*
	* @param id rewardID
	* @return 结果
	*/
	@Override
	public int deleteRewardActivitySettingById(Long id) {
		return rewardActivitySettingMapper.deleteRewardActivitySettingById(id);
	}

}
