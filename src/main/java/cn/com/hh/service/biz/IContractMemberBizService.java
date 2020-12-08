package com.common.api.service;

import java.util.List;

import com.common.api.model.contractMember;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contractBiz服务]
 */
public interface IContractMemberBizService {

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
	* 批量删除contract
	*
	* @param memberIds 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractMemberByIds(Long[] memberIds);

	/**
	* 删除contract信息
	*
	* @param memberId contractID
	* @return 结果
	*/
	public int deleteContractMemberById(Long memberId);
	
}
