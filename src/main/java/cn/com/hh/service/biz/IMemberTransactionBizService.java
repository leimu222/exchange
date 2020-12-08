package com.common.api.service;

import java.util.List;

import com.common.api.model.memberTransaction;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [memberBiz服务]
 */
public interface IMemberTransactionBizService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberTransaction selectMemberTransactionById(Long id);

	/**
	* 查询member列表
	*
	* @param memberTransaction member
	* @return member集合
	*/
	public List<MemberTransaction> selectMemberTransactionList(MemberTransaction memberTransaction);

	/**
	* 新增member
	*
	* @param memberTransaction member
	* @return 结果
	*/
	public int insertMemberTransaction(MemberTransaction memberTransaction);

	/**
	* 修改member
	*
	* @param memberTransaction member
	* @return 结果
	*/
	public int updateMemberTransaction(MemberTransaction memberTransaction);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberTransactionByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberTransactionById(Long id);
	
}
