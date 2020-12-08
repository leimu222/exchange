package com.common.api.mapper;

import com.common.api.model.ContractExchangeOrderConditionRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractExchangeOrderConditionRecordMapper{

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
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderConditionRecordById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractExchangeOrderConditionRecordByIds(Long[] ids);

}
