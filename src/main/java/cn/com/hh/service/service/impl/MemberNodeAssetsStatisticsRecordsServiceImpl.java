package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberNodeAssetsStatisticsRecordsMapper;
import com.common.api.model.MemberNodeAssetsStatisticsRecords;
import com.common.api.service.IMemberNodeAssetsStatisticsRecordsService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [member服务实现]
 */
@Service
public class MemberNodeAssetsStatisticsRecordsServiceImpl implements IMemberNodeAssetsStatisticsRecordsService {
	@Autowired
	private MemberNodeAssetsStatisticsRecordsMapper memberNodeAssetsStatisticsRecordsMapper;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberNodeAssetsStatisticsRecords selectMemberNodeAssetsStatisticsRecordsById(Long id) {
		return memberNodeAssetsStatisticsRecordsMapper.selectMemberNodeAssetsStatisticsRecordsById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberNodeAssetsStatisticsRecords member
	* @return member
	*/
	@Override
	public List<MemberNodeAssetsStatisticsRecords> selectMemberNodeAssetsStatisticsRecordsList(MemberNodeAssetsStatisticsRecords memberNodeAssetsStatisticsRecords) {
		return memberNodeAssetsStatisticsRecordsMapper.selectMemberNodeAssetsStatisticsRecordsList(memberNodeAssetsStatisticsRecords);
	}

	/**
	* 新增member
	*
	* @param memberNodeAssetsStatisticsRecords member
	* @return 结果
	*/
	@Override
	public int insertMemberNodeAssetsStatisticsRecords(MemberNodeAssetsStatisticsRecords memberNodeAssetsStatisticsRecords) {
		return memberNodeAssetsStatisticsRecordsMapper.insertMemberNodeAssetsStatisticsRecords(memberNodeAssetsStatisticsRecords);
	}

	/**
	* 修改member
	*
	* @param memberNodeAssetsStatisticsRecords member
	* @return 结果
	*/
	@Override
	public int updateMemberNodeAssetsStatisticsRecords(MemberNodeAssetsStatisticsRecords memberNodeAssetsStatisticsRecords) {
		return memberNodeAssetsStatisticsRecordsMapper.updateMemberNodeAssetsStatisticsRecords(memberNodeAssetsStatisticsRecords);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberNodeAssetsStatisticsRecordsByIds(Long[] ids) {
		return memberNodeAssetsStatisticsRecordsMapper.deleteMemberNodeAssetsStatisticsRecordsByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberNodeAssetsStatisticsRecordsById(Long id) {
		return memberNodeAssetsStatisticsRecordsMapper.deleteMemberNodeAssetsStatisticsRecordsById(id);
	}

}
