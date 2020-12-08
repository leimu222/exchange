package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberAccountOperateRecordMapper;
import com.common.api.model.MemberAccountOperateRecord;
import com.common.api.service.IMemberAccountOperateRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [memberBiz服务实现]
 */
@Service
public class MemberAccountOperateRecordBizServiceImpl extends CommonService implements IMemberAccountOperateRecordBizService {
	@Autowired
	private IMemberAccountOperateRecordService memberAccountOperateRecordService;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberAccountOperateRecord selectMemberAccountOperateRecordById(Long id) {
		return memberAccountOperateRecordService.selectMemberAccountOperateRecordById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberAccountOperateRecord member
	* @return member
	*/
	@Override
	public List<MemberAccountOperateRecord> selectMemberAccountOperateRecordList(MemberAccountOperateRecord memberAccountOperateRecord) {
		return memberAccountOperateRecordService.selectMemberAccountOperateRecordList(memberAccountOperateRecord);
	}

	/**
	* 新增member
	*
	* @param memberAccountOperateRecord member
	* @return 结果
	*/
	@Override
	public int insertMemberAccountOperateRecord(MemberAccountOperateRecord memberAccountOperateRecord) {
		return memberAccountOperateRecordService.insertMemberAccountOperateRecord(memberAccountOperateRecord);
	}

	/**
	* 修改member
	*
	* @param memberAccountOperateRecord member
	* @return 结果
	*/
	@Override
	public int updateMemberAccountOperateRecord(MemberAccountOperateRecord memberAccountOperateRecord) {
		return memberAccountOperateRecordService.updateMemberAccountOperateRecord(memberAccountOperateRecord);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberAccountOperateRecordByIds(Long[] ids) {
		return memberAccountOperateRecordService.deleteMemberAccountOperateRecordByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberAccountOperateRecordById(Long id) {
		return memberAccountOperateRecordService.deleteMemberAccountOperateRecordById(id);
	}

}
