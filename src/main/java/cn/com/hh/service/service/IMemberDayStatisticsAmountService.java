package com.common.api.service;

import java.util.List;

import com.common.api.model.memberDayStatisticsAmount;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [member服务]
 */
public interface IMemberDayStatisticsAmountService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberDayStatisticsAmount selectMemberDayStatisticsAmountById(Long id);

	/**
	* 查询member列表
	*
	* @param memberDayStatisticsAmount member
	* @return member集合
	*/
	public List<MemberDayStatisticsAmount> selectMemberDayStatisticsAmountList(MemberDayStatisticsAmount memberDayStatisticsAmount);

	/**
	* 新增member
	*
	* @param memberDayStatisticsAmount member
	* @return 结果
	*/
	public int insertMemberDayStatisticsAmount(MemberDayStatisticsAmount memberDayStatisticsAmount);

	/**
	* 修改member
	*
	* @param memberDayStatisticsAmount member
	* @return 结果
	*/
	public int updateMemberDayStatisticsAmount(MemberDayStatisticsAmount memberDayStatisticsAmount);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberDayStatisticsAmountByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberDayStatisticsAmountById(Long id);
	
}
