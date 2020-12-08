package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.CommunitySecondCategoryConfigMapper;
import com.common.api.model.CommunitySecondCategoryConfig;
import com.common.api.service.ICommunitySecondCategoryConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:02
 * Description: [community服务实现]
 */
@Service
public class CommunitySecondCategoryConfigServiceImpl implements ICommunitySecondCategoryConfigService {
	@Autowired
	private CommunitySecondCategoryConfigMapper communitySecondCategoryConfigMapper;

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	@Override
	public CommunitySecondCategoryConfig selectCommunitySecondCategoryConfigById(String id) {
		return communitySecondCategoryConfigMapper.selectCommunitySecondCategoryConfigById(id);
	}

	/**
	* 查询community列表
	*
	* @param communitySecondCategoryConfig community
	* @return community
	*/
	@Override
	public List<CommunitySecondCategoryConfig> selectCommunitySecondCategoryConfigList(CommunitySecondCategoryConfig communitySecondCategoryConfig) {
		return communitySecondCategoryConfigMapper.selectCommunitySecondCategoryConfigList(communitySecondCategoryConfig);
	}

	/**
	* 新增community
	*
	* @param communitySecondCategoryConfig community
	* @return 结果
	*/
	@Override
	public int insertCommunitySecondCategoryConfig(CommunitySecondCategoryConfig communitySecondCategoryConfig) {
		return communitySecondCategoryConfigMapper.insertCommunitySecondCategoryConfig(communitySecondCategoryConfig);
	}

	/**
	* 修改community
	*
	* @param communitySecondCategoryConfig community
	* @return 结果
	*/
	@Override
	public int updateCommunitySecondCategoryConfig(CommunitySecondCategoryConfig communitySecondCategoryConfig) {
		return communitySecondCategoryConfigMapper.updateCommunitySecondCategoryConfig(communitySecondCategoryConfig);
	}

	/**
	* 批量删除community
	*
	* @param ids 需要删除的communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunitySecondCategoryConfigByIds(String[] ids) {
		return communitySecondCategoryConfigMapper.deleteCommunitySecondCategoryConfigByIds(ids);
	}

	/**
	* 删除community信息
	*
	* @param id communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunitySecondCategoryConfigById(String id) {
		return communitySecondCategoryConfigMapper.deleteCommunitySecondCategoryConfigById(id);
	}

}
