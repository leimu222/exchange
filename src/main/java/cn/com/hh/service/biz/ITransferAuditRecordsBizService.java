package com.common.api.service;

import java.util.List;

import com.common.api.model.transferAuditRecords;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [transferBiz服务]
 */
public interface ITransferAuditRecordsBizService {

	/**
	* 查询transfer
	*
	* @param id transferID
	* @return transfer
	*/
	public TransferAuditRecords selectTransferAuditRecordsById(Long id);

	/**
	* 查询transfer列表
	*
	* @param transferAuditRecords transfer
	* @return transfer集合
	*/
	public List<TransferAuditRecords> selectTransferAuditRecordsList(TransferAuditRecords transferAuditRecords);

	/**
	* 新增transfer
	*
	* @param transferAuditRecords transfer
	* @return 结果
	*/
	public int insertTransferAuditRecords(TransferAuditRecords transferAuditRecords);

	/**
	* 修改transfer
	*
	* @param transferAuditRecords transfer
	* @return 结果
	*/
	public int updateTransferAuditRecords(TransferAuditRecords transferAuditRecords);

	/**
	* 批量删除transfer
	*
	* @param ids 需要删除的transferID
	* @return 结果
	*/
	public int deleteTransferAuditRecordsByIds(Long[] ids);

	/**
	* 删除transfer信息
	*
	* @param id transferID
	* @return 结果
	*/
	public int deleteTransferAuditRecordsById(Long id);
	
}
