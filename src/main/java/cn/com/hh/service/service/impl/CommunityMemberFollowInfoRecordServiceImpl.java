package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.CommunityMemberFollowInfoRecordMapper;
import com.common.api.model.CommunityMemberFollowInfoRecord;
import com.common.api.service.ICommunityMemberFollowInfoRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:02
 * Description: [community服务实现]
 */
@Service
public class CommunityMemberFollowInfoRecordServiceImpl implements ICommunityMemberFollowInfoRecordService {
	@Autowired
	private CommunityMemberFollowInfoRecordMapper communityMemberFollowInfoRecordMapper;

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	@Override
	public CommunityMemberFollowInfoRecord selectCommunityMemberFollowInfoRecordById(Long id) {
		return communityMemberFollowInfoRecordMapper.selectCommunityMemberFollowInfoRecordById(id);
	}

	/**
	* 查询community列表
	*
	* @param communityMemberFollowInfoRecord community
	* @return community
	*/
	@Override
	public List<CommunityMemberFollowInfoRecord> selectCommunityMemberFollowInfoRecordList(CommunityMemberFollowInfoRecord communityMemberFollowInfoRecord) {
		return communityMemberFollowInfoRecordMapper.selectCommunityMemberFollowInfoRecordList(communityMemberFollowInfoRecord);
	}

	/**
	* 新增community
	*
	* @param communityMemberFollowInfoRecord community
	* @return 结果
	*/
	@Override
	public int insertCommunityMemberFollowInfoRecord(CommunityMemberFollowInfoRecord communityMemberFollowInfoRecord) {
		return communityMemberFollowInfoRecordMapper.insertCommunityMemberFollowInfoRecord(communityMemberFollowInfoRecord);
	}

	/**
	* 修改community
	*
	* @param communityMemberFollowInfoRecord community
	* @return 结果
	*/
	@Override
	public int updateCommunityMemberFollowInfoRecord(CommunityMemberFollowInfoRecord communityMemberFollowInfoRecord) {
		return communityMemberFollowInfoRecordMapper.updateCommunityMemberFollowInfoRecord(communityMemberFollowInfoRecord);
	}

	/**
	* 批量删除community
	*
	* @param ids 需要删除的communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunityMemberFollowInfoRecordByIds(Long[] ids) {
		return communityMemberFollowInfoRecordMapper.deleteCommunityMemberFollowInfoRecordByIds(ids);
	}

	/**
	* 删除community信息
	*
	* @param id communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunityMemberFollowInfoRecordById(Long id) {
		return communityMemberFollowInfoRecordMapper.deleteCommunityMemberFollowInfoRecordById(id);
	}

}
