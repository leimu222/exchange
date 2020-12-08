package com.common.api.service;

import java.util.List;

import com.common.api.model.memberApiKey;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [memberBiz服务]
 */
public interface IMemberApiKeyBizService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberApiKey selectMemberApiKeyById(Long id);

	/**
	* 查询member列表
	*
	* @param memberApiKey member
	* @return member集合
	*/
	public List<MemberApiKey> selectMemberApiKeyList(MemberApiKey memberApiKey);

	/**
	* 新增member
	*
	* @param memberApiKey member
	* @return 结果
	*/
	public int insertMemberApiKey(MemberApiKey memberApiKey);

	/**
	* 修改member
	*
	* @param memberApiKey member
	* @return 结果
	*/
	public int updateMemberApiKey(MemberApiKey memberApiKey);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberApiKeyByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberApiKeyById(Long id);
	
}
