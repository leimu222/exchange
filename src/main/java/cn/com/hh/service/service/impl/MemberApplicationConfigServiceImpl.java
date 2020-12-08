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
 * Description: [member服务实现]
 */
@Service
public class MemberApplicationConfigServiceImpl implements IMemberApplicationConfigService {
	@Autowired
	private MemberApplicationConfigMapper memberApplicationConfigMapper;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberApplicationConfig selectMemberApplicationConfigById(Long id) {
		return memberApplicationConfigMapper.selectMemberApplicationConfigById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberApplicationConfig member
	* @return member
	*/
	@Override
	public List<MemberApplicationConfig> selectMemberApplicationConfigList(MemberApplicationConfig memberApplicationConfig) {
		return memberApplicationConfigMapper.selectMemberApplicationConfigList(memberApplicationConfig);
	}

	/**
	* 新增member
	*
	* @param memberApplicationConfig member
	* @return 结果
	*/
	@Override
	public int insertMemberApplicationConfig(MemberApplicationConfig memberApplicationConfig) {
		return memberApplicationConfigMapper.insertMemberApplicationConfig(memberApplicationConfig);
	}

	/**
	* 修改member
	*
	* @param memberApplicationConfig member
	* @return 结果
	*/
	@Override
	public int updateMemberApplicationConfig(MemberApplicationConfig memberApplicationConfig) {
		return memberApplicationConfigMapper.updateMemberApplicationConfig(memberApplicationConfig);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberApplicationConfigByIds(Long[] ids) {
		return memberApplicationConfigMapper.deleteMemberApplicationConfigByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberApplicationConfigById(Long id) {
		return memberApplicationConfigMapper.deleteMemberApplicationConfigById(id);
	}

}
