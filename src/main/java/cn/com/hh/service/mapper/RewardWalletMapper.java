package com.common.api.mapper;

import com.common.api.model.RewardWallet;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [reward服务实现]
 */
public interface RewardWalletMapper{

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
	* 删除reward
	*
	* @param id rewardID
	* @return 结果
	*/
	public int deleteRewardWalletById(Long id);

	/**
	* 批量删除reward
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteRewardWalletByIds(Long[] ids);

}
