package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.UnblockLotteryIncreasedRecordMapper;
import com.common.api.model.UnblockLotteryIncreasedRecord;
import com.common.api.service.IUnblockLotteryIncreasedRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [unblockBiz服务实现]
 */
@Service
public class UnblockLotteryIncreasedRecordBizServiceImpl extends CommonService implements IUnblockLotteryIncreasedRecordBizService {
	@Autowired
	private IUnblockLotteryIncreasedRecordService unblockLotteryIncreasedRecordService;

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	@Override
	public UnblockLotteryIncreasedRecord selectUnblockLotteryIncreasedRecordById(Long id) {
		return unblockLotteryIncreasedRecordService.selectUnblockLotteryIncreasedRecordById(id);
	}

	/**
	* 查询unblock列表
	*
	* @param unblockLotteryIncreasedRecord unblock
	* @return unblock
	*/
	@Override
	public List<UnblockLotteryIncreasedRecord> selectUnblockLotteryIncreasedRecordList(UnblockLotteryIncreasedRecord unblockLotteryIncreasedRecord) {
		return unblockLotteryIncreasedRecordService.selectUnblockLotteryIncreasedRecordList(unblockLotteryIncreasedRecord);
	}

	/**
	* 新增unblock
	*
	* @param unblockLotteryIncreasedRecord unblock
	* @return 结果
	*/
	@Override
	public int insertUnblockLotteryIncreasedRecord(UnblockLotteryIncreasedRecord unblockLotteryIncreasedRecord) {
		return unblockLotteryIncreasedRecordService.insertUnblockLotteryIncreasedRecord(unblockLotteryIncreasedRecord);
	}

	/**
	* 修改unblock
	*
	* @param unblockLotteryIncreasedRecord unblock
	* @return 结果
	*/
	@Override
	public int updateUnblockLotteryIncreasedRecord(UnblockLotteryIncreasedRecord unblockLotteryIncreasedRecord) {
		return unblockLotteryIncreasedRecordService.updateUnblockLotteryIncreasedRecord(unblockLotteryIncreasedRecord);
	}

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockLotteryIncreasedRecordByIds(Long[] ids) {
		return unblockLotteryIncreasedRecordService.deleteUnblockLotteryIncreasedRecordByIds(ids);
	}

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockLotteryIncreasedRecordById(Long id) {
		return unblockLotteryIncreasedRecordService.deleteUnblockLotteryIncreasedRecordById(id);
	}

}
