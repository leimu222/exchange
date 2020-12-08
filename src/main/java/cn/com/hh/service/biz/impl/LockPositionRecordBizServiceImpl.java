package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.LockPositionRecordMapper;
import com.common.api.model.LockPositionRecord;
import com.common.api.service.ILockPositionRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [lockBiz服务实现]
 */
@Service
public class LockPositionRecordBizServiceImpl extends CommonService implements ILockPositionRecordBizService {
	@Autowired
	private ILockPositionRecordService lockPositionRecordService;

	/**
	* 查询lock
	*
	* @param id lockID
	* @return lock
	*/
	@Override
	public LockPositionRecord selectLockPositionRecordById(Long id) {
		return lockPositionRecordService.selectLockPositionRecordById(id);
	}

	/**
	* 查询lock列表
	*
	* @param lockPositionRecord lock
	* @return lock
	*/
	@Override
	public List<LockPositionRecord> selectLockPositionRecordList(LockPositionRecord lockPositionRecord) {
		return lockPositionRecordService.selectLockPositionRecordList(lockPositionRecord);
	}

	/**
	* 新增lock
	*
	* @param lockPositionRecord lock
	* @return 结果
	*/
	@Override
	public int insertLockPositionRecord(LockPositionRecord lockPositionRecord) {
		return lockPositionRecordService.insertLockPositionRecord(lockPositionRecord);
	}

	/**
	* 修改lock
	*
	* @param lockPositionRecord lock
	* @return 结果
	*/
	@Override
	public int updateLockPositionRecord(LockPositionRecord lockPositionRecord) {
		return lockPositionRecordService.updateLockPositionRecord(lockPositionRecord);
	}

	/**
	* 批量删除lock
	*
	* @param ids 需要删除的lockID
	* @return 结果
	*/
	@Override
	public int deleteLockPositionRecordByIds(Long[] ids) {
		return lockPositionRecordService.deleteLockPositionRecordByIds(ids);
	}

	/**
	* 删除lock信息
	*
	* @param id lockID
	* @return 结果
	*/
	@Override
	public int deleteLockPositionRecordById(Long id) {
		return lockPositionRecordService.deleteLockPositionRecordById(id);
	}

}
