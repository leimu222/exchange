package com.common.api.service;

import java.util.List;

import com.common.api.model.transferRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [transfer服务]
 */
public interface ITransferRecordService {

	/**
	* 查询transfer
	*
	* @param id transferID
	* @return transfer
	*/
	public TransferRecord selectTransferRecordById(Long id);

	/**
	* 查询transfer列表
	*
	* @param transferRecord transfer
	* @return transfer集合
	*/
	public List<TransferRecord> selectTransferRecordList(TransferRecord transferRecord);

	/**
	* 新增transfer
	*
	* @param transferRecord transfer
	* @return 结果
	*/
	public int insertTransferRecord(TransferRecord transferRecord);

	/**
	* 修改transfer
	*
	* @param transferRecord transfer
	* @return 结果
	*/
	public int updateTransferRecord(TransferRecord transferRecord);

	/**
	* 批量删除transfer
	*
	* @param ids 需要删除的transferID
	* @return 结果
	*/
	public int deleteTransferRecordByIds(Long[] ids);

	/**
	* 删除transfer信息
	*
	* @param id transferID
	* @return 结果
	*/
	public int deleteTransferRecordById(Long id);
	
}
