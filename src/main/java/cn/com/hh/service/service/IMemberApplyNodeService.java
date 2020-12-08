package com.common.api.service;

import java.util.List;

import com.common.api.model.memberApplyNode;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [member服务]
 */
public interface IMemberApplyNodeService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberApplyNode selectMemberApplyNodeById(Integer id);

	/**
	* 查询member列表
	*
	* @param memberApplyNode member
	* @return member集合
	*/
	public List<MemberApplyNode> selectMemberApplyNodeList(MemberApplyNode memberApplyNode);

	/**
	* 新增member
	*
	* @param memberApplyNode member
	* @return 结果
	*/
	public int insertMemberApplyNode(MemberApplyNode memberApplyNode);

	/**
	* 修改member
	*
	* @param memberApplyNode member
	* @return 结果
	*/
	public int updateMemberApplyNode(MemberApplyNode memberApplyNode);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberApplyNodeByIds(Integer[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberApplyNodeById(Integer id);
	
}
