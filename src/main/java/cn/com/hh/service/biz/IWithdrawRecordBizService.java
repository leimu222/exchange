package com.common.api.service;

import java.util.List;

import com.common.api.model.withdrawRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [withdrawBiz服务]
 */
public interface IWithdrawRecordBizService {

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
	* 批量删除withdraw
	*
	* @param ids 需要删除的withdrawID
	* @return 结果
	*/
	public int deleteWithdrawRecordByIds(Long[] ids);

	/**
	* 删除withdraw信息
	*
	* @param id withdrawID
	* @return 结果
	*/
	public int deleteWithdrawRecordById(Long id);
	
}
