package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.UnblockMemberOperateRecordMapper;
import com.common.api.model.UnblockMemberOperateRecord;
import com.common.api.service.IUnblockMemberOperateRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [unblock服务实现]
 */
@Service
public class UnblockMemberOperateRecordServiceImpl implements IUnblockMemberOperateRecordService {
	@Autowired
	private UnblockMemberOperateRecordMapper unblockMemberOperateRecordMapper;

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	@Override
	public UnblockMemberOperateRecord selectUnblockMemberOperateRecordById(Long id) {
		return unblockMemberOperateRecordMapper.selectUnblockMemberOperateRecordById(id);
	}

	/**
	* 查询unblock列表
	*
	* @param unblockMemberOperateRecord unblock
	* @return unblock
	*/
	@Override
	public List<UnblockMemberOperateRecord> selectUnblockMemberOperateRecordList(UnblockMemberOperateRecord unblockMemberOperateRecord) {
		return unblockMemberOperateRecordMapper.selectUnblockMemberOperateRecordList(unblockMemberOperateRecord);
	}

	/**
	* 新增unblock
	*
	* @param unblockMemberOperateRecord unblock
	* @return 结果
	*/
	@Override
	public int insertUnblockMemberOperateRecord(UnblockMemberOperateRecord unblockMemberOperateRecord) {
		return unblockMemberOperateRecordMapper.insertUnblockMemberOperateRecord(unblockMemberOperateRecord);
	}

	/**
	* 修改unblock
	*
	* @param unblockMemberOperateRecord unblock
	* @return 结果
	*/
	@Override
	public int updateUnblockMemberOperateRecord(UnblockMemberOperateRecord unblockMemberOperateRecord) {
		return unblockMemberOperateRecordMapper.updateUnblockMemberOperateRecord(unblockMemberOperateRecord);
	}

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockMemberOperateRecordByIds(Long[] ids) {
		return unblockMemberOperateRecordMapper.deleteUnblockMemberOperateRecordByIds(ids);
	}

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockMemberOperateRecordById(Long id) {
		return unblockMemberOperateRecordMapper.deleteUnblockMemberOperateRecordById(id);
	}

}
