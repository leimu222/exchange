package com.common.api.service;

import java.util.List;

import com.common.api.model.optionWallet;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [optionBiz服务]
 */
public interface IOptionWalletBizService {

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionWallet selectOptionWalletById(Long id);

	/**
	* 查询option列表
	*
	* @param optionWallet option
	* @return option集合
	*/
	public List<OptionWallet> selectOptionWalletList(OptionWallet optionWallet);

	/**
	* 新增option
	*
	* @param optionWallet option
	* @return 结果
	*/
	public int insertOptionWallet(OptionWallet optionWallet);

	/**
	* 修改option
	*
	* @param optionWallet option
	* @return 结果
	*/
	public int updateOptionWallet(OptionWallet optionWallet);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionWalletByIds(Long[] ids);

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionWalletById(Long id);
	
}
