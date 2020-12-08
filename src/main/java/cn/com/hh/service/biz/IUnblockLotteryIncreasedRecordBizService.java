package com.common.api.service;

import java.util.List;

import com.common.api.model.unblockLotteryIncreasedRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [unblockBiz服务]
 */
public interface IUnblockLotteryIncreasedRecordBizService {

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	public UnblockLotteryIncreasedRecord selectUnblockLotteryIncreasedRecordById(Long id);

	/**
	* 查询unblock列表
	*
	* @param unblockLotteryIncreasedRecord unblock
	* @return unblock集合
	*/
	public List<UnblockLotteryIncreasedRecord> selectUnblockLotteryIncreasedRecordList(UnblockLotteryIncreasedRecord unblockLotteryIncreasedRecord);

	/**
	* 新增unblock
	*
	* @param unblockLotteryIncreasedRecord unblock
	* @return 结果
	*/
	public int insertUnblockLotteryIncreasedRecord(UnblockLotteryIncreasedRecord unblockLotteryIncreasedRecord);

	/**
	* 修改unblock
	*
	* @param unblockLotteryIncreasedRecord unblock
	* @return 结果
	*/
	public int updateUnblockLotteryIncreasedRecord(UnblockLotteryIncreasedRecord unblockLotteryIncreasedRecord);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	public int deleteUnblockLotteryIncreasedRecordByIds(Long[] ids);

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockLotteryIncreasedRecordById(Long id);
	
}
