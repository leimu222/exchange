package com.common.api.mapper;

import com.common.api.model.ContractWalletTransferRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [contract服务实现]
 */
public interface ContractWalletTransferRecordMapper{

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
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractWalletTransferRecordById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractWalletTransferRecordByIds(Long[] ids);

}
