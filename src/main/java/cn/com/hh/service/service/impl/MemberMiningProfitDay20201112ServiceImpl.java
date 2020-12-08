package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberMiningProfitDay20201112Mapper;
import com.common.api.model.MemberMiningProfitDay20201112;
import com.common.api.service.IMemberMiningProfitDay20201112Service;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [member服务实现]
 */
@Service
public class MemberMiningProfitDay20201112ServiceImpl implements IMemberMiningProfitDay20201112Service {
	@Autowired
	private MemberMiningProfitDay20201112Mapper memberMiningProfitDay20201112Mapper;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberMiningProfitDay20201112 selectMemberMiningProfitDay20201112ById(Long id) {
		return memberMiningProfitDay20201112Mapper.selectMemberMiningProfitDay20201112ById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberMiningProfitDay20201112 member
	* @return member
	*/
	@Override
	public List<MemberMiningProfitDay20201112> selectMemberMiningProfitDay20201112List(MemberMiningProfitDay20201112 memberMiningProfitDay20201112) {
		return memberMiningProfitDay20201112Mapper.selectMemberMiningProfitDay20201112List(memberMiningProfitDay20201112);
	}

	/**
	* 新增member
	*
	* @param memberMiningProfitDay20201112 member
	* @return 结果
	*/
	@Override
	public int insertMemberMiningProfitDay20201112(MemberMiningProfitDay20201112 memberMiningProfitDay20201112) {
		return memberMiningProfitDay20201112Mapper.insertMemberMiningProfitDay20201112(memberMiningProfitDay20201112);
	}

	/**
	* 修改member
	*
	* @param memberMiningProfitDay20201112 member
	* @return 结果
	*/
	@Override
	public int updateMemberMiningProfitDay20201112(MemberMiningProfitDay20201112 memberMiningProfitDay20201112) {
		return memberMiningProfitDay20201112Mapper.updateMemberMiningProfitDay20201112(memberMiningProfitDay20201112);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberMiningProfitDay20201112ByIds(Long[] ids) {
		return memberMiningProfitDay20201112Mapper.deleteMemberMiningProfitDay20201112ByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberMiningProfitDay20201112ById(Long id) {
		return memberMiningProfitDay20201112Mapper.deleteMemberMiningProfitDay20201112ById(id);
	}

}
