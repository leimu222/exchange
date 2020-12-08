package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberConvertTransactionMapper;
import com.common.api.model.MemberConvertTransaction;
import com.common.api.service.IMemberConvertTransactionService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [member服务实现]
 */
@Service
public class MemberConvertTransactionServiceImpl implements IMemberConvertTransactionService {
	@Autowired
	private MemberConvertTransactionMapper memberConvertTransactionMapper;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberConvertTransaction selectMemberConvertTransactionById(Integer id) {
		return memberConvertTransactionMapper.selectMemberConvertTransactionById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberConvertTransaction member
	* @return member
	*/
	@Override
	public List<MemberConvertTransaction> selectMemberConvertTransactionList(MemberConvertTransaction memberConvertTransaction) {
		return memberConvertTransactionMapper.selectMemberConvertTransactionList(memberConvertTransaction);
	}

	/**
	* 新增member
	*
	* @param memberConvertTransaction member
	* @return 结果
	*/
	@Override
	public int insertMemberConvertTransaction(MemberConvertTransaction memberConvertTransaction) {
		return memberConvertTransactionMapper.insertMemberConvertTransaction(memberConvertTransaction);
	}

	/**
	* 修改member
	*
	* @param memberConvertTransaction member
	* @return 结果
	*/
	@Override
	public int updateMemberConvertTransaction(MemberConvertTransaction memberConvertTransaction) {
		return memberConvertTransactionMapper.updateMemberConvertTransaction(memberConvertTransaction);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberConvertTransactionByIds(Integer[] ids) {
		return memberConvertTransactionMapper.deleteMemberConvertTransactionByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberConvertTransactionById(Integer id) {
		return memberConvertTransactionMapper.deleteMemberConvertTransactionById(id);
	}

}
