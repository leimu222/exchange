package com.common.api.service;

import java.util.List;

import com.common.api.model.communityMember;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:02
 * Description: [community服务]
 */
public interface ICommunityMemberService {

	/**
	* 查询community
	*
	* @param memberId communityID
	* @return community
	*/
	public CommunityMember selectCommunityMemberById(Long memberId);

	/**
	* 查询community列表
	*
	* @param communityMember community
	* @return community集合
	*/
	public List<CommunityMember> selectCommunityMemberList(CommunityMember communityMember);

	/**
	* 新增community
	*
	* @param communityMember community
	* @return 结果
	*/
	public int insertCommunityMember(CommunityMember communityMember);

	/**
	* 修改community
	*
	* @param communityMember community
	* @return 结果
	*/
	public int updateCommunityMember(CommunityMember communityMember);

	/**
	* 批量删除community
	*
	* @param memberIds 需要删除的communityID
	* @return 结果
	*/
	public int deleteCommunityMemberByIds(Long[] memberIds);

	/**
	* 删除community信息
	*
	* @param memberId communityID
	* @return 结果
	*/
	public int deleteCommunityMemberById(Long memberId);
	
}
