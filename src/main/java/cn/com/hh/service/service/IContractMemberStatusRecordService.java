package com.common.api.service;

import java.util.List;

import com.common.api.model.contractMemberStatusRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contract服务]
 */
public interface IContractMemberStatusRecordService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractMemberStatusRecord selectContractMemberStatusRecordById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractMemberStatusRecord contract
	* @return contract集合
	*/
	public List<ContractMemberStatusRecord> selectContractMemberStatusRecordList(ContractMemberStatusRecord contractMemberStatusRecord);

	/**
	* 新增contract
	*
	* @param contractMemberStatusRecord contract
	* @return 结果
	*/
	public int insertContractMemberStatusRecord(ContractMemberStatusRecord contractMemberStatusRecord);

	/**
	* 修改contract
	*
	* @param contractMemberStatusRecord contract
	* @return 结果
	*/
	public int updateContractMemberStatusRecord(ContractMemberStatusRecord contractMemberStatusRecord);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractMemberStatusRecordByIds(Long[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractMemberStatusRecordById(Long id);
	
}
