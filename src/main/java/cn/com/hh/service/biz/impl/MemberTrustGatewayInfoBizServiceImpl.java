package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberTrustGatewayInfoMapper;
import com.common.api.model.MemberTrustGatewayInfo;
import com.common.api.service.IMemberTrustGatewayInfoService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [memberBiz服务实现]
 */
@Service
public class MemberTrustGatewayInfoBizServiceImpl extends CommonService implements IMemberTrustGatewayInfoBizService {
	@Autowired
	private IMemberTrustGatewayInfoService memberTrustGatewayInfoService;

	/**
	* 查询member
	*
	* @param coin memberID
	* @return member
	*/
	@Override
	public MemberTrustGatewayInfo selectMemberTrustGatewayInfoById(String coin) {
		return memberTrustGatewayInfoService.selectMemberTrustGatewayInfoById(coin);
	}

	/**
	* 查询member列表
	*
	* @param memberTrustGatewayInfo member
	* @return member
	*/
	@Override
	public List<MemberTrustGatewayInfo> selectMemberTrustGatewayInfoList(MemberTrustGatewayInfo memberTrustGatewayInfo) {
		return memberTrustGatewayInfoService.selectMemberTrustGatewayInfoList(memberTrustGatewayInfo);
	}

	/**
	* 新增member
	*
	* @param memberTrustGatewayInfo member
	* @return 结果
	*/
	@Override
	public int insertMemberTrustGatewayInfo(MemberTrustGatewayInfo memberTrustGatewayInfo) {
		return memberTrustGatewayInfoService.insertMemberTrustGatewayInfo(memberTrustGatewayInfo);
	}

	/**
	* 修改member
	*
	* @param memberTrustGatewayInfo member
	* @return 结果
	*/
	@Override
	public int updateMemberTrustGatewayInfo(MemberTrustGatewayInfo memberTrustGatewayInfo) {
		return memberTrustGatewayInfoService.updateMemberTrustGatewayInfo(memberTrustGatewayInfo);
	}

	/**
	* 批量删除member
	*
	* @param coins 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberTrustGatewayInfoByIds(String[] coins) {
		return memberTrustGatewayInfoService.deleteMemberTrustGatewayInfoByIds(coins);
	}

	/**
	* 删除member信息
	*
	* @param coin memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberTrustGatewayInfoById(String coin) {
		return memberTrustGatewayInfoService.deleteMemberTrustGatewayInfoById(coin);
	}

}
