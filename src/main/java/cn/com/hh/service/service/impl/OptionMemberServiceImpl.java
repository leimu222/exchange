package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionMemberMapper;
import com.common.api.model.OptionMember;
import com.common.api.service.IOptionMemberService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [option服务实现]
 */
@Service
public class OptionMemberServiceImpl implements IOptionMemberService {
	@Autowired
	private OptionMemberMapper optionMemberMapper;

	/**
	* 查询option
	*
	* @param memberId optionID
	* @return option
	*/
	@Override
	public OptionMember selectOptionMemberById(Long memberId) {
		return optionMemberMapper.selectOptionMemberById(memberId);
	}

	/**
	* 查询option列表
	*
	* @param optionMember option
	* @return option
	*/
	@Override
	public List<OptionMember> selectOptionMemberList(OptionMember optionMember) {
		return optionMemberMapper.selectOptionMemberList(optionMember);
	}

	/**
	* 新增option
	*
	* @param optionMember option
	* @return 结果
	*/
	@Override
	public int insertOptionMember(OptionMember optionMember) {
		return optionMemberMapper.insertOptionMember(optionMember);
	}

	/**
	* 修改option
	*
	* @param optionMember option
	* @return 结果
	*/
	@Override
	public int updateOptionMember(OptionMember optionMember) {
		return optionMemberMapper.updateOptionMember(optionMember);
	}

	/**
	* 批量删除option
	*
	* @param memberIds 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionMemberByIds(Long[] memberIds) {
		return optionMemberMapper.deleteOptionMemberByIds(memberIds);
	}

	/**
	* 删除option信息
	*
	* @param memberId optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionMemberById(Long memberId) {
		return optionMemberMapper.deleteOptionMemberById(memberId);
	}

}
