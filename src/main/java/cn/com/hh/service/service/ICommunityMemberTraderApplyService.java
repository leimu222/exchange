package com.common.api.service;

import java.util.List;

import com.common.api.model.communityMemberTraderApply;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:02
 * Description: [community服务]
 */
public interface ICommunityMemberTraderApplyService {

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	public CommunityMemberTraderApply selectCommunityMemberTraderApplyById(String id);

	/**
	* 查询community列表
	*
	* @param communityMemberTraderApply community
	* @return community集合
	*/
	public List<CommunityMemberTraderApply> selectCommunityMemberTraderApplyList(CommunityMemberTraderApply communityMemberTraderApply);

	/**
	* 新增community
	*
	* @param communityMemberTraderApply community
	* @return 结果
	*/
	public int insertCommunityMemberTraderApply(CommunityMemberTraderApply communityMemberTraderApply);

	/**
	* 修改community
	*
	* @param communityMemberTraderApply community
	* @return 结果
	*/
	public int updateCommunityMemberTraderApply(CommunityMemberTraderApply communityMemberTraderApply);

	/**
	* 批量删除community
	*
	* @param ids 需要删除的communityID
	* @return 结果
	*/
	public int deleteCommunityMemberTraderApplyByIds(String[] ids);

	/**
	* 删除community信息
	*
	* @param id communityID
	* @return 结果
	*/
	public int deleteCommunityMemberTraderApplyById(String id);
	
}
