package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberMapper;
import com.common.api.model.Member;
import com.common.api.service.IMemberService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [memberBiz服务实现]
 */
@Service
public class MemberBizServiceImpl extends CommonService implements IMemberBizService {
	@Autowired
	private IMemberService memberService;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public Member selectMemberById(Long id) {
		return memberService.selectMemberById(id);
	}

	/**
	* 查询member列表
	*
	* @param member member
	* @return member
	*/
	@Override
	public List<Member> selectMemberList(Member member) {
		return memberService.selectMemberList(member);
	}

	/**
	* 新增member
	*
	* @param member member
	* @return 结果
	*/
	@Override
	public int insertMember(Member member) {
		return memberService.insertMember(member);
	}

	/**
	* 修改member
	*
	* @param member member
	* @return 结果
	*/
	@Override
	public int updateMember(Member member) {
		return memberService.updateMember(member);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberByIds(Long[] ids) {
		return memberService.deleteMemberByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberById(Long id) {
		return memberService.deleteMemberById(id);
	}

}
