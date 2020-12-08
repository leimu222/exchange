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
 * Description: [community服务实现]
 */
@Service
public class CommunityMemberServiceImpl implements ICommunityMemberService {
	@Autowired
	private CommunityMemberMapper communityMemberMapper;

	/**
	* 查询community
	*
	* @param memberId communityID
	* @return community
	*/
	@Override
	public CommunityMember selectCommunityMemberById(Long memberId) {
		return communityMemberMapper.selectCommunityMemberById(memberId);
	}

	/**
	* 查询community列表
	*
	* @param communityMember community
	* @return community
	*/
	@Override
	public List<CommunityMember> selectCommunityMemberList(CommunityMember communityMember) {
		return communityMemberMapper.selectCommunityMemberList(communityMember);
	}

	/**
	* 新增community
	*
	* @param communityMember community
	* @return 结果
	*/
	@Override
	public int insertCommunityMember(CommunityMember communityMember) {
		return communityMemberMapper.insertCommunityMember(communityMember);
	}

	/**
	* 修改community
	*
	* @param communityMember community
	* @return 结果
	*/
	@Override
	public int updateCommunityMember(CommunityMember communityMember) {
		return communityMemberMapper.updateCommunityMember(communityMember);
	}

	/**
	* 批量删除community
	*
	* @param memberIds 需要删除的communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunityMemberByIds(Long[] memberIds) {
		return communityMemberMapper.deleteCommunityMemberByIds(memberIds);
	}

	/**
	* 删除community信息
	*
	* @param memberId communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunityMemberById(Long memberId) {
		return communityMemberMapper.deleteCommunityMemberById(memberId);
	}

}
