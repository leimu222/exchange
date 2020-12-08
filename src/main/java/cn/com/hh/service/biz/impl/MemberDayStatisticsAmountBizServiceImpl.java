package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberDayStatisticsAmountMapper;
import com.common.api.model.MemberDayStatisticsAmount;
import com.common.api.service.IMemberDayStatisticsAmountService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [memberBiz服务实现]
 */
@Service
public class MemberDayStatisticsAmountBizServiceImpl extends CommonService implements IMemberDayStatisticsAmountBizService {
	@Autowired
	private IMemberDayStatisticsAmountService memberDayStatisticsAmountService;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberDayStatisticsAmount selectMemberDayStatisticsAmountById(Long id) {
		return memberDayStatisticsAmountService.selectMemberDayStatisticsAmountById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberDayStatisticsAmount member
	* @return member
	*/
	@Override
	public List<MemberDayStatisticsAmount> selectMemberDayStatisticsAmountList(MemberDayStatisticsAmount memberDayStatisticsAmount) {
		return memberDayStatisticsAmountService.selectMemberDayStatisticsAmountList(memberDayStatisticsAmount);
	}

	/**
	* 新增member
	*
	* @param memberDayStatisticsAmount member
	* @return 结果
	*/
	@Override
	public int insertMemberDayStatisticsAmount(MemberDayStatisticsAmount memberDayStatisticsAmount) {
		return memberDayStatisticsAmountService.insertMemberDayStatisticsAmount(memberDayStatisticsAmount);
	}

	/**
	* 修改member
	*
	* @param memberDayStatisticsAmount member
	* @return 结果
	*/
	@Override
	public int updateMemberDayStatisticsAmount(MemberDayStatisticsAmount memberDayStatisticsAmount) {
		return memberDayStatisticsAmountService.updateMemberDayStatisticsAmount(memberDayStatisticsAmount);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberDayStatisticsAmountByIds(Long[] ids) {
		return memberDayStatisticsAmountService.deleteMemberDayStatisticsAmountByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberDayStatisticsAmountById(Long id) {
		return memberDayStatisticsAmountService.deleteMemberDayStatisticsAmountById(id);
	}

}
