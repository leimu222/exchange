package com.common.api.mapper;

import com.common.api.model.ContractWalletFrozenFlowRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [contract服务实现]
 */
public interface ContractWalletFrozenFlowRecordMapper{

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
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractWalletFrozenFlowRecordById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractWalletFrozenFlowRecordByIds(Long[] ids);

}
