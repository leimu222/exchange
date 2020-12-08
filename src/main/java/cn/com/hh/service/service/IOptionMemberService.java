package com.common.api.service;

import java.util.List;

import com.common.api.model.optionMember;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [option服务]
 */
public interface IOptionMemberService {

	/**
	* 查询option
	*
	* @param memberId optionID
	* @return option
	*/
	public OptionMember selectOptionMemberById(Long memberId);

	/**
	* 查询option列表
	*
	* @param optionMember option
	* @return option集合
	*/
	public List<OptionMember> selectOptionMemberList(OptionMember optionMember);

	/**
	* 新增option
	*
	* @param optionMember option
	* @return 结果
	*/
	public int insertOptionMember(OptionMember optionMember);

	/**
	* 修改option
	*
	* @param optionMember option
	* @return 结果
	*/
	public int updateOptionMember(OptionMember optionMember);

	/**
	* 批量删除option
	*
	* @param memberIds 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionMemberByIds(Long[] memberIds);

	/**
	* 删除option信息
	*
	* @param memberId optionID
	* @return 结果
	*/
	public int deleteOptionMemberById(Long memberId);
	
}
