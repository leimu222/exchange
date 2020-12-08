package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberApiKeyMapper;
import com.common.api.model.MemberApiKey;
import com.common.api.service.IMemberApiKeyService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [memberBiz服务实现]
 */
@Service
public class MemberApiKeyBizServiceImpl extends CommonService implements IMemberApiKeyBizService {
	@Autowired
	private IMemberApiKeyService memberApiKeyService;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberApiKey selectMemberApiKeyById(Long id) {
		return memberApiKeyService.selectMemberApiKeyById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberApiKey member
	* @return member
	*/
	@Override
	public List<MemberApiKey> selectMemberApiKeyList(MemberApiKey memberApiKey) {
		return memberApiKeyService.selectMemberApiKeyList(memberApiKey);
	}

	/**
	* 新增member
	*
	* @param memberApiKey member
	* @return 结果
	*/
	@Override
	public int insertMemberApiKey(MemberApiKey memberApiKey) {
		return memberApiKeyService.insertMemberApiKey(memberApiKey);
	}

	/**
	* 修改member
	*
	* @param memberApiKey member
	* @return 结果
	*/
	@Override
	public int updateMemberApiKey(MemberApiKey memberApiKey) {
		return memberApiKeyService.updateMemberApiKey(memberApiKey);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberApiKeyByIds(Long[] ids) {
		return memberApiKeyService.deleteMemberApiKeyByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberApiKeyById(Long id) {
		return memberApiKeyService.deleteMemberApiKeyById(id);
	}

}
