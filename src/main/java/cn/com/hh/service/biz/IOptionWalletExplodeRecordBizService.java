package com.common.api.service;

import java.util.List;

import com.common.api.model.optionWalletExplodeRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [optionBiz服务]
 */
public interface IOptionWalletExplodeRecordBizService {

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionWalletExplodeRecord selectOptionWalletExplodeRecordById(Long id);

	/**
	* 查询option列表
	*
	* @param optionWalletExplodeRecord option
	* @return option集合
	*/
	public List<OptionWalletExplodeRecord> selectOptionWalletExplodeRecordList(OptionWalletExplodeRecord optionWalletExplodeRecord);

	/**
	* 新增option
	*
	* @param optionWalletExplodeRecord option
	* @return 结果
	*/
	public int insertOptionWalletExplodeRecord(OptionWalletExplodeRecord optionWalletExplodeRecord);

	/**
	* 修改option
	*
	* @param optionWalletExplodeRecord option
	* @return 结果
	*/
	public int updateOptionWalletExplodeRecord(OptionWalletExplodeRecord optionWalletExplodeRecord);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionWalletExplodeRecordByIds(Long[] ids);

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionWalletExplodeRecordById(Long id);
	
}
