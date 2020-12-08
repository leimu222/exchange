package com.common.api.service;

import java.util.List;

import com.common.api.model.optionMemberStatusRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [optionBiz服务]
 */
public interface IOptionMemberStatusRecordBizService {

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionMemberStatusRecord selectOptionMemberStatusRecordById(Long id);

	/**
	* 查询option列表
	*
	* @param optionMemberStatusRecord option
	* @return option集合
	*/
	public List<OptionMemberStatusRecord> selectOptionMemberStatusRecordList(OptionMemberStatusRecord optionMemberStatusRecord);

	/**
	* 新增option
	*
	* @param optionMemberStatusRecord option
	* @return 结果
	*/
	public int insertOptionMemberStatusRecord(OptionMemberStatusRecord optionMemberStatusRecord);

	/**
	* 修改option
	*
	* @param optionMemberStatusRecord option
	* @return 结果
	*/
	public int updateOptionMemberStatusRecord(OptionMemberStatusRecord optionMemberStatusRecord);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionMemberStatusRecordByIds(Long[] ids);

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionMemberStatusRecordById(Long id);
	
}
