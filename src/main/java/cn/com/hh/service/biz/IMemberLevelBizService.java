package com.common.api.service;

import java.util.List;

import com.common.api.model.memberLevel;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [memberBiz服务]
 */
public interface IMemberLevelBizService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberLevel selectMemberLevelById(Long id);

	/**
	* 查询member列表
	*
	* @param memberLevel member
	* @return member集合
	*/
	public List<MemberLevel> selectMemberLevelList(MemberLevel memberLevel);

	/**
	* 新增member
	*
	* @param memberLevel member
	* @return 结果
	*/
	public int insertMemberLevel(MemberLevel memberLevel);

	/**
	* 修改member
	*
	* @param memberLevel member
	* @return 结果
	*/
	public int updateMemberLevel(MemberLevel memberLevel);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberLevelByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberLevelById(Long id);
	
}
