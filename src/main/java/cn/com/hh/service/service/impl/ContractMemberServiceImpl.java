package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractMemberMapper;
import com.common.api.model.ContractMember;
import com.common.api.service.IContractMemberService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractMemberServiceImpl implements IContractMemberService {
	@Autowired
	private ContractMemberMapper contractMemberMapper;

	/**
	* 查询contract
	*
	* @param memberId contractID
	* @return contract
	*/
	@Override
	public ContractMember selectContractMemberById(Long memberId) {
		return contractMemberMapper.selectContractMemberById(memberId);
	}

	/**
	* 查询contract列表
	*
	* @param contractMember contract
	* @return contract
	*/
	@Override
	public List<ContractMember> selectContractMemberList(ContractMember contractMember) {
		return contractMemberMapper.selectContractMemberList(contractMember);
	}

	/**
	* 新增contract
	*
	* @param contractMember contract
	* @return 结果
	*/
	@Override
	public int insertContractMember(ContractMember contractMember) {
		return contractMemberMapper.insertContractMember(contractMember);
	}

	/**
	* 修改contract
	*
	* @param contractMember contract
	* @return 结果
	*/
	@Override
	public int updateContractMember(ContractMember contractMember) {
		return contractMemberMapper.updateContractMember(contractMember);
	}

	/**
	* 批量删除contract
	*
	* @param memberIds 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractMemberByIds(Long[] memberIds) {
		return contractMemberMapper.deleteContractMemberByIds(memberIds);
	}

	/**
	* 删除contract信息
	*
	* @param memberId contractID
	* @return 结果
	*/
	@Override
	public int deleteContractMemberById(Long memberId) {
		return contractMemberMapper.deleteContractMemberById(memberId);
	}

}
