package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberBonusMapper;
import com.common.api.model.MemberBonus;
import com.common.api.service.IMemberBonusService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [member服务实现]
 */
@Service
public class MemberBonusServiceImpl implements IMemberBonusService {
	@Autowired
	private MemberBonusMapper memberBonusMapper;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberBonus selectMemberBonusById(Long id) {
		return memberBonusMapper.selectMemberBonusById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberBonus member
	* @return member
	*/
	@Override
	public List<MemberBonus> selectMemberBonusList(MemberBonus memberBonus) {
		return memberBonusMapper.selectMemberBonusList(memberBonus);
	}

	/**
	* 新增member
	*
	* @param memberBonus member
	* @return 结果
	*/
	@Override
	public int insertMemberBonus(MemberBonus memberBonus) {
		return memberBonusMapper.insertMemberBonus(memberBonus);
	}

	/**
	* 修改member
	*
	* @param memberBonus member
	* @return 结果
	*/
	@Override
	public int updateMemberBonus(MemberBonus memberBonus) {
		return memberBonusMapper.updateMemberBonus(memberBonus);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberBonusByIds(Long[] ids) {
		return memberBonusMapper.deleteMemberBonusByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberBonusById(Long id) {
		return memberBonusMapper.deleteMemberBonusById(id);
	}

}
