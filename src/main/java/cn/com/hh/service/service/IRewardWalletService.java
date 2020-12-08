package com.common.api.service;

import java.util.List;

import com.common.api.model.rewardWallet;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [reward服务]
 */
public interface IRewardWalletService {

	/**
	* 查询reward
	*
	* @param id rewardID
	* @return reward
	*/
	public RewardWallet selectRewardWalletById(Long id);

	/**
	* 查询reward列表
	*
	* @param rewardWallet reward
	* @return reward集合
	*/
	public List<RewardWallet> selectRewardWalletList(RewardWallet rewardWallet);

	/**
	* 新增reward
	*
	* @param rewardWallet reward
	* @return 结果
	*/
	public int insertRewardWallet(RewardWallet rewardWallet);

	/**
	* 修改reward
	*
	* @param rewardWallet reward
	* @return 结果
	*/
	public int updateRewardWallet(RewardWallet rewardWallet);

	/**
	* 批量删除reward
	*
	* @param ids 需要删除的rewardID
	* @return 结果
	*/
	public int deleteRewardWalletByIds(Long[] ids);

	/**
	* 删除reward信息
	*
	* @param id rewardID
	* @return 结果
	*/
	public int deleteRewardWalletById(Long id);
	
}
