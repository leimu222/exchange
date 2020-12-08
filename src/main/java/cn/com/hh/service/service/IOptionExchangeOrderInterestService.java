package com.common.api.service;

import java.util.List;

import com.common.api.model.optionExchangeOrderInterest;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [option服务]
 */
public interface IOptionExchangeOrderInterestService {

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionExchangeOrderInterest selectOptionExchangeOrderInterestById(Long id);

	/**
	* 查询option列表
	*
	* @param optionExchangeOrderInterest option
	* @return option集合
	*/
	public List<OptionExchangeOrderInterest> selectOptionExchangeOrderInterestList(OptionExchangeOrderInterest optionExchangeOrderInterest);

	/**
	* 新增option
	*
	* @param optionExchangeOrderInterest option
	* @return 结果
	*/
	public int insertOptionExchangeOrderInterest(OptionExchangeOrderInterest optionExchangeOrderInterest);

	/**
	* 修改option
	*
	* @param optionExchangeOrderInterest option
	* @return 结果
	*/
	public int updateOptionExchangeOrderInterest(OptionExchangeOrderInterest optionExchangeOrderInterest);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderInterestByIds(Long[] ids);

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionExchangeOrderInterestById(Long id);
	
}
