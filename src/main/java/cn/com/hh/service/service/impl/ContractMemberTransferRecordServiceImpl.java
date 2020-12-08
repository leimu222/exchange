package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractMemberTransferRecordMapper;
import com.common.api.model.ContractMemberTransferRecord;
import com.common.api.service.IContractMemberTransferRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractMemberTransferRecordServiceImpl implements IContractMemberTransferRecordService {
	@Autowired
	private ContractMemberTransferRecordMapper contractMemberTransferRecordMapper;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractMemberTransferRecord selectContractMemberTransferRecordById(Long id) {
		return contractMemberTransferRecordMapper.selectContractMemberTransferRecordById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractMemberTransferRecord contract
	* @return contract
	*/
	@Override
	public List<ContractMemberTransferRecord> selectContractMemberTransferRecordList(ContractMemberTransferRecord contractMemberTransferRecord) {
		return contractMemberTransferRecordMapper.selectContractMemberTransferRecordList(contractMemberTransferRecord);
	}

	/**
	* 新增contract
	*
	* @param contractMemberTransferRecord contract
	* @return 结果
	*/
	@Override
	public int insertContractMemberTransferRecord(ContractMemberTransferRecord contractMemberTransferRecord) {
		return contractMemberTransferRecordMapper.insertContractMemberTransferRecord(contractMemberTransferRecord);
	}

	/**
	* 修改contract
	*
	* @param contractMemberTransferRecord contract
	* @return 结果
	*/
	@Override
	public int updateContractMemberTransferRecord(ContractMemberTransferRecord contractMemberTransferRecord) {
		return contractMemberTransferRecordMapper.updateContractMemberTransferRecord(contractMemberTransferRecord);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractMemberTransferRecordByIds(Long[] ids) {
		return contractMemberTransferRecordMapper.deleteContractMemberTransferRecordByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractMemberTransferRecordById(Long id) {
		return contractMemberTransferRecordMapper.deleteContractMemberTransferRecordById(id);
	}

}
