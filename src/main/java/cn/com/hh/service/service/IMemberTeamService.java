package com.common.api.service;

import java.util.List;

import com.common.api.model.memberTeam;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [member服务]
 */
public interface IMemberTeamService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberTeam selectMemberTeamById(Long id);

	/**
	* 查询member列表
	*
	* @param memberTeam member
	* @return member集合
	*/
	public List<MemberTeam> selectMemberTeamList(MemberTeam memberTeam);

	/**
	* 新增member
	*
	* @param memberTeam member
	* @return 结果
	*/
	public int insertMemberTeam(MemberTeam memberTeam);

	/**
	* 修改member
	*
	* @param memberTeam member
	* @return 结果
	*/
	public int updateMemberTeam(MemberTeam memberTeam);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberTeamByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberTeamById(Long id);
	
}
