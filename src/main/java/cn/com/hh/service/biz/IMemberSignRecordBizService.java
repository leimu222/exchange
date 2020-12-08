package com.common.api.service;

import java.util.List;

import com.common.api.model.memberSignRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [memberBiz服务]
 */
public interface IMemberSignRecordBizService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberSignRecord selectMemberSignRecordById(Long id);

	/**
	* 查询member列表
	*
	* @param memberSignRecord member
	* @return member集合
	*/
	public List<MemberSignRecord> selectMemberSignRecordList(MemberSignRecord memberSignRecord);

	/**
	* 新增member
	*
	* @param memberSignRecord member
	* @return 结果
	*/
	public int insertMemberSignRecord(MemberSignRecord memberSignRecord);

	/**
	* 修改member
	*
	* @param memberSignRecord member
	* @return 结果
	*/
	public int updateMemberSignRecord(MemberSignRecord memberSignRecord);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberSignRecordByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberSignRecordById(Long id);
	
}
