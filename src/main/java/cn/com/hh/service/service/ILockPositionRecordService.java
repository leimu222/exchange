package com.common.api.service;

import java.util.List;

import com.common.api.model.lockPositionRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [lock服务]
 */
public interface ILockPositionRecordService {

	/**
	* 查询lock
	*
	* @param id lockID
	* @return lock
	*/
	public LockPositionRecord selectLockPositionRecordById(Long id);

	/**
	* 查询lock列表
	*
	* @param lockPositionRecord lock
	* @return lock集合
	*/
	public List<LockPositionRecord> selectLockPositionRecordList(LockPositionRecord lockPositionRecord);

	/**
	* 新增lock
	*
	* @param lockPositionRecord lock
	* @return 结果
	*/
	public int insertLockPositionRecord(LockPositionRecord lockPositionRecord);

	/**
	* 修改lock
	*
	* @param lockPositionRecord lock
	* @return 结果
	*/
	public int updateLockPositionRecord(LockPositionRecord lockPositionRecord);

	/**
	* 批量删除lock
	*
	* @param ids 需要删除的lockID
	* @return 结果
	*/
	public int deleteLockPositionRecordByIds(Long[] ids);

	/**
	* 删除lock信息
	*
	* @param id lockID
	* @return 结果
	*/
	public int deleteLockPositionRecordById(Long id);
	
}
