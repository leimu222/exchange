package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberTransactionMapper;
import com.common.api.model.MemberTransaction;
import com.common.api.service.IMemberTransactionService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [member服务实现]
 */
@Service
public class MemberTransactionServiceImpl implements IMemberTransactionService {
	@Autowired
	private MemberTransactionMapper memberTransactionMapper;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberTransaction selectMemberTransactionById(Long id) {
		return memberTransactionMapper.selectMemberTransactionById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberTransaction member
	* @return member
	*/
	@Override
	public List<MemberTransaction> selectMemberTransactionList(MemberTransaction memberTransaction) {
		return memberTransactionMapper.selectMemberTransactionList(memberTransaction);
	}

	/**
	* 新增member
	*
	* @param memberTransaction member
	* @return 结果
	*/
	@Override
	public int insertMemberTransaction(MemberTransaction memberTransaction) {
		return memberTransactionMapper.insertMemberTransaction(memberTransaction);
	}

	/**
	* 修改member
	*
	* @param memberTransaction member
	* @return 结果
	*/
	@Override
	public int updateMemberTransaction(MemberTransaction memberTransaction) {
		return memberTransactionMapper.updateMemberTransaction(memberTransaction);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberTransactionByIds(Long[] ids) {
		return memberTransactionMapper.deleteMemberTransactionByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberTransactionById(Long id) {
		return memberTransactionMapper.deleteMemberTransactionById(id);
	}

}
