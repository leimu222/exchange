package com.common.api.mapper;

import com.common.api.model.ContractMember;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractMemberMapper{

	/**
	* 查询contract
	*
	* @param memberId contractID
	* @return contract
	*/
	public ContractMember selectContractMemberById(Long memberId);

	/**
	* 查询contract列表
	*
	* @param contractMember contract
	* @return contract集合
	*/
	public List<ContractMember> selectContractMemberList(ContractMember contractMember);

	/**
	* 新增contract
	*
	* @param contractMember contract
	* @return 结果
	*/
	public int insertContractMember(ContractMember contractMember);

	/**
	* 修改contract
	*
	* @param contractMember contract
	* @return 结果
	*/
	public int updateContractMember(ContractMember contractMember);

	/**
	* 删除contract
	*
	* @param memberId contractID
	* @return 结果
	*/
	public int deleteContractMemberById(Long memberId);

	/**
	* 批量删除contract
	*
	* @param memberIds 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractMemberByIds(Long[] memberIds);

}
