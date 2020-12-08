package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.UnblockLotteryRecordMapper;
import com.common.api.model.UnblockLotteryRecord;
import com.common.api.service.IUnblockLotteryRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [unblock服务实现]
 */
@Service
public class UnblockLotteryRecordServiceImpl implements IUnblockLotteryRecordService {
	@Autowired
	private UnblockLotteryRecordMapper unblockLotteryRecordMapper;

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	@Override
	public UnblockLotteryRecord selectUnblockLotteryRecordById(Long id) {
		return unblockLotteryRecordMapper.selectUnblockLotteryRecordById(id);
	}

	/**
	* 查询unblock列表
	*
	* @param unblockLotteryRecord unblock
	* @return unblock
	*/
	@Override
	public List<UnblockLotteryRecord> selectUnblockLotteryRecordList(UnblockLotteryRecord unblockLotteryRecord) {
		return unblockLotteryRecordMapper.selectUnblockLotteryRecordList(unblockLotteryRecord);
	}

	/**
	* 新增unblock
	*
	* @param unblockLotteryRecord unblock
	* @return 结果
	*/
	@Override
	public int insertUnblockLotteryRecord(UnblockLotteryRecord unblockLotteryRecord) {
		return unblockLotteryRecordMapper.insertUnblockLotteryRecord(unblockLotteryRecord);
	}

	/**
	* 修改unblock
	*
	* @param unblockLotteryRecord unblock
	* @return 结果
	*/
	@Override
	public int updateUnblockLotteryRecord(UnblockLotteryRecord unblockLotteryRecord) {
		return unblockLotteryRecordMapper.updateUnblockLotteryRecord(unblockLotteryRecord);
	}

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockLotteryRecordByIds(Long[] ids) {
		return unblockLotteryRecordMapper.deleteUnblockLotteryRecordByIds(ids);
	}

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockLotteryRecordById(Long id) {
		return unblockLotteryRecordMapper.deleteUnblockLotteryRecordById(id);
	}

}
