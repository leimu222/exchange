package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.RewardPromotionSettingMapper;
import com.common.api.model.RewardPromotionSetting;
import com.common.api.service.IRewardPromotionSettingService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [reward服务实现]
 */
@Service
public class RewardPromotionSettingServiceImpl implements IRewardPromotionSettingService {
	@Autowired
	private RewardPromotionSettingMapper rewardPromotionSettingMapper;

	/**
	* 查询reward
	*
	* @param id rewardID
	* @return reward
	*/
	@Override
	public RewardPromotionSetting selectRewardPromotionSettingById(Long id) {
		return rewardPromotionSettingMapper.selectRewardPromotionSettingById(id);
	}

	/**
	* 查询reward列表
	*
	* @param rewardPromotionSetting reward
	* @return reward
	*/
	@Override
	public List<RewardPromotionSetting> selectRewardPromotionSettingList(RewardPromotionSetting rewardPromotionSetting) {
		return rewardPromotionSettingMapper.selectRewardPromotionSettingList(rewardPromotionSetting);
	}

	/**
	* 新增reward
	*
	* @param rewardPromotionSetting reward
	* @return 结果
	*/
	@Override
	public int insertRewardPromotionSetting(RewardPromotionSetting rewardPromotionSetting) {
		return rewardPromotionSettingMapper.insertRewardPromotionSetting(rewardPromotionSetting);
	}

	/**
	* 修改reward
	*
	* @param rewardPromotionSetting reward
	* @return 结果
	*/
	@Override
	public int updateRewardPromotionSetting(RewardPromotionSetting rewardPromotionSetting) {
		return rewardPromotionSettingMapper.updateRewardPromotionSetting(rewardPromotionSetting);
	}

	/**
	* 批量删除reward
	*
	* @param ids 需要删除的rewardID
	* @return 结果
	*/
	@Override
	public int deleteRewardPromotionSettingByIds(Long[] ids) {
		return rewardPromotionSettingMapper.deleteRewardPromotionSettingByIds(ids);
	}

	/**
	* 删除reward信息
	*
	* @param id rewardID
	* @return 结果
	*/
	@Override
	public int deleteRewardPromotionSettingById(Long id) {
		return rewardPromotionSettingMapper.deleteRewardPromotionSettingById(id);
	}

}
