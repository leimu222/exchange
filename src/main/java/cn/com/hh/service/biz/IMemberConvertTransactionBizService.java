package com.common.api.service;

import java.util.List;

import com.common.api.model.memberConvertTransaction;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [memberBiz服务]
 */
public interface IMemberConvertTransactionBizService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberConvertTransaction selectMemberConvertTransactionById(Integer id);

	/**
	* 查询member列表
	*
	* @param memberConvertTransaction member
	* @return member集合
	*/
	public List<MemberConvertTransaction> selectMemberConvertTransactionList(MemberConvertTransaction memberConvertTransaction);

	/**
	* 新增member
	*
	* @param memberConvertTransaction member
	* @return 结果
	*/
	public int insertMemberConvertTransaction(MemberConvertTransaction memberConvertTransaction);

	/**
	* 修改member
	*
	* @param memberConvertTransaction member
	* @return 结果
	*/
	public int updateMemberConvertTransaction(MemberConvertTransaction memberConvertTransaction);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberConvertTransactionByIds(Integer[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberConvertTransactionById(Integer id);
	
}
