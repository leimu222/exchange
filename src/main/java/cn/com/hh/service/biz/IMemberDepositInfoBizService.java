package com.common.api.service;

import java.util.List;

import com.common.api.model.memberDepositInfo;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [memberBiz服务]
 */
public interface IMemberDepositInfoBizService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberDepositInfo selectMemberDepositInfoById(Long id);

	/**
	* 查询member列表
	*
	* @param memberDepositInfo member
	* @return member集合
	*/
	public List<MemberDepositInfo> selectMemberDepositInfoList(MemberDepositInfo memberDepositInfo);

	/**
	* 新增member
	*
	* @param memberDepositInfo member
	* @return 结果
	*/
	public int insertMemberDepositInfo(MemberDepositInfo memberDepositInfo);

	/**
	* 修改member
	*
	* @param memberDepositInfo member
	* @return 结果
	*/
	public int updateMemberDepositInfo(MemberDepositInfo memberDepositInfo);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberDepositInfoByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberDepositInfoById(Long id);
	
}
