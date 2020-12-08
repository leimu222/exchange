package com.common.api.service;

import java.util.List;

import com.common.api.model.depositRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [depositBiz服务]
 */
public interface IDepositRecordBizService {

	/**
	* 查询deposit
	*
	* @param id depositID
	* @return deposit
	*/
	public DepositRecord selectDepositRecordById(String id);

	/**
	* 查询deposit列表
	*
	* @param depositRecord deposit
	* @return deposit集合
	*/
	public List<DepositRecord> selectDepositRecordList(DepositRecord depositRecord);

	/**
	* 新增deposit
	*
	* @param depositRecord deposit
	* @return 结果
	*/
	public int insertDepositRecord(DepositRecord depositRecord);

	/**
	* 修改deposit
	*
	* @param depositRecord deposit
	* @return 结果
	*/
	public int updateDepositRecord(DepositRecord depositRecord);

	/**
	* 批量删除deposit
	*
	* @param ids 需要删除的depositID
	* @return 结果
	*/
	public int deleteDepositRecordByIds(String[] ids);

	/**
	* 删除deposit信息
	*
	* @param id depositID
	* @return 结果
	*/
	public int deleteDepositRecordById(String id);
	
}
