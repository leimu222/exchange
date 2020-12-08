package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberDepositMapper;
import com.common.api.model.MemberDeposit;
import com.common.api.service.IMemberDepositService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [member服务实现]
 */
@Service
public class MemberDepositServiceImpl implements IMemberDepositService {
	@Autowired
	private MemberDepositMapper memberDepositMapper;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberDeposit selectMemberDepositById(Long id) {
		return memberDepositMapper.selectMemberDepositById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberDeposit member
	* @return member
	*/
	@Override
	public List<MemberDeposit> selectMemberDepositList(MemberDeposit memberDeposit) {
		return memberDepositMapper.selectMemberDepositList(memberDeposit);
	}

	/**
	* 新增member
	*
	* @param memberDeposit member
	* @return 结果
	*/
	@Override
	public int insertMemberDeposit(MemberDeposit memberDeposit) {
		return memberDepositMapper.insertMemberDeposit(memberDeposit);
	}

	/**
	* 修改member
	*
	* @param memberDeposit member
	* @return 结果
	*/
	@Override
	public int updateMemberDeposit(MemberDeposit memberDeposit) {
		return memberDepositMapper.updateMemberDeposit(memberDeposit);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberDepositByIds(Long[] ids) {
		return memberDepositMapper.deleteMemberDepositByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberDepositById(Long id) {
		return memberDepositMapper.deleteMemberDepositById(id);
	}

}
