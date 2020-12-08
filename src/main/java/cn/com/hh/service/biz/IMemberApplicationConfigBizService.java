package com.common.api.service;

import java.util.List;

import com.common.api.model.memberApplicationConfig;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [memberBiz服务]
 */
public interface IMemberApplicationConfigBizService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberApplicationConfig selectMemberApplicationConfigById(Long id);

	/**
	* 查询member列表
	*
	* @param memberApplicationConfig member
	* @return member集合
	*/
	public List<MemberApplicationConfig> selectMemberApplicationConfigList(MemberApplicationConfig memberApplicationConfig);

	/**
	* 新增member
	*
	* @param memberApplicationConfig member
	* @return 结果
	*/
	public int insertMemberApplicationConfig(MemberApplicationConfig memberApplicationConfig);

	/**
	* 修改member
	*
	* @param memberApplicationConfig member
	* @return 结果
	*/
	public int updateMemberApplicationConfig(MemberApplicationConfig memberApplicationConfig);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberApplicationConfigByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberApplicationConfigById(Long id);
	
}
