package com.common.api.service;

import java.util.List;

import com.common.api.model.unblockMemberReward;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [unblock服务]
 */
public interface IUnblockMemberRewardService {

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	public UnblockMemberReward selectUnblockMemberRewardById(Long id);

	/**
	* 查询unblock列表
	*
	* @param unblockMemberReward unblock
	* @return unblock集合
	*/
	public List<UnblockMemberReward> selectUnblockMemberRewardList(UnblockMemberReward unblockMemberReward);

	/**
	* 新增unblock
	*
	* @param unblockMemberReward unblock
	* @return 结果
	*/
	public int insertUnblockMemberReward(UnblockMemberReward unblockMemberReward);

	/**
	* 修改unblock
	*
	* @param unblockMemberReward unblock
	* @return 结果
	*/
	public int updateUnblockMemberReward(UnblockMemberReward unblockMemberReward);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	public int deleteUnblockMemberRewardByIds(Long[] ids);

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockMemberRewardById(Long id);
	
}
