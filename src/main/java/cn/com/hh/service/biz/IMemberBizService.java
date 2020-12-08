package com.common.api.service;

import java.util.List;

import com.common.api.model.member;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [memberBiz服务]
 */
public interface IMemberBizService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public Member selectMemberById(Long id);

	/**
	* 查询member列表
	*
	* @param member member
	* @return member集合
	*/
	public List<Member> selectMemberList(Member member);

	/**
	* 新增member
	*
	* @param member member
	* @return 结果
	*/
	public int insertMember(Member member);

	/**
	* 修改member
	*
	* @param member member
	* @return 结果
	*/
	public int updateMember(Member member);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberById(Long id);
	
}
