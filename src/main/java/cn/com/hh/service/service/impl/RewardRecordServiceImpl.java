package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.RewardRecordMapper;
import com.common.api.model.RewardRecord;
import com.common.api.service.IRewardRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [reward服务实现]
 */
@Service
public class RewardRecordServiceImpl implements IRewardRecordService {
	@Autowired
	private RewardRecordMapper rewardRecordMapper;

	/**
	* 查询reward
	*
	* @param id rewardID
	* @return reward
	*/
	@Override
	public RewardRecord selectRewardRecordById(Long id) {
		return rewardRecordMapper.selectRewardRecordById(id);
	}

	/**
	* 查询reward列表
	*
	* @param rewardRecord reward
	* @return reward
	*/
	@Override
	public List<RewardRecord> selectRewardRecordList(RewardRecord rewardRecord) {
		return rewardRecordMapper.selectRewardRecordList(rewardRecord);
	}

	/**
	* 新增reward
	*
	* @param rewardRecord reward
	* @return 结果
	*/
	@Override
	public int insertRewardRecord(RewardRecord rewardRecord) {
		return rewardRecordMapper.insertRewardRecord(rewardRecord);
	}

	/**
	* 修改reward
	*
	* @param rewardRecord reward
	* @return 结果
	*/
	@Override
	public int updateRewardRecord(RewardRecord rewardRecord) {
		return rewardRecordMapper.updateRewardRecord(rewardRecord);
	}

	/**
	* 批量删除reward
	*
	* @param ids 需要删除的rewardID
	* @return 结果
	*/
	@Override
	public int deleteRewardRecordByIds(Long[] ids) {
		return rewardRecordMapper.deleteRewardRecordByIds(ids);
	}

	/**
	* 删除reward信息
	*
	* @param id rewardID
	* @return 结果
	*/
	@Override
	public int deleteRewardRecordById(Long id) {
		return rewardRecordMapper.deleteRewardRecordById(id);
	}

}
