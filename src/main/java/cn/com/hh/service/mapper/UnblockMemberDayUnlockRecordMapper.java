package com.common.api.mapper;

import com.common.api.model.UnblockMemberDayUnlockRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public interface UnblockMemberDayUnlockRecordMapper{

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
	* 删除unblock
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockMemberDayUnlockRecordById(Long id);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteUnblockMemberDayUnlockRecordByIds(Long[] ids);

}
