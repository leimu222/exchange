package com.common.api.service;

import java.util.List;

import com.common.api.model.memberWalletHistory;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [member服务]
 */
public interface IMemberWalletHistoryService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberWalletHistory selectMemberWalletHistoryById(Long id);

	/**
	* 查询member列表
	*
	* @param memberWalletHistory member
	* @return member集合
	*/
	public List<MemberWalletHistory> selectMemberWalletHistoryList(MemberWalletHistory memberWalletHistory);

	/**
	* 新增member
	*
	* @param memberWalletHistory member
	* @return 结果
	*/
	public int insertMemberWalletHistory(MemberWalletHistory memberWalletHistory);

	/**
	* 修改member
	*
	* @param memberWalletHistory member
	* @return 结果
	*/
	public int updateMemberWalletHistory(MemberWalletHistory memberWalletHistory);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberWalletHistoryByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberWalletHistoryById(Long id);
	
}
