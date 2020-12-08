package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.TransferRecordMapper;
import com.common.api.model.TransferRecord;
import com.common.api.service.ITransferRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [transferBiz服务实现]
 */
@Service
public class TransferRecordBizServiceImpl extends CommonService implements ITransferRecordBizService {
	@Autowired
	private ITransferRecordService transferRecordService;

	/**
	* 查询transfer
	*
	* @param id transferID
	* @return transfer
	*/
	@Override
	public TransferRecord selectTransferRecordById(Long id) {
		return transferRecordService.selectTransferRecordById(id);
	}

	/**
	* 查询transfer列表
	*
	* @param transferRecord transfer
	* @return transfer
	*/
	@Override
	public List<TransferRecord> selectTransferRecordList(TransferRecord transferRecord) {
		return transferRecordService.selectTransferRecordList(transferRecord);
	}

	/**
	* 新增transfer
	*
	* @param transferRecord transfer
	* @return 结果
	*/
	@Override
	public int insertTransferRecord(TransferRecord transferRecord) {
		return transferRecordService.insertTransferRecord(transferRecord);
	}

	/**
	* 修改transfer
	*
	* @param transferRecord transfer
	* @return 结果
	*/
	@Override
	public int updateTransferRecord(TransferRecord transferRecord) {
		return transferRecordService.updateTransferRecord(transferRecord);
	}

	/**
	* 批量删除transfer
	*
	* @param ids 需要删除的transferID
	* @return 结果
	*/
	@Override
	public int deleteTransferRecordByIds(Long[] ids) {
		return transferRecordService.deleteTransferRecordByIds(ids);
	}

	/**
	* 删除transfer信息
	*
	* @param id transferID
	* @return 结果
	*/
	@Override
	public int deleteTransferRecordById(Long id) {
		return transferRecordService.deleteTransferRecordById(id);
	}

}
