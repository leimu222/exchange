package com.common.api.service;

import java.util.List;

import com.common.api.model.memberApplication;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [memberBiz服务]
 */
public interface IMemberApplicationBizService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberApplication selectMemberApplicationById(Long id);

	/**
	* 查询member列表
	*
	* @param memberApplication member
	* @return member集合
	*/
	public List<MemberApplication> selectMemberApplicationList(MemberApplication memberApplication);

	/**
	* 新增member
	*
	* @param memberApplication member
	* @return 结果
	*/
	public int insertMemberApplication(MemberApplication memberApplication);

	/**
	* 修改member
	*
	* @param memberApplication member
	* @return 结果
	*/
	public int updateMemberApplication(MemberApplication memberApplication);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberApplicationByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberApplicationById(Long id);
	
}
