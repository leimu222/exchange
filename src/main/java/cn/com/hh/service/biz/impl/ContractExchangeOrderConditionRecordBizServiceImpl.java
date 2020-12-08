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
 * Description: [contractBiz服务实现]
 */
@Service
public class ContractExchangeOrderConditionRecordBizServiceImpl extends CommonService implements IContractExchangeOrderConditionRecordBizService {
	@Autowired
	private IContractExchangeOrderConditionRecordService contractExchangeOrderConditionRecordService;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractExchangeOrderConditionRecord selectContractExchangeOrderConditionRecordById(Long id) {
		return contractExchangeOrderConditionRecordService.selectContractExchangeOrderConditionRecordById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrderConditionRecord contract
	* @return contract
	*/
	@Override
	public List<ContractExchangeOrderConditionRecord> selectContractExchangeOrderConditionRecordList(ContractExchangeOrderConditionRecord contractExchangeOrderConditionRecord) {
		return contractExchangeOrderConditionRecordService.selectContractExchangeOrderConditionRecordList(contractExchangeOrderConditionRecord);
	}

	/**
	* 新增contract
	*
	* @param contractExchangeOrderConditionRecord contract
	* @return 结果
	*/
	@Override
	public int insertContractExchangeOrderConditionRecord(ContractExchangeOrderConditionRecord contractExchangeOrderConditionRecord) {
		return contractExchangeOrderConditionRecordService.insertContractExchangeOrderConditionRecord(contractExchangeOrderConditionRecord);
	}

	/**
	* 修改contract
	*
	* @param contractExchangeOrderConditionRecord contract
	* @return 结果
	*/
	@Override
	public int updateContractExchangeOrderConditionRecord(ContractExchangeOrderConditionRecord contractExchangeOrderConditionRecord) {
		return contractExchangeOrderConditionRecordService.updateContractExchangeOrderConditionRecord(contractExchangeOrderConditionRecord);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractExchangeOrderConditionRecordByIds(Long[] ids) {
		return contractExchangeOrderConditionRecordService.deleteContractExchangeOrderConditionRecordByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractExchangeOrderConditionRecordById(Long id) {
		return contractExchangeOrderConditionRecordService.deleteContractExchangeOrderConditionRecordById(id);
	}

}
