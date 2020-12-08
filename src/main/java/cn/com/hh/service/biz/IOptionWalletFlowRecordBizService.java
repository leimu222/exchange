package com.common.api.service;

import java.util.List;

import com.common.api.model.optionWalletFlowRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [optionBiz服务]
 */
public interface IOptionWalletFlowRecordBizService {

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionWalletFlowRecord selectOptionWalletFlowRecordById(Long id);

	/**
	* 查询option列表
	*
	* @param optionWalletFlowRecord option
	* @return option集合
	*/
	public List<OptionWalletFlowRecord> selectOptionWalletFlowRecordList(OptionWalletFlowRecord optionWalletFlowRecord);

	/**
	* 新增option
	*
	* @param optionWalletFlowRecord option
	* @return 结果
	*/
	public int insertOptionWalletFlowRecord(OptionWalletFlowRecord optionWalletFlowRecord);

	/**
	* 修改option
	*
	* @param optionWalletFlowRecord option
	* @return 结果
	*/
	public int updateOptionWalletFlowRecord(OptionWalletFlowRecord optionWalletFlowRecord);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionWalletFlowRecordByIds(Long[] ids);

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionWalletFlowRecordById(Long id);
	
}
