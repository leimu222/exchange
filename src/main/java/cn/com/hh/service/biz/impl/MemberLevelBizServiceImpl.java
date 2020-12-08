package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberLevelMapper;
import com.common.api.model.MemberLevel;
import com.common.api.service.IMemberLevelService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [memberBiz服务实现]
 */
@Service
public class MemberLevelBizServiceImpl extends CommonService implements IMemberLevelBizService {
	@Autowired
	private IMemberLevelService memberLevelService;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberLevel selectMemberLevelById(Long id) {
		return memberLevelService.selectMemberLevelById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberLevel member
	* @return member
	*/
	@Override
	public List<MemberLevel> selectMemberLevelList(MemberLevel memberLevel) {
		return memberLevelService.selectMemberLevelList(memberLevel);
	}

	/**
	* 新增member
	*
	* @param memberLevel member
	* @return 结果
	*/
	@Override
	public int insertMemberLevel(MemberLevel memberLevel) {
		return memberLevelService.insertMemberLevel(memberLevel);
	}

	/**
	* 修改member
	*
	* @param memberLevel member
	* @return 结果
	*/
	@Override
	public int updateMemberLevel(MemberLevel memberLevel) {
		return memberLevelService.updateMemberLevel(memberLevel);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberLevelByIds(Long[] ids) {
		return memberLevelService.deleteMemberLevelByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberLevelById(Long id) {
		return memberLevelService.deleteMemberLevelById(id);
	}

}
