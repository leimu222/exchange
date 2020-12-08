package com.common.api.mapper;

import com.common.api.model.ContractWalletFlowRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [contract服务实现]
 */
public interface ContractWalletFlowRecordMapper{

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
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractWalletFlowRecordById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractWalletFlowRecordByIds(Long[] ids);

}
