package com.common.api.mapper;

import com.common.api.model.ContractWalletExplodeRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [contract服务实现]
 */
public interface ContractWalletExplodeRecordMapper{

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
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractWalletExplodeRecordById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractWalletExplodeRecordByIds(Long[] ids);

}
