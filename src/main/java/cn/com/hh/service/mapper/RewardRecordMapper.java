package com.common.api.mapper;

import com.common.api.model.RewardRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [reward服务实现]
 */
public interface RewardRecordMapper{

	/**
	* 查询reward
	*
	* @param id rewardID
	* @return reward
	*/
	public RewardRecord selectRewardRecordById(Long id);

	/**
	* 查询reward列表
	*
	* @param rewardRecord reward
	* @return reward集合
	*/
	public List<RewardRecord> selectRewardRecordList(RewardRecord rewardRecord);

	/**
	* 新增reward
	*
	* @param rewardRecord reward
	* @return 结果
	*/
	public int insertRewardRecord(RewardRecord rewardRecord);

	/**
	* 修改reward
	*
	* @param rewardRecord reward
	* @return 结果
	*/
	public int updateRewardRecord(RewardRecord rewardRecord);

	/**
	* 删除reward
	*
	* @param id rewardID
	* @return 结果
	*/
	public int deleteRewardRecordById(Long id);

	/**
	* 批量删除reward
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteRewardRecordByIds(Long[] ids);

}
