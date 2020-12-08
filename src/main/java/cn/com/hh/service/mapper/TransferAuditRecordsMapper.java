package com.common.api.mapper;

import com.common.api.model.TransferAuditRecords;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [transfer服务实现]
 */
public interface TransferAuditRecordsMapper{

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
	* 删除transfer
	*
	* @param id transferID
	* @return 结果
	*/
	public int deleteTransferAuditRecordsById(Long id);

	/**
	* 批量删除transfer
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteTransferAuditRecordsByIds(Long[] ids);

}
