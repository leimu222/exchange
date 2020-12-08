package com.common.api.mapper;

import com.common.api.model.UnblockMemberDayReleaseRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public interface UnblockMemberDayReleaseRecordMapper{

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
	* 删除unblock
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockMemberDayReleaseRecordById(Long id);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteUnblockMemberDayReleaseRecordByIds(Long[] ids);

}
