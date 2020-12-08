package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberApplicationConfigMapper;
import com.common.api.model.MemberApplicationConfig;
import com.common.api.service.IMemberApplicationConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [memberBiz服务实现]
 */
@Service
public class MemberApplicationConfigBizServiceImpl extends CommonService implements IMemberApplicationConfigBizService {
	@Autowired
	private IMemberApplicationConfigService memberApplicationConfigService;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberApplicationConfig selectMemberApplicationConfigById(Long id) {
		return memberApplicationConfigService.selectMemberApplicationConfigById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberApplicationConfig member
	* @return member
	*/
	@Override
	public List<MemberApplicationConfig> selectMemberApplicationConfigList(MemberApplicationConfig memberApplicationConfig) {
		return memberApplicationConfigService.selectMemberApplicationConfigList(memberApplicationConfig);
	}

	/**
	* 新增member
	*
	* @param memberApplicationConfig member
	* @return 结果
	*/
	@Override
	public int insertMemberApplicationConfig(MemberApplicationConfig memberApplicationConfig) {
		return memberApplicationConfigService.insertMemberApplicationConfig(memberApplicationConfig);
	}

	/**
	* 修改member
	*
	* @param memberApplicationConfig member
	* @return 结果
	*/
	@Override
	public int updateMemberApplicationConfig(MemberApplicationConfig memberApplicationConfig) {
		return memberApplicationConfigService.updateMemberApplicationConfig(memberApplicationConfig);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberApplicationConfigByIds(Long[] ids) {
		return memberApplicationConfigService.deleteMemberApplicationConfigByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberApplicationConfigById(Long id) {
		return memberApplicationConfigService.deleteMemberApplicationConfigById(id);
	}

}
