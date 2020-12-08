package com.common.api.mapper;

import com.common.api.model.RewardActivitySetting;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [reward服务实现]
 */
public interface RewardActivitySettingMapper{

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
	* 删除reward
	*
	* @param id rewardID
	* @return 结果
	*/
	public int deleteRewardActivitySettingById(Long id);

	/**
	* 批量删除reward
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteRewardActivitySettingByIds(Long[] ids);

}
