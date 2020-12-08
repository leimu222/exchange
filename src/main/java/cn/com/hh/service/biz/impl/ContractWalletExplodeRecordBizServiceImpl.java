package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractWalletExplodeRecordMapper;
import com.common.api.model.ContractWalletExplodeRecord;
import com.common.api.service.IContractWalletExplodeRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [contractBiz服务实现]
 */
@Service
public class ContractWalletExplodeRecordBizServiceImpl extends CommonService implements IContractWalletExplodeRecordBizService {
	@Autowired
	private IContractWalletExplodeRecordService contractWalletExplodeRecordService;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractWalletExplodeRecord selectContractWalletExplodeRecordById(Long id) {
		return contractWalletExplodeRecordService.selectContractWalletExplodeRecordById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractWalletExplodeRecord contract
	* @return contract
	*/
	@Override
	public List<ContractWalletExplodeRecord> selectContractWalletExplodeRecordList(ContractWalletExplodeRecord contractWalletExplodeRecord) {
		return contractWalletExplodeRecordService.selectContractWalletExplodeRecordList(contractWalletExplodeRecord);
	}

	/**
	* 新增contract
	*
	* @param contractWalletExplodeRecord contract
	* @return 结果
	*/
	@Override
	public int insertContractWalletExplodeRecord(ContractWalletExplodeRecord contractWalletExplodeRecord) {
		return contractWalletExplodeRecordService.insertContractWalletExplodeRecord(contractWalletExplodeRecord);
	}

	/**
	* 修改contract
	*
	* @param contractWalletExplodeRecord contract
	* @return 结果
	*/
	@Override
	public int updateContractWalletExplodeRecord(ContractWalletExplodeRecord contractWalletExplodeRecord) {
		return contractWalletExplodeRecordService.updateContractWalletExplodeRecord(contractWalletExplodeRecord);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractWalletExplodeRecordByIds(Long[] ids) {
		return contractWalletExplodeRecordService.deleteContractWalletExplodeRecordByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractWalletExplodeRecordById(Long id) {
		return contractWalletExplodeRecordService.deleteContractWalletExplodeRecordById(id);
	}

}
