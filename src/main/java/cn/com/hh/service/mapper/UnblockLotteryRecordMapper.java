package com.common.api.mapper;

import com.common.api.model.UnblockLotteryRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public interface UnblockLotteryRecordMapper{

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	public UnblockLotteryRecord selectUnblockLotteryRecordById(Long id);

	/**
	* 查询unblock列表
	*
	* @param unblockLotteryRecord unblock
	* @return unblock集合
	*/
	public List<UnblockLotteryRecord> selectUnblockLotteryRecordList(UnblockLotteryRecord unblockLotteryRecord);

	/**
	* 新增unblock
	*
	* @param unblockLotteryRecord unblock
	* @return 结果
	*/
	public int insertUnblockLotteryRecord(UnblockLotteryRecord unblockLotteryRecord);

	/**
	* 修改unblock
	*
	* @param unblockLotteryRecord unblock
	* @return 结果
	*/
	public int updateUnblockLotteryRecord(UnblockLotteryRecord unblockLotteryRecord);

	/**
	* 删除unblock
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockLotteryRecordById(Long id);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteUnblockLotteryRecordByIds(Long[] ids);

}
