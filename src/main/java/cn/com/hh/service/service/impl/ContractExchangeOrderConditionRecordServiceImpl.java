package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractExchangeOrderConditionRecordMapper;
import com.common.api.model.ContractExchangeOrderConditionRecord;
import com.common.api.service.IContractExchangeOrderConditionRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractExchangeOrderConditionRecordServiceImpl implements IContractExchangeOrderConditionRecordService {
	@Autowired
	private ContractExchangeOrderConditionRecordMapper contractExchangeOrderConditionRecordMapper;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractExchangeOrderConditionRecord selectContractExchangeOrderConditionRecordById(Long id) {
		return contractExchangeOrderConditionRecordMapper.selectContractExchangeOrderConditionRecordById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrderConditionRecord contract
	* @return contract
	*/
	@Override
	public List<ContractExchangeOrderConditionRecord> selectContractExchangeOrderConditionRecordList(ContractExchangeOrderConditionRecord contractExchangeOrderConditionRecord) {
		return contractExchangeOrderConditionRecordMapper.selectContractExchangeOrderConditionRecordList(contractExchangeOrderConditionRecord);
	}

	/**
	* 新增contract
	*
	* @param contractExchangeOrderConditionRecord contract
	* @return 结果
	*/
	@Override
	public int insertContractExchangeOrderConditionRecord(ContractExchangeOrderConditionRecord contractExchangeOrderConditionRecord) {
		return contractExchangeOrderConditionRecordMapper.insertContractExchangeOrderConditionRecord(contractExchangeOrderConditionRecord);
	}

	/**
	* 修改contract
	*
	* @param contractExchangeOrderConditionRecord contract
	* @return 结果
	*/
	@Override
	public int updateContractExchangeOrderConditionRecord(ContractExchangeOrderConditionRecord contractExchangeOrderConditionRecord) {
		return contractExchangeOrderConditionRecordMapper.updateContractExchangeOrderConditionRecord(contractExchangeOrderConditionRecord);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractExchangeOrderConditionRecordByIds(Long[] ids) {
		return contractExchangeOrderConditionRecordMapper.deleteContractExchangeOrderConditionRecordByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractExchangeOrderConditionRecordById(Long id) {
		return contractExchangeOrderConditionRecordMapper.deleteContractExchangeOrderConditionRecordById(id);
	}

}
