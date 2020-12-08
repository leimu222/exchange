package com.common.api.service;

import java.util.List;

import com.common.api.model.memberReturnRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [member服务]
 */
public interface IMemberReturnRecordService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberReturnRecord selectMemberReturnRecordById(Long id);

	/**
	* 查询member列表
	*
	* @param memberReturnRecord member
	* @return member集合
	*/
	public List<MemberReturnRecord> selectMemberReturnRecordList(MemberReturnRecord memberReturnRecord);

	/**
	* 新增member
	*
	* @param memberReturnRecord member
	* @return 结果
	*/
	public int insertMemberReturnRecord(MemberReturnRecord memberReturnRecord);

	/**
	* 修改member
	*
	* @param memberReturnRecord member
	* @return 结果
	*/
	public int updateMemberReturnRecord(MemberReturnRecord memberReturnRecord);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberReturnRecordByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberReturnRecordById(Long id);
	
}
