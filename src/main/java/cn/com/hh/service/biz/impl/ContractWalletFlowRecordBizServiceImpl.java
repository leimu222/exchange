package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractWalletFlowRecordMapper;
import com.common.api.model.ContractWalletFlowRecord;
import com.common.api.service.IContractWalletFlowRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [contractBiz服务实现]
 */
@Service
public class ContractWalletFlowRecordBizServiceImpl extends CommonService implements IContractWalletFlowRecordBizService {
	@Autowired
	private IContractWalletFlowRecordService contractWalletFlowRecordService;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractWalletFlowRecord selectContractWalletFlowRecordById(Long id) {
		return contractWalletFlowRecordService.selectContractWalletFlowRecordById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractWalletFlowRecord contract
	* @return contract
	*/
	@Override
	public List<ContractWalletFlowRecord> selectContractWalletFlowRecordList(ContractWalletFlowRecord contractWalletFlowRecord) {
		return contractWalletFlowRecordService.selectContractWalletFlowRecordList(contractWalletFlowRecord);
	}

	/**
	* 新增contract
	*
	* @param contractWalletFlowRecord contract
	* @return 结果
	*/
	@Override
	public int insertContractWalletFlowRecord(ContractWalletFlowRecord contractWalletFlowRecord) {
		return contractWalletFlowRecordService.insertContractWalletFlowRecord(contractWalletFlowRecord);
	}

	/**
	* 修改contract
	*
	* @param contractWalletFlowRecord contract
	* @return 结果
	*/
	@Override
	public int updateContractWalletFlowRecord(ContractWalletFlowRecord contractWalletFlowRecord) {
		return contractWalletFlowRecordService.updateContractWalletFlowRecord(contractWalletFlowRecord);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractWalletFlowRecordByIds(Long[] ids) {
		return contractWalletFlowRecordService.deleteContractWalletFlowRecordByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractWalletFlowRecordById(Long id) {
		return contractWalletFlowRecordService.deleteContractWalletFlowRecordById(id);
	}

}
