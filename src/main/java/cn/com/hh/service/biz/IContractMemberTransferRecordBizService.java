package com.common.api.service;

import java.util.List;

import com.common.api.model.contractMemberTransferRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contractBiz服务]
 */
public interface IContractMemberTransferRecordBizService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractMemberTransferRecord selectContractMemberTransferRecordById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractMemberTransferRecord contract
	* @return contract集合
	*/
	public List<ContractMemberTransferRecord> selectContractMemberTransferRecordList(ContractMemberTransferRecord contractMemberTransferRecord);

	/**
	* 新增contract
	*
	* @param contractMemberTransferRecord contract
	* @return 结果
	*/
	public int insertContractMemberTransferRecord(ContractMemberTransferRecord contractMemberTransferRecord);

	/**
	* 修改contract
	*
	* @param contractMemberTransferRecord contract
	* @return 结果
	*/
	public int updateContractMemberTransferRecord(ContractMemberTransferRecord contractMemberTransferRecord);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractMemberTransferRecordByIds(Long[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractMemberTransferRecordById(Long id);
	
}
