package com.common.api.service;

import java.util.List;

import com.common.api.model.contractWalletExplodeRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [contractBiz服务]
 */
public interface IContractWalletExplodeRecordBizService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractWalletExplodeRecord selectContractWalletExplodeRecordById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractWalletExplodeRecord contract
	* @return contract集合
	*/
	public List<ContractWalletExplodeRecord> selectContractWalletExplodeRecordList(ContractWalletExplodeRecord contractWalletExplodeRecord);

	/**
	* 新增contract
	*
	* @param contractWalletExplodeRecord contract
	* @return 结果
	*/
	public int insertContractWalletExplodeRecord(ContractWalletExplodeRecord contractWalletExplodeRecord);

	/**
	* 修改contract
	*
	* @param contractWalletExplodeRecord contract
	* @return 结果
	*/
	public int updateContractWalletExplodeRecord(ContractWalletExplodeRecord contractWalletExplodeRecord);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractWalletExplodeRecordByIds(Long[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractWalletExplodeRecordById(Long id);
	
}
