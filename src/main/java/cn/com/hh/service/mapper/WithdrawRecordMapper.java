package com.common.api.mapper;

import com.common.api.model.WithdrawRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [withdraw服务实现]
 */
public interface WithdrawRecordMapper{

	/**
	* 查询withdraw
	*
	* @param id withdrawID
	* @return withdraw
	*/
	public WithdrawRecord selectWithdrawRecordById(Long id);

	/**
	* 查询withdraw列表
	*
	* @param withdrawRecord withdraw
	* @return withdraw集合
	*/
	public List<WithdrawRecord> selectWithdrawRecordList(WithdrawRecord withdrawRecord);

	/**
	* 新增withdraw
	*
	* @param withdrawRecord withdraw
	* @return 结果
	*/
	public int insertWithdrawRecord(WithdrawRecord withdrawRecord);

	/**
	* 修改withdraw
	*
	* @param withdrawRecord withdraw
	* @return 结果
	*/
	public int updateWithdrawRecord(WithdrawRecord withdrawRecord);

	/**
	* 删除withdraw
	*
	* @param id withdrawID
	* @return 结果
	*/
	public int deleteWithdrawRecordById(Long id);

	/**
	* 批量删除withdraw
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteWithdrawRecordByIds(Long[] ids);

}
