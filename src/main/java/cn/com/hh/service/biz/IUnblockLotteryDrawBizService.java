package com.common.api.service;

import java.util.List;

import com.common.api.model.unblockLotteryDraw;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [unblockBiz服务]
 */
public interface IUnblockLotteryDrawBizService {

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	public UnblockLotteryDraw selectUnblockLotteryDrawById(Long id);

	/**
	* 查询unblock列表
	*
	* @param unblockLotteryDraw unblock
	* @return unblock集合
	*/
	public List<UnblockLotteryDraw> selectUnblockLotteryDrawList(UnblockLotteryDraw unblockLotteryDraw);

	/**
	* 新增unblock
	*
	* @param unblockLotteryDraw unblock
	* @return 结果
	*/
	public int insertUnblockLotteryDraw(UnblockLotteryDraw unblockLotteryDraw);

	/**
	* 修改unblock
	*
	* @param unblockLotteryDraw unblock
	* @return 结果
	*/
	public int updateUnblockLotteryDraw(UnblockLotteryDraw unblockLotteryDraw);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	public int deleteUnblockLotteryDrawByIds(Long[] ids);

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockLotteryDrawById(Long id);
	
}
