package com.common.api.service;

import java.util.List;

import com.common.api.model.communityMemberFollowInfoRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:02
 * Description: [community服务]
 */
public interface ICommunityMemberFollowInfoRecordService {

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	public CommunityMemberFollowInfoRecord selectCommunityMemberFollowInfoRecordById(Long id);

	/**
	* 查询community列表
	*
	* @param communityMemberFollowInfoRecord community
	* @return community集合
	*/
	public List<CommunityMemberFollowInfoRecord> selectCommunityMemberFollowInfoRecordList(CommunityMemberFollowInfoRecord communityMemberFollowInfoRecord);

	/**
	* 新增community
	*
	* @param communityMemberFollowInfoRecord community
	* @return 结果
	*/
	public int insertCommunityMemberFollowInfoRecord(CommunityMemberFollowInfoRecord communityMemberFollowInfoRecord);

	/**
	* 修改community
	*
	* @param communityMemberFollowInfoRecord community
	* @return 结果
	*/
	public int updateCommunityMemberFollowInfoRecord(CommunityMemberFollowInfoRecord communityMemberFollowInfoRecord);

	/**
	* 批量删除community
	*
	* @param ids 需要删除的communityID
	* @return 结果
	*/
	public int deleteCommunityMemberFollowInfoRecordByIds(Long[] ids);

	/**
	* 删除community信息
	*
	* @param id communityID
	* @return 结果
	*/
	public int deleteCommunityMemberFollowInfoRecordById(Long id);
	
}
