package com.common.api.mapper;

import com.common.api.model.RewardPromotionSetting;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [reward服务实现]
 */
public interface RewardPromotionSettingMapper{

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
	* 删除reward
	*
	* @param id rewardID
	* @return 结果
	*/
	public int deleteRewardPromotionSettingById(Long id);

	/**
	* 批量删除reward
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteRewardPromotionSettingByIds(Long[] ids);

}
