package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.CommunityMemberMapper;
import com.common.api.model.CommunityMember;
import com.common.api.service.ICommunityMemberService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:02
 * Description: [communityBiz服务实现]
 */
@Service
public class CommunityMemberBizServiceImpl extends CommonService implements ICommunityMemberBizService {
	@Autowired
	private ICommunityMemberService communityMemberService;

	/**
	* 查询community
	*
	* @param memberId communityID
	* @return community
	*/
	@Override
	public CommunityMember selectCommunityMemberById(Long memberId) {
		return communityMemberService.selectCommunityMemberById(memberId);
	}

	/**
	* 查询community列表
	*
	* @param communityMember community
	* @return community
	*/
	@Override
	public List<CommunityMember> selectCommunityMemberList(CommunityMember communityMember) {
		return communityMemberService.selectCommunityMemberList(communityMember);
	}

	/**
	* 新增community
	*
	* @param communityMember community
	* @return 结果
	*/
	@Override
	public int insertCommunityMember(CommunityMember communityMember) {
		return communityMemberService.insertCommunityMember(communityMember);
	}

	/**
	* 修改community
	*
	* @param communityMember community
	* @return 结果
	*/
	@Override
	public int updateCommunityMember(CommunityMember communityMember) {
		return communityMemberService.updateCommunityMember(communityMember);
	}

	/**
	* 批量删除community
	*
	* @param memberIds 需要删除的communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunityMemberByIds(Long[] memberIds) {
		return communityMemberService.deleteCommunityMemberByIds(memberIds);
	}

	/**
	* 删除community信息
	*
	* @param memberId communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunityMemberById(Long memberId) {
		return communityMemberService.deleteCommunityMemberById(memberId);
	}

}
