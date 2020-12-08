package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractWalletTransferRecordMapper;
import com.common.api.model.ContractWalletTransferRecord;
import com.common.api.service.IContractWalletTransferRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [contract服务实现]
 */
@Service
public class ContractWalletTransferRecordServiceImpl implements IContractWalletTransferRecordService {
	@Autowired
	private ContractWalletTransferRecordMapper contractWalletTransferRecordMapper;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractWalletTransferRecord selectContractWalletTransferRecordById(Long id) {
		return contractWalletTransferRecordMapper.selectContractWalletTransferRecordById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractWalletTransferRecord contract
	* @return contract
	*/
	@Override
	public List<ContractWalletTransferRecord> selectContractWalletTransferRecordList(ContractWalletTransferRecord contractWalletTransferRecord) {
		return contractWalletTransferRecordMapper.selectContractWalletTransferRecordList(contractWalletTransferRecord);
	}

	/**
	* 新增contract
	*
	* @param contractWalletTransferRecord contract
	* @return 结果
	*/
	@Override
	public int insertContractWalletTransferRecord(ContractWalletTransferRecord contractWalletTransferRecord) {
		return contractWalletTransferRecordMapper.insertContractWalletTransferRecord(contractWalletTransferRecord);
	}

	/**
	* 修改contract
	*
	* @param contractWalletTransferRecord contract
	* @return 结果
	*/
	@Override
	public int updateContractWalletTransferRecord(ContractWalletTransferRecord contractWalletTransferRecord) {
		return contractWalletTransferRecordMapper.updateContractWalletTransferRecord(contractWalletTransferRecord);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractWalletTransferRecordByIds(Long[] ids) {
		return contractWalletTransferRecordMapper.deleteContractWalletTransferRecordByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractWalletTransferRecordById(Long id) {
		return contractWalletTransferRecordMapper.deleteContractWalletTransferRecordById(id);
	}

}
