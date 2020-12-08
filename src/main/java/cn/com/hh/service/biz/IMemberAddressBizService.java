package com.common.api.service;

import java.util.List;

import com.common.api.model.memberAddress;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [memberBiz服务]
 */
public interface IMemberAddressBizService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberAddress selectMemberAddressById(Long id);

	/**
	* 查询member列表
	*
	* @param memberAddress member
	* @return member集合
	*/
	public List<MemberAddress> selectMemberAddressList(MemberAddress memberAddress);

	/**
	* 新增member
	*
	* @param memberAddress member
	* @return 结果
	*/
	public int insertMemberAddress(MemberAddress memberAddress);

	/**
	* 修改member
	*
	* @param memberAddress member
	* @return 结果
	*/
	public int updateMemberAddress(MemberAddress memberAddress);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberAddressByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberAddressById(Long id);
	
}
