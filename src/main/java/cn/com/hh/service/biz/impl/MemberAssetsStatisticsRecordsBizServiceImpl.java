package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberAssetsStatisticsRecordsMapper;
import com.common.api.model.MemberAssetsStatisticsRecords;
import com.common.api.service.IMemberAssetsStatisticsRecordsService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [memberBiz服务实现]
 */
@Service
public class MemberAssetsStatisticsRecordsBizServiceImpl extends CommonService implements IMemberAssetsStatisticsRecordsBizService {
	@Autowired
	private IMemberAssetsStatisticsRecordsService memberAssetsStatisticsRecordsService;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberAssetsStatisticsRecords selectMemberAssetsStatisticsRecordsById(Long id) {
		return memberAssetsStatisticsRecordsService.selectMemberAssetsStatisticsRecordsById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberAssetsStatisticsRecords member
	* @return member
	*/
	@Override
	public List<MemberAssetsStatisticsRecords> selectMemberAssetsStatisticsRecordsList(MemberAssetsStatisticsRecords memberAssetsStatisticsRecords) {
		return memberAssetsStatisticsRecordsService.selectMemberAssetsStatisticsRecordsList(memberAssetsStatisticsRecords);
	}

	/**
	* 新增member
	*
	* @param memberAssetsStatisticsRecords member
	* @return 结果
	*/
	@Override
	public int insertMemberAssetsStatisticsRecords(MemberAssetsStatisticsRecords memberAssetsStatisticsRecords) {
		return memberAssetsStatisticsRecordsService.insertMemberAssetsStatisticsRecords(memberAssetsStatisticsRecords);
	}

	/**
	* 修改member
	*
	* @param memberAssetsStatisticsRecords member
	* @return 结果
	*/
	@Override
	public int updateMemberAssetsStatisticsRecords(MemberAssetsStatisticsRecords memberAssetsStatisticsRecords) {
		return memberAssetsStatisticsRecordsService.updateMemberAssetsStatisticsRecords(memberAssetsStatisticsRecords);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberAssetsStatisticsRecordsByIds(Long[] ids) {
		return memberAssetsStatisticsRecordsService.deleteMemberAssetsStatisticsRecordsByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberAssetsStatisticsRecordsById(Long id) {
		return memberAssetsStatisticsRecordsService.deleteMemberAssetsStatisticsRecordsById(id);
	}

}
