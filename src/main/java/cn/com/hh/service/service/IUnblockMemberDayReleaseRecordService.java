package com.common.api.service;

import java.util.List;

import com.common.api.model.unblockMemberDayReleaseRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [unblock服务]
 */
public interface IUnblockMemberDayReleaseRecordService {

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	public UnblockMemberDayReleaseRecord selectUnblockMemberDayReleaseRecordById(Long id);

	/**
	* 查询unblock列表
	*
	* @param unblockMemberDayReleaseRecord unblock
	* @return unblock集合
	*/
	public List<UnblockMemberDayReleaseRecord> selectUnblockMemberDayReleaseRecordList(UnblockMemberDayReleaseRecord unblockMemberDayReleaseRecord);

	/**
	* 新增unblock
	*
	* @param unblockMemberDayReleaseRecord unblock
	* @return 结果
	*/
	public int insertUnblockMemberDayReleaseRecord(UnblockMemberDayReleaseRecord unblockMemberDayReleaseRecord);

	/**
	* 修改unblock
	*
	* @param unblockMemberDayReleaseRecord unblock
	* @return 结果
	*/
	public int updateUnblockMemberDayReleaseRecord(UnblockMemberDayReleaseRecord unblockMemberDayReleaseRecord);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	public int deleteUnblockMemberDayReleaseRecordByIds(Long[] ids);

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockMemberDayReleaseRecordById(Long id);
	
}
