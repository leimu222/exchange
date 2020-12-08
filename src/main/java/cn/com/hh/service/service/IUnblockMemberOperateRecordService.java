package com.common.api.service;

import java.util.List;

import com.common.api.model.unblockMemberOperateRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [unblock服务]
 */
public interface IUnblockMemberOperateRecordService {

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	public UnblockMemberOperateRecord selectUnblockMemberOperateRecordById(Long id);

	/**
	* 查询unblock列表
	*
	* @param unblockMemberOperateRecord unblock
	* @return unblock集合
	*/
	public List<UnblockMemberOperateRecord> selectUnblockMemberOperateRecordList(UnblockMemberOperateRecord unblockMemberOperateRecord);

	/**
	* 新增unblock
	*
	* @param unblockMemberOperateRecord unblock
	* @return 结果
	*/
	public int insertUnblockMemberOperateRecord(UnblockMemberOperateRecord unblockMemberOperateRecord);

	/**
	* 修改unblock
	*
	* @param unblockMemberOperateRecord unblock
	* @return 结果
	*/
	public int updateUnblockMemberOperateRecord(UnblockMemberOperateRecord unblockMemberOperateRecord);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	public int deleteUnblockMemberOperateRecordByIds(Long[] ids);

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockMemberOperateRecordById(Long id);
	
}
