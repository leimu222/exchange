package com.common.api.service;

import java.util.List;

import com.common.api.model.memberRechargeFromWallet;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [member服务]
 */
public interface IMemberRechargeFromWalletService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberRechargeFromWallet selectMemberRechargeFromWalletById(Long id);

	/**
	* 查询member列表
	*
	* @param memberRechargeFromWallet member
	* @return member集合
	*/
	public List<MemberRechargeFromWallet> selectMemberRechargeFromWalletList(MemberRechargeFromWallet memberRechargeFromWallet);

	/**
	* 新增member
	*
	* @param memberRechargeFromWallet member
	* @return 结果
	*/
	public int insertMemberRechargeFromWallet(MemberRechargeFromWallet memberRechargeFromWallet);

	/**
	* 修改member
	*
	* @param memberRechargeFromWallet member
	* @return 结果
	*/
	public int updateMemberRechargeFromWallet(MemberRechargeFromWallet memberRechargeFromWallet);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberRechargeFromWalletByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberRechargeFromWalletById(Long id);
	
}
