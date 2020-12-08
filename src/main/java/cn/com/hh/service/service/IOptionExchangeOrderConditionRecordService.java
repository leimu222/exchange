package com.common.api.service;

import java.util.List;

import com.common.api.model.optionExchangeOrderConditionRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [option服务]
 */
public interface IOptionExchangeOrderConditionRecordService {

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionExchangeOrderConditionRecord selectOptionExchangeOrderConditionRecordById(Long id);

	/**
	* 查询option列表
	*
	* @param optionExchangeOrderConditionRecord option
	* @return option集合
	*/
	public List<OptionExchangeOrderConditionRecord> selectOptionExchangeOrderConditionRecordList(OptionExchangeOrderConditionRecord optionExchangeOrderConditionRecord);

	/**
	* 新增option
	*
	* @param optionExchangeOrderConditionRecord option
	* @return 结果
	*/
	public int insertOptionExchangeOrderConditionRecord(OptionExchangeOrderConditionRecord optionExchangeOrderConditionRecord);

	/**
	* 修改option
	*
	* @param optionExchangeOrderConditionRecord option
	* @return 结果
	*/
	public int updateOptionExchangeOrderConditionRecord(OptionExchangeOrderConditionRecord optionExchangeOrderConditionRecord);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderConditionRecordByIds(Long[] ids);

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderConditionRecordById(Long id);
	
}
