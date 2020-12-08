package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberMiningProfitDayMapper;
import com.common.api.model.MemberMiningProfitDay;
import com.common.api.service.IMemberMiningProfitDayService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [member服务实现]
 */
@Service
public class MemberMiningProfitDayServiceImpl implements IMemberMiningProfitDayService {
	@Autowired
	private MemberMiningProfitDayMapper memberMiningProfitDayMapper;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberMiningProfitDay selectMemberMiningProfitDayById(Long id) {
		return memberMiningProfitDayMapper.selectMemberMiningProfitDayById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberMiningProfitDay member
	* @return member
	*/
	@Override
	public List<MemberMiningProfitDay> selectMemberMiningProfitDayList(MemberMiningProfitDay memberMiningProfitDay) {
		return memberMiningProfitDayMapper.selectMemberMiningProfitDayList(memberMiningProfitDay);
	}

	/**
	* 新增member
	*
	* @param memberMiningProfitDay member
	* @return 结果
	*/
	@Override
	public int insertMemberMiningProfitDay(MemberMiningProfitDay memberMiningProfitDay) {
		return memberMiningProfitDayMapper.insertMemberMiningProfitDay(memberMiningProfitDay);
	}

	/**
	* 修改member
	*
	* @param memberMiningProfitDay member
	* @return 结果
	*/
	@Override
	public int updateMemberMiningProfitDay(MemberMiningProfitDay memberMiningProfitDay) {
		return memberMiningProfitDayMapper.updateMemberMiningProfitDay(memberMiningProfitDay);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberMiningProfitDayByIds(Long[] ids) {
		return memberMiningProfitDayMapper.deleteMemberMiningProfitDayByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberMiningProfitDayById(Long id) {
		return memberMiningProfitDayMapper.deleteMemberMiningProfitDayById(id);
	}

}
