package com.common.api.service;

import java.util.List;

import com.common.api.model.optionWalletFrozenFlowRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [optionBiz服务]
 */
public interface IOptionWalletFrozenFlowRecordBizService {

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionWalletFrozenFlowRecord selectOptionWalletFrozenFlowRecordById(Long id);

	/**
	* 查询option列表
	*
	* @param optionWalletFrozenFlowRecord option
	* @return option集合
	*/
	public List<OptionWalletFrozenFlowRecord> selectOptionWalletFrozenFlowRecordList(OptionWalletFrozenFlowRecord optionWalletFrozenFlowRecord);

	/**
	* 新增option
	*
	* @param optionWalletFrozenFlowRecord option
	* @return 结果
	*/
	public int insertOptionWalletFrozenFlowRecord(OptionWalletFrozenFlowRecord optionWalletFrozenFlowRecord);

	/**
	* 修改option
	*
	* @param optionWalletFrozenFlowRecord option
	* @return 结果
	*/
	public int updateOptionWalletFrozenFlowRecord(OptionWalletFrozenFlowRecord optionWalletFrozenFlowRecord);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionWalletFrozenFlowRecordByIds(Long[] ids);

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionWalletFrozenFlowRecordById(Long id);
	
}
