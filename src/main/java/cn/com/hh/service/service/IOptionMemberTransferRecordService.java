package com.common.api.service;

import java.util.List;

import com.common.api.model.optionMemberTransferRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [option服务]
 */
public interface IOptionMemberTransferRecordService {

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionMemberTransferRecord selectOptionMemberTransferRecordById(Long id);

	/**
	* 查询option列表
	*
	* @param optionMemberTransferRecord option
	* @return option集合
	*/
	public List<OptionMemberTransferRecord> selectOptionMemberTransferRecordList(OptionMemberTransferRecord optionMemberTransferRecord);

	/**
	* 新增option
	*
	* @param optionMemberTransferRecord option
	* @return 结果
	*/
	public int insertOptionMemberTransferRecord(OptionMemberTransferRecord optionMemberTransferRecord);

	/**
	* 修改option
	*
	* @param optionMemberTransferRecord option
	* @return 结果
	*/
	public int updateOptionMemberTransferRecord(OptionMemberTransferRecord optionMemberTransferRecord);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionMemberTransferRecordByIds(Long[] ids);

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionMemberTransferRecordById(Long id);
	
}
