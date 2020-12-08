package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberSignRecordMapper;
import com.common.api.model.MemberSignRecord;
import com.common.api.service.IMemberSignRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [memberBiz服务实现]
 */
@Service
public class MemberSignRecordBizServiceImpl extends CommonService implements IMemberSignRecordBizService {
	@Autowired
	private IMemberSignRecordService memberSignRecordService;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberSignRecord selectMemberSignRecordById(Long id) {
		return memberSignRecordService.selectMemberSignRecordById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberSignRecord member
	* @return member
	*/
	@Override
	public List<MemberSignRecord> selectMemberSignRecordList(MemberSignRecord memberSignRecord) {
		return memberSignRecordService.selectMemberSignRecordList(memberSignRecord);
	}

	/**
	* 新增member
	*
	* @param memberSignRecord member
	* @return 结果
	*/
	@Override
	public int insertMemberSignRecord(MemberSignRecord memberSignRecord) {
		return memberSignRecordService.insertMemberSignRecord(memberSignRecord);
	}

	/**
	* 修改member
	*
	* @param memberSignRecord member
	* @return 结果
	*/
	@Override
	public int updateMemberSignRecord(MemberSignRecord memberSignRecord) {
		return memberSignRecordService.updateMemberSignRecord(memberSignRecord);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberSignRecordByIds(Long[] ids) {
		return memberSignRecordService.deleteMemberSignRecordByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberSignRecordById(Long id) {
		return memberSignRecordService.deleteMemberSignRecordById(id);
	}

}
