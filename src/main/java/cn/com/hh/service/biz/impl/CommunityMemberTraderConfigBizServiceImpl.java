package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.CommunityMemberTraderConfigMapper;
import com.common.api.model.CommunityMemberTraderConfig;
import com.common.api.service.ICommunityMemberTraderConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:02
 * Description: [communityBiz服务实现]
 */
@Service
public class CommunityMemberTraderConfigBizServiceImpl extends CommonService implements ICommunityMemberTraderConfigBizService {
	@Autowired
	private ICommunityMemberTraderConfigService communityMemberTraderConfigService;

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	@Override
	public CommunityMemberTraderConfig selectCommunityMemberTraderConfigById(Long id) {
		return communityMemberTraderConfigService.selectCommunityMemberTraderConfigById(id);
	}

	/**
	* 查询community列表
	*
	* @param communityMemberTraderConfig community
	* @return community
	*/
	@Override
	public List<CommunityMemberTraderConfig> selectCommunityMemberTraderConfigList(CommunityMemberTraderConfig communityMemberTraderConfig) {
		return communityMemberTraderConfigService.selectCommunityMemberTraderConfigList(communityMemberTraderConfig);
	}

	/**
	* 新增community
	*
	* @param communityMemberTraderConfig community
	* @return 结果
	*/
	@Override
	public int insertCommunityMemberTraderConfig(CommunityMemberTraderConfig communityMemberTraderConfig) {
		return communityMemberTraderConfigService.insertCommunityMemberTraderConfig(communityMemberTraderConfig);
	}

	/**
	* 修改community
	*
	* @param communityMemberTraderConfig community
	* @return 结果
	*/
	@Override
	public int updateCommunityMemberTraderConfig(CommunityMemberTraderConfig communityMemberTraderConfig) {
		return communityMemberTraderConfigService.updateCommunityMemberTraderConfig(communityMemberTraderConfig);
	}

	/**
	* 批量删除community
	*
	* @param ids 需要删除的communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunityMemberTraderConfigByIds(Long[] ids) {
		return communityMemberTraderConfigService.deleteCommunityMemberTraderConfigByIds(ids);
	}

	/**
	* 删除community信息
	*
	* @param id communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunityMemberTraderConfigById(Long id) {
		return communityMemberTraderConfigService.deleteCommunityMemberTraderConfigById(id);
	}

}
