package com.common.api.service;

import java.util.List;

import com.common.api.model.communityMemberFollowInfo;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:02
 * Description: [communityBiz服务]
 */
public interface ICommunityMemberFollowInfoBizService {

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	public CommunityMemberFollowInfo selectCommunityMemberFollowInfoById(Long id);

	/**
	* 查询community列表
	*
	* @param communityMemberFollowInfo community
	* @return community集合
	*/
	public List<CommunityMemberFollowInfo> selectCommunityMemberFollowInfoList(CommunityMemberFollowInfo communityMemberFollowInfo);

	/**
	* 新增community
	*
	* @param communityMemberFollowInfo community
	* @return 结果
	*/
	public int insertCommunityMemberFollowInfo(CommunityMemberFollowInfo communityMemberFollowInfo);

	/**
	* 修改community
	*
	* @param communityMemberFollowInfo community
	* @return 结果
	*/
	public int updateCommunityMemberFollowInfo(CommunityMemberFollowInfo communityMemberFollowInfo);

	/**
	* 批量删除community
	*
	* @param ids 需要删除的communityID
	* @return 结果
	*/
	public int deleteCommunityMemberFollowInfoByIds(Long[] ids);

	/**
	* 删除community信息
	*
	* @param id communityID
	* @return 结果
	*/
	public int deleteCommunityMemberFollowInfoById(Long id);
	
}
