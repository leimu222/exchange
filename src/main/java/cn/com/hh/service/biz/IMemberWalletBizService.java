package com.common.api.service;

import java.util.List;

import com.common.api.model.memberWallet;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [memberBiz服务]
 */
public interface IMemberWalletBizService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberWallet selectMemberWalletById(Long id);

	/**
	* 查询member列表
	*
	* @param memberWallet member
	* @return member集合
	*/
	public List<MemberWallet> selectMemberWalletList(MemberWallet memberWallet);

	/**
	* 新增member
	*
	* @param memberWallet member
	* @return 结果
	*/
	public int insertMemberWallet(MemberWallet memberWallet);

	/**
	* 修改member
	*
	* @param memberWallet member
	* @return 结果
	*/
	public int updateMemberWallet(MemberWallet memberWallet);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberWalletByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberWalletById(Long id);
	
}
