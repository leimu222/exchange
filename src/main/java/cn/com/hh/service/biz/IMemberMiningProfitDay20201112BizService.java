package com.common.api.service;

import java.util.List;

import com.common.api.model.memberMiningProfitDay20201112;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [memberBiz服务]
 */
public interface IMemberMiningProfitDay20201112BizService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberMiningProfitDay20201112 selectMemberMiningProfitDay20201112ById(Long id);

	/**
	* 查询member列表
	*
	* @param memberMiningProfitDay20201112 member
	* @return member集合
	*/
	public List<MemberMiningProfitDay20201112> selectMemberMiningProfitDay20201112List(MemberMiningProfitDay20201112 memberMiningProfitDay20201112);

	/**
	* 新增member
	*
	* @param memberMiningProfitDay20201112 member
	* @return 结果
	*/
	public int insertMemberMiningProfitDay20201112(MemberMiningProfitDay20201112 memberMiningProfitDay20201112);

	/**
	* 修改member
	*
	* @param memberMiningProfitDay20201112 member
	* @return 结果
	*/
	public int updateMemberMiningProfitDay20201112(MemberMiningProfitDay20201112 memberMiningProfitDay20201112);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberMiningProfitDay20201112ByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberMiningProfitDay20201112ById(Long id);
	
}
