package com.common.api.service;

import java.util.List;

import com.common.api.model.unblockMemberDayUnlockRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [unblockBiz服务]
 */
public interface IUnblockMemberDayUnlockRecordBizService {

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	public UnblockMemberDayUnlockRecord selectUnblockMemberDayUnlockRecordById(Long id);

	/**
	* 查询unblock列表
	*
	* @param unblockMemberDayUnlockRecord unblock
	* @return unblock集合
	*/
	public List<UnblockMemberDayUnlockRecord> selectUnblockMemberDayUnlockRecordList(UnblockMemberDayUnlockRecord unblockMemberDayUnlockRecord);

	/**
	* 新增unblock
	*
	* @param unblockMemberDayUnlockRecord unblock
	* @return 结果
	*/
	public int insertUnblockMemberDayUnlockRecord(UnblockMemberDayUnlockRecord unblockMemberDayUnlockRecord);

	/**
	* 修改unblock
	*
	* @param unblockMemberDayUnlockRecord unblock
	* @return 结果
	*/
	public int updateUnblockMemberDayUnlockRecord(UnblockMemberDayUnlockRecord unblockMemberDayUnlockRecord);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	public int deleteUnblockMemberDayUnlockRecordByIds(Long[] ids);

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockMemberDayUnlockRecordById(Long id);
	
}
