package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.UnblockMemberDayUnlockRecordMapper;
import com.common.api.model.UnblockMemberDayUnlockRecord;
import com.common.api.service.IUnblockMemberDayUnlockRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [unblock服务实现]
 */
@Service
public class UnblockMemberDayUnlockRecordServiceImpl implements IUnblockMemberDayUnlockRecordService {
	@Autowired
	private UnblockMemberDayUnlockRecordMapper unblockMemberDayUnlockRecordMapper;

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	@Override
	public UnblockMemberDayUnlockRecord selectUnblockMemberDayUnlockRecordById(Long id) {
		return unblockMemberDayUnlockRecordMapper.selectUnblockMemberDayUnlockRecordById(id);
	}

	/**
	* 查询unblock列表
	*
	* @param unblockMemberDayUnlockRecord unblock
	* @return unblock
	*/
	@Override
	public List<UnblockMemberDayUnlockRecord> selectUnblockMemberDayUnlockRecordList(UnblockMemberDayUnlockRecord unblockMemberDayUnlockRecord) {
		return unblockMemberDayUnlockRecordMapper.selectUnblockMemberDayUnlockRecordList(unblockMemberDayUnlockRecord);
	}

	/**
	* 新增unblock
	*
	* @param unblockMemberDayUnlockRecord unblock
	* @return 结果
	*/
	@Override
	public int insertUnblockMemberDayUnlockRecord(UnblockMemberDayUnlockRecord unblockMemberDayUnlockRecord) {
		return unblockMemberDayUnlockRecordMapper.insertUnblockMemberDayUnlockRecord(unblockMemberDayUnlockRecord);
	}

	/**
	* 修改unblock
	*
	* @param unblockMemberDayUnlockRecord unblock
	* @return 结果
	*/
	@Override
	public int updateUnblockMemberDayUnlockRecord(UnblockMemberDayUnlockRecord unblockMemberDayUnlockRecord) {
		return unblockMemberDayUnlockRecordMapper.updateUnblockMemberDayUnlockRecord(unblockMemberDayUnlockRecord);
	}

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockMemberDayUnlockRecordByIds(Long[] ids) {
		return unblockMemberDayUnlockRecordMapper.deleteUnblockMemberDayUnlockRecordByIds(ids);
	}

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockMemberDayUnlockRecordById(Long id) {
		return unblockMemberDayUnlockRecordMapper.deleteUnblockMemberDayUnlockRecordById(id);
	}

}
