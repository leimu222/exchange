package com.common.api.service;

import java.util.List;

import com.common.api.model.contractExchangeOrderConditionRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contractBiz服务]
 */
public interface IContractExchangeOrderConditionRecordBizService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractExchangeOrderConditionRecord selectContractExchangeOrderConditionRecordById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrderConditionRecord contract
	* @return contract集合
	*/
	public List<ContractExchangeOrderConditionRecord> selectContractExchangeOrderConditionRecordList(ContractExchangeOrderConditionRecord contractExchangeOrderConditionRecord);

	/**
	* 新增contract
	*
	* @param contractExchangeOrderConditionRecord contract
	* @return 结果
	*/
	public int insertContractExchangeOrderConditionRecord(ContractExchangeOrderConditionRecord contractExchangeOrderConditionRecord);

	/**
	* 修改contract
	*
	* @param contractExchangeOrderConditionRecord contract
	* @return 结果
	*/
	public int updateContractExchangeOrderConditionRecord(ContractExchangeOrderConditionRecord contractExchangeOrderConditionRecord);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderConditionRecordByIds(Long[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderConditionRecordById(Long id);
	
}
