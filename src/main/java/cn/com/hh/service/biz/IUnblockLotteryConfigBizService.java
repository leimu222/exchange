package com.common.api.service;

import java.util.List;

import com.common.api.model.unblockLotteryConfig;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [unblockBiz服务]
 */
public interface IUnblockLotteryConfigBizService {

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	public UnblockLotteryConfig selectUnblockLotteryConfigById(Long id);

	/**
	* 查询unblock列表
	*
	* @param unblockLotteryConfig unblock
	* @return unblock集合
	*/
	public List<UnblockLotteryConfig> selectUnblockLotteryConfigList(UnblockLotteryConfig unblockLotteryConfig);

	/**
	* 新增unblock
	*
	* @param unblockLotteryConfig unblock
	* @return 结果
	*/
	public int insertUnblockLotteryConfig(UnblockLotteryConfig unblockLotteryConfig);

	/**
	* 修改unblock
	*
	* @param unblockLotteryConfig unblock
	* @return 结果
	*/
	public int updateUnblockLotteryConfig(UnblockLotteryConfig unblockLotteryConfig);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	public int deleteUnblockLotteryConfigByIds(Long[] ids);

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockLotteryConfigById(Long id);
	
}
