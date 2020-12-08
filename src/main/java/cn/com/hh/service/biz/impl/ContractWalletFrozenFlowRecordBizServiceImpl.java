package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractWalletFrozenFlowRecordMapper;
import com.common.api.model.ContractWalletFrozenFlowRecord;
import com.common.api.service.IContractWalletFrozenFlowRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [contractBiz服务实现]
 */
@Service
public class ContractWalletFrozenFlowRecordBizServiceImpl extends CommonService implements IContractWalletFrozenFlowRecordBizService {
	@Autowired
	private IContractWalletFrozenFlowRecordService contractWalletFrozenFlowRecordService;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractWalletFrozenFlowRecord selectContractWalletFrozenFlowRecordById(Long id) {
		return contractWalletFrozenFlowRecordService.selectContractWalletFrozenFlowRecordById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractWalletFrozenFlowRecord contract
	* @return contract
	*/
	@Override
	public List<ContractWalletFrozenFlowRecord> selectContractWalletFrozenFlowRecordList(ContractWalletFrozenFlowRecord contractWalletFrozenFlowRecord) {
		return contractWalletFrozenFlowRecordService.selectContractWalletFrozenFlowRecordList(contractWalletFrozenFlowRecord);
	}

	/**
	* 新增contract
	*
	* @param contractWalletFrozenFlowRecord contract
	* @return 结果
	*/
	@Override
	public int insertContractWalletFrozenFlowRecord(ContractWalletFrozenFlowRecord contractWalletFrozenFlowRecord) {
		return contractWalletFrozenFlowRecordService.insertContractWalletFrozenFlowRecord(contractWalletFrozenFlowRecord);
	}

	/**
	* 修改contract
	*
	* @param contractWalletFrozenFlowRecord contract
	* @return 结果
	*/
	@Override
	public int updateContractWalletFrozenFlowRecord(ContractWalletFrozenFlowRecord contractWalletFrozenFlowRecord) {
		return contractWalletFrozenFlowRecordService.updateContractWalletFrozenFlowRecord(contractWalletFrozenFlowRecord);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractWalletFrozenFlowRecordByIds(Long[] ids) {
		return contractWalletFrozenFlowRecordService.deleteContractWalletFrozenFlowRecordByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractWalletFrozenFlowRecordById(Long id) {
		return contractWalletFrozenFlowRecordService.deleteContractWalletFrozenFlowRecordById(id);
	}

}
