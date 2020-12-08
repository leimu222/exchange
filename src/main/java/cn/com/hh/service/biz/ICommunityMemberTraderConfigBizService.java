package com.common.api.service;

import java.util.List;

import com.common.api.model.communityMemberTraderConfig;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:02
 * Description: [communityBiz服务]
 */
public interface ICommunityMemberTraderConfigBizService {

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	public CommunityMemberTraderConfig selectCommunityMemberTraderConfigById(Long id);

	/**
	* 查询community列表
	*
	* @param communityMemberTraderConfig community
	* @return community集合
	*/
	public List<CommunityMemberTraderConfig> selectCommunityMemberTraderConfigList(CommunityMemberTraderConfig communityMemberTraderConfig);

	/**
	* 新增community
	*
	* @param communityMemberTraderConfig community
	* @return 结果
	*/
	public int insertCommunityMemberTraderConfig(CommunityMemberTraderConfig communityMemberTraderConfig);

	/**
	* 修改community
	*
	* @param communityMemberTraderConfig community
	* @return 结果
	*/
	public int updateCommunityMemberTraderConfig(CommunityMemberTraderConfig communityMemberTraderConfig);

	/**
	* 批量删除community
	*
	* @param ids 需要删除的communityID
	* @return 结果
	*/
	public int deleteCommunityMemberTraderConfigByIds(Long[] ids);

	/**
	* 删除community信息
	*
	* @param id communityID
	* @return 结果
	*/
	public int deleteCommunityMemberTraderConfigById(Long id);
	
}
