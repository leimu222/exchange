package com.common.api.service;

import java.util.List;

import com.common.api.model.contractWalletTransferRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [contract服务]
 */
public interface IContractWalletTransferRecordService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractWalletTransferRecord selectContractWalletTransferRecordById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractWalletTransferRecord contract
	* @return contract集合
	*/
	public List<ContractWalletTransferRecord> selectContractWalletTransferRecordList(ContractWalletTransferRecord contractWalletTransferRecord);

	/**
	* 新增contract
	*
	* @param contractWalletTransferRecord contract
	* @return 结果
	*/
	public int insertContractWalletTransferRecord(ContractWalletTransferRecord contractWalletTransferRecord);

	/**
	* 修改contract
	*
	* @param contractWalletTransferRecord contract
	* @return 结果
	*/
	public int updateContractWalletTransferRecord(ContractWalletTransferRecord contractWalletTransferRecord);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractWalletTransferRecordByIds(Long[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractWalletTransferRecordById(Long id);
	
}
