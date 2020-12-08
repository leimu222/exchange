package com.common.api.service;

import java.util.List;

import com.common.api.model.optionWalletTransferRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [option服务]
 */
public interface IOptionWalletTransferRecordService {

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionWalletTransferRecord selectOptionWalletTransferRecordById(Long id);

	/**
	* 查询option列表
	*
	* @param optionWalletTransferRecord option
	* @return option集合
	*/
	public List<OptionWalletTransferRecord> selectOptionWalletTransferRecordList(OptionWalletTransferRecord optionWalletTransferRecord);

	/**
	* 新增option
	*
	* @param optionWalletTransferRecord option
	* @return 结果
	*/
	public int insertOptionWalletTransferRecord(OptionWalletTransferRecord optionWalletTransferRecord);

	/**
	* 修改option
	*
	* @param optionWalletTransferRecord option
	* @return 结果
	*/
	public int updateOptionWalletTransferRecord(OptionWalletTransferRecord optionWalletTransferRecord);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionWalletTransferRecordByIds(Long[] ids);

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionWalletTransferRecordById(Long id);
	
}
