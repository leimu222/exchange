package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.TransferAuditRecordsMapper;
import com.common.api.model.TransferAuditRecords;
import com.common.api.service.ITransferAuditRecordsService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [transfer服务实现]
 */
@Service
public class TransferAuditRecordsServiceImpl implements ITransferAuditRecordsService {
	@Autowired
	private TransferAuditRecordsMapper transferAuditRecordsMapper;

	/**
	* 查询transfer
	*
	* @param id transferID
	* @return transfer
	*/
	@Override
	public TransferAuditRecords selectTransferAuditRecordsById(Long id) {
		return transferAuditRecordsMapper.selectTransferAuditRecordsById(id);
	}

	/**
	* 查询transfer列表
	*
	* @param transferAuditRecords transfer
	* @return transfer
	*/
	@Override
	public List<TransferAuditRecords> selectTransferAuditRecordsList(TransferAuditRecords transferAuditRecords) {
		return transferAuditRecordsMapper.selectTransferAuditRecordsList(transferAuditRecords);
	}

	/**
	* 新增transfer
	*
	* @param transferAuditRecords transfer
	* @return 结果
	*/
	@Override
	public int insertTransferAuditRecords(TransferAuditRecords transferAuditRecords) {
		return transferAuditRecordsMapper.insertTransferAuditRecords(transferAuditRecords);
	}

	/**
	* 修改transfer
	*
	* @param transferAuditRecords transfer
	* @return 结果
	*/
	@Override
	public int updateTransferAuditRecords(TransferAuditRecords transferAuditRecords) {
		return transferAuditRecordsMapper.updateTransferAuditRecords(transferAuditRecords);
	}

	/**
	* 批量删除transfer
	*
	* @param ids 需要删除的transferID
	* @return 结果
	*/
	@Override
	public int deleteTransferAuditRecordsByIds(Long[] ids) {
		return transferAuditRecordsMapper.deleteTransferAuditRecordsByIds(ids);
	}

	/**
	* 删除transfer信息
	*
	* @param id transferID
	* @return 结果
	*/
	@Override
	public int deleteTransferAuditRecordsById(Long id) {
		return transferAuditRecordsMapper.deleteTransferAuditRecordsById(id);
	}

}
