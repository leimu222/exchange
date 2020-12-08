package com.common.api.service;

import java.util.List;

import com.common.api.model.contractWalletFrozenFlowRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [contract服务]
 */
public interface IContractWalletFrozenFlowRecordService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractWalletFrozenFlowRecord selectContractWalletFrozenFlowRecordById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractWalletFrozenFlowRecord contract
	* @return contract集合
	*/
	public List<ContractWalletFrozenFlowRecord> selectContractWalletFrozenFlowRecordList(ContractWalletFrozenFlowRecord contractWalletFrozenFlowRecord);

	/**
	* 新增contract
	*
	* @param contractWalletFrozenFlowRecord contract
	* @return 结果
	*/
	public int insertContractWalletFrozenFlowRecord(ContractWalletFrozenFlowRecord contractWalletFrozenFlowRecord);

	/**
	* 修改contract
	*
	* @param contractWalletFrozenFlowRecord contract
	* @return 结果
	*/
	public int updateContractWalletFrozenFlowRecord(ContractWalletFrozenFlowRecord contractWalletFrozenFlowRecord);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractWalletFrozenFlowRecordByIds(Long[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractWalletFrozenFlowRecordById(Long id);
	
}
