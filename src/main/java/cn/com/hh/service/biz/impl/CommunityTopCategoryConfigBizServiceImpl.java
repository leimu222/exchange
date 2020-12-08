package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.CommunityTopCategoryConfigMapper;
import com.common.api.model.CommunityTopCategoryConfig;
import com.common.api.service.ICommunityTopCategoryConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:02
 * Description: [communityBiz服务实现]
 */
@Service
public class CommunityTopCategoryConfigBizServiceImpl extends CommonService implements ICommunityTopCategoryConfigBizService {
	@Autowired
	private ICommunityTopCategoryConfigService communityTopCategoryConfigService;

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	@Override
	public CommunityTopCategoryConfig selectCommunityTopCategoryConfigById(String id) {
		return communityTopCategoryConfigService.selectCommunityTopCategoryConfigById(id);
	}

	/**
	* 查询community列表
	*
	* @param communityTopCategoryConfig community
	* @return community
	*/
	@Override
	public List<CommunityTopCategoryConfig> selectCommunityTopCategoryConfigList(CommunityTopCategoryConfig communityTopCategoryConfig) {
		return communityTopCategoryConfigService.selectCommunityTopCategoryConfigList(communityTopCategoryConfig);
	}

	/**
	* 新增community
	*
	* @param communityTopCategoryConfig community
	* @return 结果
	*/
	@Override
	public int insertCommunityTopCategoryConfig(CommunityTopCategoryConfig communityTopCategoryConfig) {
		return communityTopCategoryConfigService.insertCommunityTopCategoryConfig(communityTopCategoryConfig);
	}

	/**
	* 修改community
	*
	* @param communityTopCategoryConfig community
	* @return 结果
	*/
	@Override
	public int updateCommunityTopCategoryConfig(CommunityTopCategoryConfig communityTopCategoryConfig) {
		return communityTopCategoryConfigService.updateCommunityTopCategoryConfig(communityTopCategoryConfig);
	}

	/**
	* 批量删除community
	*
	* @param ids 需要删除的communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunityTopCategoryConfigByIds(String[] ids) {
		return communityTopCategoryConfigService.deleteCommunityTopCategoryConfigByIds(ids);
	}

	/**
	* 删除community信息
	*
	* @param id communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunityTopCategoryConfigById(String id) {
		return communityTopCategoryConfigService.deleteCommunityTopCategoryConfigById(id);
	}

}
