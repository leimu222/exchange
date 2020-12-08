package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberServiceInfoMapper;
import com.common.api.model.MemberServiceInfo;
import com.common.api.service.IMemberServiceInfoService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [memberBiz服务实现]
 */
@Service
public class MemberServiceInfoBizServiceImpl extends CommonService implements IMemberServiceInfoBizService {
	@Autowired
	private IMemberServiceInfoService memberServiceInfoService;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberServiceInfo selectMemberServiceInfoById(Integer id) {
		return memberServiceInfoService.selectMemberServiceInfoById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberServiceInfo member
	* @return member
	*/
	@Override
	public List<MemberServiceInfo> selectMemberServiceInfoList(MemberServiceInfo memberServiceInfo) {
		return memberServiceInfoService.selectMemberServiceInfoList(memberServiceInfo);
	}

	/**
	* 新增member
	*
	* @param memberServiceInfo member
	* @return 结果
	*/
	@Override
	public int insertMemberServiceInfo(MemberServiceInfo memberServiceInfo) {
		return memberServiceInfoService.insertMemberServiceInfo(memberServiceInfo);
	}

	/**
	* 修改member
	*
	* @param memberServiceInfo member
	* @return 结果
	*/
	@Override
	public int updateMemberServiceInfo(MemberServiceInfo memberServiceInfo) {
		return memberServiceInfoService.updateMemberServiceInfo(memberServiceInfo);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberServiceInfoByIds(Integer[] ids) {
		return memberServiceInfoService.deleteMemberServiceInfoByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberServiceInfoById(Integer id) {
		return memberServiceInfoService.deleteMemberServiceInfoById(id);
	}

}
