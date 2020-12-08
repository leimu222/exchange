package com.common.api.service;

import java.util.List;

import com.common.api.model.memberTrustGatewayInfo;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [member服务]
 */
public interface IMemberTrustGatewayInfoService {

	/**
	* 查询member
	*
	* @param coin memberID
	* @return member
	*/
	public MemberTrustGatewayInfo selectMemberTrustGatewayInfoById(String coin);

	/**
	* 查询member列表
	*
	* @param memberTrustGatewayInfo member
	* @return member集合
	*/
	public List<MemberTrustGatewayInfo> selectMemberTrustGatewayInfoList(MemberTrustGatewayInfo memberTrustGatewayInfo);

	/**
	* 新增member
	*
	* @param memberTrustGatewayInfo member
	* @return 结果
	*/
	public int insertMemberTrustGatewayInfo(MemberTrustGatewayInfo memberTrustGatewayInfo);

	/**
	* 修改member
	*
	* @param memberTrustGatewayInfo member
	* @return 结果
	*/
	public int updateMemberTrustGatewayInfo(MemberTrustGatewayInfo memberTrustGatewayInfo);

	/**
	* 批量删除member
	*
	* @param coins 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberTrustGatewayInfoByIds(String[] coins);

	/**
	* 删除member信息
	*
	* @param coin memberID
	* @return 结果
	*/
	public int deleteMemberTrustGatewayInfoById(String coin);
	
}
