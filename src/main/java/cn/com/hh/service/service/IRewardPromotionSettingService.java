package com.common.api.service;

import java.util.List;

import com.common.api.model.rewardPromotionSetting;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [reward服务]
 */
public interface IRewardPromotionSettingService {

	/**
	* 查询reward
	*
	* @param id rewardID
	* @return reward
	*/
	public RewardPromotionSetting selectRewardPromotionSettingById(Long id);

	/**
	* 查询reward列表
	*
	* @param rewardPromotionSetting reward
	* @return reward集合
	*/
	public List<RewardPromotionSetting> selectRewardPromotionSettingList(RewardPromotionSetting rewardPromotionSetting);

	/**
	* 新增reward
	*
	* @param rewardPromotionSetting reward
	* @return 结果
	*/
	public int insertRewardPromotionSetting(RewardPromotionSetting rewardPromotionSetting);

	/**
	* 修改reward
	*
	* @param rewardPromotionSetting reward
	* @return 结果
	*/
	public int updateRewardPromotionSetting(RewardPromotionSetting rewardPromotionSetting);

	/**
	* 批量删除reward
	*
	* @param ids 需要删除的rewardID
	* @return 结果
	*/
	public int deleteRewardPromotionSettingByIds(Long[] ids);

	/**
	* 删除reward信息
	*
	* @param id rewardID
	* @return 结果
	*/
	public int deleteRewardPromotionSettingById(Long id);
	
}
