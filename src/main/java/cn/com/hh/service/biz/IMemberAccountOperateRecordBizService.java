package com.common.api.service;

import java.util.List;

import com.common.api.model.memberAccountOperateRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [memberBiz服务]
 */
public interface IMemberAccountOperateRecordBizService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberAccountOperateRecord selectMemberAccountOperateRecordById(Long id);

	/**
	* 查询member列表
	*
	* @param memberAccountOperateRecord member
	* @return member集合
	*/
	public List<MemberAccountOperateRecord> selectMemberAccountOperateRecordList(MemberAccountOperateRecord memberAccountOperateRecord);

	/**
	* 新增member
	*
	* @param memberAccountOperateRecord member
	* @return 结果
	*/
	public int insertMemberAccountOperateRecord(MemberAccountOperateRecord memberAccountOperateRecord);

	/**
	* 修改member
	*
	* @param memberAccountOperateRecord member
	* @return 结果
	*/
	public int updateMemberAccountOperateRecord(MemberAccountOperateRecord memberAccountOperateRecord);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberAccountOperateRecordByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberAccountOperateRecordById(Long id);
	
}
