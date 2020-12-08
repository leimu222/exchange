package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.CommunityMemberFollowInfoMapper;
import com.common.api.model.CommunityMemberFollowInfo;
import com.common.api.service.ICommunityMemberFollowInfoService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:02
 * Description: [community服务实现]
 */
@Service
public class CommunityMemberFollowInfoServiceImpl implements ICommunityMemberFollowInfoService {
	@Autowired
	private CommunityMemberFollowInfoMapper communityMemberFollowInfoMapper;

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	@Override
	public CommunityMemberFollowInfo selectCommunityMemberFollowInfoById(Long id) {
		return communityMemberFollowInfoMapper.selectCommunityMemberFollowInfoById(id);
	}

	/**
	* 查询community列表
	*
	* @param communityMemberFollowInfo community
	* @return community
	*/
	@Override
	public List<CommunityMemberFollowInfo> selectCommunityMemberFollowInfoList(CommunityMemberFollowInfo communityMemberFollowInfo) {
		return communityMemberFollowInfoMapper.selectCommunityMemberFollowInfoList(communityMemberFollowInfo);
	}

	/**
	* 新增community
	*
	* @param communityMemberFollowInfo community
	* @return 结果
	*/
	@Override
	public int insertCommunityMemberFollowInfo(CommunityMemberFollowInfo communityMemberFollowInfo) {
		return communityMemberFollowInfoMapper.insertCommunityMemberFollowInfo(communityMemberFollowInfo);
	}

	/**
	* 修改community
	*
	* @param communityMemberFollowInfo community
	* @return 结果
	*/
	@Override
	public int updateCommunityMemberFollowInfo(CommunityMemberFollowInfo communityMemberFollowInfo) {
		return communityMemberFollowInfoMapper.updateCommunityMemberFollowInfo(communityMemberFollowInfo);
	}

	/**
	* 批量删除community
	*
	* @param ids 需要删除的communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunityMemberFollowInfoByIds(Long[] ids) {
		return communityMemberFollowInfoMapper.deleteCommunityMemberFollowInfoByIds(ids);
	}

	/**
	* 删除community信息
	*
	* @param id communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunityMemberFollowInfoById(Long id) {
		return communityMemberFollowInfoMapper.deleteCommunityMemberFollowInfoById(id);
	}

}
