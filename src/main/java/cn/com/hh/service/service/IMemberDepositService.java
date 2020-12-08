package com.common.api.service;

import java.util.List;

import com.common.api.model.memberDeposit;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [member服务]
 */
public interface IMemberDepositService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberDeposit selectMemberDepositById(Long id);

	/**
	* 查询member列表
	*
	* @param memberDeposit member
	* @return member集合
	*/
	public List<MemberDeposit> selectMemberDepositList(MemberDeposit memberDeposit);

	/**
	* 新增member
	*
	* @param memberDeposit member
	* @return 结果
	*/
	public int insertMemberDeposit(MemberDeposit memberDeposit);

	/**
	* 修改member
	*
	* @param memberDeposit member
	* @return 结果
	*/
	public int updateMemberDeposit(MemberDeposit memberDeposit);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberDepositByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberDepositById(Long id);
	
}
