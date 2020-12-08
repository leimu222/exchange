package com.common.api.service;

import java.util.List;

import com.common.api.model.rewardActivitySetting;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [rewardBiz服务]
 */
public interface IRewardActivitySettingBizService {

	/**
	* 查询reward
	*
	* @param id rewardID
	* @return reward
	*/
	public RewardActivitySetting selectRewardActivitySettingById(Long id);

	/**
	* 查询reward列表
	*
	* @param rewardActivitySetting reward
	* @return reward集合
	*/
	public List<RewardActivitySetting> selectRewardActivitySettingList(RewardActivitySetting rewardActivitySetting);

	/**
	* 新增reward
	*
	* @param rewardActivitySetting reward
	* @return 结果
	*/
	public int insertRewardActivitySetting(RewardActivitySetting rewardActivitySetting);

	/**
	* 修改reward
	*
	* @param rewardActivitySetting reward
	* @return 结果
	*/
	public int updateRewardActivitySetting(RewardActivitySetting rewardActivitySetting);

	/**
	* 批量删除reward
	*
	* @param ids 需要删除的rewardID
	* @return 结果
	*/
	public int deleteRewardActivitySettingByIds(Long[] ids);

	/**
	* 删除reward信息
	*
	* @param id rewardID
	* @return 结果
	*/
	public int deleteRewardActivitySettingById(Long id);
	
}
