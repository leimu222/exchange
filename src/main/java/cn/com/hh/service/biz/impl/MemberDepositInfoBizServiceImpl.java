package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberDepositInfoMapper;
import com.common.api.model.MemberDepositInfo;
import com.common.api.service.IMemberDepositInfoService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [memberBiz服务实现]
 */
@Service
public class MemberDepositInfoBizServiceImpl extends CommonService implements IMemberDepositInfoBizService {
	@Autowired
	private IMemberDepositInfoService memberDepositInfoService;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberDepositInfo selectMemberDepositInfoById(Long id) {
		return memberDepositInfoService.selectMemberDepositInfoById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberDepositInfo member
	* @return member
	*/
	@Override
	public List<MemberDepositInfo> selectMemberDepositInfoList(MemberDepositInfo memberDepositInfo) {
		return memberDepositInfoService.selectMemberDepositInfoList(memberDepositInfo);
	}

	/**
	* 新增member
	*
	* @param memberDepositInfo member
	* @return 结果
	*/
	@Override
	public int insertMemberDepositInfo(MemberDepositInfo memberDepositInfo) {
		return memberDepositInfoService.insertMemberDepositInfo(memberDepositInfo);
	}

	/**
	* 修改member
	*
	* @param memberDepositInfo member
	* @return 结果
	*/
	@Override
	public int updateMemberDepositInfo(MemberDepositInfo memberDepositInfo) {
		return memberDepositInfoService.updateMemberDepositInfo(memberDepositInfo);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberDepositInfoByIds(Long[] ids) {
		return memberDepositInfoService.deleteMemberDepositInfoByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberDepositInfoById(Long id) {
		return memberDepositInfoService.deleteMemberDepositInfoById(id);
	}

}
