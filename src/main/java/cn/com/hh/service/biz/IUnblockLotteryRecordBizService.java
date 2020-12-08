package com.common.api.service;

import java.util.List;

import com.common.api.model.unblockLotteryRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [unblockBiz服务]
 */
public interface IUnblockLotteryRecordBizService {

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	public UnblockLotteryRecord selectUnblockLotteryRecordById(Long id);

	/**
	* 查询unblock列表
	*
	* @param unblockLotteryRecord unblock
	* @return unblock集合
	*/
	public List<UnblockLotteryRecord> selectUnblockLotteryRecordList(UnblockLotteryRecord unblockLotteryRecord);

	/**
	* 新增unblock
	*
	* @param unblockLotteryRecord unblock
	* @return 结果
	*/
	public int insertUnblockLotteryRecord(UnblockLotteryRecord unblockLotteryRecord);

	/**
	* 修改unblock
	*
	* @param unblockLotteryRecord unblock
	* @return 结果
	*/
	public int updateUnblockLotteryRecord(UnblockLotteryRecord unblockLotteryRecord);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	public int deleteUnblockLotteryRecordByIds(Long[] ids);

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockLotteryRecordById(Long id);
	
}
