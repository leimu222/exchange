package com.common.api.service;

import java.util.List;

import com.common.api.model.memberBonus;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [member服务]
 */
public interface IMemberBonusService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberBonus selectMemberBonusById(Long id);

	/**
	* 查询member列表
	*
	* @param memberBonus member
	* @return member集合
	*/
	public List<MemberBonus> selectMemberBonusList(MemberBonus memberBonus);

	/**
	* 新增member
	*
	* @param memberBonus member
	* @return 结果
	*/
	public int insertMemberBonus(MemberBonus memberBonus);

	/**
	* 修改member
	*
	* @param memberBonus member
	* @return 结果
	*/
	public int updateMemberBonus(MemberBonus memberBonus);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberBonusByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberBonusById(Long id);
	
}
