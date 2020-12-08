package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberTeamMapper;
import com.common.api.model.MemberTeam;
import com.common.api.service.IMemberTeamService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [member服务实现]
 */
@Service
public class MemberTeamServiceImpl implements IMemberTeamService {
	@Autowired
	private MemberTeamMapper memberTeamMapper;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberTeam selectMemberTeamById(Long id) {
		return memberTeamMapper.selectMemberTeamById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberTeam member
	* @return member
	*/
	@Override
	public List<MemberTeam> selectMemberTeamList(MemberTeam memberTeam) {
		return memberTeamMapper.selectMemberTeamList(memberTeam);
	}

	/**
	* 新增member
	*
	* @param memberTeam member
	* @return 结果
	*/
	@Override
	public int insertMemberTeam(MemberTeam memberTeam) {
		return memberTeamMapper.insertMemberTeam(memberTeam);
	}

	/**
	* 修改member
	*
	* @param memberTeam member
	* @return 结果
	*/
	@Override
	public int updateMemberTeam(MemberTeam memberTeam) {
		return memberTeamMapper.updateMemberTeam(memberTeam);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberTeamByIds(Long[] ids) {
		return memberTeamMapper.deleteMemberTeamByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberTeamById(Long id) {
		return memberTeamMapper.deleteMemberTeamById(id);
	}

}
