package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.UnblockMemberRewardMapper;
import com.common.api.model.UnblockMemberReward;
import com.common.api.service.IUnblockMemberRewardService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [unblock服务实现]
 */
@Service
public class UnblockMemberRewardServiceImpl implements IUnblockMemberRewardService {
	@Autowired
	private UnblockMemberRewardMapper unblockMemberRewardMapper;

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	@Override
	public UnblockMemberReward selectUnblockMemberRewardById(Long id) {
		return unblockMemberRewardMapper.selectUnblockMemberRewardById(id);
	}

	/**
	* 查询unblock列表
	*
	* @param unblockMemberReward unblock
	* @return unblock
	*/
	@Override
	public List<UnblockMemberReward> selectUnblockMemberRewardList(UnblockMemberReward unblockMemberReward) {
		return unblockMemberRewardMapper.selectUnblockMemberRewardList(unblockMemberReward);
	}

	/**
	* 新增unblock
	*
	* @param unblockMemberReward unblock
	* @return 结果
	*/
	@Override
	public int insertUnblockMemberReward(UnblockMemberReward unblockMemberReward) {
		return unblockMemberRewardMapper.insertUnblockMemberReward(unblockMemberReward);
	}

	/**
	* 修改unblock
	*
	* @param unblockMemberReward unblock
	* @return 结果
	*/
	@Override
	public int updateUnblockMemberReward(UnblockMemberReward unblockMemberReward) {
		return unblockMemberRewardMapper.updateUnblockMemberReward(unblockMemberReward);
	}

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockMemberRewardByIds(Long[] ids) {
		return unblockMemberRewardMapper.deleteUnblockMemberRewardByIds(ids);
	}

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockMemberRewardById(Long id) {
		return unblockMemberRewardMapper.deleteUnblockMemberRewardById(id);
	}

}
