package com.common.api.mapper;

import com.common.api.model.ContractMemberTransferRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractMemberTransferRecordMapper{

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
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractMemberTransferRecordById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractMemberTransferRecordByIds(Long[] ids);

}
