package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.RewardWalletMapper;
import com.common.api.model.RewardWallet;
import com.common.api.service.IRewardWalletService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [reward服务实现]
 */
@Service
public class RewardWalletServiceImpl implements IRewardWalletService {
	@Autowired
	private RewardWalletMapper rewardWalletMapper;

	/**
	* 查询reward
	*
	* @param id rewardID
	* @return reward
	*/
	@Override
	public RewardWallet selectRewardWalletById(Long id) {
		return rewardWalletMapper.selectRewardWalletById(id);
	}

	/**
	* 查询reward列表
	*
	* @param rewardWallet reward
	* @return reward
	*/
	@Override
	public List<RewardWallet> selectRewardWalletList(RewardWallet rewardWallet) {
		return rewardWalletMapper.selectRewardWalletList(rewardWallet);
	}

	/**
	* 新增reward
	*
	* @param rewardWallet reward
	* @return 结果
	*/
	@Override
	public int insertRewardWallet(RewardWallet rewardWallet) {
		return rewardWalletMapper.insertRewardWallet(rewardWallet);
	}

	/**
	* 修改reward
	*
	* @param rewardWallet reward
	* @return 结果
	*/
	@Override
	public int updateRewardWallet(RewardWallet rewardWallet) {
		return rewardWalletMapper.updateRewardWallet(rewardWallet);
	}

	/**
	* 批量删除reward
	*
	* @param ids 需要删除的rewardID
	* @return 结果
	*/
	@Override
	public int deleteRewardWalletByIds(Long[] ids) {
		return rewardWalletMapper.deleteRewardWalletByIds(ids);
	}

	/**
	* 删除reward信息
	*
	* @param id rewardID
	* @return 结果
	*/
	@Override
	public int deleteRewardWalletById(Long id) {
		return rewardWalletMapper.deleteRewardWalletById(id);
	}

}
