package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberRechargeFromWalletMapper;
import com.common.api.model.MemberRechargeFromWallet;
import com.common.api.service.IMemberRechargeFromWalletService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [member服务实现]
 */
@Service
public class MemberRechargeFromWalletServiceImpl implements IMemberRechargeFromWalletService {
	@Autowired
	private MemberRechargeFromWalletMapper memberRechargeFromWalletMapper;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberRechargeFromWallet selectMemberRechargeFromWalletById(Long id) {
		return memberRechargeFromWalletMapper.selectMemberRechargeFromWalletById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberRechargeFromWallet member
	* @return member
	*/
	@Override
	public List<MemberRechargeFromWallet> selectMemberRechargeFromWalletList(MemberRechargeFromWallet memberRechargeFromWallet) {
		return memberRechargeFromWalletMapper.selectMemberRechargeFromWalletList(memberRechargeFromWallet);
	}

	/**
	* 新增member
	*
	* @param memberRechargeFromWallet member
	* @return 结果
	*/
	@Override
	public int insertMemberRechargeFromWallet(MemberRechargeFromWallet memberRechargeFromWallet) {
		return memberRechargeFromWalletMapper.insertMemberRechargeFromWallet(memberRechargeFromWallet);
	}

	/**
	* 修改member
	*
	* @param memberRechargeFromWallet member
	* @return 结果
	*/
	@Override
	public int updateMemberRechargeFromWallet(MemberRechargeFromWallet memberRechargeFromWallet) {
		return memberRechargeFromWalletMapper.updateMemberRechargeFromWallet(memberRechargeFromWallet);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberRechargeFromWalletByIds(Long[] ids) {
		return memberRechargeFromWalletMapper.deleteMemberRechargeFromWalletByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberRechargeFromWalletById(Long id) {
		return memberRechargeFromWalletMapper.deleteMemberRechargeFromWalletById(id);
	}

}
