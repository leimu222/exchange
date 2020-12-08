package com.common.api.service;

import java.util.List;

import com.common.api.model.rewardRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [rewardBiz服务]
 */
public interface IRewardRecordBizService {

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
	* 批量删除reward
	*
	* @param ids 需要删除的rewardID
	* @return 结果
	*/
	public int deleteRewardRecordByIds(Long[] ids);

	/**
	* 删除reward信息
	*
	* @param id rewardID
	* @return 结果
	*/
	public int deleteRewardRecordById(Long id);
	
}
