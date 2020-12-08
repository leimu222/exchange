package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberApplicationMapper;
import com.common.api.model.MemberApplication;
import com.common.api.service.IMemberApplicationService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [memberBiz服务实现]
 */
@Service
public class MemberApplicationBizServiceImpl extends CommonService implements IMemberApplicationBizService {
	@Autowired
	private IMemberApplicationService memberApplicationService;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberApplication selectMemberApplicationById(Long id) {
		return memberApplicationService.selectMemberApplicationById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberApplication member
	* @return member
	*/
	@Override
	public List<MemberApplication> selectMemberApplicationList(MemberApplication memberApplication) {
		return memberApplicationService.selectMemberApplicationList(memberApplication);
	}

	/**
	* 新增member
	*
	* @param memberApplication member
	* @return 结果
	*/
	@Override
	public int insertMemberApplication(MemberApplication memberApplication) {
		return memberApplicationService.insertMemberApplication(memberApplication);
	}

	/**
	* 修改member
	*
	* @param memberApplication member
	* @return 结果
	*/
	@Override
	public int updateMemberApplication(MemberApplication memberApplication) {
		return memberApplicationService.updateMemberApplication(memberApplication);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberApplicationByIds(Long[] ids) {
		return memberApplicationService.deleteMemberApplicationByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberApplicationById(Long id) {
		return memberApplicationService.deleteMemberApplicationById(id);
	}

}
