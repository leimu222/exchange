package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberApplyNodeMapper;
import com.common.api.model.MemberApplyNode;
import com.common.api.service.IMemberApplyNodeService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [memberBiz服务实现]
 */
@Service
public class MemberApplyNodeBizServiceImpl extends CommonService implements IMemberApplyNodeBizService {
	@Autowired
	private IMemberApplyNodeService memberApplyNodeService;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberApplyNode selectMemberApplyNodeById(Integer id) {
		return memberApplyNodeService.selectMemberApplyNodeById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberApplyNode member
	* @return member
	*/
	@Override
	public List<MemberApplyNode> selectMemberApplyNodeList(MemberApplyNode memberApplyNode) {
		return memberApplyNodeService.selectMemberApplyNodeList(memberApplyNode);
	}

	/**
	* 新增member
	*
	* @param memberApplyNode member
	* @return 结果
	*/
	@Override
	public int insertMemberApplyNode(MemberApplyNode memberApplyNode) {
		return memberApplyNodeService.insertMemberApplyNode(memberApplyNode);
	}

	/**
	* 修改member
	*
	* @param memberApplyNode member
	* @return 结果
	*/
	@Override
	public int updateMemberApplyNode(MemberApplyNode memberApplyNode) {
		return memberApplyNodeService.updateMemberApplyNode(memberApplyNode);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberApplyNodeByIds(Integer[] ids) {
		return memberApplyNodeService.deleteMemberApplyNodeByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberApplyNodeById(Integer id) {
		return memberApplyNodeService.deleteMemberApplyNodeById(id);
	}

}
