package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberWalletMapper;
import com.common.api.model.MemberWallet;
import com.common.api.service.IMemberWalletService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [member服务实现]
 */
@Service
public class MemberWalletServiceImpl implements IMemberWalletService {
	@Autowired
	private MemberWalletMapper memberWalletMapper;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberWallet selectMemberWalletById(Long id) {
		return memberWalletMapper.selectMemberWalletById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberWallet member
	* @return member
	*/
	@Override
	public List<MemberWallet> selectMemberWalletList(MemberWallet memberWallet) {
		return memberWalletMapper.selectMemberWalletList(memberWallet);
	}

	/**
	* 新增member
	*
	* @param memberWallet member
	* @return 结果
	*/
	@Override
	public int insertMemberWallet(MemberWallet memberWallet) {
		return memberWalletMapper.insertMemberWallet(memberWallet);
	}

	/**
	* 修改member
	*
	* @param memberWallet member
	* @return 结果
	*/
	@Override
	public int updateMemberWallet(MemberWallet memberWallet) {
		return memberWalletMapper.updateMemberWallet(memberWallet);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberWalletByIds(Long[] ids) {
		return memberWalletMapper.deleteMemberWalletByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberWalletById(Long id) {
		return memberWalletMapper.deleteMemberWalletById(id);
	}

}
