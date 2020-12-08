package com.common.api.service;

import java.util.List;

import com.common.api.model.contractWalletFlowRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [contractBiz服务]
 */
public interface IContractWalletFlowRecordBizService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractWalletFlowRecord selectContractWalletFlowRecordById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractWalletFlowRecord contract
	* @return contract集合
	*/
	public List<ContractWalletFlowRecord> selectContractWalletFlowRecordList(ContractWalletFlowRecord contractWalletFlowRecord);

	/**
	* 新增contract
	*
	* @param contractWalletFlowRecord contract
	* @return 结果
	*/
	public int insertContractWalletFlowRecord(ContractWalletFlowRecord contractWalletFlowRecord);

	/**
	* 修改contract
	*
	* @param contractWalletFlowRecord contract
	* @return 结果
	*/
	public int updateContractWalletFlowRecord(ContractWalletFlowRecord contractWalletFlowRecord);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractWalletFlowRecordByIds(Long[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractWalletFlowRecordById(Long id);
	
}
