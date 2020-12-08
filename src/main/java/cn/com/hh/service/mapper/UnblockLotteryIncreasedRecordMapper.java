package com.common.api.mapper;

import com.common.api.model.UnblockLotteryIncreasedRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public interface UnblockLotteryIncreasedRecordMapper{

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	public UnblockLotteryIncreasedRecord selectUnblockLotteryIncreasedRecordById(Long id);

	/**
	* 查询unblock列表
	*
	* @param unblockLotteryIncreasedRecord unblock
	* @return unblock集合
	*/
	public List<UnblockLotteryIncreasedRecord> selectUnblockLotteryIncreasedRecordList(UnblockLotteryIncreasedRecord unblockLotteryIncreasedRecord);

	/**
	* 新增unblock
	*
	* @param unblockLotteryIncreasedRecord unblock
	* @return 结果
	*/
	public int insertUnblockLotteryIncreasedRecord(UnblockLotteryIncreasedRecord unblockLotteryIncreasedRecord);

	/**
	* 修改unblock
	*
	* @param unblockLotteryIncreasedRecord unblock
	* @return 结果
	*/
	public int updateUnblockLotteryIncreasedRecord(UnblockLotteryIncreasedRecord unblockLotteryIncreasedRecord);

	/**
	* 删除unblock
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockLotteryIncreasedRecordById(Long id);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteUnblockLotteryIncreasedRecordByIds(Long[] ids);

}
