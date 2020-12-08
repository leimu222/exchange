package com.common.api.mapper;

import com.common.api.model.UnblockMemberOperateRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public interface UnblockMemberOperateRecordMapper{

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
	* 删除unblock
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockMemberOperateRecordById(Long id);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteUnblockMemberOperateRecordByIds(Long[] ids);

}
