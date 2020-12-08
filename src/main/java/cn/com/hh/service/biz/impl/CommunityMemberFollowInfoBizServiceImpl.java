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
 * Description: [communityBiz服务实现]
 */
@Service
public class CommunityMemberFollowInfoBizServiceImpl extends CommonService implements ICommunityMemberFollowInfoBizService {
	@Autowired
	private ICommunityMemberFollowInfoService communityMemberFollowInfoService;

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	@Override
	public CommunityMemberFollowInfo selectCommunityMemberFollowInfoById(Long id) {
		return communityMemberFollowInfoService.selectCommunityMemberFollowInfoById(id);
	}

	/**
	* 查询community列表
	*
	* @param communityMemberFollowInfo community
	* @return community
	*/
	@Override
	public List<CommunityMemberFollowInfo> selectCommunityMemberFollowInfoList(CommunityMemberFollowInfo communityMemberFollowInfo) {
		return communityMemberFollowInfoService.selectCommunityMemberFollowInfoList(communityMemberFollowInfo);
	}

	/**
	* 新增community
	*
	* @param communityMemberFollowInfo community
	* @return 结果
	*/
	@Override
	public int insertCommunityMemberFollowInfo(CommunityMemberFollowInfo communityMemberFollowInfo) {
		return communityMemberFollowInfoService.insertCommunityMemberFollowInfo(communityMemberFollowInfo);
	}

	/**
	* 修改community
	*
	* @param communityMemberFollowInfo community
	* @return 结果
	*/
	@Override
	public int updateCommunityMemberFollowInfo(CommunityMemberFollowInfo communityMemberFollowInfo) {
		return communityMemberFollowInfoService.updateCommunityMemberFollowInfo(communityMemberFollowInfo);
	}

	/**
	* 批量删除community
	*
	* @param ids 需要删除的communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunityMemberFollowInfoByIds(Long[] ids) {
		return communityMemberFollowInfoService.deleteCommunityMemberFollowInfoByIds(ids);
	}

	/**
	* 删除community信息
	*
	* @param id communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunityMemberFollowInfoById(Long id) {
		return communityMemberFollowInfoService.deleteCommunityMemberFollowInfoById(id);
	}

}
