package com.common.api.service;

import java.util.List;

import com.common.api.model.communityTopCategoryConfig;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:02
 * Description: [community服务]
 */
public interface ICommunityTopCategoryConfigService {

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	public CommunityTopCategoryConfig selectCommunityTopCategoryConfigById(String id);

	/**
	* 查询community列表
	*
	* @param communityTopCategoryConfig community
	* @return community集合
	*/
	public List<CommunityTopCategoryConfig> selectCommunityTopCategoryConfigList(CommunityTopCategoryConfig communityTopCategoryConfig);

	/**
	* 新增community
	*
	* @param communityTopCategoryConfig community
	* @return 结果
	*/
	public int insertCommunityTopCategoryConfig(CommunityTopCategoryConfig communityTopCategoryConfig);

	/**
	* 修改community
	*
	* @param communityTopCategoryConfig community
	* @return 结果
	*/
	public int updateCommunityTopCategoryConfig(CommunityTopCategoryConfig communityTopCategoryConfig);

	/**
	* 批量删除community
	*
	* @param ids 需要删除的communityID
	* @return 结果
	*/
	public int deleteCommunityTopCategoryConfigByIds(String[] ids);

	/**
	* 删除community信息
	*
	* @param id communityID
	* @return 结果
	*/
	public int deleteCommunityTopCategoryConfigById(String id);
	
}
