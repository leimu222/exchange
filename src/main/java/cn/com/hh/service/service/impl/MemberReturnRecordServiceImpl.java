package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberReturnRecordMapper;
import com.common.api.model.MemberReturnRecord;
import com.common.api.service.IMemberReturnRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [member服务实现]
 */
@Service
public class MemberReturnRecordServiceImpl implements IMemberReturnRecordService {
	@Autowired
	private MemberReturnRecordMapper memberReturnRecordMapper;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberReturnRecord selectMemberReturnRecordById(Long id) {
		return memberReturnRecordMapper.selectMemberReturnRecordById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberReturnRecord member
	* @return member
	*/
	@Override
	public List<MemberReturnRecord> selectMemberReturnRecordList(MemberReturnRecord memberReturnRecord) {
		return memberReturnRecordMapper.selectMemberReturnRecordList(memberReturnRecord);
	}

	/**
	* 新增member
	*
	* @param memberReturnRecord member
	* @return 结果
	*/
	@Override
	public int insertMemberReturnRecord(MemberReturnRecord memberReturnRecord) {
		return memberReturnRecordMapper.insertMemberReturnRecord(memberReturnRecord);
	}

	/**
	* 修改member
	*
	* @param memberReturnRecord member
	* @return 结果
	*/
	@Override
	public int updateMemberReturnRecord(MemberReturnRecord memberReturnRecord) {
		return memberReturnRecordMapper.updateMemberReturnRecord(memberReturnRecord);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberReturnRecordByIds(Long[] ids) {
		return memberReturnRecordMapper.deleteMemberReturnRecordByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberReturnRecordById(Long id) {
		return memberReturnRecordMapper.deleteMemberReturnRecordById(id);
	}

}
