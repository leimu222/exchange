package com.common.api.mapper;

import com.common.api.model.ContractMemberStatusRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractMemberStatusRecordMapper{

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
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractMemberStatusRecordById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractMemberStatusRecordByIds(Long[] ids);

}
